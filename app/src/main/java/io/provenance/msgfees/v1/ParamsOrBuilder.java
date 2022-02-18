// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/msgfees/v1/msgfees.proto

package io.provenance.msgfees.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.msgfees.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * constant used to calculate fees when gas fees shares denom with msg fee
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin floor_gas_price = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"floor_gas_price&#92;""];</code>
   * @return Whether the floorGasPrice field is set.
   */
  boolean hasFloorGasPrice();
  /**
   * <pre>
   * constant used to calculate fees when gas fees shares denom with msg fee
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin floor_gas_price = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"floor_gas_price&#92;""];</code>
   * @return The floorGasPrice.
   */
  cosmos.base.v1beta1.CoinOuterClass.Coin getFloorGasPrice();
  /**
   * <pre>
   * constant used to calculate fees when gas fees shares denom with msg fee
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin floor_gas_price = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"floor_gas_price&#92;""];</code>
   */
  cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getFloorGasPriceOrBuilder();
}