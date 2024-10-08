package com.facebook.mediastreaming.opt.source.audio;

import X.0dV;
import X.V66;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class AndroidExternalAudioSource extends AndroidAudioInputHost {
    public static final V66 Companion = new Object();
    public static final Class TAG = AndroidExternalAudioSource.class;
    public AndroidAudioInput audioInput;

    public native ByteBuffer acquireAudioSampleBuffer();

    public native void audioSampleBufferFilled(int i, boolean z, long j);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V66] */
    static {
        0dV.A0C("mediastreaming");
    }

    public final void prepare() {
        AndroidAudioInput androidAudioInput = this.audioInput;
        if (androidAudioInput != null) {
            androidAudioInput.setHost(this);
        }
    }

    public final void setAudioInput(AndroidAudioInput androidAudioInput) {
        this.audioInput = androidAudioInput;
    }

    public final void start() {
        AndroidAudioInput androidAudioInput = this.audioInput;
        if (androidAudioInput != null) {
            androidAudioInput.startAudioStreaming();
        }
    }

    public final void stop() {
        AndroidAudioInput androidAudioInput = this.audioInput;
        if (androidAudioInput != null) {
            androidAudioInput.stopAudioStreaming();
        }
    }

    public final void release() {
        stop();
        AndroidAudioInput androidAudioInput = this.audioInput;
        if (androidAudioInput != null) {
            androidAudioInput.setHost((AndroidAudioInputHost) null);
        }
    }

    public AndroidExternalAudioSource(HybridData hybridData) {
        super(hybridData);
    }
}
