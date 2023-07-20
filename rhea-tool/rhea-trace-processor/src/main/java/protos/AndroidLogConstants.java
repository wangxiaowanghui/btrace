// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/perfetto/common/android_log_constants.proto

package perfetto.protos;

public final class AndroidLogConstants {
  private AndroidLogConstants() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Values from NDK's android/log.h.
   * </pre>
   *
   * Protobuf enum {@code perfetto.protos.AndroidLogId}
   */
  public enum AndroidLogId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * MAIN.
     * </pre>
     *
     * <code>LID_DEFAULT = 0;</code>
     */
    LID_DEFAULT(0),
    /**
     * <code>LID_RADIO = 1;</code>
     */
    LID_RADIO(1),
    /**
     * <code>LID_EVENTS = 2;</code>
     */
    LID_EVENTS(2),
    /**
     * <code>LID_SYSTEM = 3;</code>
     */
    LID_SYSTEM(3),
    /**
     * <code>LID_CRASH = 4;</code>
     */
    LID_CRASH(4),
    /**
     * <code>LID_STATS = 5;</code>
     */
    LID_STATS(5),
    /**
     * <code>LID_SECURITY = 6;</code>
     */
    LID_SECURITY(6),
    /**
     * <code>LID_KERNEL = 7;</code>
     */
    LID_KERNEL(7),
    ;

    /**
     * <pre>
     * MAIN.
     * </pre>
     *
     * <code>LID_DEFAULT = 0;</code>
     */
    public static final int LID_DEFAULT_VALUE = 0;
    /**
     * <code>LID_RADIO = 1;</code>
     */
    public static final int LID_RADIO_VALUE = 1;
    /**
     * <code>LID_EVENTS = 2;</code>
     */
    public static final int LID_EVENTS_VALUE = 2;
    /**
     * <code>LID_SYSTEM = 3;</code>
     */
    public static final int LID_SYSTEM_VALUE = 3;
    /**
     * <code>LID_CRASH = 4;</code>
     */
    public static final int LID_CRASH_VALUE = 4;
    /**
     * <code>LID_STATS = 5;</code>
     */
    public static final int LID_STATS_VALUE = 5;
    /**
     * <code>LID_SECURITY = 6;</code>
     */
    public static final int LID_SECURITY_VALUE = 6;
    /**
     * <code>LID_KERNEL = 7;</code>
     */
    public static final int LID_KERNEL_VALUE = 7;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AndroidLogId valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AndroidLogId forNumber(int value) {
      switch (value) {
        case 0: return LID_DEFAULT;
        case 1: return LID_RADIO;
        case 2: return LID_EVENTS;
        case 3: return LID_SYSTEM;
        case 4: return LID_CRASH;
        case 5: return LID_STATS;
        case 6: return LID_SECURITY;
        case 7: return LID_KERNEL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AndroidLogId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AndroidLogId> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AndroidLogId>() {
            public AndroidLogId findValueByNumber(int number) {
              return AndroidLogId.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return perfetto.protos.AndroidLogConstants.getDescriptor().getEnumTypes().get(0);
    }

    private static final AndroidLogId[] VALUES = values();

    public static AndroidLogId valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AndroidLogId(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:perfetto.protos.AndroidLogId)
  }

  /**
   * Protobuf enum {@code perfetto.protos.AndroidLogPriority}
   */
  public enum AndroidLogPriority
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PRIO_UNSPECIFIED = 0;</code>
     */
    PRIO_UNSPECIFIED(0),
    /**
     * <pre>
     * _DEFAULT, but should never be seen in logs.
     * </pre>
     *
     * <code>PRIO_UNUSED = 1;</code>
     */
    PRIO_UNUSED(1),
    /**
     * <code>PRIO_VERBOSE = 2;</code>
     */
    PRIO_VERBOSE(2),
    /**
     * <code>PRIO_DEBUG = 3;</code>
     */
    PRIO_DEBUG(3),
    /**
     * <code>PRIO_INFO = 4;</code>
     */
    PRIO_INFO(4),
    /**
     * <code>PRIO_WARN = 5;</code>
     */
    PRIO_WARN(5),
    /**
     * <code>PRIO_ERROR = 6;</code>
     */
    PRIO_ERROR(6),
    /**
     * <code>PRIO_FATAL = 7;</code>
     */
    PRIO_FATAL(7),
    ;

    /**
     * <code>PRIO_UNSPECIFIED = 0;</code>
     */
    public static final int PRIO_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * _DEFAULT, but should never be seen in logs.
     * </pre>
     *
     * <code>PRIO_UNUSED = 1;</code>
     */
    public static final int PRIO_UNUSED_VALUE = 1;
    /**
     * <code>PRIO_VERBOSE = 2;</code>
     */
    public static final int PRIO_VERBOSE_VALUE = 2;
    /**
     * <code>PRIO_DEBUG = 3;</code>
     */
    public static final int PRIO_DEBUG_VALUE = 3;
    /**
     * <code>PRIO_INFO = 4;</code>
     */
    public static final int PRIO_INFO_VALUE = 4;
    /**
     * <code>PRIO_WARN = 5;</code>
     */
    public static final int PRIO_WARN_VALUE = 5;
    /**
     * <code>PRIO_ERROR = 6;</code>
     */
    public static final int PRIO_ERROR_VALUE = 6;
    /**
     * <code>PRIO_FATAL = 7;</code>
     */
    public static final int PRIO_FATAL_VALUE = 7;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AndroidLogPriority valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AndroidLogPriority forNumber(int value) {
      switch (value) {
        case 0: return PRIO_UNSPECIFIED;
        case 1: return PRIO_UNUSED;
        case 2: return PRIO_VERBOSE;
        case 3: return PRIO_DEBUG;
        case 4: return PRIO_INFO;
        case 5: return PRIO_WARN;
        case 6: return PRIO_ERROR;
        case 7: return PRIO_FATAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AndroidLogPriority>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AndroidLogPriority> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AndroidLogPriority>() {
            public AndroidLogPriority findValueByNumber(int number) {
              return AndroidLogPriority.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return perfetto.protos.AndroidLogConstants.getDescriptor().getEnumTypes().get(1);
    }

    private static final AndroidLogPriority[] VALUES = values();

    public static AndroidLogPriority valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AndroidLogPriority(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:perfetto.protos.AndroidLogPriority)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2protos/perfetto/common/android_log_con" +
      "stants.proto\022\017perfetto.protos*\216\001\n\014Androi" +
      "dLogId\022\017\n\013LID_DEFAULT\020\000\022\r\n\tLID_RADIO\020\001\022\016" +
      "\n\nLID_EVENTS\020\002\022\016\n\nLID_SYSTEM\020\003\022\r\n\tLID_CR" +
      "ASH\020\004\022\r\n\tLID_STATS\020\005\022\020\n\014LID_SECURITY\020\006\022\016" +
      "\n\nLID_KERNEL\020\007*\233\001\n\022AndroidLogPriority\022\024\n" +
      "\020PRIO_UNSPECIFIED\020\000\022\017\n\013PRIO_UNUSED\020\001\022\020\n\014" +
      "PRIO_VERBOSE\020\002\022\016\n\nPRIO_DEBUG\020\003\022\r\n\tPRIO_I" +
      "NFO\020\004\022\r\n\tPRIO_WARN\020\005\022\016\n\nPRIO_ERROR\020\006\022\016\n\n" +
      "PRIO_FATAL\020\007"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}