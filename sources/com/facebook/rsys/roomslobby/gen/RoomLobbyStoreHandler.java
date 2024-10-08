package com.facebook.rsys.roomslobby.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class RoomLobbyStoreHandler {

    public final class CProxy extends RoomLobbyStoreHandler {
        public final NativeHolder mNativeHolder;

        public static native RoomLobbyStoreHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void didLoadActiveUsers(String str, ArrayList arrayList);

        public native void didLoadRingableUsers(String str, ArrayList arrayList);

        public native int hashCode();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RoomLobbyStoreHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void didLoadActiveUsers(String str, ArrayList arrayList);

    public abstract void didLoadRingableUsers(String str, ArrayList arrayList);
}
