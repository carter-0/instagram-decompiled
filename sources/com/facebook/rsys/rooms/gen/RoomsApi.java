package com.facebook.rsys.rooms.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class RoomsApi {

    public final class CProxy extends RoomsApi {
        public final NativeHolder mNativeHolder;

        public static native RoomsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void cancelOpenUrl();

        public native void endRoom(String str);

        public native int hashCode();

        public native void join(String str);

        public native void openUrl(String str, RoomResolveConfig roomResolveConfig);

        public native void updateJoinPermissionSetting(String str, int i);

        public native void updateLockStatus(String str, boolean z, boolean z2);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RoomsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void cancelOpenUrl();

    public abstract void endRoom(String str);

    public abstract void join(String str);

    public abstract void openUrl(String str, RoomResolveConfig roomResolveConfig);

    public abstract void updateJoinPermissionSetting(String str, int i);

    public abstract void updateLockStatus(String str, boolean z, boolean z2);
}
