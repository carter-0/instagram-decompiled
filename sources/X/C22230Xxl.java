package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import com.facebook.mediastreaming.opt.source.event.AndroidEventMessageInputSource;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportError;
import com.facebook.mediastreaming.opt.transport.TransportEvent;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.util.Arrays;

/* renamed from: X.Xxl  reason: case insensitive filesystem */
public final class C22230Xxl implements TransportCallbacks {
    public LiveStreamSessionProbe A00;
    public LiveStreamingClient A01;
    public Integer A02 = AnonymousClass05K.A00;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final Handler A06;
    public final TempFileCreator A07;
    public final AndroidAudioRecorder A08;
    public final AndroidEventMessageInputSource A09 = new AndroidEventMessageInputSource();
    public final WIZ A0A = new WIZ();
    public final XAnalyticsHolder A0B;
    public final XZQ A0C;
    public final C21437Xan A0D;
    public final XZR A0E;
    public final C62320sa A0F;
    public final boolean A0G;

    public C22230Xxl(Context context, Handler handler, AnonymousClass0JR r12, TempFileCreator tempFileCreator, XAnalyticsHolder xAnalyticsHolder, XZQ xzq, XZR xzr, C62320sa r17, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = context;
        this.A0C = xzq;
        this.A07 = tempFileCreator;
        this.A0B = xAnalyticsHolder;
        this.A06 = handler;
        this.A0E = xzr;
        this.A0F = r17;
        this.A0G = z3;
        this.A08 = new AndroidAudioRecorder(r12, 2, i2, z, i, 5, (X0Z) null, z2);
        this.A0D = new C21437Xan(r12, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0051, code lost:
        if (r1 != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSpeedTestResult(com.facebook.mediastreaming.opt.transport.SpeedTestStatus r15) {
        /*
            r14 = this;
            r2 = 0
            X.0qQ.A0B(r15, r2)
            java.lang.Class<X.Xxl> r4 = X.C22230Xxl.class
            java.lang.String r1 = "onSpeedTestResult "
            com.facebook.mediastreaming.opt.transport.SpeedTestStatus$Status r0 = r15.state
            java.lang.String r0 = r0.name()
            java.lang.String r3 = X.002.A0R(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            r7 = 0
            r0 = 3
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = r4.getSimpleName()
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            X.W3b.A06(r1, r3, r0)
            com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient r0 = r14.A01
            if (r0 == 0) goto L_0x00ef
            X.XZR r5 = r14.A0E
            com.facebook.mediastreaming.opt.transport.SpeedTestStatus$Status r0 = r15.state
            int r1 = r0.ordinal()
            double r2 = r15.bandwidth
            long r8 = r15.timeTaken
            boolean r6 = r15.speedTestPassesThreshold
            com.facebook.video.common.livestreaming.NetworkSpeedTest$Status[] r0 = com.facebook.video.common.livestreaming.NetworkSpeedTest.Status.values()
            r4 = r0[r1]
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r2 = r2 * r0
            com.facebook.video.common.livestreaming.NetworkSpeedTest$Status r0 = com.facebook.video.common.livestreaming.NetworkSpeedTest.Status.Ignored
            boolean r1 = X.AnonymousClass7TF.A1W(r4, r0)
            com.facebook.video.common.livestreaming.NetworkSpeedTest$Status r0 = com.facebook.video.common.livestreaming.NetworkSpeedTest.Status.Succeeded
            if (r4 != r0) goto L_0x0050
            if (r6 != 0) goto L_0x0053
        L_0x0050:
            r13 = 0
            if (r1 == 0) goto L_0x0054
        L_0x0053:
            r13 = 1
        L_0x0054:
            X.Y0z r6 = r5.A00
            X.M0X r10 = r6.A0E
            java.lang.String r5 = r4.name()
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.0Ae r1 = r10.A0N
            r0 = 4858(0x12fa, float:6.808E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r4 = X.C51969G9p.A0d(r1, r0)
            r0 = 2730(0xaaa, float:3.826E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "step"
            r4.AAJ(r0, r1)
            X.1Q9 r0 = r10.A0Q
            java.lang.String r0 = r0.A05()
            X.0qQ.A07(r0)
            X.C21053XCe.A15(r4, r0)
            X.0iw r0 = r10.A0O
            X.C51969G9p.A1A(r4, r0)
            long r0 = r10.A02
            float r12 = (float) r0
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r12 = r12 / r11
            double r0 = (double) r12
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "duration"
            r4.A8D(r0, r1)
            java.lang.String r1 = r10.A09
            r0 = 4539(0x11bb, float:6.36E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
            java.lang.String r1 = r10.A08
            java.lang.String r0 = "broadcast_id"
            r4.AAJ(r0, r1)
            if (r13 == 0) goto L_0x00f0
            r0 = 1
        L_0x00ae:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "result"
            r4.A9F(r0, r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "kbps"
            r4.A8D(r0, r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r10.A01
            long r2 = r2 - r0
            float r0 = (float) r2
            float r0 = r0 / r11
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = 5190(0x1446, float:7.273E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A8D(r0, r1)
            java.lang.String r0 = "state"
            r4.AAJ(r0, r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = "time_taken"
            r4.A9F(r0, r1)
            r4.Cgf()
            X.XcN r0 = r6.A00
            X.C21478XcN.A00(r0)
            r6.A00 = r7
        L_0x00ef:
            return
        L_0x00f0:
            r0 = 0
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22230Xxl.onSpeedTestResult(com.facebook.mediastreaming.opt.transport.SpeedTestStatus):void");
    }

    public final void onTransportEvent(TransportEvent transportEvent, TransportError transportError) {
        String str;
        0qQ.A0B(transportEvent, 0);
        Class<C22230Xxl> cls = C22230Xxl.class;
        String name = transportEvent.name();
        if (transportError != null) {
            str = transportError.fullDescription;
        } else {
            str = null;
        }
        String A0u = 002.A0u("onTransportEvent ", name, ", ", str);
        Object[] copyOf = Arrays.copyOf(new Object[0], 0);
        0qQ.A0B(copyOf, 3);
        W3b.A06(cls.getSimpleName(), A0u, Arrays.copyOf(copyOf, copyOf.length));
        switch (transportEvent.ordinal()) {
            case 0:
                C22371Y0z y0z = this.A0E.A00;
                y0z.A0E.A0F("onConnectionEstablished");
                C62423KfY kfY = ((C65818M0k) y0z.A0G).A01;
                if (y0z.equals(kfY.A0F)) {
                    kfY.A0a.A0C = true;
                    if (kfY.A0Q) {
                        kfY.A0Q = false;
                        C62423KfY.A0A(kfY, AnonymousClass05K.A05);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.A04 = false;
                return;
            case 2:
            case 3:
            case 7:
                return;
            case 4:
                this.A04 = true;
                return;
            case 5:
                if (transportError != null) {
                    LiveStreamingError liveStreamingError = new LiveStreamingError(transportError.errorCode, transportError.domain, transportError.reason, transportError.description, transportError.fullDescription, transportError.isTransient, transportError.isConnectionLost, transportError.isStreamTerminated);
                    if (this.A01 != null) {
                        C22371Y0z y0z2 = this.A0E.A00;
                        M0X m0x = y0z2.A0E;
                        int i = liveStreamingError.errorCode;
                        String str2 = liveStreamingError.domain;
                        if (str2 == null) {
                            str2 = "";
                        }
                        m0x.A0D(i, str2, liveStreamingError.reason, liveStreamingError.description, liveStreamingError.fullDescription);
                        MUT mut = y0z2.A0G;
                        String obj = liveStreamingError.toString();
                        C62423KfY kfY2 = ((C65818M0k) mut).A01;
                        if (y0z2.equals(kfY2.A0F)) {
                            kfY2.A0a.A0C = false;
                            if (!kfY2.A0Q) {
                                kfY2.A0Q = true;
                                C62423KfY.A03((C21478XcN) null, kfY2, AnonymousClass05K.A0Y, obj, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                this.A03 = true;
                if (transportError != null) {
                    LiveStreamingError liveStreamingError2 = new LiveStreamingError(transportError.errorCode, transportError.domain, transportError.reason, transportError.description, transportError.fullDescription, transportError.isTransient, transportError.isConnectionLost, transportError.isStreamTerminated);
                    if (this.A01 != null) {
                        String str3 = "";
                        C22371Y0z y0z3 = this.A0E.A00;
                        MUT mut2 = y0z3.A0G;
                        BroadcastFailureType broadcastFailureType = BroadcastFailureType.InitFailure;
                        String str4 = liveStreamingError2.domain;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        mut2.Cz4(new C62683Kkj(broadcastFailureType, str3, liveStreamingError2.fullDescription), y0z3);
                        return;
                    }
                    return;
                }
                return;
            default:
                0KC.A02(cls, 002.A0R("Unrecognized event ", name));
                return;
        }
    }
}
