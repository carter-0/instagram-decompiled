package com.facebook.rsys.devicestats.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class DeviceStatsApi {
    public static 2LV CONVERTER = C71546Omh.A00(33);

    public final class CProxy extends DeviceStatsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DeviceStatsApi createDeviceStatsApi();

        public static native DeviceStatsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native BatteryStatsReader getBatteryStatsReader();

        public native int hashCode();

        public native void setBatteryStatsReader(BatteryStatsReader batteryStatsReader);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DeviceStatsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract BatteryStatsReader getBatteryStatsReader();

    public abstract void setBatteryStatsReader(BatteryStatsReader batteryStatsReader);
}
