package com.facebook.rsys.netobject.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class NetObjectSessionListener {
    public static 2LV CONVERTER = C22181Xwr.A00(22);

    public final class CProxy extends NetObjectSessionListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetObjectSessionListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onChanged(ArrayList arrayList, ArrayList arrayList2);

        public native void onPeerConnected(String str, NetObjectPeerMetadata netObjectPeerMetadata);

        public native void onPeerDisconnected(String str);

        public native void onPeerLatencyChanged(String str, long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetObjectSessionListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onChanged(ArrayList arrayList, ArrayList arrayList2);

    public abstract void onPeerConnected(String str, NetObjectPeerMetadata netObjectPeerMetadata);

    public abstract void onPeerDisconnected(String str);

    public abstract void onPeerLatencyChanged(String str, long j);
}
