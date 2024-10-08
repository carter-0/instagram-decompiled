package com.instagram.rtc.rsys.proxies;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class IGRTCSyncedClockHolder {
    public static 2LV CONVERTER = new C71545Omg(29);

    public final class CProxy extends IGRTCSyncedClockHolder {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native IGRTCSyncedClockHolder createFromMcfType(McfReference mcfReference);

        public static native IGRTCSyncedClockHolder createSyncedClockHolder(SignalingSenderProxy signalingSenderProxy);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native McfReference getSyncedClock();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof IGRTCSyncedClockHolder)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract McfReference getSyncedClock();
}
