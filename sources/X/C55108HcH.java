package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HcH  reason: case insensitive filesystem */
public abstract class C55108HcH {
    public static final void A00(C286575Wy r32, String str, C62320sa r34, int i, boolean z) {
        int i2;
        String str2 = str;
        C62320sa r10 = r34;
        int A02 = DbW.A02(0, str2, r10);
        C286575Wy r15 = r32;
        r15.ExV(-1001944161);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, str2) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r15, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r10);
        }
        if ((i2 & 147) != 146 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(340089186, "com.instagram.rtc.presentation.aistatus.RtcCallAiStatusLayout (RtcCallAiStatusLayout.kt:25)");
            }
            C285245Qk r4 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r4);
            Modifier A0B = C287195Zj.A0B(A0T, 0.0f, 0.0f, 0.0f, 48.0f);
            AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A06, r15, C287215Zl.A02, 6);
            int A00 = C287425a7.A00(r15);
            C286565Wx r2 = (C286565Wx) r15;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r15, A0B);
            C51973G9u.A0y(r15, r2);
            C51971G9r.A12(r15, A022, A04);
            0sL r6 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r6, A00);
            }
            C51965G9l.A18(r15, A01);
            C304676Et r3 = C304676Et.A00;
            r15.ExS(1701114259);
            if (str2.length() > 0 && !z) {
                AnonymousClass5Z4 A0h = C51966G9m.A0h(r15);
                long A0I = C51966G9m.A0I(r15);
                long A012 = AnonymousClass5Z7.A01(14);
                Modifier A09 = C287195Zj.A09(C51969G9p.A0X(C287195Zj.A0B(C51966G9m.A0S(r3, r4), 0.0f, 0.0f, 0.0f, 38.0f), 8.0f, AnonymousClass5aQ.A00(r15).A0r), 10.0f, 4.0f);
                boolean A1Z = C51974G9v.A1Z(r15, 1701135471, i2);
                Object ECw = r15.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = new C74180PqM(r10, 14);
                    r15.FLL(ECw);
                }
                AnonymousClass5ZZ.A03(r15, A09, A0h, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, str2, C51965G9l.A0z(r2, ECw), 3, 0, A02, 0, (i2 & 14) | 3072, 6, 7024, A0I, A012, 0, false);
            }
            C286565Wx.A0L(r2, false);
            C56340Hwr.A01(r15, C287195Zj.A0B(A0T, 0.0f, 0.0f, 0.0f, 48.0f), 26.0f, 6.0f, (i2 & 112) | 3462, z2);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(958428463);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59140J7w(r10, str2, i3, 6, z2);
        }
    }
}
