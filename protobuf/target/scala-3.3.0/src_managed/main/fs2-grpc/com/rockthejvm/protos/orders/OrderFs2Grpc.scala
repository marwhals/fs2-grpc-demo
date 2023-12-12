package com.rockthejvm.protos.orders

import _root_.cats.syntax.all._

trait OrderFs2Grpc[F[_], A] {
  def sendOrderStream(request: _root_.fs2.Stream[F, com.rockthejvm.protos.orders.OrderRequest], ctx: A): _root_.fs2.Stream[F, com.rockthejvm.protos.orders.OrderReply]
}

object OrderFs2Grpc extends _root_.fs2.grpc.GeneratedCompanion[OrderFs2Grpc] {
  
  def mkClient[F[_]: _root_.cats.effect.Async, A](dispatcher: _root_.cats.effect.std.Dispatcher[F], channel: _root_.io.grpc.Channel, mkMetadata: A => F[_root_.io.grpc.Metadata], clientOptions: _root_.fs2.grpc.client.ClientOptions): OrderFs2Grpc[F, A] = new OrderFs2Grpc[F, A] {
    def sendOrderStream(request: _root_.fs2.Stream[F, com.rockthejvm.protos.orders.OrderRequest], ctx: A): _root_.fs2.Stream[F, com.rockthejvm.protos.orders.OrderReply] = {
      _root_.fs2.Stream.eval(mkMetadata(ctx)).flatMap { m =>
        _root_.fs2.Stream.eval(_root_.fs2.grpc.client.Fs2ClientCall[F](channel, com.rockthejvm.protos.orders.OrderGrpc.METHOD_SEND_ORDER_STREAM, dispatcher, clientOptions)).flatMap(_.streamingToStreamingCall(request, m))
      }
    }
  }
  
  protected def serviceBinding[F[_]: _root_.cats.effect.Async, A](dispatcher: _root_.cats.effect.std.Dispatcher[F], serviceImpl: OrderFs2Grpc[F, A], mkCtx: _root_.io.grpc.Metadata => F[A], serverOptions: _root_.fs2.grpc.server.ServerOptions): _root_.io.grpc.ServerServiceDefinition = {
    _root_.io.grpc.ServerServiceDefinition
      .builder(com.rockthejvm.protos.orders.OrderGrpc.SERVICE)
      .addMethod(com.rockthejvm.protos.orders.OrderGrpc.METHOD_SEND_ORDER_STREAM, _root_.fs2.grpc.server.Fs2ServerCallHandler[F](dispatcher, serverOptions).streamingToStreamingCall[com.rockthejvm.protos.orders.OrderRequest, com.rockthejvm.protos.orders.OrderReply]((r, m) => _root_.fs2.Stream.eval(mkCtx(m)).flatMap(serviceImpl.sendOrderStream(r, _))))
      .build()
  }

}