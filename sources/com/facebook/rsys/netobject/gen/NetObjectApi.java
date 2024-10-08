package com.facebook.rsys.netobject.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.realtimesession.gen.RealtimeSessionCreateParams;
import com.facebook.simplejni.NativeHolder;

public abstract class NetObjectApi {
    public static 2LV CONVERTER = C22181Xwr.A00(17);

    public final class CProxy extends NetObjectApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetObjectApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void createSession(TaskExecutor taskExecutor, RealtimeSessionCreateParams realtimeSessionCreateParams, NetObjectSessionCreationConfig netObjectSessionCreationConfig, NetObjectSessionCallback netObjectSessionCallback);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetObjectApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void createSession(TaskExecutor taskExecutor, RealtimeSessionCreateParams realtimeSessionCreateParams, NetObjectSessionCreationConfig netObjectSessionCreationConfig, NetObjectSessionCallback netObjectSessionCallback);
}
