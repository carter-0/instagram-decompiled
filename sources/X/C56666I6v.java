package X;

import androidx.compose.ui.Modifier;
import ca.psiphon.PsiphonTunnel;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.I6v  reason: case insensitive filesystem */
public abstract class C56666I6v {
    public static final Modifier A00(C286575Wy r10, Modifier modifier) {
        0qQ.A0B(modifier, 0);
        C286575Wy r2 = r10;
        if (C51967G9n.A1U(r10, -1407831292)) {
            0fL.A01(-12217275, "com.instagram.compose.ui.shimmer.shimmer (Shimmer.kt:45)");
        }
        Modifier A01 = A01(r2, modifier, A03(r2, (List) null, 0.0f, 0.0f, 0, 0, 127, 0), 0);
        if (0fL.A02()) {
            0fL.A00(-833105855);
        }
        C51965G9l.A1X(r2, false);
        return A01;
    }

    public static final Modifier A01(C286575Wy r4, Modifier modifier, C55984Hqp hqp, int i) {
        AnonymousClass7TF.A1H(modifier, hqp);
        if (C51967G9n.A1U(r4, 167695156)) {
            0fL.A01(909477543, "com.instagram.compose.ui.shimmer.shimmer (Shimmer.kt:49)");
        }
        boolean z = false;
        A04(r4, 0);
        r4.ExS(1361958498);
        if ((((i & 112) ^ 48) > 32 && r4.AGu(hqp)) || (i & 48) == 32) {
            z = true;
        }
        Object ECw = r4.ECw();
        if (z || ECw == AnonymousClass5XT.A00) {
            ECw = new J6I(hqp, 47);
            r4.FLL(ECw);
        }
        C286565Wx A0H = C51965G9l.A0H(r4, false);
        Modifier A00 = C289575dp.A00(modifier, (0sP) ECw);
        if (0fL.A02()) {
            0fL.A00(660425648);
        }
        C286565Wx.A0L(A0H, false);
        return A00;
    }

    public static final C55984Hqp A02(C286575Wy r7, List list, float f, float f2, float f3, int i, int i2, int i3) {
        int i4 = i;
        float f4 = f3;
        float f5 = f2;
        float f6 = f;
        List list2 = list;
        0qQ.A0B(list, 0);
        C286575Wy r5 = r7;
        r7.ExS(309505176);
        if ((i3 & 2) != 0) {
            f6 = 250.0f;
        }
        if ((i3 & 4) != 0) {
            f5 = 750.0f;
        }
        if ((i3 & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i3 & 16) != 0) {
            i4 = PsiphonTunnel.VPN_INTERFACE_MTU;
        }
        if (0fL.A02()) {
            0fL.A01(-849324079, "com.instagram.compose.ui.shimmer.rememberShimmerState (Shimmer.kt:86)");
        }
        GRG A01 = GRH.A01(new GRJ(GQC.A01(C52518GVv.A02, i4, 0), AnonymousClass05K.A00), GRH.A02(r7), r5, 0.0f, 1.0f, 4536 | ((i2 >> 3) & 57344));
        Object A0m = C51967G9n.A0m(r5, 464261022);
        if (A0m == AnonymousClass5XT.A00) {
            A0m = new C55984Hqp(A01, list2, f6, f5, f4);
            r5.FLL(A0m);
        }
        C55984Hqp hqp = (C55984Hqp) A0m;
        C286565Wx A0H = C51965G9l.A0H(r5, false);
        hqp.A03 = list2;
        hqp.A00 = f6;
        hqp.A02 = f5;
        hqp.A01 = f4;
        if (0fL.A02()) {
            0fL.A00(763823760);
        }
        C286565Wx.A0L(A0H, false);
        return hqp;
    }

    public static void A05(C286575Wy r2, Modifier modifier) {
        C287675aa.A02(r2, A00(r2, modifier), 0);
    }

    public static void A06(C286575Wy r8, Modifier modifier, float f) {
        Modifier A08 = C287205Zk.A08(modifier, f);
        C286575Wy r3 = r8;
        AnonymousClass5aQ.A02(r8);
        C287675aa.A02(r3, A01(r3, AnonymousClass6FZ.A01(A08, AnonymousClass5ZM.A02), A02(r3, C55378Hgk.A01, 0.0f, 250.0f, 0.0f, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, 24966, 42), 0), 0);
    }

    public static void A07(C286575Wy r2, Modifier modifier, AnonymousClass5S2 r4) {
        C287675aa.A02(r2, A00(r2, AnonymousClass6FZ.A01(modifier, r4)), 0);
    }

    public static final C55984Hqp A03(C286575Wy r16, List<Object> list, float f, float f2, int i, int i2, int i3, long j) {
        int i4 = i2;
        int i5 = i;
        float f3 = f2;
        float f4 = f;
        long j2 = j;
        C286575Wy r9 = r16;
        r9.ExS(-1062796575);
        if ((i3 & 1) != 0) {
            j2 = C51966G9m.A0A(r9);
        }
        if ((i3 & 2) != 0) {
            Float valueOf = Float.valueOf(0.3f);
            Float valueOf2 = Float.valueOf(0.6f);
            Float valueOf3 = Float.valueOf(0.9f);
            list = 0sr.A1P(new Float[]{valueOf, valueOf2, valueOf3, C51967G9n.A0h(), valueOf3, valueOf2, valueOf});
        }
        float f5 = 0.0f;
        if ((i3 & 4) != 0) {
            f5 = 250.0f;
        }
        if ((i3 & 8) != 0) {
            f4 = 750.0f;
        }
        if ((i3 & 16) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 32) != 0) {
            i5 = PsiphonTunnel.VPN_INTERFACE_MTU;
        }
        if (0fL.A02()) {
            0fL.A01(828818036, "com.instagram.compose.ui.shimmer.rememberShimmerState (Shimmer.kt:63)");
        }
        r9.ExS(464226447);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (Object A04 : list) {
            A0r.add(C51965G9l.A0N(C285595Rx.A01(C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j2 & 63)], AnonymousClass5RW.A03(j2), AnonymousClass5RW.A02(j2), AnonymousClass5RW.A01(j2), AnonymousClass7TE.A04(A04)), AnonymousClass5aQ.A00(r9).A0C)));
        }
        C286565Wx r4 = (C286565Wx) r9;
        C286565Wx.A0L(r4, false);
        int i6 = i4 >> 3;
        C55984Hqp A02 = A02(r9, A0r, f5, f4, f3, i5, C51973G9u.A03((i6 & 112) | (i6 & 896), i6 & 7168, i6), 0);
        if (0fL.A02()) {
            0fL.A00(-1006585481);
        }
        C286565Wx.A0L(r4, false);
        return A02;
    }

    public static final void A04(C286575Wy r6, int i) {
        C286625Xd ASQ;
        int i2;
        r6.ExV(1532647369);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-677821853, "com.instagram.compose.ui.shimmer.LogShimmerState (Shimmer.kt:108)");
            }
            int A00 = C287425a7.A00(r6);
            String A0p = C51972G9s.A0p(r6);
            Object AJO = r6.AJO(C304946Fv.A00);
            if (AJO == null) {
                if (0fL.A02()) {
                    0fL.A00(-467448482);
                }
                ASQ = r6.ASQ();
                if (ASQ != null) {
                    i2 = 21;
                    JG9.A01(ASQ, i, i2);
                }
                return;
            }
            C60340gF r2 = C60340gF.A00;
            boolean A1U = C51968G9o.A1U(r6, A0p, C51967G9n.A1Z(r6, AJO, 1377756967), r6.AGs(A00));
            Object ECw = r6.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = new C52425GSd(AJO, A0p, A00, 1);
                r6.FLL(ECw);
            }
            C51965G9l.A1V(r6);
            C286645Xf.A03(r6, r2, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(-1380009347);
            }
        } else {
            r6.Evl();
        }
        ASQ = r6.ASQ();
        if (ASQ != null) {
            i2 = 20;
            JG9.A01(ASQ, i, i2);
        }
    }
}
