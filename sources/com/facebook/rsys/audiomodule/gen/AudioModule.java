package com.facebook.rsys.audiomodule.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioFrame;
import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.simplejni.NativeHolder;

public abstract class AudioModule {
    public static 2LV CONVERTER = C71546Omh.A00(11);

    public final class CProxy extends AudioModule {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioModule createFromMcfType(McfReference mcfReference);

        public static native AudioModule createImp(AudioPipelineContext audioPipelineContext, OverlayConfigManagerHolder overlayConfigManagerHolder);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void deliverAppLevelAudio(AudioFrame audioFrame);

        public native void enableNoiseSuppression(boolean z);

        public native int hashCode();

        public native void resetNsAecAlgorithms();

        public native void startPlayout();

        public native void startRecording();

        public native void stopPlayout();

        public native void stopRecording();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioModule)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void deliverAppLevelAudio(AudioFrame audioFrame);

    public abstract void enableNoiseSuppression(boolean z);

    public abstract void resetNsAecAlgorithms();

    public abstract void startPlayout();

    public abstract void startRecording();

    public abstract void stopPlayout();

    public abstract void stopRecording();
}
