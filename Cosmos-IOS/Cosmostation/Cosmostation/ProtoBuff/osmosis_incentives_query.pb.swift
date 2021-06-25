// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/incentives/query.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

struct Osmosis_Incentives_ModuleToDistributeCoinsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_ModuleToDistributeCoinsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var coins: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_ModuleDistributedCoinsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_ModuleDistributedCoinsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var coins: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_GaugeByIDRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_GaugeByIDResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var gauge: Osmosis_Incentives_Gauge {
    get {return _gauge ?? Osmosis_Incentives_Gauge()}
    set {_gauge = newValue}
  }
  /// Returns true if `gauge` has been explicitly set.
  var hasGauge: Bool {return self._gauge != nil}
  /// Clears the value of `gauge`. Subsequent reads from it will return its default value.
  mutating func clearGauge() {self._gauge = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _gauge: Osmosis_Incentives_Gauge? = nil
}

struct Osmosis_Incentives_GaugesRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines an pagination for the request.
  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

struct Osmosis_Incentives_GaugesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var data: [Osmosis_Incentives_Gauge] = []

  /// pagination defines an pagination for the response.
  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

struct Osmosis_Incentives_ActiveGaugesRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines an pagination for the request.
  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

struct Osmosis_Incentives_ActiveGaugesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var data: [Osmosis_Incentives_Gauge] = []

  /// pagination defines an pagination for the response.
  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

struct Osmosis_Incentives_UpcomingGaugesRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines an pagination for the request.
  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

struct Osmosis_Incentives_UpcomingGaugesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var data: [Osmosis_Incentives_Gauge] = []

  /// pagination defines an pagination for the response.
  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

struct Osmosis_Incentives_RewardsEstRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String = String()

  var lockIds: [UInt64] = []

  var endEpoch: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_RewardsEstResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var coins: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_QueryLockableDurationsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_QueryLockableDurationsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var lockableDurations: [SwiftProtobuf.Google_Protobuf_Duration] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.incentives"

extension Osmosis_Incentives_ModuleToDistributeCoinsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ModuleToDistributeCoinsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_ModuleToDistributeCoinsRequest, rhs: Osmosis_Incentives_ModuleToDistributeCoinsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_ModuleToDistributeCoinsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ModuleToDistributeCoinsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "coins"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.coins)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.coins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.coins, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_ModuleToDistributeCoinsResponse, rhs: Osmosis_Incentives_ModuleToDistributeCoinsResponse) -> Bool {
    if lhs.coins != rhs.coins {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_ModuleDistributedCoinsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ModuleDistributedCoinsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_ModuleDistributedCoinsRequest, rhs: Osmosis_Incentives_ModuleDistributedCoinsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_ModuleDistributedCoinsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ModuleDistributedCoinsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "coins"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.coins)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.coins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.coins, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_ModuleDistributedCoinsResponse, rhs: Osmosis_Incentives_ModuleDistributedCoinsResponse) -> Bool {
    if lhs.coins != rhs.coins {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_GaugeByIDRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GaugeByIDRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularUInt64Field(value: &self.id)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_GaugeByIDRequest, rhs: Osmosis_Incentives_GaugeByIDRequest) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_GaugeByIDResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GaugeByIDResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "gauge"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularMessageField(value: &self._gauge)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._gauge {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_GaugeByIDResponse, rhs: Osmosis_Incentives_GaugeByIDResponse) -> Bool {
    if lhs._gauge != rhs._gauge {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_GaugesRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GaugesRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularMessageField(value: &self._pagination)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_GaugesRequest, rhs: Osmosis_Incentives_GaugesRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_GaugesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GaugesResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "data"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.data)
      case 2: try decoder.decodeSingularMessageField(value: &self._pagination)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.data.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.data, fieldNumber: 1)
    }
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_GaugesResponse, rhs: Osmosis_Incentives_GaugesResponse) -> Bool {
    if lhs.data != rhs.data {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_ActiveGaugesRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ActiveGaugesRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularMessageField(value: &self._pagination)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_ActiveGaugesRequest, rhs: Osmosis_Incentives_ActiveGaugesRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_ActiveGaugesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ActiveGaugesResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "data"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.data)
      case 2: try decoder.decodeSingularMessageField(value: &self._pagination)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.data.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.data, fieldNumber: 1)
    }
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_ActiveGaugesResponse, rhs: Osmosis_Incentives_ActiveGaugesResponse) -> Bool {
    if lhs.data != rhs.data {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_UpcomingGaugesRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpcomingGaugesRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularMessageField(value: &self._pagination)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_UpcomingGaugesRequest, rhs: Osmosis_Incentives_UpcomingGaugesRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_UpcomingGaugesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpcomingGaugesResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "data"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.data)
      case 2: try decoder.decodeSingularMessageField(value: &self._pagination)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.data.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.data, fieldNumber: 1)
    }
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_UpcomingGaugesResponse, rhs: Osmosis_Incentives_UpcomingGaugesResponse) -> Bool {
    if lhs.data != rhs.data {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_RewardsEstRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardsEstRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .standard(proto: "lock_ids"),
    3: .standard(proto: "end_epoch"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.owner)
      case 2: try decoder.decodeRepeatedUInt64Field(value: &self.lockIds)
      case 3: try decoder.decodeSingularInt64Field(value: &self.endEpoch)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if !self.lockIds.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.lockIds, fieldNumber: 2)
    }
    if self.endEpoch != 0 {
      try visitor.visitSingularInt64Field(value: self.endEpoch, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_RewardsEstRequest, rhs: Osmosis_Incentives_RewardsEstRequest) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.lockIds != rhs.lockIds {return false}
    if lhs.endEpoch != rhs.endEpoch {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_RewardsEstResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardsEstResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "coins"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.coins)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.coins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.coins, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_RewardsEstResponse, rhs: Osmosis_Incentives_RewardsEstResponse) -> Bool {
    if lhs.coins != rhs.coins {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_QueryLockableDurationsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryLockableDurationsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_QueryLockableDurationsRequest, rhs: Osmosis_Incentives_QueryLockableDurationsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_QueryLockableDurationsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryLockableDurationsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "lockable_durations"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.lockableDurations)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.lockableDurations.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lockableDurations, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_QueryLockableDurationsResponse, rhs: Osmosis_Incentives_QueryLockableDurationsResponse) -> Bool {
    if lhs.lockableDurations != rhs.lockableDurations {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}