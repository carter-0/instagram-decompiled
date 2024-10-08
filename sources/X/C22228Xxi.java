package X;

import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.Xxi  reason: case insensitive filesystem */
public final class C22228Xxi implements LiveStreamingClient.LiveStreamingSessionCallbacks {
    public final /* synthetic */ C22230Xxl A00;

    public C22228Xxi(C22230Xxl xxl) {
        this.A00 = xxl;
    }

    public final void onError(int i, String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        AnonymousClass7TG.A1O(str5, str6);
        String str7 = str4;
        0qQ.A0B(str7, 4);
        C22230Xxl xxl = this.A00;
        if (!xxl.A03) {
            LiveStreamingError liveStreamingError = new LiveStreamingError(i, "StreamingSdkLiveStreamer", str6, str5, str7, false, false, false);
            if (xxl.A01 != null) {
                XZR xzr = xxl.A0E;
                0KC.A05(C22371Y0z.class, "onStreamFailed", liveStreamingError.A00);
                C22371Y0z y0z = xzr.A00;
                C18594Vul vul = y0z.A02;
                if (vul != null) {
                    C18594Vul.A01(vul, new C62683Kkj(BroadcastFailureType.InitFailure, "StartLiveStream", "Failed to start live stream"));
                    y0z.A02 = null;
                }
                MUT mut = y0z.A0G;
                BroadcastFailureType broadcastFailureType = BroadcastFailureType.InitFailure;
                String str8 = liveStreamingError.domain;
                if (str8 == null) {
                    str8 = "";
                }
                mut.Cz4(new C62683Kkj(broadcastFailureType, str8, liveStreamingError.fullDescription), y0z);
            }
        }
    }

    public final void onInitialized() {
        C22371Y0z y0z = this.A00.A0E.A00;
        y0z.A0E.A0F("onStreamInitialized");
        y0z.A07 = AnonymousClass05K.A01;
    }

    public final void onPaused() {
        C22230Xxl xxl = this.A00;
        C21437Xan xan = xxl.A0D;
        boolean z = xan.A02;
        long j = xan.A00;
        if (z) {
            j += xan.A03.now() - xan.A01;
        }
        xan.A00 = j;
        xan.A02 = false;
        C22371Y0z y0z = xxl.A0E.A00;
        y0z.A0E.A0F("onStreamPaused");
        y0z.A0I.A00();
        y0z.A07 = AnonymousClass05K.A0N;
        11Z.A02(new Y25(y0z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReleased() {
        /*
            r5 = this;
            X.Xxl r0 = r5.A00
            X.XZR r0 = r0.A0E
            X.Y0z r4 = r0.A00
            X.Xxl r2 = r4.A0H
            com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe r0 = r2.A00
            if (r0 == 0) goto L_0x006a
            int r1 = r0.getMuxState()
            r0 = 1
            if (r1 == r0) goto L_0x0067
            r0 = 2
            if (r1 == r0) goto L_0x0064
            r0 = 3
            if (r1 == r0) goto L_0x0061
            r0 = 4
            if (r1 != r0) goto L_0x006a
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
        L_0x001e:
            r4.A05 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3 = 0
            if (r1 == r0) goto L_0x0056
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x0056
            r0 = r3
        L_0x002a:
            r4.A04 = r0
            X.M0X r2 = r4.A0E
            if (r0 != 0) goto L_0x004a
            java.lang.String r1 = "dvr:missing"
        L_0x0032:
            java.lang.String r0 = "onStreamFinished"
            r2.A0H(r0, r1)
            X.Vul r2 = r4.A01
            java.io.File r1 = r4.A04
            X.XZO r0 = new X.XZO
            r0.<init>(r1)
            X.C18594Vul.A02(r2, r0)
            r4.A01 = r3
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r4.A07 = r0
            return
        L_0x004a:
            java.lang.Integer r1 = r4.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0053
            java.lang.String r1 = "dvr:ok"
            goto L_0x0032
        L_0x0053:
            java.lang.String r1 = "dvr:full"
            goto L_0x0032
        L_0x0056:
            com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe r0 = r2.A00
            if (r0 == 0) goto L_0x005f
            java.io.File r0 = r0.getDvrOutputFile()
            goto L_0x002a
        L_0x005f:
            r0 = 0
            goto L_0x002a
        L_0x0061:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x001e
        L_0x0064:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x001e
        L_0x0067:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x001e
        L_0x006a:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22228Xxi.onReleased():void");
    }

    public final void onResumed() {
        C22230Xxl xxl = this.A00;
        C21437Xan xan = xxl.A0D;
        if (!xan.A02) {
            xan.A02 = true;
            xan.A01 = xan.A03.now();
        }
        C22371Y0z y0z = xxl.A0E.A00;
        y0z.A0E.A0F("onStreamResumed");
        C63938LDy lDy = y0z.A0I;
        if (!lDy.A02) {
            lDy.A02 = true;
            lDy.A05.A0B.post(lDy.A04);
        }
        C22371Y0z.A00(y0z);
        y0z.A07 = AnonymousClass05K.A0C;
    }

    public final void onStarted() {
        C22230Xxl xxl = this.A00;
        C21437Xan xan = xxl.A0D;
        if (!xan.A02) {
            xan.A02 = true;
            xan.A01 = xan.A03.now();
        }
        C22371Y0z y0z = xxl.A0E.A00;
        y0z.A0E.A0F("onStreamStarted");
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = y0z.A0C.liveTraceConfig;
        if (videoBroadcastLiveTraceConfig != null && videoBroadcastLiveTraceConfig.enabled) {
            y0z.A0F.A02(y0z.A0J);
        }
        C63938LDy lDy = y0z.A0I;
        if (!lDy.A02) {
            lDy.A02 = true;
            lDy.A05.A0B.post(lDy.A04);
        }
        C22371Y0z.A00(y0z);
        y0z.A07 = AnonymousClass05K.A0C;
    }

    public final void onStopped() {
        C22230Xxl xxl = this.A00;
        C21437Xan xan = xxl.A0D;
        boolean z = xan.A02;
        long j = xan.A00;
        if (z) {
            j += xan.A03.now() - xan.A01;
        }
        xan.A00 = j;
        xan.A02 = false;
        C22371Y0z y0z = xxl.A0E.A00;
        y0z.A0E.A0F("onStreamStopped");
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = y0z.A0C.liveTraceConfig;
        if (videoBroadcastLiveTraceConfig != null && videoBroadcastLiveTraceConfig.enabled) {
            y0z.A0F.A01(y0z.A0J);
        }
        y0z.A0I.A00();
        y0z.A07 = AnonymousClass05K.A0Y;
    }
}
