package X;

import android.graphics.DashPathEffect;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.android.R;

public abstract class I53 {
    public static final void A03(C286575Wy r12, Modifier modifier, C52979GgW ggW, int i) {
        int i2;
        Modifier modifier2 = modifier;
        AnonymousClass7TF.A1H(ggW, modifier);
        C286575Wy r3 = r12;
        r12.ExV(470481661);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, ggW) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r12, modifier);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1771003537, "com.instagram.opal.impl.ui.OpalSwitchIndicator (OpalSwitchIndicator.kt:40)");
            }
            A00(r3, modifier2, ((C53351Gmb) G9w.A0g(r12, ggW.A01, 0)).A00, 0.0f, (i2 << 3) & 896, 24, C51966G9m.A0A(r12), false);
            if (0fL.A02()) {
                0fL.A00(2103038538);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, modifier, ggW, i, 35);
        }
    }

    public static final void A00(C286575Wy r14, Modifier modifier, float f, float f2, int i, int i2, long j, boolean z) {
        int i3;
        float f3 = f2;
        boolean z2 = z;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier, 2);
        r14.ExV(-50342887);
        float f4 = f;
        int i4 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C51970G9q.A05(r14.AGr(f4) ? 1 : 0) | i;
        } else {
            i3 = i4;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0C(r14, j2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i4 & 384) == 0) {
            i3 |= G9t.A0Q(r14, modifier);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i3 |= G9t.A0b(r14, z2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i3 |= G9t.A03(r14, f3);
        }
        if ((i3 & 9363) != 9362 || !r14.Bwn()) {
            z2 = C51966G9m.A1R(i5, z2);
            if (i6 != 0) {
                f3 = 1.0f;
            }
            if (0fL.A02()) {
                0fL.A01(-682470771, "com.instagram.opal.impl.ui.OpalSwitchIndicator (OpalSwitchIndicator.kt:57)");
            }
            Object AJO = r14.AJO(AndroidCompositionLocals_androidKt.A03);
            Object A0m = C51967G9n.A0m(r14, -488230442);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r14, DbT.A0l(z2));
            }
            C284945Oz r7 = (C284945Oz) A0m;
            C286565Wx r6 = (C286565Wx) r14;
            C286565Wx.A0L(r6, false);
            r14.ExS(-488228773);
            if (f >= 1.0f && !C51971G9r.A1W(r7)) {
                C60340gF r16 = C60340gF.A00;
                boolean A1Z = C51967G9n.A1Z(r14, AJO, -488226607);
                Object ECw = r14.ECw();
                if (A1Z || ECw == obj) {
                    ECw = new C51648Fy7(AJO, r7, (AnonymousClass4D7) null, 12);
                    r14.FLL(ECw);
                }
                C51968G9o.A1E(r14, r6, ECw, r16);
            }
            C286565Wx.A0L(r6, false);
            float f5 = 80.0f * f3;
            Modifier A0X = C51966G9m.A0X(C287205Zk.A08(modifier2, f5), j2);
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A00 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r14, A0X);
            C51973G9u.A0y(r14, r6);
            C51971G9r.A12(r14, A0Z, A04);
            0sL r5 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r5, A00);
            }
            C51965G9l.A18(r14, A01);
            A01(r14, C287205Zk.A08(C51970G9q.A0X(Modifier.A00, J4C.A00), f5), f4, i3 & 14);
            if (C51967G9n.A1R(r14)) {
                0fL.A00(-570692691);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            Modifier modifier3 = modifier2;
            ASQ.A06 = new J93(modifier3, f4, f3, i, i2, j, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0rh] */
    public static final void A01(C286575Wy r26, Modifier modifier, float f, int i) {
        int i2;
        float f2;
        float f3;
        int A00;
        int A002;
        C286575Wy r6 = r26;
        r6.ExV(-1801575475);
        int i3 = i;
        float f4 = f;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(r6.AGr(f4) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        int i4 = i & 48;
        Modifier modifier2 = modifier;
        if (i4 == 0) {
            i2 |= G9t.A0P(r6, modifier2);
        }
        if ((i2 & 19) != 18 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(285383431, "com.instagram.opal.impl.ui.IndicatorContent (OpalSwitchIndicator.kt:87)");
            }
            if (f > 0.0f) {
                float A02 = C229632nm.A02(f / 0.75f, 0.0f, 1.0f);
                float f5 = f / 1.0f;
                ? obj = new Object();
                if (f5 >= 0.9f) {
                    f3 = 1.0f - f5;
                } else if (f5 >= 0.8f) {
                    f3 = f5 - 0.8f;
                } else {
                    f2 = 0.0f;
                    obj.A00 = f2;
                    obj.A00 = C229632nm.A02(f2, 0.0f, 1.0f);
                    AnonymousClass5RD A003 = C287675aa.A00(C287215Zl.A0E, false);
                    A00 = C287425a7.A00(r6);
                    C286565Wx r14 = (C286565Wx) r6;
                    AnonymousClass5RM A04 = C286565Wx.A04(r14);
                    Modifier A01 = C287435a8.A01(r6, modifier2);
                    C62320sa r9 = C287485aD.A00;
                    C51973G9u.A0z(r6, r14, r9);
                    0sL r13 = C287485aD.A03;
                    0sL A0w = C51969G9p.A0w(r6, A003, A04, r13);
                    0sL r12 = C287485aD.A02;
                    if (r14.A0K || !C51972G9s.A1Q(r6, A00)) {
                        C51971G9r.A13(r6, r12, A00);
                    }
                    0sL A1K = C51966G9m.A1K(r6, A01);
                    C289515dj r8 = C289515dj.A00;
                    C285245Qk r0 = Modifier.A00;
                    Modifier AAz = r8.AAz(C287215Zl.A0C, HRI.A00(C51970G9q.A0X(r0, new G4U(obj, 47)), A02, A02));
                    Alignment alignment = C287215Zl.A09;
                    AnonymousClass5RD A004 = C287675aa.A00(alignment, false);
                    A002 = C287425a7.A00(r6);
                    AnonymousClass5RM A042 = C286565Wx.A04(r14);
                    Modifier A012 = C287435a8.A01(r6, AAz);
                    C51973G9u.A0z(r6, r14, r9);
                    C287595aO.A00(r6, A004, r13);
                    if (C51965G9l.A1Y(r6, r14, A042, A0w) || !C51972G9s.A1Q(r6, A002)) {
                        C51971G9r.A13(r6, r12, A002);
                    }
                    C287595aO.A00(r6, A012, A1K);
                    A02(r6, C287205Zk.A0C(r0, 39.0f), 6);
                    C52390GQp.A01(r6, C287205Zk.A0C(r0, 40.0f), f5, 2.0f, 0.0f, 196656, 88, C51966G9m.A0H(r6), 0, false);
                    C288165bT.A05(r6, C51970G9q.A0X(r8.AAz(alignment, C287205Zk.A03(r0)), new G4U(obj, 48)), C287975bA.A00(r6, R.drawable.instagram_key_pano_filled_24, 0), C51966G9m.A0H(r6));
                    r6.ASN();
                    r6.ASN();
                }
                f2 = f3 / 0.1f;
                obj.A00 = f2;
                obj.A00 = C229632nm.A02(f2, 0.0f, 1.0f);
                AnonymousClass5RD A0032 = C287675aa.A00(C287215Zl.A0E, false);
                A00 = C287425a7.A00(r6);
                C286565Wx r142 = (C286565Wx) r6;
                AnonymousClass5RM A043 = C286565Wx.A04(r142);
                Modifier A013 = C287435a8.A01(r6, modifier2);
                C62320sa r92 = C287485aD.A00;
                C51973G9u.A0z(r6, r142, r92);
                0sL r132 = C287485aD.A03;
                0sL A0w2 = C51969G9p.A0w(r6, A0032, A043, r132);
                0sL r122 = C287485aD.A02;
                C51971G9r.A13(r6, r122, A00);
                0sL A1K2 = C51966G9m.A1K(r6, A013);
                C289515dj r82 = C289515dj.A00;
                C285245Qk r02 = Modifier.A00;
                Modifier AAz2 = r82.AAz(C287215Zl.A0C, HRI.A00(C51970G9q.A0X(r02, new G4U(obj, 47)), A02, A02));
                Alignment alignment2 = C287215Zl.A09;
                AnonymousClass5RD A0042 = C287675aa.A00(alignment2, false);
                A002 = C287425a7.A00(r6);
                AnonymousClass5RM A0422 = C286565Wx.A04(r142);
                Modifier A0122 = C287435a8.A01(r6, AAz2);
                C51973G9u.A0z(r6, r142, r92);
                C287595aO.A00(r6, A0042, r132);
                C51971G9r.A13(r6, r122, A002);
                C287595aO.A00(r6, A0122, A1K2);
                A02(r6, C287205Zk.A0C(r02, 39.0f), 6);
                C52390GQp.A01(r6, C287205Zk.A0C(r02, 40.0f), f5, 2.0f, 0.0f, 196656, 88, C51966G9m.A0H(r6), 0, false);
                C288165bT.A05(r6, C51970G9q.A0X(r82.AAz(alignment2, C287205Zk.A03(r02)), new G4U(obj, 48)), C287975bA.A00(r6, R.drawable.instagram_key_pano_filled_24, 0), C51966G9m.A0H(r6));
                r6.ASN();
                r6.ASN();
            }
            if (0fL.A02()) {
                0fL.A00(1805745513);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7J(modifier2, f4, i3, 0);
        }
    }

    public static final void A02(C286575Wy r13, Modifier modifier, int i) {
        int i2;
        r13.ExV(256254737);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-429343838, "com.instagram.opal.impl.ui.EmptyCircularProgressIndicator (OpalSwitchIndicator.kt:137)");
            }
            long A0M = C51966G9m.A0M(r13);
            float F06 = C51968G9o.A0Y(r13).F06(1.0f);
            Object A0m = C51967G9n.A0m(r13, -750567635);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = new C298575tg(new C56878IFz(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), F06, 4.0f, 0, 0);
                r13.FLL(A0m);
            }
            C286565Wx A0G = C51965G9l.A0G(r13);
            r13.ExS(-750563064);
            boolean A1U = C51966G9m.A1U(r13, A0m, r13.AGt(A0M));
            Object ECw = r13.ECw();
            if (A1U || ECw == obj) {
                ECw = new C58734Iwh(A0M, A0m, 8);
                r13.FLL(ECw);
            }
            C286565Wx.A0I(A0G);
            C289565do.A00(r13, modifier, (0sP) ECw, i2 & 14);
            if (0fL.A02()) {
                0fL.A00(205014437);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, modifier, i, 35);
        }
    }
}
