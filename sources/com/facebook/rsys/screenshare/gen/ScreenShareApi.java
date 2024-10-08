package com.facebook.rsys.screenshare.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioFrame;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

public abstract class ScreenShareApi {
    public static 2LV CONVERTER = new C71545Omg(3);

    public final class CProxy extends ScreenShareApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ScreenShareApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void enableScreenShare(boolean z, int i);

        public native String getCurrentCallServerInfoData();

        public native int getScreenSharePlayerCurrentIndex();

        public native int getScreenSharePlayerMediaQueueCount();

        public native int getScreenShareStopActionSource();

        public native void handleAudioData(AudioFrame audioFrame, boolean z);

        public native void handleFrame(RSVideoFrame rSVideoFrame, boolean z);

        public native int hashCode();

        public native void initiateScreenShare();

        public native void logAppOpenWithName(String str);

        public native void logGetSources(int i);

        public native void sceneCompLogCapturedFrame(boolean z);

        public native void setScreenSharePlayerCurrentIndex(int i);

        public native void setScreenSharePlayerMediaQueueCount(int i);

        public native void stopScreenShare(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ScreenShareApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void enableScreenShare(boolean z, int i);

    public abstract String getCurrentCallServerInfoData();

    public abstract int getScreenSharePlayerCurrentIndex();

    public abstract int getScreenSharePlayerMediaQueueCount();

    public abstract int getScreenShareStopActionSource();

    public abstract void handleAudioData(AudioFrame audioFrame, boolean z);

    public abstract void handleFrame(RSVideoFrame rSVideoFrame, boolean z);

    public abstract void initiateScreenShare();

    public abstract void logAppOpenWithName(String str);

    public abstract void logGetSources(int i);

    public abstract void sceneCompLogCapturedFrame(boolean z);

    public abstract void setScreenSharePlayerCurrentIndex(int i);

    public abstract void setScreenSharePlayerMediaQueueCount(int i);

    public abstract void stopScreenShare(int i);
}
