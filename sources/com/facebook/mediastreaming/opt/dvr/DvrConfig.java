package com.facebook.mediastreaming.opt.dvr;

import X.0dV;
import X.XV4;
import com.facebook.jni.HybridClassBase;

public final class DvrConfig extends HybridClassBase {
    public static final DvrConfig INSTANCE = new HybridClassBase();

    public final class Builder extends HybridClassBase {
        public static final XV4 Companion = new Object();

        private final native void initHybrid();

        public final native DvrConfig build();

        public final native Builder setAudioBitRate(int i);

        public final native Builder setAudioChannels(int i);

        public final native Builder setAudioEncoderProfile(int i);

        public final native Builder setAudioSampleRate(int i);

        public final native Builder setAvailableSpaceThresholdInMB(int i);

        public final native Builder setBinFailureHandleMode(int i);

        public final native Builder setCheckAvailableSpaceIntervalInSeconds(int i);

        public final native Builder setEnableRestartVideoEncoder(boolean z);

        public final native Builder setMaxDvrFileSizeInMB(int i);

        public final native Builder setMaxValidDvrLiveDurationDiffMs(int i);

        public final native Builder setUsePersistentStorage(boolean z);

        public final native Builder setVideoBitrate(int i);

        public final native Builder setVideoEncoderBitrateMode(int i);

        public final native Builder setVideoEncoderProfile(int i);

        public final native Builder setVideoEnforceKeyframeInterval(boolean z);

        public final native Builder setVideoFps(int i);

        public final native Builder setVideoHeight(int i);

        public final native Builder setVideoKeyframeInterval(float f);

        public final native Builder setVideoWidth(int i);

        /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.XV4] */
        static {
            0dV.A0C("mediastreaming-dvr");
        }

        public Builder() {
            initHybrid();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.jni.HybridClassBase, com.facebook.mediastreaming.opt.dvr.DvrConfig] */
    static {
        0dV.A0C("mediastreaming-dvr");
    }
}
