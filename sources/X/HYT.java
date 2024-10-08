package X;

import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

public abstract class HYT {
    public static final void A00(C286575Wy r29, C285975Tl r30, MagicModPostCaptureTransform magicModPostCaptureTransform, C53526Gpw gpw, int i) {
        int i2;
        C53526Gpw gpw2 = gpw;
        boolean A1U = AnonymousClass7TF.A1U(0, gpw2, r30);
        C286575Wy r3 = r29;
        r3.ExV(2024533407);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r3, gpw2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r3, r30);
        }
        MagicModPostCaptureTransform magicModPostCaptureTransform2 = magicModPostCaptureTransform;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r3, magicModPostCaptureTransform2);
        }
        if ((i2 & 147) != 146 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1759241142, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.BackdropNonLinearSection (BackdropNonLinearSection.kt:46)");
            }
            AnonymousClass62P r26 = gpw2.A00;
            Object A0m = C51967G9n.A0m(r3, 299719064);
            Object obj = AnonymousClass5XT.A00;
            C56547I1b i1b = (C56547I1b) C51972G9s.A0k(r3, A0m, obj);
            C286565Wx A0H = C51965G9l.A0H(r3, false);
            boolean A1Y = C51967G9n.A1Y(r3, r26, 299722126);
            Object ECw = r3.ECw();
            if (A1Y || ECw == obj) {
                ECw = J2F.A00;
                r3.FLL(ECw);
            }
            0sP A0z = C51965G9l.A0z(A0H, ECw);
            C55717HmE A00 = C56271Hvf.A00(r3);
            float A01 = C51972G9s.A01(r3) * 1.7777778f * 0.85f;
            C285245Qk r8 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r3, 0);
            int A002 = C287425a7.A00(r3);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r3, r8);
            C62320sa r7 = C287485aD.A00;
            C51973G9u.A0z(r3, A0H, r7);
            0sL r6 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r3, A0Z, A04, r6);
            0sL r5 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r3, A002)) {
                C51971G9r.A13(r3, r5, A002);
            }
            0sL A1K = C51966G9m.A1K(r3, A012);
            Modifier A003 = C304676Et.A00.A00(r8, A1U);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A004 = C287425a7.A00(r3);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r3, A003);
            C51973G9u.A0z(r3, A0H, r7);
            C287595aO.A00(r3, A0a, r6);
            if (C51965G9l.A1Y(r3, A0H, A042, A0w) || !C51972G9s.A1Q(r3, A004)) {
                C51971G9r.A13(r3, r5, A004);
            }
            C287595aO.A00(r3, A013, A1K);
            C286575Wy r21 = r3;
            C56271Hvf.A01(C287275Zs.A01(12.0f), r21, C287205Zk.A0F(r8, 0.0f, A01), A00, A0z, AnonymousClass5PI.A01(r3, new JK0(magicModPostCaptureTransform2, 12), 1815295029), r26, 199680, 0);
            r3.ASN();
            Modifier A09 = C287195Zj.A09(r8, 0.0f, 16.0f);
            AnonymousClass5RD A0V = C51968G9o.A0V(r3);
            int A005 = C287425a7.A00(r3);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A014 = C287435a8.A01(r3, A09);
            C51973G9u.A0z(r3, A0H, r7);
            C287595aO.A00(r3, A0V, r6);
            if (C51965G9l.A1Y(r3, A0H, A043, A0w) || !C51972G9s.A1Q(r3, A005)) {
                C51971G9r.A13(r3, r5, A005);
            }
            C287595aO.A00(r3, A014, A1K);
            boolean z = A1U;
            C286575Wy r17 = r3;
            C285975Tl r19 = r30;
            HYF.A00(r17, i1b, r19, C362088hK.A09, C58354IqZ.A00, C58355Iqa.A00, J2E.A00, 2131961425, ((i2 >> 3) & 14) | 115040688, false, z);
            if (C51971G9r.A1R(r3)) {
                0fL.A00(1005544186);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r30, magicModPostCaptureTransform2, gpw2, i3, 25);
        }
    }
}
