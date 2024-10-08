package X;

import android.content.Context;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.proxies.IGRTCFeatureProviderProxy;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;

/* renamed from: X.NfO  reason: case insensitive filesystem */
public final class C69142NfO extends IGRTCFeatureProviderProxy {
    public final Context A00;
    public final NDK A01;
    public final AudioModule A02;
    public final ExternalCallProxy A03;
    public final UserSession A04;
    public final NDM A05;
    public final NCW A06;
    public final NDB A07;
    public final NDI A08;
    public final NDP A09;
    public final XNW A0A;
    public final C7856Qbg A0B;
    public final NDW A0C;
    public final NDY A0D;
    public final NDr A0E;
    public final C54023Gy7 A0F;
    public final NDg A0G;
    public final C68367NCq A0H;
    public final OAA A0I;
    public final IGRTCSyncedClockHolder A0J;
    public final OZU A0K;
    public final boolean A0L;
    public final boolean A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
        if (r11 != 1) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList createFeatureHolders() {
        /*
            r14 = this;
            r0 = 24
            java.util.ArrayList r4 = X.DbS.A0v(r0)
            boolean r0 = r14.A0M
            if (r0 == 0) goto L_0x0026
            com.facebook.rsys.audiomodule.gen.AudioModule r1 = r14.A02
            if (r1 == 0) goto L_0x0177
            r0 = 1
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.audiomodule.gen.AudioModuleFeatureFactory.CProxy.create(r1, r0, r0)
            r4.add(r0)
            com.instagram.common.session.UserSession r0 = r14.A04
            X.NCq r1 = new X.NCq
            r1.<init>(r0)
            r0 = 0
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.connectfunnel.gen.ConnectFunnelFeatureFactory.CProxy.create(r1, r0)
        L_0x0022:
            r4.add(r0)
            return r4
        L_0x0026:
            boolean r0 = r14.A0L
            r6 = 0
            if (r0 == 0) goto L_0x0034
            X.NDK r0 = r14.A01
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.metaaivoicestate.feature.gen.MetaAiVoiceStateFeatureFactory.CProxy.create(r0, r6)
            r4.add(r0)
        L_0x0034:
            X.OAA r0 = r14.A0I
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319677974060600(0x81088e00001e38, double:3.03204882617592E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r13 = 9
            if (r0 == 0) goto L_0x0049
            r13 = 25
        L_0x0049:
            r0 = 2342166677212638575(0x20810c2f00042d6f, double:4.068696032194803E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0056
            r13 = r13 | 32
        L_0x0056:
            com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder r0 = r14.A0J
            com.facebook.djinni.msys.infra.McfReference r7 = r0.getSyncedClock()
            X.0qQ.A07(r7)
            r1 = 2
            r0 = r13 & 2
            boolean r9 = X.AnonymousClass7TF.A1S(r0, r1)
            X.NDI r8 = r14.A08
            com.instagram.common.session.UserSession r3 = r14.A04
            r5 = 0
            X.0Tu r10 = X.DbS.A0J(r3, r5)
            r0 = 36594555880998664(0x82028e00000708, double:3.205882721368041E-306)
            long r11 = X.182.A01(r10, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            if (r0 == 0) goto L_0x0085
            r1 = 1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 2
            if (r0 == 0) goto L_0x0086
        L_0x0085:
            r2 = 0
        L_0x0086:
            r0 = 36313600595331239(0x810307000008a7, double:3.028205467395832E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x0093
            r2 = r2 | 4
        L_0x0093:
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.mediasync.gen.MediaSyncFeatureFactory.CProxy.create(r8, r7, r9, r2)
            r4.add(r0)
            X.NDB r0 = r14.A07
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.livevideo.gen.LiveVideoFeatureFactory.CProxy.create(r5, r0, r6, r6)
            r4.add(r0)
            X.NDM r0 = r14.A05
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.moderator.gen.ModeratorFeatureFactory.CProxy.create(r0)
            r4.add(r0)
            com.facebook.rsys.externalcall.gen.ExternalCallProxy r0 = r14.A03
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.externalcall.gen.ExternalCallFeatureFactory.CProxy.create(r0)
            r4.add(r0)
            X.NDr r0 = r14.A0E
            r2 = 1
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationFeatureFactory.CProxy.create(r5, r2, r0)
            r4.add(r0)
            X.NDP r11 = r14.A09
            android.content.Context r0 = r14.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            int r10 = r0.widthPixels
            int r9 = r0.heightPixels
            r8 = 368(0x170, float:5.16E-43)
            r0 = 640(0x280, float:8.97E-43)
            com.facebook.rsys.mosaicgrid.gen.FrameSize r1 = new com.facebook.rsys.mosaicgrid.gen.FrameSize
            if (r10 >= r9) goto L_0x0172
            r1.<init>(r8, r0)
        L_0x00d6:
            com.facebook.rsys.mosaicgrid.gen.MosaicGridParams r0 = new com.facebook.rsys.mosaicgrid.gen.MosaicGridParams
            r0.<init>(r2, r1)
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.mosaicgrid.gen.MosaicGridFeatureFactory.CProxy.create(r11, r0)
            r4.add(r0)
            X.XNW r0 = r14.A0A
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.networkinfo.gen.NetworkInfoFeatureFactory.CProxy.create(r0)
            r4.add(r0)
            X.Qbg r0 = r14.A0B
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.networktraffic.gen.NetworkTrafficFeatureFactory.CProxy.create(r0)
            r4.add(r0)
            X.NDW r0 = r14.A0C
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.photobooth.gen.PhotoboothFeatureFactory.CProxy.create(r0, r7)
            r4.add(r0)
            r1 = 32
            r0 = r13 & 32
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r1)
            X.NCq r0 = r14.A0H
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.connectfunnel.gen.ConnectFunnelFeatureFactory.CProxy.create(r0, r1)
            r4.add(r0)
            X.NCW r0 = r14.A06
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationFeatureFactory.CProxy.create(r0)
            r4.add(r0)
            X.OZU r0 = r14.A0K
            com.facebook.rsys.screenshare.gen.ScreenShareProxy r1 = r0.A07
            r0 = 8
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.screenshare.gen.ScreenShareFeatureFactory.CProxy.create(r0, r1, r6)
            r4.add(r0)
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.appstate.gen.AppstateFeatureFactory.CProxy.create()
            r4.add(r0)
            X.NDY r0 = r14.A0D
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.reactions.gen.ReactionsFeatureFactory.CProxy.create(r0)
            r4.add(r0)
            com.facebook.rsys.audiomodule.gen.AudioModule r0 = r14.A02
            if (r0 == 0) goto L_0x013f
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.audiomodule.gen.AudioModuleFeatureFactory.CProxy.create(r0, r2, r5)
            r4.add(r0)
        L_0x013f:
            X.Gy7 r1 = r14.A0F
            r0 = -1
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.starrating.gen.StarRatingFeatureFactory.CProxy.create(r1, r0)
            r4.add(r0)
            X.NDg r0 = r14.A0G
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.trafficshaping.gen.TrafficShapingFeatureFactory.CProxy.create(r0)
            r4.add(r0)
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.networktelemetry.gen.NetworkTelemetryFeatureFactory.CProxy.create()
            r4.add(r0)
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.realtimesession.feature.gen.RealtimeSessionFeatureFactory.CProxy.create()
            r4.add(r0)
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.netobject.feature.gen.NetObjectFeatureFactory.CProxy.create()
            r4.add(r0)
            X.ND7 r0 = new X.ND7
            r0.<init>(r3)
            com.facebook.rsys.base.gen.FeatureHolder r0 = com.facebook.rsys.hdvideo.gen.HdVideoFeatureFactory.CProxy.create(r0)
            goto L_0x0022
        L_0x0172:
            r1.<init>(r0, r8)
            goto L_0x00d6
        L_0x0177:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69142NfO.createFeatureHolders():java.util.ArrayList");
    }

    public C69142NfO(Context context, UserSession userSession, OU3 ou3) {
        this.A04 = userSession;
        this.A00 = context;
        this.A0I = ou3.A0a;
        this.A08 = ou3.A0M;
        this.A0J = ou3.A0b;
        this.A07 = ou3.A0K;
        this.A05 = ou3.A0I;
        this.A03 = ou3.A0C;
        this.A09 = ou3.A0N;
        this.A0E = ou3.A0S;
        this.A0K = ou3.A0c;
        this.A0A = ou3.A0O;
        this.A0B = ou3.A0P;
        this.A0C = ou3.A0Q;
        this.A0H = ou3.A0Y;
        this.A0D = ou3.A0R;
        this.A06 = ou3.A0J;
        this.A02 = ou3.A0A;
        this.A0F = ou3.A0U;
        this.A0G = ou3.A0V;
        this.A0M = ou3.A0l;
        this.A0L = ou3.A0k;
        this.A01 = ou3.A08;
    }
}
