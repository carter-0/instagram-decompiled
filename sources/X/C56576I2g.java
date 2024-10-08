package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.I2g  reason: case insensitive filesystem */
public abstract class C56576I2g {
    public static final void A02(String str, String str2, C286575Wy r30, int i) {
        int i2;
        String str3 = str;
        0qQ.A0B(str3, 0);
        C286575Wy r9 = r30;
        r9.ExV(1255177158);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r9, str3) | i;
        } else {
            i2 = i3;
        }
        String str4 = str2;
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r9, str4);
        }
        if ((i2 & 91) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1219675912, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolbarTitle (MagicModToolbar.kt:145)");
            }
            Modifier A0V = C51966G9m.A0V(C51967G9n.A0F(Modifier.A00, 12.0f));
            AnonymousClass5RD A0X = C51968G9o.A0X(r9);
            int A00 = C287425a7.A00(r9);
            C286565Wx r0 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A01 = C287435a8.A01(r9, A0V);
            C51973G9u.A0y(r9, r0);
            C51971G9r.A12(r9, A0X, A04);
            0sL r5 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r5, A00);
            }
            C51965G9l.A18(r9, A01);
            AnonymousClass5ZZ.A0B(r9, (Modifier) null, C51965G9l.A0S(r9), str3, 3, 1, 2, i2 & 14, 390, 11130, G9w.A05(r9));
            r9.ExS(328923181);
            if (str2 != null) {
                C286575Wy r20 = r9;
                String str5 = str4;
                AnonymousClass5ZZ.A0B(r20, (Modifier) null, C51966G9m.A0c(r9), str5, 3, 2, 2, (i2 >> 3) & 14, 390, 11130, C51966G9m.A0M(r9));
            }
            if (C51971G9r.A1S(r9, r0, false)) {
                0fL.A00(784089491);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7S(str3, str4, i3, 0);
        }
    }

    public static final void A01(C286575Wy r32, C61084JwM jwM, HLB hlb, C62320sa r35, C62320sa r36, C62320sa r37, C62320sa r38, 0sP r39, int i, int i2, boolean z) {
        C287245Zp r33;
        C62320sa r14 = r38;
        HLB hlb2 = hlb;
        C62320sa r17 = r37;
        C62320sa r15 = r36;
        0sP r16 = r39;
        C62320sa r11 = r35;
        C61084JwM jwM2 = jwM;
        AnonymousClass7TF.A1H(jwM2, r11);
        C286575Wy r2 = r32;
        r2.ExV(47427287);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            r16 = J2C.A00;
        }
        if ((i2 & 8) != 0) {
            r15 = C58349IqU.A00;
        }
        if ((i2 & 16) != 0) {
            r17 = C58350IqV.A00;
        }
        if ((i2 & 32) != 0) {
            hlb2 = null;
        }
        if ((i2 & 64) != 0) {
            r14 = C58351IqW.A00;
        }
        boolean A1R = C51966G9m.A1R(i3 & 128, z);
        if (0fL.A02()) {
            0fL.A01(1294397634, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolbar (MagicModToolbar.kt:50)");
        }
        C285245Qk r8 = Modifier.A00;
        AnonymousClass5RD A0a = C51966G9m.A0a(false);
        int A00 = C287425a7.A00(r2);
        C286565Wx r5 = (C286565Wx) r2;
        AnonymousClass5RM A04 = C286565Wx.A04(r5);
        Modifier A01 = C287435a8.A01(r2, r8);
        C51973G9u.A0y(r2, r5);
        C51971G9r.A12(r2, A0a, A04);
        0sL r4 = C287485aD.A02;
        if (r5.A0K || !C51972G9s.A1Q(r2, A00)) {
            C51971G9r.A13(r2, r4, A00);
        }
        C51965G9l.A18(r2, A01);
        HY1.A00(r2, C287205Zk.A08(r8, C287645aX.A01(r2, R.dimen.avatar_reel_ring_size_extra_large)), HLA.TOP_DOWN, 6, 0);
        if (jwM2.A00 instanceof C53524Gpu) {
            r33 = C287215Zl.A05;
        } else {
            r33 = C287215Zl.A04;
        }
        C54917HXz.A00(r2, r33, C287195Zj.A0B(r8, 12.0f, 14.0f, 12.0f, 0.0f), AnonymousClass5PI.A01(r2, new C59133J7p(jwM2, r11, r17, 12.0f, 2), -600228985), AnonymousClass5PI.A01(r2, C59342JFu.A00(jwM2, 3), 1830521480), AnonymousClass5PI.A01(r2, new C59190J9u(0, r17, r16, hlb2, jwM2, r15, r14, A1R), -33695351), 438, 0);
        if (C51967G9n.A1R(r2)) {
            0fL.A00(599295911);
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            C61084JwM jwM3 = jwM2;
            ASQ.A06 = new C59232JBk(hlb2, r14, r15, r16, r17, jwM3, r11, i, i3, 2, A1R);
        }
    }

    public static final String A00(C286575Wy r2, C266444Yx r3) {
        String str;
        if (C51967G9n.A1U(r2, -1701023697)) {
            0fL.A01(-1651642634, "com.instagram.creation.genai.magicmod.common.ui.resolveToolBarString (MagicModToolbar.kt:173)");
        }
        if (r3 != null) {
            str = C52409GRk.A01(r2, r3);
        } else {
            str = null;
        }
        if (0fL.A02()) {
            0fL.A00(339526442);
        }
        C51965G9l.A1V(r2);
        return str;
    }
}
