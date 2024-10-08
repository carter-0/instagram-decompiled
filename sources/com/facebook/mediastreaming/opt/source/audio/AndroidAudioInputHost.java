package com.facebook.mediastreaming.opt.source.audio;

import X.0dV;
import X.0qQ;
import X.V64;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.nio.ByteBuffer;

public abstract class AndroidAudioInputHost extends StreamingHybridClassBase {
    public static final V64 Companion = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAudioInputHost(HybridData hybridData) {
        super(hybridData);
        0qQ.A0B(hybridData, 1);
    }

    public static final native HybridData initHybrid();

    public abstract ByteBuffer acquireAudioSampleBuffer();

    public abstract void audioSampleBufferFilled(int i, boolean z, long j);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V64, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming");
    }

    public AndroidAudioInputHost() {
        super(initHybrid());
    }
}
