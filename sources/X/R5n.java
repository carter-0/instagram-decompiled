package X;

import com.google.repack.protobuf.Any;
import com.google.repack.protobuf.Api;
import com.google.repack.protobuf.BoolValue;
import com.google.repack.protobuf.BytesValue;
import com.google.repack.protobuf.DoubleValue;
import com.google.repack.protobuf.Duration;
import com.google.repack.protobuf.Empty;
import com.google.repack.protobuf.Enum;
import com.google.repack.protobuf.EnumValue;
import com.google.repack.protobuf.Field;
import com.google.repack.protobuf.FieldMask;
import com.google.repack.protobuf.FloatValue;
import com.google.repack.protobuf.Int32Value;
import com.google.repack.protobuf.Int64Value;
import com.google.repack.protobuf.ListValue;
import com.google.repack.protobuf.Method;
import com.google.repack.protobuf.Mixin;
import com.google.repack.protobuf.Option;
import com.google.repack.protobuf.SourceContext;
import com.google.repack.protobuf.StringValue;
import com.google.repack.protobuf.Struct;
import com.google.repack.protobuf.Timestamp;
import com.google.repack.protobuf.Type;
import com.google.repack.protobuf.UInt32Value;
import com.google.repack.protobuf.UInt64Value;
import com.google.repack.protobuf.Value;
import com.meta.hera.engine.device.Device;
import com.meta.hera.engine.device.DeviceActions$RegisterDevice;
import com.meta.hera.engine.device.DeviceActions$SearchDevices;
import com.meta.hera.engine.device.DeviceActions$UnregisterDevice;
import com.meta.hera.engine.device.DeviceActions$UpdatePeripheralState;
import com.meta.hera.engine.device.DevicePeripheralState;
import com.meta.hera.engine.device.DeviceState;
import com.meta.hera.engine.device.PhonePeripheralState;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class R5n extends T5R {
    public static Map defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public SIT unknownFields = SIT.A03;

    public static T5T A00(R5n r5n) {
        return new T5T(r5n);
    }

    public static C10705Rwj A01(T5R t5r, String str, Object[] objArr) {
        return new C10705Rwj(t5r, str, objArr);
    }

    public final Object A03(Integer num) {
        C13494TbL tbL;
        C13494TbL tbL2;
        C13494TbL tbL3;
        C13494TbL tbL4;
        C13494TbL tbL5;
        C13494TbL tbL6;
        C13494TbL tbL7;
        C13494TbL tbL8;
        C13494TbL tbL9;
        C13494TbL tbL10;
        C13494TbL tbL11;
        C13494TbL tbL12;
        C13494TbL tbL13;
        C13494TbL tbL14;
        C13494TbL tbL15;
        C13494TbL tbL16;
        C13494TbL tbL17;
        C13494TbL tbL18;
        C13494TbL tbL19;
        C13494TbL tbL20;
        C13494TbL tbL21;
        C13494TbL tbL22;
        C13494TbL tbL23;
        C13494TbL tbL24;
        C13494TbL tbL25;
        C13494TbL tbL26;
        C13494TbL tbL27;
        C13494TbL tbL28;
        C13494TbL tbL29;
        C13494TbL tbL30;
        C13494TbL tbL31;
        C13494TbL tbL32;
        C13494TbL tbL33;
        C13494TbL tbL34;
        if (this instanceof PhonePeripheralState) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(PhonePeripheralState.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "phoneApplicationLifecycleState_"});
                case 3:
                    return new R5n();
                case 4:
                    return new R6Q();
                case 5:
                    return PhonePeripheralState.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL35 = PhonePeripheralState.PARSER;
                    if (tbL35 != null) {
                        return tbL35;
                    }
                    synchronized (PhonePeripheralState.class) {
                        tbL34 = PhonePeripheralState.PARSER;
                        if (tbL34 == null) {
                            SNG sng = T5T.A01;
                            tbL34 = A00(PhonePeripheralState.DEFAULT_INSTANCE);
                            PhonePeripheralState.PARSER = tbL34;
                        }
                    }
                    return tbL34;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DeviceState) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceState.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"devices_", Device.class, "searchRequestId_"});
                case 3:
                    return new DeviceState();
                case 4:
                    return new R6P();
                case 5:
                    return DeviceState.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL36 = DeviceState.PARSER;
                    if (tbL36 != null) {
                        return tbL36;
                    }
                    synchronized (DeviceState.class) {
                        tbL33 = DeviceState.PARSER;
                        if (tbL33 == null) {
                            SNG sng2 = T5T.A01;
                            tbL33 = A00(DeviceState.DEFAULT_INSTANCE);
                            DeviceState.PARSER = tbL33;
                        }
                    }
                    return tbL33;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DevicePeripheralState) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DevicePeripheralState.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"bitField0_", "glassesHingeState_", "glassesMountState_", "deviceThermalState_", "deviceBatteryState_", "devicePeakPowerState_", "deviceCameraErrorState_"});
                case 3:
                    return new R5n();
                case 4:
                    return new R6O();
                case 5:
                    return DevicePeripheralState.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL37 = DevicePeripheralState.PARSER;
                    if (tbL37 != null) {
                        return tbL37;
                    }
                    synchronized (DevicePeripheralState.class) {
                        tbL32 = DevicePeripheralState.PARSER;
                        if (tbL32 == null) {
                            SNG sng3 = T5T.A01;
                            tbL32 = A00(DevicePeripheralState.DEFAULT_INSTANCE);
                            DevicePeripheralState.PARSER = tbL32;
                        }
                    }
                    return tbL32;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DeviceActions$UpdatePeripheralState) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceActions$UpdatePeripheralState.DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"delta_", "deltaCase_", "deviceId_", DevicePeripheralState.class, PhonePeripheralState.class});
                case 3:
                    return new DeviceActions$UpdatePeripheralState();
                case 4:
                    return new R6N();
                case 5:
                    return DeviceActions$UpdatePeripheralState.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL38 = DeviceActions$UpdatePeripheralState.PARSER;
                    if (tbL38 != null) {
                        return tbL38;
                    }
                    synchronized (DeviceActions$UpdatePeripheralState.class) {
                        tbL31 = DeviceActions$UpdatePeripheralState.PARSER;
                        if (tbL31 == null) {
                            SNG sng4 = T5T.A01;
                            tbL31 = A00(DeviceActions$UpdatePeripheralState.DEFAULT_INSTANCE);
                            DeviceActions$UpdatePeripheralState.PARSER = tbL31;
                        }
                    }
                    return tbL31;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DeviceActions$UnregisterDevice) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceActions$UnregisterDevice.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceId_"});
                case 3:
                    return new DeviceActions$UnregisterDevice();
                case 4:
                    return new R6M();
                case 5:
                    return DeviceActions$UnregisterDevice.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL39 = DeviceActions$UnregisterDevice.PARSER;
                    if (tbL39 != null) {
                        return tbL39;
                    }
                    synchronized (DeviceActions$UnregisterDevice.class) {
                        tbL30 = DeviceActions$UnregisterDevice.PARSER;
                        if (tbL30 == null) {
                            SNG sng5 = T5T.A01;
                            tbL30 = A00(DeviceActions$UnregisterDevice.DEFAULT_INSTANCE);
                            DeviceActions$UnregisterDevice.PARSER = tbL30;
                        }
                    }
                    return tbL30;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DeviceActions$SearchDevices) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceActions$SearchDevices.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "timeoutMs_"});
                case 3:
                    return new R5n();
                case 4:
                    return new R6L();
                case 5:
                    return DeviceActions$SearchDevices.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL40 = DeviceActions$SearchDevices.PARSER;
                    if (tbL40 != null) {
                        return tbL40;
                    }
                    synchronized (DeviceActions$SearchDevices.class) {
                        tbL29 = DeviceActions$SearchDevices.PARSER;
                        if (tbL29 == null) {
                            SNG sng6 = T5T.A01;
                            tbL29 = A00(DeviceActions$SearchDevices.DEFAULT_INSTANCE);
                            DeviceActions$SearchDevices.PARSER = tbL29;
                        }
                    }
                    return tbL29;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DeviceActions$RegisterDevice) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceActions$RegisterDevice.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"device_"});
                case 3:
                    return new R5n();
                case 4:
                    return new R6K();
                case 5:
                    return DeviceActions$RegisterDevice.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL41 = DeviceActions$RegisterDevice.PARSER;
                    if (tbL41 != null) {
                        return tbL41;
                    }
                    synchronized (DeviceActions$RegisterDevice.class) {
                        tbL28 = DeviceActions$RegisterDevice.PARSER;
                        if (tbL28 == null) {
                            SNG sng7 = T5T.A01;
                            tbL28 = A00(DeviceActions$RegisterDevice.DEFAULT_INSTANCE);
                            DeviceActions$RegisterDevice.PARSER = tbL28;
                        }
                    }
                    return tbL28;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Device) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Device.DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ለ\u0000\u0004\f\u0005\u0003\u0006<\u0000\u0007<\u0000", new Object[]{"peripheralState_", "peripheralStateCase_", "bitField0_", "id_", "role_", "name_", "status_", "lastHeartbeatTimestampMs_", DevicePeripheralState.class, PhonePeripheralState.class});
                case 3:
                    return new Device();
                case 4:
                    return new R6J();
                case 5:
                    return Device.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL42 = Device.PARSER;
                    if (tbL42 != null) {
                        return tbL42;
                    }
                    synchronized (Device.class) {
                        tbL27 = Device.PARSER;
                        if (tbL27 == null) {
                            SNG sng8 = T5T.A01;
                            tbL27 = A00(Device.DEFAULT_INSTANCE);
                            Device.PARSER = tbL27;
                        }
                    }
                    return tbL27;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Value.DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
                case 3:
                    return new Value();
                case 4:
                    return new R6I();
                case 5:
                    return Value.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL43 = Value.PARSER;
                    if (tbL43 != null) {
                        return tbL43;
                    }
                    synchronized (Value.class) {
                        tbL26 = Value.PARSER;
                        if (tbL26 == null) {
                            SNG sng9 = T5T.A01;
                            tbL26 = A00(Value.DEFAULT_INSTANCE);
                            Value.PARSER = tbL26;
                        }
                    }
                    return tbL26;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof UInt64Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(UInt64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", Pxh.A1Z());
                case 3:
                    return new R5n();
                case 4:
                    return new R6H();
                case 5:
                    return UInt64Value.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL44 = UInt64Value.PARSER;
                    if (tbL44 != null) {
                        return tbL44;
                    }
                    synchronized (UInt64Value.class) {
                        tbL25 = UInt64Value.PARSER;
                        if (tbL25 == null) {
                            SNG sng10 = T5T.A01;
                            tbL25 = A00(UInt64Value.DEFAULT_INSTANCE);
                            UInt64Value.PARSER = tbL25;
                        }
                    }
                    return tbL25;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof UInt32Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(UInt32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", Pxh.A1Z());
                case 3:
                    return new R5n();
                case 4:
                    return new R6G();
                case 5:
                    return UInt32Value.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL45 = UInt32Value.PARSER;
                    if (tbL45 != null) {
                        return tbL45;
                    }
                    synchronized (UInt32Value.class) {
                        tbL24 = UInt32Value.PARSER;
                        if (tbL24 == null) {
                            SNG sng11 = T5T.A01;
                            tbL24 = A00(UInt32Value.DEFAULT_INSTANCE);
                            UInt32Value.PARSER = tbL24;
                        }
                    }
                    return tbL24;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Type) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Type.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
                case 3:
                    return new Type();
                case 4:
                    return new R6F();
                case 5:
                    return Type.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL46 = Type.PARSER;
                    if (tbL46 != null) {
                        return tbL46;
                    }
                    synchronized (Type.class) {
                        tbL23 = Type.PARSER;
                        if (tbL23 == null) {
                            SNG sng12 = T5T.A01;
                            tbL23 = A00(Type.DEFAULT_INSTANCE);
                            Type.PARSER = tbL23;
                        }
                    }
                    return tbL23;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Timestamp) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Timestamp.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 3:
                    return new R5n();
                case 4:
                    return new R6E();
                case 5:
                    return Timestamp.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL47 = Timestamp.PARSER;
                    if (tbL47 != null) {
                        return tbL47;
                    }
                    synchronized (Timestamp.class) {
                        tbL22 = Timestamp.PARSER;
                        if (tbL22 == null) {
                            SNG sng13 = T5T.A01;
                            tbL22 = A00(Timestamp.DEFAULT_INSTANCE);
                            Timestamp.PARSER = tbL22;
                        }
                    }
                    return tbL22;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Struct) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Struct.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", C10020RlF.A00});
                case 3:
                    return new Struct();
                case 4:
                    return new R6D();
                case 5:
                    return Struct.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL48 = Struct.PARSER;
                    if (tbL48 != null) {
                        return tbL48;
                    }
                    synchronized (Struct.class) {
                        tbL21 = Struct.PARSER;
                        if (tbL21 == null) {
                            SNG sng14 = T5T.A01;
                            tbL21 = A00(Struct.DEFAULT_INSTANCE);
                            Struct.PARSER = tbL21;
                        }
                    }
                    return tbL21;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof StringValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(StringValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", Pxh.A1Z());
                case 3:
                    return new StringValue();
                case 4:
                    return new R6C();
                case 5:
                    return StringValue.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL49 = StringValue.PARSER;
                    if (tbL49 != null) {
                        return tbL49;
                    }
                    synchronized (StringValue.class) {
                        tbL20 = StringValue.PARSER;
                        if (tbL20 == null) {
                            SNG sng15 = T5T.A01;
                            tbL20 = A00(StringValue.DEFAULT_INSTANCE);
                            StringValue.PARSER = tbL20;
                        }
                    }
                    return tbL20;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof SourceContext) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(SourceContext.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
                case 3:
                    return new SourceContext();
                case 4:
                    return new R6B();
                case 5:
                    return SourceContext.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL50 = SourceContext.PARSER;
                    if (tbL50 != null) {
                        return tbL50;
                    }
                    synchronized (SourceContext.class) {
                        tbL19 = SourceContext.PARSER;
                        if (tbL19 == null) {
                            SNG sng16 = T5T.A01;
                            tbL19 = A00(SourceContext.DEFAULT_INSTANCE);
                            SourceContext.PARSER = tbL19;
                        }
                    }
                    return tbL19;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Option) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Option.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
                case 3:
                    return new Option();
                case 4:
                    return new R6A();
                case 5:
                    return Option.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL51 = Option.PARSER;
                    if (tbL51 != null) {
                        return tbL51;
                    }
                    synchronized (Option.class) {
                        tbL18 = Option.PARSER;
                        if (tbL18 == null) {
                            SNG sng17 = T5T.A01;
                            tbL18 = A00(Option.DEFAULT_INSTANCE);
                            Option.PARSER = tbL18;
                        }
                    }
                    return tbL18;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Mixin) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Mixin.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
                case 3:
                    return new Mixin();
                case 4:
                    return new R69();
                case 5:
                    return Mixin.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL52 = Mixin.PARSER;
                    if (tbL52 != null) {
                        return tbL52;
                    }
                    synchronized (Mixin.class) {
                        tbL17 = Mixin.PARSER;
                        if (tbL17 == null) {
                            SNG sng18 = T5T.A01;
                            tbL17 = A00(Mixin.DEFAULT_INSTANCE);
                            Mixin.PARSER = tbL17;
                        }
                    }
                    return tbL17;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Method) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Method.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
                case 3:
                    return new Method();
                case 4:
                    return new R68();
                case 5:
                    return Method.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL53 = Method.PARSER;
                    if (tbL53 != null) {
                        return tbL53;
                    }
                    synchronized (Method.class) {
                        tbL16 = Method.PARSER;
                        if (tbL16 == null) {
                            SNG sng19 = T5T.A01;
                            tbL16 = A00(Method.DEFAULT_INSTANCE);
                            Method.PARSER = tbL16;
                        }
                    }
                    return tbL16;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof ListValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(ListValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
                case 3:
                    return new ListValue();
                case 4:
                    return new R67();
                case 5:
                    return ListValue.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL54 = ListValue.PARSER;
                    if (tbL54 != null) {
                        return tbL54;
                    }
                    synchronized (ListValue.class) {
                        tbL15 = ListValue.PARSER;
                        if (tbL15 == null) {
                            SNG sng20 = T5T.A01;
                            tbL15 = A00(ListValue.DEFAULT_INSTANCE);
                            ListValue.PARSER = tbL15;
                        }
                    }
                    return tbL15;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Int64Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Int64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", Pxh.A1Z());
                case 3:
                    return new R5n();
                case 4:
                    return new R66();
                case 5:
                    return Int64Value.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL55 = Int64Value.PARSER;
                    if (tbL55 != null) {
                        return tbL55;
                    }
                    synchronized (Int64Value.class) {
                        tbL14 = Int64Value.PARSER;
                        if (tbL14 == null) {
                            SNG sng21 = T5T.A01;
                            tbL14 = A00(Int64Value.DEFAULT_INSTANCE);
                            Int64Value.PARSER = tbL14;
                        }
                    }
                    return tbL14;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Int32Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Int32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", Pxh.A1Z());
                case 3:
                    return new R5n();
                case 4:
                    return new R65();
                case 5:
                    return Int32Value.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL56 = Int32Value.PARSER;
                    if (tbL56 != null) {
                        return tbL56;
                    }
                    synchronized (Int32Value.class) {
                        tbL13 = Int32Value.PARSER;
                        if (tbL13 == null) {
                            SNG sng22 = T5T.A01;
                            tbL13 = A00(Int32Value.DEFAULT_INSTANCE);
                            Int32Value.PARSER = tbL13;
                        }
                    }
                    return tbL13;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof FloatValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(FloatValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", Pxh.A1Z());
                case 3:
                    return new R5n();
                case 4:
                    return new R64();
                case 5:
                    return FloatValue.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL57 = FloatValue.PARSER;
                    if (tbL57 != null) {
                        return tbL57;
                    }
                    synchronized (FloatValue.class) {
                        tbL12 = FloatValue.PARSER;
                        if (tbL12 == null) {
                            SNG sng23 = T5T.A01;
                            tbL12 = A00(FloatValue.DEFAULT_INSTANCE);
                            FloatValue.PARSER = tbL12;
                        }
                    }
                    return tbL12;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof FieldMask) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(FieldMask.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
                case 3:
                    return new FieldMask();
                case 4:
                    return new R63();
                case 5:
                    return FieldMask.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL58 = FieldMask.PARSER;
                    if (tbL58 != null) {
                        return tbL58;
                    }
                    synchronized (FieldMask.class) {
                        tbL11 = FieldMask.PARSER;
                        if (tbL11 == null) {
                            SNG sng24 = T5T.A01;
                            tbL11 = A00(FieldMask.DEFAULT_INSTANCE);
                            FieldMask.PARSER = tbL11;
                        }
                    }
                    return tbL11;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Field) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Field.DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
                case 3:
                    return new Field();
                case 4:
                    return new R62();
                case 5:
                    return Field.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL59 = Field.PARSER;
                    if (tbL59 != null) {
                        return tbL59;
                    }
                    synchronized (Field.class) {
                        tbL10 = Field.PARSER;
                        if (tbL10 == null) {
                            SNG sng25 = T5T.A01;
                            tbL10 = A00(Field.DEFAULT_INSTANCE);
                            Field.PARSER = tbL10;
                        }
                    }
                    return tbL10;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof EnumValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(EnumValue.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
                case 3:
                    return new EnumValue();
                case 4:
                    return new R61();
                case 5:
                    return EnumValue.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL60 = EnumValue.PARSER;
                    if (tbL60 != null) {
                        return tbL60;
                    }
                    synchronized (EnumValue.class) {
                        tbL9 = EnumValue.PARSER;
                        if (tbL9 == null) {
                            SNG sng26 = T5T.A01;
                            tbL9 = A00(EnumValue.DEFAULT_INSTANCE);
                            EnumValue.PARSER = tbL9;
                        }
                    }
                    return tbL9;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Enum) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Enum.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
                case 3:
                    return new Enum();
                case 4:
                    return new R60();
                case 5:
                    return Enum.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL61 = Enum.PARSER;
                    if (tbL61 != null) {
                        return tbL61;
                    }
                    synchronized (Enum.class) {
                        tbL8 = Enum.PARSER;
                        if (tbL8 == null) {
                            SNG sng27 = T5T.A01;
                            tbL8 = A00(Enum.DEFAULT_INSTANCE);
                            Enum.PARSER = tbL8;
                        }
                    }
                    return tbL8;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Empty) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Empty.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new R5n();
                case 4:
                    return new R5z();
                case 5:
                    return Empty.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL62 = Empty.PARSER;
                    if (tbL62 != null) {
                        return tbL62;
                    }
                    synchronized (Empty.class) {
                        tbL7 = Empty.PARSER;
                        if (tbL7 == null) {
                            SNG sng28 = T5T.A01;
                            tbL7 = A00(Empty.DEFAULT_INSTANCE);
                            Empty.PARSER = tbL7;
                        }
                    }
                    return tbL7;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof Duration) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Duration.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 3:
                    return new R5n();
                case 4:
                    return new R5y();
                case 5:
                    return Duration.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL63 = Duration.PARSER;
                    if (tbL63 != null) {
                        return tbL63;
                    }
                    synchronized (Duration.class) {
                        tbL6 = Duration.PARSER;
                        if (tbL6 == null) {
                            SNG sng29 = T5T.A01;
                            tbL6 = A00(Duration.DEFAULT_INSTANCE);
                            Duration.PARSER = tbL6;
                        }
                    }
                    return tbL6;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof DoubleValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DoubleValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", Pxh.A1Z());
                case 3:
                    return new R5n();
                case 4:
                    return new R5x();
                case 5:
                    return DoubleValue.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL64 = DoubleValue.PARSER;
                    if (tbL64 != null) {
                        return tbL64;
                    }
                    synchronized (DoubleValue.class) {
                        tbL5 = DoubleValue.PARSER;
                        if (tbL5 == null) {
                            SNG sng30 = T5T.A01;
                            tbL5 = A00(DoubleValue.DEFAULT_INSTANCE);
                            DoubleValue.PARSER = tbL5;
                        }
                    }
                    return tbL5;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof BytesValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(BytesValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", Pxh.A1Z());
                case 3:
                    return new BytesValue();
                case 4:
                    return new R5w();
                case 5:
                    return BytesValue.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL65 = BytesValue.PARSER;
                    if (tbL65 != null) {
                        return tbL65;
                    }
                    synchronized (BytesValue.class) {
                        tbL4 = BytesValue.PARSER;
                        if (tbL4 == null) {
                            SNG sng31 = T5T.A01;
                            tbL4 = A00(BytesValue.DEFAULT_INSTANCE);
                            BytesValue.PARSER = tbL4;
                        }
                    }
                    return tbL4;
                default:
                    throw C66580MXl.A11();
            }
        } else if (this instanceof BoolValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(BoolValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", Pxh.A1Z());
                case 3:
                    return new R5n();
                case 4:
                    return new R5v();
                case 5:
                    return BoolValue.DEFAULT_INSTANCE;
                case 6:
                    C13494TbL tbL66 = BoolValue.PARSER;
                    if (tbL66 != null) {
                        return tbL66;
                    }
                    synchronized (BoolValue.class) {
                        tbL3 = BoolValue.PARSER;
                        if (tbL3 == null) {
                            SNG sng32 = T5T.A01;
                            tbL3 = A00(BoolValue.DEFAULT_INSTANCE);
                            BoolValue.PARSER = tbL3;
                        }
                    }
                    return tbL3;
                default:
                    throw C66580MXl.A11();
            }
        } else {
            boolean z = this instanceof Api;
            int intValue = num.intValue();
            if (z) {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return A01(Api.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
                    case 3:
                        return new Api();
                    case 4:
                        return new R5u();
                    case 5:
                        return Api.DEFAULT_INSTANCE;
                    case 6:
                        C13494TbL tbL67 = Api.PARSER;
                        if (tbL67 != null) {
                            return tbL67;
                        }
                        synchronized (Api.class) {
                            tbL2 = Api.PARSER;
                            if (tbL2 == null) {
                                SNG sng33 = T5T.A01;
                                tbL2 = A00(Api.DEFAULT_INSTANCE);
                                Api.PARSER = tbL2;
                            }
                        }
                        return tbL2;
                    default:
                        throw C66580MXl.A11();
                }
            } else {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return A01(Any.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
                    case 3:
                        return new Any();
                    case 4:
                        return new R5t();
                    case 5:
                        return Any.DEFAULT_INSTANCE;
                    case 6:
                        C13494TbL tbL68 = Any.PARSER;
                        if (tbL68 != null) {
                            return tbL68;
                        }
                        synchronized (Any.class) {
                            tbL = Any.PARSER;
                            if (tbL == null) {
                                SNG sng34 = T5T.A01;
                                tbL = A00(Any.DEFAULT_INSTANCE);
                                Any.PARSER = tbL;
                            }
                        }
                        return tbL;
                    default:
                        throw C66580MXl.A11();
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ R5n Avs() {
        return (R5n) A03(AnonymousClass05K.A0j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return SH6.A02.A00(this).ASr(this, obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int CL6 = SH6.A02.A00(this).CL6(this);
        this.memoizedHashCode = CL6;
        return CL6;
    }

    public static Object A02(Object obj, java.lang.reflect.Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw Pxe.A0u("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw Pxe.A0u("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("# ");
        A1A.append(obj);
        SL0.A01(this, A1A, 0);
        return A1A.toString();
    }
}
