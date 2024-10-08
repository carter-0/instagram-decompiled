package com.facebook.mediastreaming.client.livestreaming;

import X.0dV;
import X.0qQ;
import X.AnonymousClass7TF;
import X.C10961S2t;
import X.C12135Snf;
import X.C22229Xxk;
import X.XV2;
import android.os.Handler;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.opt.source.event.AndroidEventMessageInputSource;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;
import com.facebook.mediastreaming.opt.transport.SSLFactoryHolder;
import com.facebook.mediastreaming.opt.transport.TraceEventObserverHolder;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportSinkFactoryHolder;
import java.util.List;

public final class LiveStreamingClientImpl implements LiveStreamingClient {
    public static final XV2 Companion = new Object();
    public final HybridData mHybridData;
    public final C12135Snf sessionCallbacksDelegate;
    public final C22229Xxk transportCallbacksDelegate;

    public LiveStreamingClientImpl(LiveStreamingConfig liveStreamingConfig, AndroidVideoInput androidVideoInput, List list, AndroidEventMessageInputSource androidEventMessageInputSource, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, Handler handler, TransportCallbacks transportCallbacks, TransportSinkFactoryHolder transportSinkFactoryHolder, SSLFactoryHolder sSLFactoryHolder, List list2, C10961S2t s2t, TraceEventObserverHolder traceEventObserverHolder) {
        0qQ.A0B(androidVideoInput, 2);
        Handler handler2 = handler;
        SSLFactoryHolder sSLFactoryHolder2 = sSLFactoryHolder;
        AnonymousClass7TF.A1G(handler2, 6, sSLFactoryHolder2);
        C12135Snf snf = new C12135Snf(handler2, liveStreamingSessionCallbacks, s2t);
        this.sessionCallbacksDelegate = snf;
        C22229Xxk xxk = new C22229Xxk(handler2, transportCallbacks);
        this.transportCallbacksDelegate = xxk;
        this.mHybridData = initHybrid(liveStreamingConfig, snf, androidVideoInput, list, androidEventMessageInputSource, xxk, (TransportSinkFactoryHolder) null, sSLFactoryHolder2, list2, (TraceEventObserverHolder) null);
    }

    public static final native HybridData initHybrid(LiveStreamingConfig liveStreamingConfig, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, AndroidVideoInput androidVideoInput, List list, AndroidEventMessageInputSource androidEventMessageInputSource, TransportCallbacks transportCallbacks, TransportSinkFactoryHolder transportSinkFactoryHolder, SSLFactoryHolder sSLFactoryHolder, List list2, TraceEventObserverHolder traceEventObserverHolder);

    public native void pause(boolean z);

    public native void resume();

    public native void setAudioEnhancementPreLivePlayback(boolean z);

    public native void setAudioEnhancementPreLivePlaybackRewind();

    public native void setAudioEnhancementPreLiveRecording(boolean z);

    public native void setAudioEnhancementPreLiveRecordingReset();

    public native void start();

    public native void stop(boolean z);

    public native void updateAspectRatio(float f);

    public native void updateAudioEnhancementEngine(boolean z, boolean z2);

    public native void updateConfig(LiveStreamingConfig liveStreamingConfig);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XV2, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming");
    }
}
