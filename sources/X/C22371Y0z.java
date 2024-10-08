package X;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import ca.psiphon.PsiphonTunnel;
import com.facebook.mediastreaming.bundledservices.BundledLiveStreamServiceProviderHolder;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClientImpl;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.client.livestreaming.livetrace.LiveTraceServiceProviderHolder;
import com.facebook.mediastreaming.opt.dvr.DvrConfig;
import com.facebook.mediastreaming.opt.sessionlog.SessionLogger;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import com.facebook.mediastreaming.opt.source.event.AndroidEventMessageInputSource;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;
import com.facebook.mediastreaming.opt.transport.TraceEventObserverHolder;
import com.facebook.mediastreaming.opt.transport.TransportSinkFactoryHolder;
import com.facebook.mediastreaming.opt.videoqualityquery.VideoQualityDeviceModelServiceProviderHolder;
import com.facebook.mediastreaming.opt.xanalytics.XAnalyticsEventLogWriterProviderHolder;
import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Y0z  reason: case insensitive filesystem */
public final class C22371Y0z implements C66537MVr {
    public C21478XcN A00;
    public C18594Vul A01;
    public C18594Vul A02;
    public C21299XTw A03;
    public File A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Handler A0B;
    public final VideoBroadcastInitResponse A0C;
    public final UserSession A0D;
    public final M0X A0E;
    public final LRP A0F;
    public final MUT A0G;
    public final C22230Xxl A0H;
    public final C63938LDy A0I;
    public final Integer A0J;
    public final AnonymousClass1FE A0K;
    public final XZR A0L;

    public final boolean CSg() {
        return true;
    }

    public static final void A00(C22371Y0z y0z) {
        WIZ wiz = y0z.A0H.A0A;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(wiz.A01.values());
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            A1C2.add(new C19836WgH((YBE) it.next()));
        }
        C18594Vul.A02(y0z.A02, A1C2);
        y0z.A02 = null;
    }

    public final long C8j() {
        C21437Xan xan = this.A0H.A0D;
        boolean z = xan.A02;
        long j = xan.A00;
        if (z) {
            return j + (xan.A03.now() - xan.A01);
        }
        return j;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [com.facebook.mediastreaming.opt.transport.SSLFactoryHolder, java.lang.Object] */
    public final void CMe(C21478XcN xcN) {
        C16541Uwm uwm;
        XR2 xr2;
        long j;
        long j2;
        int i;
        ? obj;
        String str;
        XR2 xr22;
        Class<C22371Y0z> cls = C22371Y0z.class;
        if (this.A07 != AnonymousClass05K.A00) {
            0KC.A02(cls, "init() on a broadcast that was already initialized");
            return;
        }
        C21478XcN xcN2 = xcN;
        this.A00 = new XPP(1, xcN2, this);
        C22230Xxl xxl = this.A0H;
        VideoBroadcastInitResponse videoBroadcastInitResponse = this.A0C;
        0qQ.A0B(videoBroadcastInitResponse, 0);
        if (xxl.A01 != null) {
            0KC.A02(C22230Xxl.class, "Live streaming client already created!");
        } else if (xxl.A02 != AnonymousClass05K.A0j) {
            C21403XaB xaB = xxl.A0C.A00;
            0qQ.A0B(xaB, 2);
            LiveStreamingConfig.Builder builder = LiveStreamingConfig.Builder.$redex_init_class;
            LiveStreamingConfig.Builder builder2 = new LiveStreamingConfig.Builder(Long.parseLong(videoBroadcastInitResponse.broadcastId));
            VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = videoBroadcastInitResponse.videoStreamingConfig;
            if (videoBroadcastVideoStreamingConfig != null) {
                C16547Uwu A012 = C18096VlQ.A01(videoBroadcastVideoStreamingConfig.videoProfile);
                builder2.setVideoWidth(videoBroadcastVideoStreamingConfig.width);
                builder2.setVideoHeight(videoBroadcastVideoStreamingConfig.height);
                builder2.setVideoBitrate(videoBroadcastVideoStreamingConfig.bitRate);
                builder2.setVideoFps(videoBroadcastVideoStreamingConfig.frameRate);
                builder2.setVideoEncoderProfile(A012.A00);
            }
            builder2.setVideoKeyframeIntervalSeconds(2.0f);
            VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig = videoBroadcastInitResponse.audioStreamingConfig;
            if (videoBroadcastAudioStreamingConfig != null) {
                if (videoBroadcastAudioStreamingConfig.profile == 5) {
                    xr22 = XR2.HE;
                } else {
                    xr22 = XR2.LC;
                }
                builder2.setAudioBitRate(videoBroadcastAudioStreamingConfig.bitRate);
                builder2.setAudioSampleRate(videoBroadcastAudioStreamingConfig.sampleRate);
                builder2.setAudioChannels(videoBroadcastAudioStreamingConfig.channels);
                builder2.setAudioEncoderProfile(xr22.A00);
            }
            VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = videoBroadcastInitResponse.liveTraceConfig;
            if (videoBroadcastLiveTraceConfig != null) {
                builder2.setLiveTraceEnabled(videoBroadcastLiveTraceConfig.enabled);
                builder2.setLiveTraceSampleIntervalInSeconds(videoBroadcastLiveTraceConfig.sampleIntervalInSeconds);
                builder2.setLiveTraceSamplingSource(videoBroadcastLiveTraceConfig.samplingSource);
            }
            String str2 = videoBroadcastInitResponse.fbLivePublishUrl;
            if (str2 != null) {
                builder2.setPublishURL(str2);
            }
            String str3 = videoBroadcastInitResponse.fbLiveQuicPublishUrl;
            if (str3 != null) {
                builder2.setPublishQuicURL(str3);
            }
            String str4 = videoBroadcastInitResponse.fbLiveFallbackPublishUrl;
            if (str4 != null) {
                builder2.setPublishFallbackURL(str4);
            }
            String str5 = videoBroadcastInitResponse.fbLiveTransportHeaderBase64;
            if (str5 != null) {
                builder2.setConnectionToken(str5);
            }
            builder2.setVideoAllowBFrames(videoBroadcastInitResponse.allowBFrame);
            Integer num = videoBroadcastInitResponse.streamNetworkSendCheckTimeoutMs;
            if (num != null) {
                builder2.setSendCheckTimeoutMsec(num.intValue());
            }
            Integer num2 = videoBroadcastInitResponse.streamNetworkQueueCapacityInBytes;
            if (num2 != null) {
                builder2.setQueueCapacityInBytes(num2.intValue());
            }
            Integer num3 = videoBroadcastInitResponse.streamNetworkQueueVideoCapacityInSeconds;
            if (num3 != null) {
                builder2.setQueueVideoCapacityInSeconds(num3.intValue());
            }
            Integer num4 = videoBroadcastInitResponse.streamNetworkQueuePercentageOfCapacityToDrop;
            if (num4 != null) {
                builder2.setPercentageOfCapacityToDrop(num4.intValue());
            }
            Integer num5 = videoBroadcastInitResponse.streamNetworkConnectionRetryCount;
            if (num5 != null) {
                builder2.setConnectionRetryCount(num5.intValue());
            }
            Integer num6 = videoBroadcastInitResponse.streamNetworkConnectionRetryDelayInSeconds;
            if (num6 != null) {
                builder2.setConnectionRetryDelayInSeconds(num6.intValue());
            }
            Integer num7 = videoBroadcastInitResponse.streamNetworkMeasurementsIntervalInMs;
            if (num7 != null) {
                builder2.setMeasurementsIntervalInMs(num7.intValue());
            }
            Boolean bool = videoBroadcastInitResponse.streamNetworkShouldProbeRttWithPings;
            if (bool != null) {
                builder2.setShouldProbeRTTWithPings(bool.booleanValue());
            }
            Boolean bool2 = videoBroadcastInitResponse.streamNetworkUseSslFactory;
            if (bool2 != null) {
                builder2.setUseSSLFactory(bool2.booleanValue());
            }
            Integer num8 = videoBroadcastInitResponse.streamNetworkSpeedTestPayloadSizeInBytes;
            if (num8 != null) {
                builder2.setSpeedTestPayloadSize(num8.intValue());
            }
            Integer num9 = videoBroadcastInitResponse.streamNetworkSpeedTestPayloadChunkSizeInBytes;
            if (num9 != null) {
                builder2.setSpeedTestPayloadChunkSize(num9.intValue());
            }
            Double d = videoBroadcastInitResponse.speedTestMinimumBandwidthThreshold;
            if (d != null) {
                builder2.setSpeedTestMinimumBandwidthThreshold(d.doubleValue());
            }
            Boolean bool3 = videoBroadcastInitResponse.use1RTTConnectionSetup;
            if (bool3 != null) {
                builder2.setUse1RTTConnectionSetup(bool3.booleanValue());
            }
            Boolean bool4 = videoBroadcastInitResponse.latencySensitive;
            if (bool4 != null) {
                builder2.setLatencySensitive(bool4.booleanValue());
            }
            Map<String, Double> map = videoBroadcastInitResponse.initialBitratePrediction;
            if (map != null && (!map.isEmpty())) {
                builder2.setInitialBitratePredictions(map);
            }
            UserSession userSession = xaB.A00;
            0Tu r2 = 0Tu.A05;
            builder2.setVideoEncoderProfile(C18096VlQ.A01(182.A04(r2, userSession, 36873810359877652L)).A00);
            if (182.A06(r2, userSession, 36310860406194521L)) {
                uwm = C16541Uwm.CBR;
            } else {
                uwm = C16541Uwm.DEFAULT;
            }
            builder2.setVideoEncoderBitrateMode(uwm.A00);
            builder2.setVideoKeyframeIntervalSeconds((float) 182.A01(r2, userSession, 36592335382970813L));
            builder2.setVideoFps(DbS.A04(r2, userSession, 36592335383101886L));
            builder2.setVideoEnforceKeyframeInterval(182.A06(r2, userSession, 2342153869620019546L));
            builder2.setVideoEnforceColorInfo(182.A06(r2, userSession, 36310860406522203L));
            int i2 = 1;
            if (XXs.A00(userSession)) {
                i2 = 2;
            }
            if (182.A06(r2, userSession, 36311603435537027L)) {
                xr2 = XR2.HE;
            } else {
                xr2 = XR2.LC;
            }
            builder2.setAudioEncoderProfile(xr2.A00);
            builder2.setAudioChannels(i2);
            builder2.setAudioBitRate(i2 * DbS.A04(r2, userSession, 36593078412510125L));
            builder2.setAudioSampleRate(DbS.A04(r2, userSession, 36593078412444588L));
            builder2.setAllowSeparateThreads(182.A06(r2, userSession, 36310624183124174L));
            builder2.setSeparateLiveAudioEncoderThread(182.A06(r2, userSession, 36310624182993101L));
            builder2.setSeparateLiveVideoEncoderThread(182.A06(r2, userSession, 36310624183386321L));
            builder2.setABRUseAsyncMessage(182.A06(r2, userSession, 36310624183451858L));
            builder2.setMinInterruptionLimitInSeconds(DbS.A04(r2, userSession, 36592172174213457L));
            builder2.setMaxInterruptionLimitInSeconds(DbS.A04(r2, userSession, 36592172174147920L));
            builder2.setABRUpscaleDelayMs(30000);
            builder2.setABRMinDecreaseBitrateForLargeQueue(128000);
            builder2.setABRBitrateIncreaseFromLastGood(32000);
            builder2.setABRTimeSinceLastBitrateIncreaseThresholdMs(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            builder2.setABRResolutionMappingBpp(182.A00(r2, userSession, 37155152192471049L));
            builder2.setABRMaxBitrate(DbS.A04(r2, userSession, 36592202239902056L));
            builder2.setVideoBitrate(DbS.A04(r2, userSession, 36592202239574372L));
            int intValue = xaB.A01.intValue();
            if (intValue == 2) {
                j = 36592202239770982L;
            } else if (intValue == 1) {
                j = 36592202239705445L;
            } else if (intValue == 0) {
                j = 36592202239836519L;
            } else {
                throw new RuntimeException();
            }
            builder2.setABRMaxBitrateOn4G(DbS.A04(r2, userSession, j));
            if (intValue == 2) {
                j2 = 36592202239246691L;
            } else if (intValue != 1) {
                j2 = 36592202239115618L;
            } else {
                j2 = 36592202238984545L;
            }
            builder2.setABRMaxBitrateOnWifi(DbS.A04(r2, userSession, j2));
            builder2.setResolutionMappingString(182.A04(r2, userSession, 36873677216874513L));
            ProxyServiceBroadcaster proxyServiceBroadcaster = ProxyServiceBroadcaster.instance;
            builder2.setProxyHostname(proxyServiceBroadcaster.getProxyAddress());
            synchronized (proxyServiceBroadcaster) {
                i = proxyServiceBroadcaster.httpProxyPort;
            }
            builder2.setProxyPort(i);
            builder2.setEnableQuic(true);
            builder2.setQuicCongestionControlType("copa");
            builder2.setCopaLatencyFactor(182.A00(r2, userSession, 37156148624752660L));
            builder2.setQuicSocketDrainTimeoutMs(DbS.A04(r2, userSession, 36593198671463396L));
            builder2.setQuicTcpRacingEnabled(true);
            builder2.setTcpConnectDelayMs(PsiphonTunnel.VPN_INTERFACE_MTU);
            builder2.setConnectionRetryCount(DbS.A04(r2, userSession, 36593198671528933L));
            builder2.setConnectionRetryDelayInSeconds(DbS.A04(r2, userSession, 36593198671594470L));
            builder2.setConnectTimeoutMs(DbS.A04(r2, userSession, 36593198671660007L));
            builder2.setNetworkLagStopThreshold(30.0d);
            builder2.setNetworkLagResumeThreshold(8.0d);
            builder2.setEnableRushGoAwayFrame(182.A06(r2, userSession, 36311723695014631L));
            builder2.setEnableRushClockSync(182.A06(r2, userSession, 36311723695080168L));
            builder2.setEnableEncoderMetadata(182.A06(r2, userSession, 36311723695145705L));
            builder2.setUseUnifiedRushClient(182.A06(r2, userSession, 36311723695342315L));
            String str6 = videoBroadcastInitResponse.fbLiveFallbackPublishUrl;
            if (!(str6 == null || str6.length() == 0)) {
                builder2.setEnableUrlFallback(182.A06(r2, userSession, 36311723695211242L));
                builder2.setUrlSwapInterval(DbS.A04(r2, userSession, 36593198671987688L));
                builder2.setEnableActiveUrlFallback(182.A06(r2, userSession, 36311723695407852L));
            }
            builder2.setEnableVideoSourceValidation(182.A06(r2, userSession, 2342155690686022869L));
            builder2.setVideoSourceTsIncreaseUpperBoundInSeconds(182.A00(r2, userSession, 37157106402787368L));
            builder2.setVideoSourceTsIncreaseLowerBoundInSeconds(182.A00(r2, userSession, 37157106402721831L));
            builder2.setVideoSourceLoggerEpochDurationInSeconds(182.A00(r2, userSession, 37157106402590758L));
            builder2.setVideoSourceLoggerSamplesPerEpoch(DbS.A04(r2, userSession, 36594156449236567L));
            builder2.setEnableInitialBitratePredict(false);
            builder2.setInitialBitratePredictPolicy("speedtest");
            builder2.setInitialBitratePredictSelection("");
            builder2.setQualityFrameInterval(DbS.A04(r2, userSession, 36596643235170878L));
            LiveStreamingConfig build = builder2.build();
            0qQ.A07(build);
            BundledLiveStreamServiceProviderHolder bundledLiveStreamServiceProviderHolder = new BundledLiveStreamServiceProviderHolder(build, (DvrConfig) null, xxl.A07);
            xxl.A00 = bundledLiveStreamServiceProviderHolder.getSessionProbe();
            C22228Xxi xxi = new C22228Xxi(xxl);
            Handler handler = xxl.A06;
            0qQ.A0B(handler, 3);
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            WIZ wiz = xxl.A0A;
            0qQ.A0B(wiz, 0);
            A1C.add(wiz);
            A1C2.add(xxl.A08);
            AndroidEventMessageInputSource androidEventMessageInputSource = xxl.A09;
            0qQ.A0B(androidEventMessageInputSource, 0);
            A1C3.add(androidEventMessageInputSource);
            A1C4.add(bundledLiveStreamServiceProviderHolder);
            A1C4.add(new SessionLogger((String) null));
            A1C4.add(new LiveTraceServiceProviderHolder());
            A1C4.add(new XAnalyticsEventLogWriterProviderHolder(xxl.A0B, false));
            if (xxl.A0G && (str = videoBroadcastInitResponse.videoQualityModel) != null) {
                A1C4.add(new VideoQualityDeviceModelServiceProviderHolder(str));
            }
            for (Object next : (List) xxl.A0F.invoke()) {
                0qQ.A0B(next, 0);
                A1C4.add(next);
            }
            Context context = xxl.A05;
            boolean z = true;
            17k.A0J(!A1C2.isEmpty(), "Must specify at least one audio track", new Object[0]);
            if (A1C.size() != 1) {
                z = false;
            }
            17k.A0J(z, "Only single video track supported!", new Object[0]);
            C10961S2t s2t = C10961S2t.A05;
            if (s2t == null) {
                Context applicationContext = context.getApplicationContext();
                0qQ.A07(applicationContext);
                s2t = new C10961S2t(applicationContext);
                C10961S2t.A05 = s2t;
            }
            synchronized (XV8.class) {
                synchronized (XMQ.A01) {
                    if (XMQ.A00 == null) {
                        XMQ.A00 = new C11342SNz();
                    }
                    obj = new Object();
                    File file = new File(context.getFilesDir(), "fbtlsx_fbvp.store");
                    C22261XyJ xyJ = C22261XyJ.A00;
                    String obj2 = file.toString();
                    0qQ.A07(obj2);
                    obj.mHybridData = obj.initHybridData(obj2, false, xyJ);
                }
            }
            XV2 xv2 = LiveStreamingClientImpl.Companion;
            AndroidVideoInput androidVideoInput = (AndroidVideoInput) A1C.get(0);
            ArrayList arrayList = A1C2;
            LiveStreamingConfig liveStreamingConfig = build;
            xxl.A01 = new LiveStreamingClientImpl(liveStreamingConfig, androidVideoInput, arrayList, (AndroidEventMessageInputSource) 018.A13(A1C3), xxi, handler, xxl, (TransportSinkFactoryHolder) null, obj, A1C4, s2t, (TraceEventObserverHolder) null);
            xxl.A02 = AnonymousClass05K.A01;
            return;
        }
        11Z.A02(new C22410Y2s(xcN2, new C62683Kkj(BroadcastFailureType.InitFailure, "InitializeBroadcastSession", "Failed to initialize broadcast")));
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Looper] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (X.0qQ.A0K(r1, r3) == false) goto L_0x0030;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cr5(X.C21028XAh r10) {
        /*
            r9 = this;
            java.lang.Class<X.WgH> r1 = X.C19836WgH.class
            boolean r0 = r1.isInstance(r10)
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r1.cast(r10)
            X.WgH r0 = (X.C19836WgH) r0
            if (r0 == 0) goto L_0x008e
            X.Xxl r4 = r9.A0H
            X.YBE r8 = r0.A01
            android.os.Looper r3 = android.os.Looper.myLooper()
            r2 = r8
            X.WKS r2 = (X.WKS) r2
            r1 = 0
            if (r3 == 0) goto L_0x0035
            android.os.Handler r0 = r2.A04
            if (r0 == 0) goto L_0x0030
            android.os.Handler r0 = r2.A04
            if (r0 == 0) goto L_0x002a
            android.os.Looper r1 = r0.getLooper()
        L_0x002a:
            boolean r0 = X.0qQ.A0K(r1, r3)
            if (r0 != 0) goto L_0x0037
        L_0x0030:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r3)
        L_0x0035:
            r2.A04 = r1
        L_0x0037:
            X.WIZ r7 = r4.A0A
            java.util.concurrent.atomic.AtomicLong r0 = r2.A03
            long r2 = r0.get()
            java.util.Map r6 = r7.A01
            X.0qQ.A06(r6)
            monitor-enter(r6)
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r6)     // Catch:{ all -> 0x008a }
            r4 = -1
        L_0x004a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x006b
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r5)     // Catch:{ all -> 0x008a }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x008a }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x008a }
            X.WKS r0 = (X.WKS) r0     // Catch:{ all -> 0x008a }
            boolean r0 = X.0qQ.A0K(r0, r8)     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x004a
            int r4 = r1.intValue()     // Catch:{ all -> 0x008a }
            goto L_0x004a
        L_0x006b:
            monitor-exit(r6)
            if (r4 < 0) goto L_0x008e
            java.util.List r6 = r7.A00
            X.0qQ.A06(r6)
            monitor-enter(r6)
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x008a }
        L_0x0078:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x008a }
            X.Y9L r0 = (X.Y9L) r0     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0078
            r0.onVideoInputFrameAvailable(r4, r2)     // Catch:{ all -> 0x008a }
            goto L_0x0078
        L_0x008a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x008d:
            monitor-exit(r6)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22371Y0z.Cr5(X.XAh):void");
    }

    public final void ECT(C18594Vul vul, boolean z) {
        String str;
        M0X m0x = this.A0E;
        if (z) {
            str = "stopBroadcastAndSeal";
        } else {
            str = "stopBroadcastNoSeal";
        }
        m0x.A0F(str);
        this.A0I.A00();
        C22230Xxl xxl = this.A0H;
        WIZ wiz = xxl.A0A;
        wiz.stopRenderingToOutput();
        wiz.A01.clear();
        List list = wiz.A00;
        0qQ.A06(list);
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            list.clear();
        }
        LiveStreamingClient liveStreamingClient = xxl.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.stop(z);
            xxl.A01 = null;
        }
        Integer num = AnonymousClass05K.A0j;
        xxl.A02 = num;
        if (this.A07 == num) {
            C18594Vul.A02(vul, new XZO(this.A04));
            vul = null;
        }
        this.A01 = vul;
    }

    public final void EPE(boolean z) {
        this.A0H.A08.setMute(z);
    }

    public final void Eww(C18594Vul vul) {
        this.A02 = vul;
        C22230Xxl xxl = this.A0H;
        W3b.A07("startLiveStream", new Object[0]);
        AndroidAudioRecorder androidAudioRecorder = xxl.A08;
        W3b.A03(AnonymousClass000.A00(3609), AnonymousClass000.A00(1837), new Object[0]);
        androidAudioRecorder.executor.execute(new C19941WiE(androidAudioRecorder));
        LiveStreamingClient liveStreamingClient = xxl.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.start();
        }
        xxl.A02 = AnonymousClass05K.A0N;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.XTw] */
    public final void EyB(C21478XcN xcN, boolean z) {
        C21299XTw xTw;
        this.A0I.A00();
        XZS xzs = new XZS(this);
        C22230Xxl xxl = this.A0H;
        W3b.A07("stopLiveStream", new Object[0]);
        LiveStreamingClient liveStreamingClient = xxl.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.pause(z);
        }
        AndroidAudioRecorder androidAudioRecorder = xxl.A08;
        W3b.A03(AnonymousClass000.A00(3609), "stopAudioRecording", new Object[0]);
        androidAudioRecorder.executor.execute(new Y2T(androidAudioRecorder, xzs));
        xxl.A02 = AnonymousClass05K.A0Y;
        if (z) {
            C21478XcN.A00(xcN);
            xTw = null;
        } else {
            C21299XTw xTw2 = this.A03;
            if (xTw2 != null) {
                xTw2.A00 = xcN;
                return;
            }
            ? obj = new Object();
            obj.A02 = false;
            obj.A01 = false;
            obj.A00 = xcN;
            xTw = obj;
        }
        this.A03 = xTw;
    }

    public final BroadcastType Ai8() {
        return BroadcastType.LIVESWAP_RTMP;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [X.1FE, java.lang.Object] */
    public C22371Y0z(Context context, UserSession userSession, XPM xpm, M0X m0x, LRP lrp, LBN lbn, MUT mut, Integer num, int i, int i2) {
        XPM xpm2 = xpm;
        0qQ.A0B(xpm2, 3);
        0qQ.A0B(lbn, 4);
        LRP lrp2 = lrp;
        MUT mut2 = mut;
        AnonymousClass7TF.A1G(lrp2, 8, mut2);
        Integer num2 = num;
        0qQ.A0B(num2, 10);
        Context context2 = context;
        this.A0A = context2;
        UserSession userSession2 = userSession;
        this.A0D = userSession2;
        int i3 = i;
        this.A09 = i3;
        int i4 = i2;
        this.A08 = i4;
        this.A0E = m0x;
        this.A0F = lrp2;
        this.A0G = mut2;
        Handler handler = new Handler();
        this.A0B = handler;
        Integer num3 = AnonymousClass05K.A00;
        this.A07 = num3;
        Pair A002 = LQN.A00(xpm2.A0A, i3, i4);
        Number number = (Number) A002.first;
        Number number2 = (Number) A002.second;
        HashMap hashMap = null;
        String str = null;
        0sn r24 = 0sn.A00;
        String str2 = xpm2.A0H;
        String str3 = xpm2.A0F;
        String str4 = xpm2.A0E;
        String str5 = xpm2.A0D;
        String valueOf = String.valueOf(System.currentTimeMillis());
        valueOf = valueOf == null ? "" : valueOf;
        String str6 = xpm2.A0C;
        0qQ.A0A(number);
        int intValue = number.intValue();
        0qQ.A0A(number2);
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = new VideoBroadcastVideoStreamingConfig("baseline", 1.0f, xpm2.A08, xpm2.A09, number2.intValue(), intValue);
        ULD uld = new ULD(0);
        uld.A00 = xpm2.A04;
        uld.A01 = xpm2.A05;
        uld.A02 = xpm2.A06;
        uld.A03 = xpm2.A07;
        VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig = new VideoBroadcastAudioStreamingConfig(uld);
        boolean z = xpm2.A0L;
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = new VideoBroadcastLiveTraceConfig(xpm2.A01, xpm2.A02, xpm2.A0K);
        hashMap = xpm2.A0I.isEmpty() ^ true ? xpm2.A0I : hashMap;
        String str7 = xpm2.A0G;
        this.A0C = new VideoBroadcastInitResponse(videoBroadcastAudioStreamingConfig, videoBroadcastLiveTraceConfig, videoBroadcastVideoStreamingConfig, str6, str5, str3, str4, str2, valueOf, str7.length() > 0 ? str7 : str, r24, hashMap, z);
        this.A06 = num3;
        ? obj = new Object();
        this.A0K = obj;
        this.A05 = num3;
        this.A0J = num3;
        this.A0I = new C63938LDy(this);
        XZR xzr = new XZR(this);
        this.A0L = xzr;
        C21403XaB xaB = new C21403XaB(userSession2, num2);
        MJ6 mj6 = new MJ6(20, xaB, this);
        XZQ xzq = new XZQ(xaB);
        WIX wix = WIX.A00;
        XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
        XAnalyticsHolder xAnalyticsAdapterHolder2 = new XAnalyticsAdapterHolder(new C12392Ssg(userSession2));
        UserSession userSession3 = xaB.A00;
        boolean A003 = XXs.A00(userSession3);
        0Tu r3 = 0Tu.A05;
        this.A0H = new C22230Xxl(context2, handler, obj, wix, xAnalyticsAdapterHolder2, xzq, xzr, mj6, DbS.A04(r3, userSession3, 36593078412444588L), DbS.A04(r3, userSession3, 36593078412968878L), A003, 182.A06(r3, userSession3, 36311603436192389L), 182.A06(r3, userSession3, 36315168258395187L));
        EPE(0tS.A4E.A00().A0R());
    }
}
