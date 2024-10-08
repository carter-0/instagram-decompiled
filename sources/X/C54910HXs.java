package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HXs  reason: case insensitive filesystem */
public abstract class C54910HXs {
    public static final void A00(C286575Wy r17, 0sL r18, int i, int i2, int i3, int i4, int i5) {
        int i6;
        0sL r10 = r18;
        C286575Wy r12 = r17;
        r12.ExV(1252292545);
        int i7 = i5;
        int i8 = i4;
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = G9t.A05(r12, i) | i4;
        } else {
            i6 = i8;
        }
        int i9 = i2;
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= G9t.A06(r12, i9);
        }
        int i10 = i3;
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i8 & 384) == 0) {
            i6 |= G9t.A07(r12, i10);
        }
        int i11 = i5 & 8;
        if (i11 != 0) {
            i6 |= 3072;
        } else if ((i8 & 3072) == 0) {
            i6 |= G9t.A0H(r12, r10);
        }
        if ((i6 & 1171) != 1170 || !r12.Bwn()) {
            if (i11 != 0) {
                r10 = C55388Hgu.A01;
            }
            if (0fL.A02()) {
                0fL.A01(1991977215, "com.instagram.creation.genai.attribution.bottomsheet.ListCell (CreatedWithAIBottomSheetFragment.kt:137)");
            }
            C285245Qk r14 = Modifier.A00;
            Modifier A03 = C287195Zj.A03(r14);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r12, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r12);
            C286565Wx r9 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r12, A03);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r12, r9, r8);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r12, A02, A04, r7);
            0sL r6 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r6, A00);
            }
            0sL A1K = C51966G9m.A1K(r12, A01);
            C288165bT.A05(r12, C287195Zj.A0B(r14, 0.0f, 7.0f, 12.0f, 0.0f), C51966G9m.A0Y(r12, i6, i), C51966G9m.A0G(r12));
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r12, 0);
            int A002 = C287425a7.A00(r12);
            AnonymousClass5RM A042 = C286565Wx.A04(r9);
            Modifier A012 = C287435a8.A01(r12, r14);
            C51973G9u.A0z(r12, r9, r8);
            C287595aO.A00(r12, A0Z, r7);
            if (C51965G9l.A1Y(r12, r9, A042, A0w) || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r6, A002);
            }
            C287595aO.A00(r12, A012, A1K);
            AnonymousClass5ZZ.A0r(r12, C51966G9m.A0g(r12), C304346Dc.A00(r12, i9), C51966G9m.A0H(r12));
            C51975G9x.A16(r12, C304346Dc.A00(r12, i10));
            C51972G9s.A11(r12, r10, i6 >> 9);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-1190625771);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J88(r10, i, i9, i10, i8, i7);
        }
    }
}
