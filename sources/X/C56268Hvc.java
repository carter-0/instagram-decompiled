package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hvc  reason: case insensitive filesystem */
public abstract class C56268Hvc {
    public static final void A00(int i, int i2, int i3, C286575Wy r22, int i4) {
        int i5;
        C286575Wy r1 = r22;
        r1.ExV(-801064855);
        int i6 = i4;
        int i7 = i;
        if ((i4 & 6) == 0) {
            i5 = G9t.A05(r1, i7) | i4;
        } else {
            i5 = i6;
        }
        int i8 = i2;
        if ((i4 & 48) == 0) {
            i5 |= G9t.A06(r1, i8);
        }
        int i9 = i3;
        if ((i6 & 384) == 0) {
            i5 |= G9t.A07(r1, i9);
        }
        if ((i5 & 147) != 146 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1579199367, "com.instagram.creation.capture.quickcapture.publiccollections.ItemRow (PublicCollectionsDeprecationBottomSheet.kt:103)");
            }
            C285245Qk r9 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(r9), 34.0f, 0.0f, 34.0f, 24.0f);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r1, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r1);
            C286565Wx r7 = (C286565Wx) r1;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r1, A0B);
            C62320sa r6 = C287485aD.A00;
            C51973G9u.A0z(r1, r7, r6);
            0sL r5 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r1, A02, A04, r5);
            0sL r4 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r1, A00)) {
                C51971G9r.A13(r1, r4, A00);
            }
            0sL A1K = C51966G9m.A1K(r1, A01);
            AnonymousClass6FX r11 = AnonymousClass6FX.A00;
            C286575Wy r17 = r1;
            C288165bT.A00(r17, C287195Zj.A0B(r9, 0.0f, 0.0f, 20.0f, 0.0f), C51966G9m.A0Y(r1, i5, i7), 432, 24, 0);
            Modifier A002 = r11.A00(r9);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r1, 0);
            int A003 = C287425a7.A00(r1);
            AnonymousClass5RM A042 = C286565Wx.A04(r7);
            Modifier A012 = C287435a8.A01(r1, A002);
            C51973G9u.A0z(r1, r7, r6);
            C287595aO.A00(r1, A0Z, r5);
            if (C51965G9l.A1Y(r1, r7, A042, A0w) || !C51972G9s.A1Q(r1, A003)) {
                C51971G9r.A13(r1, r4, A003);
            }
            C287595aO.A00(r1, A012, A1K);
            AnonymousClass5ZZ.A0m(r17, C51966G9m.A0h(r1), C288035bG.A00(r1, i8), 5, 16254, 0);
            AnonymousClass5ZZ.A0m(r17, C51966G9m.A0c(r1), C288035bG.A00(r1, i9), 5, 16254, 0);
            if (C51971G9r.A1R(r1)) {
                0fL.A00(-1530329753);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7B(i7, i8, i9, i6);
        }
    }

    public static final void A01(C286575Wy r4, C62320sa r5, C62320sa r6, int i) {
        int i2;
        r4.ExV(1488877672);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, r5) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r4, r6);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-243728725, "com.instagram.creation.capture.quickcapture.publiccollections.Content (PublicCollectionsDeprecationBottomSheet.kt:69)");
            }
            if (C51972G9s.A1U(r4, C51969G9p.A0U(), new JG1(32, r6, r5), -447815190)) {
                0fL.A00(1991826911);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(r5, r6, i, 36);
        }
    }
}
