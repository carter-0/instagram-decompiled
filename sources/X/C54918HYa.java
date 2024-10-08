package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HYa  reason: case insensitive filesystem */
public abstract class C54918HYa {
    public static final void A00(C286575Wy r30, C62320sa r31, C62320sa r32, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        boolean z3 = z2;
        boolean z4 = z;
        C62320sa r23 = r31;
        C62320sa r22 = r32;
        AnonymousClass7TF.A1H(r23, r22);
        C286575Wy r0 = r30;
        r0.ExV(1279550038);
        int i5 = i2;
        int i6 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C41848B3p.A01(r0, r23) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0F(r0, r22);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= G9t.A0a(r0, z4);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i3 |= G9t.A0b(r0, z3);
        }
        if ((i3 & 5851) != 1170 || !r0.Bwn()) {
            z4 = C51966G9m.A1Q(i7, z4);
            z3 = C51966G9m.A1Q(i8, z3);
            if (0fL.A02()) {
                0fL.A01(-714216747, "com.instagram.creation.genai.themes.ui.AiThemesHeader (AiThemesHeader.kt:37)");
            }
            C285245Qk r4 = Modifier.A00;
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r0);
            C286565Wx r3 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r0, r4);
            C62320sa r15 = C287485aD.A00;
            C51973G9u.A0z(r0, r3, r15);
            0sL r14 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0a, A04, r14);
            0sL r8 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r8, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C289515dj r17 = C289515dj.A00;
            AnonymousClass2DO A002 = C287975bA.A00(r0, R.drawable.instagram_x_pano_filled_24, 0);
            String A003 = C304346Dc.A00(r0, 2131956164);
            0sP r12 = C287655aY.A00;
            Modifier A0B = C287195Zj.A0B(JJP.A00(r4, r12, 3), 16.0f, 12.0f, 0.0f, 0.0f);
            boolean A1N = C51973G9u.A1N(r0, 1214034373, i3);
            Object ECw = r0.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C58672Ivh.A00(r0, r23, 44);
            }
            C286575Wy r29 = r0;
            C288165bT.A07(r29, G9w.A0C(r0, r3, A0B, ECw), A002, A003, 8, C51966G9m.A0H(r0));
            C289515dj r10 = r17;
            Modifier A0B2 = C287195Zj.A0B(JJP.A00(r10.AAz(C287215Zl.A0C, C51966G9m.A0T(r4)), r12, 3), 0.0f, 12.0f, 0.0f, 12.0f);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A02, r0, C287215Zl.A05, 6);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r3);
            Modifier A012 = C287435a8.A01(r0, A0B2);
            C51973G9u.A0z(r0, r3, r15);
            C287595aO.A00(r0, A02, r14);
            if (C51965G9l.A1Y(r0, r3, A042, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r8, A004);
            }
            C287595aO.A00(r0, A012, A1K);
            if (z3) {
                r0.ExS(-932015955);
                i4 = 2131952722;
            } else {
                r0.ExS(-931584342);
                i4 = 2131966398;
                AnonymousClass6G3.A0B(r0, C287195Zj.A09(r4, 4.0f, 2.0f), C287975bA.A00(r0, R.drawable.gen_ai_assets_metaaicontextheader, 0), C288035bG.A00(r0, 2131966398), 392);
            }
            String A005 = C288035bG.A00(r0, i4);
            long A0H = C51966G9m.A0H(r0);
            AnonymousClass5ZZ.A0T(r29, C287195Zj.A09(r4, 0.0f, 3.0f), C51965G9l.A0S(r0), A005, A0H);
            C286565Wx.A0L(r3, false);
            r0.ASN();
            String A006 = C288035bG.A00(r0, 2131968361);
            long A0N = C51966G9m.A0N(r0);
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r0);
            Modifier A0B3 = C287195Zj.A0B(JJP.A00(r17.AAz(C287215Zl.A0D, r4), r12, 3), 0.0f, 16.0f, 16.0f, 0.0f);
            boolean A1Y = C51974G9v.A1Y(r0, 1214096835, i3);
            Object ECw2 = r0.ECw();
            if (A1Y || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C58672Ivh(r22, 45);
                r0.FLL(ECw2);
            }
            C286575Wy r312 = r0;
            AnonymousClass5ZZ.A0X(r312, C288235ba.A01(r0, A0B3, (C287625aV) null, (String) null, C51965G9l.A0y(r3, ECw2, false), 6, z4), A0c, A006, A0N);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(846740943);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9A(r22, r23, i6, i5, 2, z3, z4);
        }
    }
}
