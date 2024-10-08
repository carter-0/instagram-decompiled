package com.facebook.rsys.audio.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class AudioProxy {
    public static 2LV CONVERTER = C71546Omh.A00(5);

    public final class CProxy extends AudioProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native ArrayList createAvailableAudioInputRoutes();

        public native ArrayList createAvailableAudioOutputRoutes();

        public native int hashCode();

        public native void setApi(AudioApi audioApi);

        public native void setAudioDeviceModule(AudioDeviceModule audioDeviceModule);

        public native void setAudioInputRoute(AudioInputRoute audioInputRoute);

        public native void setAudioOn(boolean z, boolean z2);

        public native void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2);

        public native void setIsCallActive(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract ArrayList createAvailableAudioInputRoutes();

    public abstract ArrayList createAvailableAudioOutputRoutes();

    public abstract void setApi(AudioApi audioApi);

    public abstract void setAudioDeviceModule(AudioDeviceModule audioDeviceModule);

    public abstract void setAudioInputRoute(AudioInputRoute audioInputRoute);

    public abstract void setAudioOn(boolean z, boolean z2);

    public abstract void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2);

    public abstract void setIsCallActive(boolean z);
}
