package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.I2z  reason: case insensitive filesystem */
public abstract class C56595I2z {
    public static final void A01(C286575Wy r10, F0P f0p, int i, int i2) {
        int i3;
        boolean z;
        0qQ.A0B(f0p, 1);
        r10.ExV(1458656090);
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r10, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= C51970G9q.A06(G9t.A1U(r10, f0p, i2) ? 1 : 0);
        }
        if ((i3 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1933148553, "com.instagram.profilecard.ui.ProfileCardDownloadBottomSheetContent (ProfileCardDownloadBottomSheetContent.kt:27)");
            }
            Modifier A00 = JJP.A00(Modifier.A00, C287655aY.A00, 1);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r10, C287215Zl.A02, 0);
            int A002 = C287425a7.A00(r10);
            C286565Wx r5 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r10, A00);
            C51973G9u.A0y(r10, r5);
            C51971G9r.A12(r10, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r1, A002);
            }
            C51965G9l.A18(r10, A01);
            A00(r10, i, i3 & 14);
            String A003 = C304346Dc.A00(r10, 2131961015);
            r10.ExS(524282954);
            int i4 = i3 & 112;
            boolean z2 = true;
            if (i4 == 32 || ((i3 & 64) != 0 && r10.AGw(f0p))) {
                z = true;
            } else {
                z = false;
            }
            Object ECw = r10.ECw();
            if (z || ECw == AnonymousClass5XT.A00) {
                ECw = new C51795G2e(f0p, 40);
                r10.FLL(ECw);
            }
            A02(r10, A003, C51965G9l.A0y(r5, ECw, false), R.drawable.instagram_scan_qr_pano_outline_24, 0);
            String A004 = C304346Dc.A00(r10, 2131961014);
            r10.ExS(524290482);
            if (i4 != 32 && ((i3 & 64) == 0 || !r10.AGw(f0p))) {
                z2 = false;
            }
            Object ECw2 = r10.ECw();
            if (z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C51795G2e(f0p, 41);
                r10.FLL(ECw2);
            }
            A02(r10, A004, C51965G9l.A0y(r5, ECw2, false), R.drawable.instagram_user_circle_pano_outline_24, 0);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(366914297);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, f0p, i, i2, 21);
        }
    }

    public static final void A00(C286575Wy r16, int i, int i2) {
        int i3;
        C286575Wy r9 = r16;
        r9.ExV(-1368382139);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r9, i5) | i2;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1491882555, "com.instagram.profilecard.ui.ProfileCardBottomSheetHeader (ProfileCardDownloadBottomSheetContent.kt:42)");
            }
            C285245Qk r8 = Modifier.A00;
            Modifier A0C = C51967G9n.A0C(r8, 16.0f);
            AnonymousClass5RD A0W = C51968G9o.A0W(r9);
            int A00 = C287425a7.A00(r9);
            C286565Wx r5 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r9, A0C);
            C51973G9u.A0y(r9, r5);
            C51971G9r.A12(r9, A0W, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r1, A00);
            }
            C51965G9l.A18(r9, A01);
            AnonymousClass5ZZ.A0J(r9, C51966G9m.A0T(r8), C51966G9m.A0h(r9), C304346Dc.A00(r9, i5), 3120, 16240, C51966G9m.A0H(r9), AnonymousClass5Z7.A01(16));
            if (C51967G9n.A1R(r9)) {
                0fL.A00(911760026);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            C59347JFz.A00(ASQ, i5, i4, 9);
        }
    }

    public static final void A02(C286575Wy r18, String str, C62320sa r20, int i, int i2) {
        int i3;
        C286575Wy r12 = r18;
        r12.ExV(1544005200);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r12, i5) | i2;
        } else {
            i3 = i4;
        }
        String str2 = str;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r12, str2);
        }
        C62320sa r2 = r20;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0G(r12, r2);
        }
        if ((i3 & 147) != 146 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1789160250, "com.instagram.profilecard.ui.MenuItemRow (ProfileCardDownloadBottomSheetContent.kt:56)");
            }
            C285245Qk r9 = Modifier.A00;
            boolean A1P = C51973G9u.A1P(r12, -894732967, i3);
            Object ECw = r12.ECw();
            if (A1P || ECw == AnonymousClass5XT.A00) {
                ECw = new C51795G2e(r2, 39);
                r12.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            Modifier A03 = C287195Zj.A03(C51966G9m.A0V(C287635aW.A06(r9, (C62320sa) ECw)));
            AnonymousClass5RD A0W = C51968G9o.A0W(r12);
            int A00 = C287425a7.A00(r12);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r12, A03);
            C51973G9u.A0y(r12, A0H);
            C51971G9r.A12(r12, A0W, A04);
            0sL r5 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r5, A00);
            }
            C51965G9l.A18(r12, A01);
            C288165bT.A07(r12, G9w.A0I(r9, 12.0f), C51966G9m.A0Y(r12, i3, i5), str, (i3 & 112) | 384, C51966G9m.A0G(r12));
            int i6 = ((i3 >> 3) & 14) | 3072;
            AnonymousClass5ZZ.A0G(r12, (Modifier) null, (AnonymousClass5Z4) null, str2, 3, i6, 32626, C51966G9m.A0H(r12), AnonymousClass5Z7.A01(16));
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-1628928900);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59139J7v(r2, str2, i5, i4, 11);
        }
    }
}
