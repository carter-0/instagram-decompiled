package com.facebook.rsys.rooms.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class RoomsStoreFactory {

    public final class CProxy extends RoomsStoreFactory {
        public final NativeHolder mNativeHolder;

        public static native RoomsStoreFactory createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native RoomsStore createStore(String str, String str2, Long l, boolean z, RoomPollingOptions roomPollingOptions);

        public native int hashCode();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RoomsStoreFactory)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract RoomsStore createStore(String str, String str2, Long l, boolean z, RoomPollingOptions roomPollingOptions);
}
