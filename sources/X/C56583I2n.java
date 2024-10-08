package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.I2n  reason: case insensitive filesystem */
public abstract class C56583I2n {
    public static final void A02(C62320sa r12, C286575Wy r13, int i) {
        int i2;
        0qQ.A0B(r12, 0);
        r13.ExV(1474222333);
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r13, r12) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1614422599, "com.instagram.direct.fragment.stickertray.aisticker.ui.DirectAIStickersScreenTopNavBar (DirectAIStickerTrayScreenTopNavBar.kt:24)");
            }
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A0B, false);
            int A002 = C287425a7.A00(r13);
            C286565Wx r10 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r10);
            Modifier A01 = C287435a8.A01(r13, A0U);
            C62320sa r9 = C287485aD.A00;
            C51973G9u.A0z(r13, r10, r9);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r13, A00, A04, r7);
            0sL r5 = C287485aD.A02;
            if (r10.A0K || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r5, A002);
            }
            0sL A1K = C51966G9m.A1K(r13, A01);
            A01(r12, r13, i2 & 14);
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A003 = C287425a7.A00(r13);
            AnonymousClass5RM A042 = C286565Wx.A04(r10);
            Modifier A012 = C287435a8.A01(r13, A0U);
            C51973G9u.A0z(r13, r10, r9);
            C287595aO.A00(r13, A0Z, r7);
            if (C51965G9l.A1Y(r13, r10, A042, A0w) || !C51972G9s.A1Q(r13, A003)) {
                C51971G9r.A13(r13, r5, A003);
            }
            C287595aO.A00(r13, A012, A1K);
            A00(r13, 0);
            if (C51971G9r.A1R(r13)) {
                0fL.A00(495336683);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r12, i, 11);
        }
    }

    public static final void A00(C286575Wy r7, int i) {
        r7.ExV(895019171);
        if (i != 0 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-821373397, "com.instagram.direct.fragment.stickertray.aisticker.ui.NavBarTitle (DirectAIStickerTrayScreenTopNavBar.kt:45)");
            }
            C287245Zp r0 = C287215Zl.A04;
            C285245Qk r6 = Modifier.A00;
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r7, r0);
            int A00 = C287425a7.A00(r7);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r7, r6);
            C51973G9u.A0y(r7, r3);
            C51971G9r.A12(r7, A0Q, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r1, A00);
            }
            C51965G9l.A18(r7, A01);
            AnonymousClass6G3.A0B(r7, G9w.A0I(r6, 4.0f), C287975bA.A00(r7, R.drawable.gen_ai_assets_metaaicontextheader, 0), C288035bG.A00(r7, 2131966398), 392);
            AnonymousClass5ZZ.A0u(r7, C51965G9l.A0S(r7), C288035bG.A00(r7, 2131966398), C51966G9m.A0H(r7));
            if (C51967G9n.A1R(r7)) {
                0fL.A00(-450017799);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 42);
        }
    }

    public static final void A01(C62320sa r13, C286575Wy r14, int i) {
        int i2;
        C286575Wy r4 = r14;
        r14.ExV(1187769370);
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r14, r13) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1048696498, "com.instagram.direct.fragment.stickertray.aisticker.ui.BackButton (DirectAIStickerTrayScreenTopNavBar.kt:32)");
            }
            AnonymousClass2DO A00 = C287975bA.A00(r14, R.drawable.instagram_arrow_left_pano_outline_24, 0);
            Modifier A0G = C51967G9n.A0G(Modifier.A00, 8.0f);
            boolean A1N = C51973G9u.A1N(r14, 1606644940, i2);
            Object ECw = r14.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new C73923Pm3(r13, 24);
                r14.FLL(ECw);
            }
            C51965G9l.A1X(r14, false);
            C288165bT.A06(r4, C288235ba.A04(r14, A0G, (C62320sa) ECw), A00, C288075bK.A05, C288035bG.A00(r14, 2131958620), 24584, 0, C51966G9m.A0G(r14));
            if (0fL.A02()) {
                0fL.A00(-634344022);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r13, i, 10);
        }
    }
}
