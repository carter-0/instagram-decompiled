package com.facebook.rsys.rooms.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class RoomsStore {

    public final class CProxy extends RoomsStore {
        public final NativeHolder mNativeHolder;

        public static native RoomsStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void enterRoom();

        public native String getUrl();

        public native int hashCode();

        public native void resolveAndStartObserving();

        public native void revokeRoom();

        public native void setHandler(RoomsStoreHandler roomsStoreHandler);

        public native void stopObserving();

        public native void updateJoinPermissionSetting(int i);

        public native void updateLockStatus(boolean z, boolean z2);

        public native void updatePollingState(boolean z);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RoomsStore)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void enterRoom();

    public abstract String getUrl();

    public abstract void resolveAndStartObserving();

    public abstract void revokeRoom();

    public abstract void setHandler(RoomsStoreHandler roomsStoreHandler);

    public abstract void stopObserving();

    public abstract void updateJoinPermissionSetting(int i);

    public abstract void updateLockStatus(boolean z, boolean z2);

    public abstract void updatePollingState(boolean z);
}
