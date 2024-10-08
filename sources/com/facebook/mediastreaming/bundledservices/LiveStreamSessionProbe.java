package com.facebook.mediastreaming.bundledservices;

import X.0dV;
import X.C62983KpZ;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.io.File;

public final class LiveStreamSessionProbe {
    public static final C62983KpZ Companion = new Object();
    public final HybridData mHybridData;

    public final native AudioEncoderConfig getAudioEncoderConfig();

    public final native long getAudioPts();

    public final native long getAudioPtsStreamTime();

    public final native double getAvgLiveEncodingBitrate();

    public final native File getDvrOutputFile();

    public final native double getLatestLiveEncodingBitrate();

    public final native int getMuxState();

    public final native int getNumberOfNetworkInterrupts();

    public final native double getTransportThroughputBps();

    public final native VideoEncoderConfig getVideoEncoderConfig();

    public final native long getVideoPts();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.KpZ, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-bundledservices");
    }

    public LiveStreamSessionProbe(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
