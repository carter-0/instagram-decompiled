package com.facebook.mediastreaming.bundledservices;

import X.0dV;
import X.0qQ;
import X.XV1;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.opt.dvr.DvrConfig;
import com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;

public final class BundledLiveStreamServiceProviderHolder extends ServiceProviderHolder {
    public static final XV1 Companion = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory, java.lang.Object] */
    public BundledLiveStreamServiceProviderHolder(LiveStreamingConfig liveStreamingConfig, DvrConfig dvrConfig, TempFileCreator tempFileCreator) {
        0qQ.A0B(liveStreamingConfig, 1);
        initHybrid(liveStreamingConfig, dvrConfig, tempFileCreator, new Object());
    }

    private final native void initHybrid(LiveStreamingConfig liveStreamingConfig, DvrConfig dvrConfig, TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory);

    public final native LiveStreamSessionProbe getSessionProbe();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XV1, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-bundledservices");
    }
}
