package com.facebook.cameracore.audiograph;

import X.0dV;
import X.C341477mx;
import com.facebook.jni.HybridData;
import java.util.concurrent.atomic.AtomicBoolean;

public class CameraAudioManager {
    public C341477mx mCallback;
    public final AtomicBoolean mDestroyed = new AtomicBoolean(false);
    public HybridData mHybridData;

    private native HybridData initHybrid(float f);

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native int getNumSamples();

    public native float getSampleRate();

    public native boolean getSpeakers();

    public native int getState();

    public native String getStateStr(int i);

    public native void setSpeakers(boolean z);

    public native int setState(int i);

    public native int setStateSync(int i);

    static {
        0dV.A0C("audiograph-native");
    }

    public void onAudioData(byte[] bArr, long j) {
        C341477mx r1 = this.mCallback;
        if (r1 != null) {
            r1.A01(bArr, (int) getSampleRate(), 2, 1, j, 0);
        }
    }

    public CameraAudioManager(float f) {
        this.mHybridData = initHybrid(f);
    }
}
