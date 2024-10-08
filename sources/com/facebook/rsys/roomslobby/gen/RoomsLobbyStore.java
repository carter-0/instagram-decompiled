package com.facebook.rsys.roomslobby.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class RoomsLobbyStore {

    public final class CProxy extends RoomsLobbyStore {
        public final NativeHolder mNativeHolder;

        public static native RoomsLobbyStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void fetchRingableUsers(String str);

        public native String getUrl();

        public native int hashCode();

        public native void setHandler(RoomLobbyStoreHandler roomLobbyStoreHandler);

        public native void startObserverActiveUsers();

        public native void stopObserverActiveUsers();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RoomsLobbyStore)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void fetchRingableUsers(String str);

    public abstract String getUrl();

    public abstract void setHandler(RoomLobbyStoreHandler roomLobbyStoreHandler);

    public abstract void startObserverActiveUsers();

    public abstract void stopObserverActiveUsers();
}
