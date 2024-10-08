package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public abstract class HXH {
    public static final void A00(C286575Wy r27, C61070Jw8 jw8, int i) {
        int i2;
        long j;
        C61070Jw8 jw82 = jw8;
        0qQ.A0B(jw82, 0);
        C286575Wy r2 = r27;
        r2.ExV(-623389432);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r2, jw82) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(20612372, "com.instagram.compose.igds.components.bottomsheet.IgdsModalBottomSheetHeader (ModalBottomSheetHeader.kt:128)");
            }
            C284945Oz A0M = C51968G9o.A0M(r2, AndroidCompositionLocals_androidKt.A01);
            Object A0m = C51967G9n.A0m(r2, 182386774);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r2, Float.valueOf(0.0f));
            }
            C284945Oz r11 = (C284945Oz) A0m;
            C286565Wx A0H = C51965G9l.A0H(r2, false);
            Object A0m2 = C51967G9n.A0m(r2, 182388758);
            if (A0m2 == obj) {
                A0m2 = G9t.A0o(r2, Float.valueOf(0.0f));
            }
            C284945Oz A0J = C51965G9l.A0J(A0H, A0m2, false);
            Object A0m3 = C51967G9n.A0m(r2, 182390486);
            if (A0m3 == obj) {
                A0m3 = G9t.A0o(r2, Float.valueOf(0.0f));
            }
            C284945Oz A0J2 = C51965G9l.A0J(A0H, A0m3, false);
            float A02 = (C51971G9r.A02(r11) - (Math.max(C51971G9r.A02(A0J), C51971G9r.A02(A0J2)) * 2.0f)) - ((float) C61380mr.A01((Context) A0M.getValue(), 16));
            C285245Qk r8 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r8);
            Modifier A09 = C287195Zj.A09(C287205Zk.A05(A0T, 44.0f), 8.0f, 12.0f);
            Object A0m4 = C51967G9n.A0m(r2, 182402853);
            if (A0m4 == obj) {
                A0m4 = new J6I(r11, 34);
                r2.FLL(A0m4);
            }
            Modifier A0E = C51973G9u.A0E(A0H, A09, A0m4);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r2);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r2, A0E);
            C51973G9u.A0y(r2, A0H);
            C51971G9r.A12(r2, A0a, A04);
            0sL r7 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r2, A00)) {
                C51971G9r.A13(r2, r7, A00);
            }
            C51965G9l.A18(r2, A01);
            C289515dj r72 = C289515dj.A00;
            C59640JRi jRi = (C59640JRi) jw82.A01;
            r2.ExS(-89226542);
            if (!(jRi instanceof IPT)) {
                C262224Cq r13 = ((AnonymousClass6FV) C51974G9v.A0Y(r2, r2.ECw(), obj)).A00;
                Object AJO = r2.AJO(C55322Hfp.A00);
                Modifier A092 = C287195Zj.A09(r72.AAz(C287215Zl.A0B, r8), 8.0f, 0.0f);
                Object A0m5 = C51967G9n.A0m(r2, -89216911);
                if (A0m5 == obj) {
                    A0m5 = new J6I(A0J, 36);
                    r2.FLL(A0m5);
                }
                Modifier A0E2 = C51973G9u.A0E(A0H, A092, A0m5);
                C287625aV A0R = C51965G9l.A0R(0);
                boolean A1U = C51966G9m.A1U(r2, AJO, G9t.A1Y(r2, jRi, r13, -89209649));
                Object ECw = r2.ECw();
                if (A1U || ECw == obj) {
                    ECw = new C41567AwZ(6, AJO, jRi, r13);
                    r2.FLL(ECw);
                }
                Modifier A022 = C288235ba.A02(r2, A0E2, A0R, C51965G9l.A0y(A0H, ECw, false));
                if (jRi instanceof C53505Gpb) {
                    C53505Gpb gpb = (C53505Gpb) jRi;
                    r2.ExS(-89200785);
                    C286575Wy r18 = r2;
                    C288165bT.A06(r18, C287205Zk.A0D(A022, 24.0f), C287975bA.A00(r2, gpb.A01, 0), C288075bK.A06, C288035bG.A00(r2, gpb.A00), 24576, 8, 0);
                } else if (0qQ.A0K(jRi, IPT.A00)) {
                    r2.ExS(-89177638);
                } else {
                    throw C51972G9s.A0v(r2, A0H, -89202833);
                }
                C286565Wx.A0L(A0H, false);
            }
            C286565Wx.A0L(A0H, false);
            C286715Xm.A01(r2, AnonymousClass5PI.A01(r2, new C59133J7p(r72, jw82, A0M, A02, 1), 751486670), new C286705Xl[]{AnonymousClass5ZZ.A00.A02(C51966G9m.A0d(r2)), C51969G9p.A0T(C304856Fm.A00, C51966G9m.A0H(r2))}, 56);
            C61079JwH jwH = (C61079JwH) jw82.A00;
            r2.ExS(-89130737);
            if (jwH != null) {
                Modifier A093 = C287195Zj.A09(r72.AAz(C287215Zl.A0A, r8), 8.0f, 0.0f);
                Object A0m6 = C51967G9n.A0m(r2, -89126007);
                if (A0m6 == obj) {
                    A0m6 = new J6I(A0J2, 35);
                    r2.FLL(A0m6);
                }
                Modifier A023 = C288235ba.A02(r2, C51973G9u.A0E(A0H, A093, A0m6), C51965G9l.A0R(0), (C62320sa) jwH.A01);
                if (C61079JwH.A00(7, jwH)) {
                    r2.ExS(1532336268);
                    String str = jwH.A02;
                    AnonymousClass5Z4 A0g = C51966G9m.A0g(r2);
                    AnonymousClass5RW r4 = (AnonymousClass5RW) jwH.A00;
                    r2.ExS(-89112030);
                    if (r4 == null) {
                        j = C51966G9m.A0H(r2);
                    } else {
                        j = r4.A00;
                    }
                    C286565Wx.A0L(A0H, false);
                    AnonymousClass5ZZ.A0Q(r2, A023, A0g, str, j);
                    C286565Wx.A0L(A0H, false);
                } else {
                    throw C51972G9s.A0v(r2, A0H, -89118932);
                }
            }
            C286565Wx.A0L(A0H, false);
            r2.ASN();
            C56618I4t.A01(r2, A0T);
            if (0fL.A02()) {
                0fL.A00(240649278);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, jw82, i3, 30);
        }
    }
}
