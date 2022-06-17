// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package proto

@SerialVersionUID(0L)
final case class SearchRequest(
    query: _root_.scala.Predef.String = "",
    pageNumber: _root_.scala.Int = 0,
    resultPerPage: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[SearchRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = query
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = pageNumber
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      
      {
        val __value = resultPerPage
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = query
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = pageNumber
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = resultPerPage
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withQuery(__v: _root_.scala.Predef.String): SearchRequest = copy(query = __v)
    def withPageNumber(__v: _root_.scala.Int): SearchRequest = copy(pageNumber = __v)
    def withResultPerPage(__v: _root_.scala.Int): SearchRequest = copy(resultPerPage = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = query
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = pageNumber
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = resultPerPage
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(query)
        case 2 => _root_.scalapb.descriptors.PInt(pageNumber)
        case 3 => _root_.scalapb.descriptors.PInt(resultPerPage)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = proto.SearchRequest
    // @@protoc_insertion_point(GeneratedMessage[proto.SearchRequest])
}

object SearchRequest extends scalapb.GeneratedMessageCompanion[proto.SearchRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[proto.SearchRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): proto.SearchRequest = {
    var __query: _root_.scala.Predef.String = ""
    var __pageNumber: _root_.scala.Int = 0
    var __resultPerPage: _root_.scala.Int = 0
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __query = _input__.readStringRequireUtf8()
        case 16 =>
          __pageNumber = _input__.readInt32()
        case 24 =>
          __resultPerPage = _input__.readInt32()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    proto.SearchRequest(
        query = __query,
        pageNumber = __pageNumber,
        resultPerPage = __resultPerPage,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[proto.SearchRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      proto.SearchRequest(
        query = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        pageNumber = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        resultPerPage = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HelloworldProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HelloworldProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = proto.SearchRequest(
    query = "",
    pageNumber = 0,
    resultPerPage = 0
  )
  implicit class SearchRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, proto.SearchRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, proto.SearchRequest](_l) {
    def query: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.query)((c_, f_) => c_.copy(query = f_))
    def pageNumber: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.pageNumber)((c_, f_) => c_.copy(pageNumber = f_))
    def resultPerPage: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.resultPerPage)((c_, f_) => c_.copy(resultPerPage = f_))
  }
  final val QUERY_FIELD_NUMBER = 1
  final val PAGE_NUMBER_FIELD_NUMBER = 2
  final val RESULT_PER_PAGE_FIELD_NUMBER = 3
  def of(
    query: _root_.scala.Predef.String,
    pageNumber: _root_.scala.Int,
    resultPerPage: _root_.scala.Int
  ): _root_.proto.SearchRequest = _root_.proto.SearchRequest(
    query,
    pageNumber,
    resultPerPage
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[proto.SearchRequest])
}