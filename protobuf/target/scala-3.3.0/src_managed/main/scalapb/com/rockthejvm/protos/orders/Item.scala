// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.rockthejvm.protos.orders

@SerialVersionUID(0L)
final case class Item(
    name: _root_.scala.Predef.String = "",
    qty: _root_.scala.Int = 0,
    amount: _root_.scala.Double = 0.0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Item] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = qty
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      
      {
        val __value = amount
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(3, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = qty
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = amount
        if (__v != 0.0) {
          _output__.writeDouble(3, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): Item = copy(name = __v)
    def withQty(__v: _root_.scala.Int): Item = copy(qty = __v)
    def withAmount(__v: _root_.scala.Double): Item = copy(amount = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = qty
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = amount
          if (__t != 0.0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PInt(qty)
        case 3 => _root_.scalapb.descriptors.PDouble(amount)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.rockthejvm.protos.orders.Item.type = com.rockthejvm.protos.orders.Item
    // @@protoc_insertion_point(GeneratedMessage[com.rockthejvm.protos.Item])
}

object Item extends scalapb.GeneratedMessageCompanion[com.rockthejvm.protos.orders.Item] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.rockthejvm.protos.orders.Item] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.rockthejvm.protos.orders.Item = {
    var __name: _root_.scala.Predef.String = ""
    var __qty: _root_.scala.Int = 0
    var __amount: _root_.scala.Double = 0.0
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _input__.readStringRequireUtf8()
        case 16 =>
          __qty = _input__.readInt32()
        case 25 =>
          __amount = _input__.readDouble()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.rockthejvm.protos.orders.Item(
        name = __name,
        qty = __qty,
        amount = __amount,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.rockthejvm.protos.orders.Item] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.rockthejvm.protos.orders.Item(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        qty = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        amount = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Double]).getOrElse(0.0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = OrdersProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = OrdersProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.rockthejvm.protos.orders.Item(
    name = "",
    qty = 0,
    amount = 0.0
  )
  implicit class ItemLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.rockthejvm.protos.orders.Item]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.rockthejvm.protos.orders.Item](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def qty: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.qty)((c_, f_) => c_.copy(qty = f_))
    def amount: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.amount)((c_, f_) => c_.copy(amount = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val QTY_FIELD_NUMBER = 2
  final val AMOUNT_FIELD_NUMBER = 3
  def of(
    name: _root_.scala.Predef.String,
    qty: _root_.scala.Int,
    amount: _root_.scala.Double
  ): _root_.com.rockthejvm.protos.orders.Item = _root_.com.rockthejvm.protos.orders.Item(
    name,
    qty,
    amount
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[com.rockthejvm.protos.Item])
}
