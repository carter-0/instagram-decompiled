package com.facebook.rsys.roomslobby.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class RoomsLobbyStoreFactory {

    public final class CProxy extends RoomsLobbyStoreFactory {
        public final NativeHolder mNativeHolder;

        public static native RoomsLobbyStoreFactory createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native RoomsLobbyStore createStore(String str, String str2);

        public native int hashCode();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RoomsLobbyStoreFactory)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract RoomsLobbyStore createStore(String str, String str2);
}
