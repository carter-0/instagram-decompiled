package com.facebook.rsys.audio.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class AudioFrameMetadata {
    public static 2LV CONVERTER = C22180Xwq.A00(4);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioFrameMetadata createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, int i2, int i3, boolean z, AudioFrameDetails audioFrameDetails);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native AudioFrameDetails getDetails();

    public native boolean getIsMuted();

    public native int getNumberOfChannels();

    public native int getNumberOfSamples();

    public native int getSampleRate();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioFrameMetadata)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AudioFrameMetadata(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioFrameMetadata(int i, int i2, int i3, boolean z, AudioFrameDetails audioFrameDetails) {
        this.mNativeHolder = initNativeHolder(i, i2, i3, z, audioFrameDetails);
    }
}
