package com.facebook.rsys.callintent.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.perf.holders.gen.PerfListenerFactory;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.simplejni.NativeHolder;

public abstract class CallIntentFactory {

    public final class CProxy extends CallIntentFactory {
        public final NativeHolder mNativeHolder;

        public static native CallIntentFactory createFromMcfType(McfReference mcfReference);

        public static native CallIntentFactory createInstance(TaskExecutor taskExecutor, CallIntentFactoryListener callIntentFactoryListener, PerfListenerFactory perfListenerFactory);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void asyncDestroyForSigcoreUseOnly();

        public native CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

        public native void destroy();

        public native PerfLoggerHolder getPerfLogger(String str, String str2);

        public native int hashCode();

        public native void registerUser(SignalingUserContext signalingUserContext);

        public native void unregisterUser(String str, String str2);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallIntentFactory)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void asyncDestroyForSigcoreUseOnly();

    public abstract CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

    public abstract void destroy();

    public abstract PerfLoggerHolder getPerfLogger(String str, String str2);

    public abstract void registerUser(SignalingUserContext signalingUserContext);

    public abstract void unregisterUser(String str, String str2);
}
