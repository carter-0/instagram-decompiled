package com.facebook.rsys.livevideo.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class LiveVideoBroadcastLifecycleCallback {
    public static 2LV CONVERTER = C22180Xwq.A00(58);

    public final class CProxy extends LiveVideoBroadcastLifecycleCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LiveVideoBroadcastLifecycleCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void roomsBroadcastCancelled(boolean z);

        public native void roomsBroadcastCreated(boolean z);

        public native void roomsBroadcastEnded(boolean z);

        public native void roomsBroadcastStarted(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LiveVideoBroadcastLifecycleCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void roomsBroadcastCancelled(boolean z);

    public abstract void roomsBroadcastCreated(boolean z);

    public abstract void roomsBroadcastEnded(boolean z);

    public abstract void roomsBroadcastStarted(boolean z);
}
