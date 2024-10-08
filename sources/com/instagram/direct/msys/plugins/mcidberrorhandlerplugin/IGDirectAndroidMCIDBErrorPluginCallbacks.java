package com.instagram.direct.msys.plugins.mcidberrorhandlerplugin;

import X.0dV;
import com.facebook.simplejni.NativeHolder;

public class IGDirectAndroidMCIDBErrorPluginCallbacks {

    public class MCIDBErrorHandlerCompletionCallback {
        public final NativeHolder mNativeHolder;

        private native void runJNI(boolean z);

        static {
            0dV.A0C("IGDirectAndroidMCIDBErrorPluginjni");
        }

        public MCIDBErrorHandlerCompletionCallback(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public void run(boolean z) {
            runJNI(z);
        }
    }
}
