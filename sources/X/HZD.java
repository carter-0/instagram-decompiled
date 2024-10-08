package X;

import androidx.compose.ui.Modifier;

public abstract class HZD {
    public static final void A00(C286575Wy r22, JV5 jv5, C52369GPq gPq, C62320sa r25, C62320sa r26, int i, int i2) {
        int i3;
        C62320sa r1 = r26;
        C62320sa r3 = r25;
        JV5 jv52 = jv5;
        C52369GPq gPq2 = gPq;
        AnonymousClass7TF.A1H(jv52, gPq2);
        C286575Wy r14 = r22;
        r14.ExV(-1654534157);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r14, jv52) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r14, gPq2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r14, r3);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r14, r1);
        }
        if ((i3 & 1171) != 1170 || !r14.Bwn()) {
            if (i6 != 0) {
                r3 = C58363Iqi.A00;
            }
            if (i7 != 0) {
                r1 = C58364Iqj.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1109403665, "com.instagram.creator.agent.settings.audience.Layout (ReachabilityFragment.kt:105)");
            }
            C60340gF r9 = C60340gF.A00;
            boolean A1Z = C51967G9n.A1Z(r14, gPq2, -1386443442);
            Object ECw = r14.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = G9w.A0n(r14, gPq2, 13);
            }
            C286565Wx A0E = C51975G9x.A0E(r14, ECw, r9);
            C285245Qk r12 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
            int A00 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(A0E);
            Modifier A01 = C287435a8.A01(r14, r12);
            C51973G9u.A0y(r14, A0E);
            C51971G9r.A12(r14, A0Z, A04);
            0sL r92 = C287485aD.A02;
            if (A0E.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r92, A00);
            }
            C51965G9l.A18(r14, A01);
            C304676Et r93 = C304676Et.A00;
            String A012 = C52409GRk.A01(r14, (C266444Yx) jv52.A00);
            AnonymousClass5ZZ.A06(r14, C287195Zj.A0B(r93.A00(r12, false), 16.0f, 20.0f, 16.0f, 36.0f), C51966G9m.A0c(r14), A012);
            String A013 = C52409GRk.A01(r14, (C266444Yx) jv52.A03);
            boolean A1Z2 = C51967G9n.A1Z(r14, gPq2, -1803365112) | AnonymousClass7TF.A1S(i3 & 896, 256);
            Object ECw2 = r14.ECw();
            if (A1Z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C58689Ivy.A00(r14, r3, gPq2, 24);
            }
            C62320sa A0y = C51965G9l.A0y(A0E, ECw2, false);
            boolean z = jv52.A01;
            String A002 = C288035bG.A00(r14, 2131966205);
            boolean A1Z3 = C51967G9n.A1Z(r14, gPq2, -1803357270) | C51975G9x.A1P(i3);
            Object ECw3 = r14.ECw();
            if (A1Z3 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C58689Ivy(25, r1, gPq2);
                r14.FLL(ECw3);
            }
            I7L.A01(r14, (Modifier) null, (CharSequence) null, A013, A002, A0y, C51965G9l.A0y(A0E, ECw3, false), 0, 0, 32652, false, z);
            if (C51967G9n.A1R(r14)) {
                0fL.A00(1464743014);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(jv52, r1, r3, gPq2, i5, i4, 15);
        }
    }
}
