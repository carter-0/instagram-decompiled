package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HuO  reason: case insensitive filesystem */
public abstract class C56195HuO {
    public static final void A00(C286575Wy r26, C61079JwH jwH, C62320sa r28, C62320sa r29, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        C61079JwH jwH2 = jwH;
        C62320sa r27 = r29;
        boolean A1b = C51973G9u.A1b(jwH2, r28, r27);
        C286575Wy r0 = r26;
        r0.ExV(1092243686);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, jwH2) | i;
        } else {
            i2 = i4;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r0, r28);
        }
        if ((i4 & 384) == 0) {
            i2 |= G9t.A0G(r0, r27);
        }
        if ((i2 & 147) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-872071035, "com.instagram.aistudio.editor.AiApprovedLandingScreen (AiApprovedLandingScreen.kt:37)");
            }
            r0.ExS(-1673256087);
            if (jwH2.A00 == null) {
                GQD.A01(r0, C51969G9p.A0U());
                if (C51970G9q.A1a(r0, false)) {
                    0fL.A00(-21422609);
                }
                ASQ = r0.ASQ();
                if (ASQ != null) {
                    i3 = 4;
                    ASQ.A06 = JGN.A01(jwH2, r28, r27, i4, i3);
                }
                return;
            }
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C285245Qk r9 = Modifier.A00;
            C287325Zx r8 = C287275Zs.A07;
            C287265Zr r10 = C287215Zl.A02;
            AnonymousClass5RD A02 = C291495hO.A02(r8, r0, r10, 0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, r9);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A02, A04, r13);
            0sL r12 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r12, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            Modifier A002 = C304676Et.A00.A00(I28.A02(r0, r9), A1b);
            AnonymousClass5RD A022 = C291495hO.A02(r8, r0, r10, 0);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, A002);
            C51973G9u.A0z(r0, A0H, r14);
            C287595aO.A00(r0, A022, r13);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r12, A003);
            }
            C287595aO.A00(r0, A012, A1K);
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(r9), 20.0f, 20.0f, 20.0f, 24.0f);
            AnonymousClass5RD A023 = C291495hO.A02(r8, r0, C287215Zl.A00, 48);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r0, A0B);
            C51973G9u.A0z(r0, A0H, r14);
            C287595aO.A00(r0, A023, r13);
            if (C51965G9l.A1Y(r0, A0H, A043, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r12, A004);
            }
            C287595aO.A00(r0, A013, A1K);
            ImageUrl imageUrl = (ImageUrl) jwH2.A01;
            r0.ExS(1044549952);
            if (imageUrl != null) {
                A01(r0, imageUrl, 0);
            }
            C286565Wx.A0L(A0H, false);
            String A005 = C288035bG.A00(r0, 2131952680);
            C286575Wy r102 = r0;
            AnonymousClass5ZZ.A0S(r102, C287195Zj.A0B(r9, 0.0f, 20.0f, 0.0f, 0.0f), AnonymousClass5aQ.A01(r0).A04, A005, C51966G9m.A0H(r0));
            String str = jwH2.A02;
            r0.ExS(1044564990);
            if (str != null) {
                C286575Wy r7 = r0;
                AnonymousClass5ZZ.A0S(r7, C287195Zj.A0B(r9, 0.0f, 12.0f, 0.0f, 0.0f), C51966G9m.A0c(r0), C51968G9o.A14(r0, str, 2131952679), C51966G9m.A0M(r0));
            }
            C286565Wx.A0L(A0H, false);
            r0.ASN();
            C56649I6e.A04(r0, C287975bA.A00(r0, R.drawable.instagram_users_pano_outline_24, 0), C288035bG.A00(r0, 2131952673), 2131952672);
            C56649I6e.A04(r0, C287975bA.A00(r0, R.drawable.instagram_direct_pano_outline_24, 0), C288035bG.A00(r0, 2131952675), 2131952674);
            C56649I6e.A04(r0, C287975bA.A00(r0, R.drawable.instagram_licensing_pano_outline_24, 0), C288035bG.A00(r0, 2131952677), 2131952676);
            r0.ASN();
            String A006 = C288035bG.A00(r0, 2131952678);
            String A007 = C288035bG.A00(r0, 2131952695);
            boolean A1Y = C51974G9v.A1Y(r0, -1912436539, i2);
            Object ECw = r0.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new C66301MMk(r28, 6);
                r0.FLL(ECw);
            }
            C62320sa A0y = C51965G9l.A0y(A0H, ECw, false);
            boolean A1Z = C51974G9v.A1Z(r0, -1912428345, i2);
            Object ECw2 = r0.ECw();
            if (A1Z || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C66301MMk(r27, 7);
                r0.FLL(ECw2);
            }
            I7L.A00(r0, (Modifier) null, (CharSequence) null, A006, A007, A0y, C51965G9l.A0y(A0H, ECw2, false), 0, 3072, 24476);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(783138533);
            }
        } else {
            r0.Evl();
        }
        ASQ = r0.ASQ();
        if (ASQ != null) {
            i3 = 5;
            ASQ.A06 = JGN.A01(jwH2, r28, r27, i4, i3);
        }
    }

    public static final void A01(C286575Wy r15, ImageUrl imageUrl, int i) {
        int i2;
        C286575Wy r9 = r15;
        r15.ExV(520415433);
        int i3 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, imageUrl2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1754676549, "com.instagram.aistudio.editor.ImageWithBubble (AiApprovedLandingScreen.kt:110)");
            }
            Alignment alignment = C287215Zl.A0C;
            C285245Qk r7 = Modifier.A00;
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r15);
            C286565Wx r5 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r15, r7);
            C51973G9u.A0y(r15, r5);
            C51971G9r.A12(r15, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r15, A002)) {
                C51971G9r.A13(r15, r1, A002);
            }
            C51965G9l.A18(r15, A01);
            AnonymousClass6G3.A03(r15, C51976G9y.A0C(r15, r7, 188.0f), C51966G9m.A0o(r15, imageUrl2, i2));
            HT0.A00(r9, (AnonymousClass5Z4) null, C288035bG.A00(r15, 2131952671), 0, 0, 26, C51966G9m.A08(r15), false);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(234755603);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, imageUrl2, i3, 10);
        }
    }
}
