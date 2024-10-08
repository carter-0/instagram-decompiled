package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.realtimeclient.RealtimeClientManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Ods  reason: case insensitive filesystem */
public final class C71142Ods {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public RtcCallKey A0K;
    public Integer A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public final int A0P;
    public final OMM A0Q;
    public final C69465Nm9 A0R;
    public final ONT A0S;
    public final C60640iu A0T;
    public final UserSession A0U;
    public final C70687OGi A0V;
    public final RealtimeClientManager A0W;
    public final OTL A0X;
    public final C68683NSp A0Y;
    public final 1Cn A0Z;
    public final Integer A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final boolean A0f;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        if (r1.A06() != false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0xI A00(X.C70840ONr r9, X.C71142Ods r10) {
        /*
            X.NSp r1 = r10.A0Y
            java.lang.String r0 = "ig_video_call_waterfall"
            X.0xI r2 = r1.A04(r0)
            java.lang.String r1 = r10.A0e
            java.lang.String r0 = "thread_id"
            r2.A0C(r0, r1)
            java.lang.String r1 = r10.A0d
            java.lang.String r0 = "open_thread_id"
            if (r1 == 0) goto L_0x0018
            r2.A0C(r0, r1)
        L_0x0018:
            java.lang.String r1 = r10.A0b
            java.lang.String r0 = "armadillo_thread_id"
            if (r1 == 0) goto L_0x0021
            r2.A0C(r0, r1)
        L_0x0021:
            java.lang.String r1 = r10.A0c
            java.lang.String r0 = "occamadillo_thread_id"
            if (r1 == 0) goto L_0x002a
            r2.A0C(r0, r1)
        L_0x002a:
            X.Nm9 r0 = r10.A0R
            if (r0 == 0) goto L_0x0039
            long r0 = r0.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "xma_type"
            r2.A0B(r0, r1)
        L_0x0039:
            boolean r1 = r10.A0f
            java.lang.String r0 = "e2ee_mandated"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A09(r0, r1)
            java.lang.String r0 = "is_e2ee"
            r2.A09(r0, r1)
            long r5 = r10.A02
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            long r5 = android.os.SystemClock.elapsedRealtime()
        L_0x0055:
            long r3 = r10.A01
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            long r7 = r5 - r3
        L_0x005d:
            java.lang.String r1 = "duration"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.A0B(r1, r0)
            com.instagram.realtimeclient.RealtimeClientManager r0 = r10.A0W
            boolean r3 = r0.isMqttConnected()
            r0 = 344(0x158, float:4.82E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A09(r1, r0)
            com.instagram.common.session.UserSession r0 = r10.A0U
            X.6AQ r0 = X.AnonymousClass6AP.A00(r0)
            int r0 = r0.A00
            java.lang.String r1 = X.C59690JTx.A00(r0)
            java.lang.String r0 = "act_connection_status"
            r2.A0C(r0, r1)
            X.1Cn r1 = r10.A0Z
            r1.A04()
            boolean r0 = r10.A0N
            if (r0 != 0) goto L_0x009a
            boolean r1 = r1.A06()
            r0 = 0
            if (r1 == 0) goto L_0x009b
        L_0x009a:
            r0 = 1
        L_0x009b:
            r10.A0N = r0
            java.util.Map r0 = r9.A00
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r0)
        L_0x00a3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0114
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r4)
            java.lang.String r3 = X.DbT.A13(r0)
            java.lang.Object r1 = r0.getValue()
            X.Np8 r1 = (X.C69626Np8) r1
            boolean r0 = r1 instanceof X.C69078NeI
            if (r0 == 0) goto L_0x00c3
            X.NeI r1 = (X.C69078NeI) r1
            java.lang.String r0 = r1.A00
            r2.A0C(r3, r0)
            goto L_0x00a3
        L_0x00c3:
            boolean r0 = r1 instanceof X.C69076NeG
            if (r0 == 0) goto L_0x00d3
            X.NeG r1 = (X.C69076NeG) r1
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A08(r0, r3)
            goto L_0x00a3
        L_0x00d3:
            boolean r0 = r1 instanceof X.C69073NeD
            if (r0 == 0) goto L_0x00e3
            X.NeD r1 = (X.C69073NeD) r1
            boolean r0 = r1.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A09(r3, r0)
            goto L_0x00a3
        L_0x00e3:
            boolean r0 = r1 instanceof X.C69074NeE
            if (r0 == 0) goto L_0x00f3
            X.NeE r1 = (X.C69074NeE) r1
            double r0 = r1.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A0A(r3, r0)
            goto L_0x00a3
        L_0x00f3:
            boolean r0 = r1 instanceof X.C69077NeH
            if (r0 == 0) goto L_0x0103
            X.NeH r1 = (X.C69077NeH) r1
            long r0 = r1.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B(r3, r0)
            goto L_0x00a3
        L_0x0103:
            boolean r0 = r1 instanceof X.C69075NeF
            if (r0 == 0) goto L_0x010f
            X.NeF r1 = (X.C69075NeF) r1
            X.0xE r0 = r1.A00
            r2.A06(r0, r3)
            goto L_0x00a3
        L_0x010f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0114:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71142Ods.A00(X.ONr, X.Ods):X.0xI");
    }

    public static final C70840ONr A01(C71142Ods ods, String str) {
        String str2;
        String str3;
        RtcCallKey rtcCallKey = ods.A0K;
        if (rtcCallKey != null) {
            str2 = rtcCallKey.A00;
        } else {
            str2 = null;
        }
        C70840ONr oNr = new C70840ONr();
        oNr.A03("step", str);
        oNr.A03("server_info_data", str2);
        if (ods.A0a.intValue() != 0) {
            str3 = MediaStreamTrack.AUDIO_TRACK_KIND;
        } else {
            str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        oNr.A03("call_type", str3);
        return oNr;
    }

    public static final void A02(C69417Nkz nkz, C71142Ods ods, 0sP r6) {
        C71004OWb oWb = C71004OWb.A00;
        String str = nkz.A00;
        oWb.A00("RtcWaterfallImpl", 002.A0R("log: ", str));
        if (!ods.A0f || nkz.A01) {
            C70840ONr A012 = A01(ods, str);
            if (r6 != null) {
                r6.invoke(A012);
            }
            ods.A0T.EFq(A00(A012, ods));
        }
    }

    public static final void A03(C74424Pue pue, C71142Ods ods) {
        if (!ods.A0f || pue.BzR().A01) {
            C70840ONr A012 = A01(ods, pue.BzR().A00);
            pue.AvD().invoke(A012);
            ods.A0T.EFq(A00(A012, ods));
        }
    }

    public static final void A04(C71142Ods ods) {
        long j = ods.A07;
        long j2 = ods.A06;
        long j3 = 0;
        if (j2 != 0) {
            j3 = SystemClock.elapsedRealtime() - j2;
        }
        ods.A07 = j + j3;
        ods.A06 = 0;
    }

    public static final void A05(C71142Ods ods) {
        long j = ods.A08;
        long j2 = 0;
        if (j != 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        int intValue = ods.A0L.intValue();
        if (intValue == 0) {
            ods.A04 += j2;
        } else if (intValue != 1) {
            ods.A03 += j2;
        } else {
            ods.A05 += j2;
        }
    }

    public static final void A06(C71142Ods ods) {
        long j = ods.A0F;
        long j2 = 0;
        if (j != 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        int intValue = ods.A0L.intValue();
        if (intValue == 0) {
            ods.A0C += j2;
        } else if (intValue != 1) {
            ods.A00 += j2;
        } else {
            ods.A0G += j2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002a, code lost:
        r1 = r7.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C71142Ods(android.content.Context r4, X.C69465Nm9 r5, com.instagram.common.session.UserSession r6, com.instagram.model.rtc.RtcCallFunnelSessionId r7, com.instagram.model.rtc.RtcCallKey r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r3 = this;
            X.0xN r2 = X.C60510iO.A00(r6)
            com.instagram.realtimeclient.RealtimeClientManager r1 = com.instagram.realtimeclient.RealtimeClientManager.getInstance(r6)
            X.ONT r0 = new X.ONT
            r0.<init>(r6)
            r3.<init>()
            r3.A0U = r6
            r3.A0K = r8
            r3.A0e = r11
            r3.A0d = r12
            r3.A0b = r13
            r3.A0c = r14
            r3.A0R = r5
            r3.A0a = r9
            r3.A0f = r15
            r3.A0T = r2
            r3.A0W = r1
            r3.A0S = r0
            if (r7 == 0) goto L_0x0030
            java.lang.String r1 = r7.A00()
            if (r1 != 0) goto L_0x0034
        L_0x0030:
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
        L_0x0034:
            X.NSp r0 = new X.NSp
            r0.<init>(r10, r1)
            r3.A0Y = r0
            X.1Cn r2 = new X.1Cn
            r2.<init>(r4)
            r3.A0Z = r2
            r0 = 20
            X.MJ0 r1 = new X.MJ0
            r1.<init>(r6, r0)
            java.lang.Class<X.OGi> r0 = X.C70687OGi.class
            java.lang.Object r0 = r6.A01(r0, r1)
            X.OGi r0 = (X.C70687OGi) r0
            r3.A0V = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A0L = r0
            X.1Cn.A00(r2)
            int r0 = r2.A00
            r3.A0P = r0
            java.lang.String r0 = "/proc/self/stat"
            java.lang.String[] r0 = X.OYL.A02(r0)
            X.OMM r0 = X.OYL.A01(r0)
            r3.A0Q = r0
            X.Pkf r1 = X.C73842Pkf.A00
            X.OTL r0 = new X.OTL
            r0.<init>(r1)
            r3.A0X = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71142Ods.<init>(android.content.Context, X.Nm9, com.instagram.common.session.UserSession, com.instagram.model.rtc.RtcCallFunnelSessionId, com.instagram.model.rtc.RtcCallKey, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A07(C71142Ods ods, Integer num) {
        A06(ods);
        ods.A0F = SystemClock.elapsedRealtime();
        if (ods.A08 > 0) {
            A05(ods);
            ods.A08 = SystemClock.elapsedRealtime();
        }
        ods.A0L = num;
    }
}
