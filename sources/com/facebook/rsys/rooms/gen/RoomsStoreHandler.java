package com.facebook.rsys.rooms.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;
import com.facebook.simplejni.NativeHolder;

public abstract class RoomsStoreHandler {

    public final class CProxy extends RoomsStoreHandler {
        public final NativeHolder mNativeHolder;

        public static native RoomsStoreHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void roomThreadKeyUpdated(String str);

        public native void roomUpdated(String str, RoomJoiningModel roomJoiningModel, UserProfile userProfile);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RoomsStoreHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void roomThreadKeyUpdated(String str);

    public abstract void roomUpdated(String str, RoomJoiningModel roomJoiningModel, UserProfile userProfile);
}
