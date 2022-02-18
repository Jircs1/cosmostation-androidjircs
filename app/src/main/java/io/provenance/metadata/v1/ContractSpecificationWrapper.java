// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * ContractSpecificationWrapper contains a single contract specification and some extra identifiers for it.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.ContractSpecificationWrapper}
 */
public final class ContractSpecificationWrapper extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.ContractSpecificationWrapper)
    ContractSpecificationWrapperOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContractSpecificationWrapper.newBuilder() to construct.
  private ContractSpecificationWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContractSpecificationWrapper() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContractSpecificationWrapper();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ContractSpecificationWrapper(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.provenance.metadata.v1.ContractSpecification.Builder subBuilder = null;
            if (specification_ != null) {
              subBuilder = specification_.toBuilder();
            }
            specification_ = input.readMessage(io.provenance.metadata.v1.ContractSpecification.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(specification_);
              specification_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.provenance.metadata.v1.ContractSpecIdInfo.Builder subBuilder = null;
            if (contractSpecIdInfo_ != null) {
              subBuilder = contractSpecIdInfo_.toBuilder();
            }
            contractSpecIdInfo_ = input.readMessage(io.provenance.metadata.v1.ContractSpecIdInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(contractSpecIdInfo_);
              contractSpecIdInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationWrapper_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationWrapper_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.ContractSpecificationWrapper.class, io.provenance.metadata.v1.ContractSpecificationWrapper.Builder.class);
  }

  public static final int SPECIFICATION_FIELD_NUMBER = 1;
  private io.provenance.metadata.v1.ContractSpecification specification_;
  /**
   * <pre>
   * specification is the on-chain contract specification message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
   * @return Whether the specification field is set.
   */
  @java.lang.Override
  public boolean hasSpecification() {
    return specification_ != null;
  }
  /**
   * <pre>
   * specification is the on-chain contract specification message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
   * @return The specification.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.ContractSpecification getSpecification() {
    return specification_ == null ? io.provenance.metadata.v1.ContractSpecification.getDefaultInstance() : specification_;
  }
  /**
   * <pre>
   * specification is the on-chain contract specification message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.ContractSpecificationOrBuilder getSpecificationOrBuilder() {
    return getSpecification();
  }

  public static final int CONTRACT_SPEC_ID_INFO_FIELD_NUMBER = 2;
  private io.provenance.metadata.v1.ContractSpecIdInfo contractSpecIdInfo_;
  /**
   * <pre>
   * contract_spec_id_info contains information about the id/address of the contract specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
   * @return Whether the contractSpecIdInfo field is set.
   */
  @java.lang.Override
  public boolean hasContractSpecIdInfo() {
    return contractSpecIdInfo_ != null;
  }
  /**
   * <pre>
   * contract_spec_id_info contains information about the id/address of the contract specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
   * @return The contractSpecIdInfo.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.ContractSpecIdInfo getContractSpecIdInfo() {
    return contractSpecIdInfo_ == null ? io.provenance.metadata.v1.ContractSpecIdInfo.getDefaultInstance() : contractSpecIdInfo_;
  }
  /**
   * <pre>
   * contract_spec_id_info contains information about the id/address of the contract specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.ContractSpecIdInfoOrBuilder getContractSpecIdInfoOrBuilder() {
    return getContractSpecIdInfo();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (specification_ != null) {
      output.writeMessage(1, getSpecification());
    }
    if (contractSpecIdInfo_ != null) {
      output.writeMessage(2, getContractSpecIdInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (specification_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpecification());
    }
    if (contractSpecIdInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getContractSpecIdInfo());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.provenance.metadata.v1.ContractSpecificationWrapper)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.ContractSpecificationWrapper other = (io.provenance.metadata.v1.ContractSpecificationWrapper) obj;

    if (hasSpecification() != other.hasSpecification()) return false;
    if (hasSpecification()) {
      if (!getSpecification()
          .equals(other.getSpecification())) return false;
    }
    if (hasContractSpecIdInfo() != other.hasContractSpecIdInfo()) return false;
    if (hasContractSpecIdInfo()) {
      if (!getContractSpecIdInfo()
          .equals(other.getContractSpecIdInfo())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSpecification()) {
      hash = (37 * hash) + SPECIFICATION_FIELD_NUMBER;
      hash = (53 * hash) + getSpecification().hashCode();
    }
    if (hasContractSpecIdInfo()) {
      hash = (37 * hash) + CONTRACT_SPEC_ID_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getContractSpecIdInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ContractSpecificationWrapper parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.provenance.metadata.v1.ContractSpecificationWrapper prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * ContractSpecificationWrapper contains a single contract specification and some extra identifiers for it.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.ContractSpecificationWrapper}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.ContractSpecificationWrapper)
      io.provenance.metadata.v1.ContractSpecificationWrapperOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationWrapper_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationWrapper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.ContractSpecificationWrapper.class, io.provenance.metadata.v1.ContractSpecificationWrapper.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.ContractSpecificationWrapper.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (specificationBuilder_ == null) {
        specification_ = null;
      } else {
        specification_ = null;
        specificationBuilder_ = null;
      }
      if (contractSpecIdInfoBuilder_ == null) {
        contractSpecIdInfo_ = null;
      } else {
        contractSpecIdInfo_ = null;
        contractSpecIdInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationWrapper_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ContractSpecificationWrapper getDefaultInstanceForType() {
      return io.provenance.metadata.v1.ContractSpecificationWrapper.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ContractSpecificationWrapper build() {
      io.provenance.metadata.v1.ContractSpecificationWrapper result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ContractSpecificationWrapper buildPartial() {
      io.provenance.metadata.v1.ContractSpecificationWrapper result = new io.provenance.metadata.v1.ContractSpecificationWrapper(this);
      if (specificationBuilder_ == null) {
        result.specification_ = specification_;
      } else {
        result.specification_ = specificationBuilder_.build();
      }
      if (contractSpecIdInfoBuilder_ == null) {
        result.contractSpecIdInfo_ = contractSpecIdInfo_;
      } else {
        result.contractSpecIdInfo_ = contractSpecIdInfoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.provenance.metadata.v1.ContractSpecificationWrapper) {
        return mergeFrom((io.provenance.metadata.v1.ContractSpecificationWrapper)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.ContractSpecificationWrapper other) {
      if (other == io.provenance.metadata.v1.ContractSpecificationWrapper.getDefaultInstance()) return this;
      if (other.hasSpecification()) {
        mergeSpecification(other.getSpecification());
      }
      if (other.hasContractSpecIdInfo()) {
        mergeContractSpecIdInfo(other.getContractSpecIdInfo());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.provenance.metadata.v1.ContractSpecificationWrapper parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.ContractSpecificationWrapper) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.provenance.metadata.v1.ContractSpecification specification_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.ContractSpecification, io.provenance.metadata.v1.ContractSpecification.Builder, io.provenance.metadata.v1.ContractSpecificationOrBuilder> specificationBuilder_;
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     * @return Whether the specification field is set.
     */
    public boolean hasSpecification() {
      return specificationBuilder_ != null || specification_ != null;
    }
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     * @return The specification.
     */
    public io.provenance.metadata.v1.ContractSpecification getSpecification() {
      if (specificationBuilder_ == null) {
        return specification_ == null ? io.provenance.metadata.v1.ContractSpecification.getDefaultInstance() : specification_;
      } else {
        return specificationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     */
    public Builder setSpecification(io.provenance.metadata.v1.ContractSpecification value) {
      if (specificationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specification_ = value;
        onChanged();
      } else {
        specificationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     */
    public Builder setSpecification(
        io.provenance.metadata.v1.ContractSpecification.Builder builderForValue) {
      if (specificationBuilder_ == null) {
        specification_ = builderForValue.build();
        onChanged();
      } else {
        specificationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     */
    public Builder mergeSpecification(io.provenance.metadata.v1.ContractSpecification value) {
      if (specificationBuilder_ == null) {
        if (specification_ != null) {
          specification_ =
            io.provenance.metadata.v1.ContractSpecification.newBuilder(specification_).mergeFrom(value).buildPartial();
        } else {
          specification_ = value;
        }
        onChanged();
      } else {
        specificationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     */
    public Builder clearSpecification() {
      if (specificationBuilder_ == null) {
        specification_ = null;
        onChanged();
      } else {
        specification_ = null;
        specificationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     */
    public io.provenance.metadata.v1.ContractSpecification.Builder getSpecificationBuilder() {
      
      onChanged();
      return getSpecificationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     */
    public io.provenance.metadata.v1.ContractSpecificationOrBuilder getSpecificationOrBuilder() {
      if (specificationBuilder_ != null) {
        return specificationBuilder_.getMessageOrBuilder();
      } else {
        return specification_ == null ?
            io.provenance.metadata.v1.ContractSpecification.getDefaultInstance() : specification_;
      }
    }
    /**
     * <pre>
     * specification is the on-chain contract specification message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecification specification = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.ContractSpecification, io.provenance.metadata.v1.ContractSpecification.Builder, io.provenance.metadata.v1.ContractSpecificationOrBuilder> 
        getSpecificationFieldBuilder() {
      if (specificationBuilder_ == null) {
        specificationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.ContractSpecification, io.provenance.metadata.v1.ContractSpecification.Builder, io.provenance.metadata.v1.ContractSpecificationOrBuilder>(
                getSpecification(),
                getParentForChildren(),
                isClean());
        specification_ = null;
      }
      return specificationBuilder_;
    }

    private io.provenance.metadata.v1.ContractSpecIdInfo contractSpecIdInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.ContractSpecIdInfo, io.provenance.metadata.v1.ContractSpecIdInfo.Builder, io.provenance.metadata.v1.ContractSpecIdInfoOrBuilder> contractSpecIdInfoBuilder_;
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     * @return Whether the contractSpecIdInfo field is set.
     */
    public boolean hasContractSpecIdInfo() {
      return contractSpecIdInfoBuilder_ != null || contractSpecIdInfo_ != null;
    }
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     * @return The contractSpecIdInfo.
     */
    public io.provenance.metadata.v1.ContractSpecIdInfo getContractSpecIdInfo() {
      if (contractSpecIdInfoBuilder_ == null) {
        return contractSpecIdInfo_ == null ? io.provenance.metadata.v1.ContractSpecIdInfo.getDefaultInstance() : contractSpecIdInfo_;
      } else {
        return contractSpecIdInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public Builder setContractSpecIdInfo(io.provenance.metadata.v1.ContractSpecIdInfo value) {
      if (contractSpecIdInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contractSpecIdInfo_ = value;
        onChanged();
      } else {
        contractSpecIdInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public Builder setContractSpecIdInfo(
        io.provenance.metadata.v1.ContractSpecIdInfo.Builder builderForValue) {
      if (contractSpecIdInfoBuilder_ == null) {
        contractSpecIdInfo_ = builderForValue.build();
        onChanged();
      } else {
        contractSpecIdInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public Builder mergeContractSpecIdInfo(io.provenance.metadata.v1.ContractSpecIdInfo value) {
      if (contractSpecIdInfoBuilder_ == null) {
        if (contractSpecIdInfo_ != null) {
          contractSpecIdInfo_ =
            io.provenance.metadata.v1.ContractSpecIdInfo.newBuilder(contractSpecIdInfo_).mergeFrom(value).buildPartial();
        } else {
          contractSpecIdInfo_ = value;
        }
        onChanged();
      } else {
        contractSpecIdInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public Builder clearContractSpecIdInfo() {
      if (contractSpecIdInfoBuilder_ == null) {
        contractSpecIdInfo_ = null;
        onChanged();
      } else {
        contractSpecIdInfo_ = null;
        contractSpecIdInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public io.provenance.metadata.v1.ContractSpecIdInfo.Builder getContractSpecIdInfoBuilder() {
      
      onChanged();
      return getContractSpecIdInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    public io.provenance.metadata.v1.ContractSpecIdInfoOrBuilder getContractSpecIdInfoOrBuilder() {
      if (contractSpecIdInfoBuilder_ != null) {
        return contractSpecIdInfoBuilder_.getMessageOrBuilder();
      } else {
        return contractSpecIdInfo_ == null ?
            io.provenance.metadata.v1.ContractSpecIdInfo.getDefaultInstance() : contractSpecIdInfo_;
      }
    }
    /**
     * <pre>
     * contract_spec_id_info contains information about the id/address of the contract specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ContractSpecIdInfo contract_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_spec_id_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.ContractSpecIdInfo, io.provenance.metadata.v1.ContractSpecIdInfo.Builder, io.provenance.metadata.v1.ContractSpecIdInfoOrBuilder> 
        getContractSpecIdInfoFieldBuilder() {
      if (contractSpecIdInfoBuilder_ == null) {
        contractSpecIdInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.ContractSpecIdInfo, io.provenance.metadata.v1.ContractSpecIdInfo.Builder, io.provenance.metadata.v1.ContractSpecIdInfoOrBuilder>(
                getContractSpecIdInfo(),
                getParentForChildren(),
                isClean());
        contractSpecIdInfo_ = null;
      }
      return contractSpecIdInfoBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.ContractSpecificationWrapper)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.ContractSpecificationWrapper)
  private static final io.provenance.metadata.v1.ContractSpecificationWrapper DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.ContractSpecificationWrapper();
  }

  public static io.provenance.metadata.v1.ContractSpecificationWrapper getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContractSpecificationWrapper>
      PARSER = new com.google.protobuf.AbstractParser<ContractSpecificationWrapper>() {
    @java.lang.Override
    public ContractSpecificationWrapper parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ContractSpecificationWrapper(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContractSpecificationWrapper> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContractSpecificationWrapper> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.ContractSpecificationWrapper getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
