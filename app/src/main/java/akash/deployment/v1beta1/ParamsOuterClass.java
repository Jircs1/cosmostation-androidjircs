// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta1/params.proto

package akash.deployment.v1beta1;

public final class ParamsOuterClass {
  private ParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:akash.deployment.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     * @return Whether the deploymentMinDeposit field is set.
     */
    boolean hasDeploymentMinDeposit();
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     * @return The deploymentMinDeposit.
     */
    cosmos.base.v1beta1.CoinOuterClass.Coin getDeploymentMinDeposit();
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getDeploymentMinDepositOrBuilder();
  }
  /**
   * <pre>
   * Params defines the parameters for the x/deployment package
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:akash.deployment.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Params(
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
              cosmos.base.v1beta1.CoinOuterClass.Coin.Builder subBuilder = null;
              if (deploymentMinDeposit_ != null) {
                subBuilder = deploymentMinDeposit_.toBuilder();
              }
              deploymentMinDeposit_ = input.readMessage(cosmos.base.v1beta1.CoinOuterClass.Coin.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(deploymentMinDeposit_);
                deploymentMinDeposit_ = subBuilder.buildPartial();
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
      return akash.deployment.v1beta1.ParamsOuterClass.internal_static_akash_deployment_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return akash.deployment.v1beta1.ParamsOuterClass.internal_static_akash_deployment_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              akash.deployment.v1beta1.ParamsOuterClass.Params.class, akash.deployment.v1beta1.ParamsOuterClass.Params.Builder.class);
    }

    public static final int DEPLOYMENT_MIN_DEPOSIT_FIELD_NUMBER = 1;
    private cosmos.base.v1beta1.CoinOuterClass.Coin deploymentMinDeposit_;
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     * @return Whether the deploymentMinDeposit field is set.
     */
    @java.lang.Override
    public boolean hasDeploymentMinDeposit() {
      return deploymentMinDeposit_ != null;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     * @return The deploymentMinDeposit.
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.Coin getDeploymentMinDeposit() {
      return deploymentMinDeposit_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : deploymentMinDeposit_;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getDeploymentMinDepositOrBuilder() {
      return getDeploymentMinDeposit();
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
      if (deploymentMinDeposit_ != null) {
        output.writeMessage(1, getDeploymentMinDeposit());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (deploymentMinDeposit_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getDeploymentMinDeposit());
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
      if (!(obj instanceof akash.deployment.v1beta1.ParamsOuterClass.Params)) {
        return super.equals(obj);
      }
      akash.deployment.v1beta1.ParamsOuterClass.Params other = (akash.deployment.v1beta1.ParamsOuterClass.Params) obj;

      if (hasDeploymentMinDeposit() != other.hasDeploymentMinDeposit()) return false;
      if (hasDeploymentMinDeposit()) {
        if (!getDeploymentMinDeposit()
            .equals(other.getDeploymentMinDeposit())) return false;
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
      if (hasDeploymentMinDeposit()) {
        hash = (37 * hash) + DEPLOYMENT_MIN_DEPOSIT_FIELD_NUMBER;
        hash = (53 * hash) + getDeploymentMinDeposit().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta1.ParamsOuterClass.Params parseFrom(
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
    public static Builder newBuilder(akash.deployment.v1beta1.ParamsOuterClass.Params prototype) {
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
     * Params defines the parameters for the x/deployment package
     * </pre>
     *
     * Protobuf type {@code akash.deployment.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta1.Params)
        akash.deployment.v1beta1.ParamsOuterClass.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return akash.deployment.v1beta1.ParamsOuterClass.internal_static_akash_deployment_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return akash.deployment.v1beta1.ParamsOuterClass.internal_static_akash_deployment_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                akash.deployment.v1beta1.ParamsOuterClass.Params.class, akash.deployment.v1beta1.ParamsOuterClass.Params.Builder.class);
      }

      // Construct using akash.deployment.v1beta1.ParamsOuterClass.Params.newBuilder()
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
        if (deploymentMinDepositBuilder_ == null) {
          deploymentMinDeposit_ = null;
        } else {
          deploymentMinDeposit_ = null;
          deploymentMinDepositBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return akash.deployment.v1beta1.ParamsOuterClass.internal_static_akash_deployment_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public akash.deployment.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
        return akash.deployment.v1beta1.ParamsOuterClass.Params.getDefaultInstance();
      }

      @java.lang.Override
      public akash.deployment.v1beta1.ParamsOuterClass.Params build() {
        akash.deployment.v1beta1.ParamsOuterClass.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public akash.deployment.v1beta1.ParamsOuterClass.Params buildPartial() {
        akash.deployment.v1beta1.ParamsOuterClass.Params result = new akash.deployment.v1beta1.ParamsOuterClass.Params(this);
        if (deploymentMinDepositBuilder_ == null) {
          result.deploymentMinDeposit_ = deploymentMinDeposit_;
        } else {
          result.deploymentMinDeposit_ = deploymentMinDepositBuilder_.build();
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
        if (other instanceof akash.deployment.v1beta1.ParamsOuterClass.Params) {
          return mergeFrom((akash.deployment.v1beta1.ParamsOuterClass.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(akash.deployment.v1beta1.ParamsOuterClass.Params other) {
        if (other == akash.deployment.v1beta1.ParamsOuterClass.Params.getDefaultInstance()) return this;
        if (other.hasDeploymentMinDeposit()) {
          mergeDeploymentMinDeposit(other.getDeploymentMinDeposit());
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
        akash.deployment.v1beta1.ParamsOuterClass.Params parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (akash.deployment.v1beta1.ParamsOuterClass.Params) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private cosmos.base.v1beta1.CoinOuterClass.Coin deploymentMinDeposit_;
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> deploymentMinDepositBuilder_;
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       * @return Whether the deploymentMinDeposit field is set.
       */
      public boolean hasDeploymentMinDeposit() {
        return deploymentMinDepositBuilder_ != null || deploymentMinDeposit_ != null;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       * @return The deploymentMinDeposit.
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin getDeploymentMinDeposit() {
        if (deploymentMinDepositBuilder_ == null) {
          return deploymentMinDeposit_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : deploymentMinDeposit_;
        } else {
          return deploymentMinDepositBuilder_.getMessage();
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       */
      public Builder setDeploymentMinDeposit(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (deploymentMinDepositBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          deploymentMinDeposit_ = value;
          onChanged();
        } else {
          deploymentMinDepositBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       */
      public Builder setDeploymentMinDeposit(
          cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
        if (deploymentMinDepositBuilder_ == null) {
          deploymentMinDeposit_ = builderForValue.build();
          onChanged();
        } else {
          deploymentMinDepositBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       */
      public Builder mergeDeploymentMinDeposit(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (deploymentMinDepositBuilder_ == null) {
          if (deploymentMinDeposit_ != null) {
            deploymentMinDeposit_ =
              cosmos.base.v1beta1.CoinOuterClass.Coin.newBuilder(deploymentMinDeposit_).mergeFrom(value).buildPartial();
          } else {
            deploymentMinDeposit_ = value;
          }
          onChanged();
        } else {
          deploymentMinDepositBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       */
      public Builder clearDeploymentMinDeposit() {
        if (deploymentMinDepositBuilder_ == null) {
          deploymentMinDeposit_ = null;
          onChanged();
        } else {
          deploymentMinDeposit_ = null;
          deploymentMinDepositBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder getDeploymentMinDepositBuilder() {
        
        onChanged();
        return getDeploymentMinDepositFieldBuilder().getBuilder();
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getDeploymentMinDepositOrBuilder() {
        if (deploymentMinDepositBuilder_ != null) {
          return deploymentMinDepositBuilder_.getMessageOrBuilder();
        } else {
          return deploymentMinDeposit_ == null ?
              cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : deploymentMinDeposit_;
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin deployment_min_deposit = 1 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentMinDeposit", (.gogoproto.jsontag) = "deployment_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"deployment_min_deposit&#92;""];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
          getDeploymentMinDepositFieldBuilder() {
        if (deploymentMinDepositBuilder_ == null) {
          deploymentMinDepositBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder>(
                  getDeploymentMinDeposit(),
                  getParentForChildren(),
                  isClean());
          deploymentMinDeposit_ = null;
        }
        return deploymentMinDepositBuilder_;
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


      // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:akash.deployment.v1beta1.Params)
    private static final akash.deployment.v1beta1.ParamsOuterClass.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new akash.deployment.v1beta1.ParamsOuterClass.Params();
    }

    public static akash.deployment.v1beta1.ParamsOuterClass.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Params(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public akash.deployment.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_deployment_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_deployment_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%akash/deployment/v1beta1/params.proto\022" +
      "\030akash.deployment.v1beta1\032\024gogoproto/gog" +
      "o.proto\032\036cosmos/base/v1beta1/coin.proto\"" +
      "\235\001\n\006Params\022\222\001\n\026deployment_min_deposit\030\001 " +
      "\001(\0132\031.cosmos.base.v1beta1.CoinBW\342\336\037\024Depl" +
      "oymentMinDeposit\310\336\037\000\352\336\037\026deployment_min_d" +
      "eposit\362\336\037\035yaml:\"deployment_min_deposit\"B" +
      ",Z*github.com/ovrclk/akash/x/deployment/" +
      "typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
        });
    internal_static_akash_deployment_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_deployment_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_deployment_v1beta1_Params_descriptor,
        new java.lang.String[] { "DeploymentMinDeposit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.customname);
    registry.add(com.google.protobuf2.GoGoProtos.jsontag);
    registry.add(com.google.protobuf2.GoGoProtos.moretags);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}