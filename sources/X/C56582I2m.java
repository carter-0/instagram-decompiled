package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I2m  reason: case insensitive filesystem */
public abstract class C56582I2m {
    public static final void A00(C286575Wy r6, int i) {
        r6.ExV(-1692644874);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2145037766, "com.instagram.direct.fragment.managefolders.Layout (DirectManageFoldersEducationSheet.kt:48)");
            }
            C285245Qk r3 = Modifier.A00;
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r6, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r6);
            C286565Wx r4 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r6, r3);
            C51973G9u.A0y(r6, r4);
            C51971G9r.A12(r6, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            A01(r6, 2131959704, 0);
            A02(r6, 2131959702, 2131959698, 0);
            A02(r6, 2131959701, 2131959697, 0);
            A01(r6, 2131959706, 0);
            A02(r6, 2131959700, 2131959696, 0);
            A02(r6, 2131959705, 2131959695, 0);
            A02(r6, 2131959703, 2131959699, 0);
            if (C51967G9n.A1R(r6)) {
                0fL.A00(-1834571265);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 39);
        }
    }

    public static final void A01(C286575Wy r2, int i, int i2) {
        int i3;
        r2.ExV(536384420);
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r2, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(663426856, "com.instagram.direct.fragment.managefolders.Header (DirectManageFoldersEducationSheet.kt:72)");
            }
            C52747Gbz.A04(r2, C288035bG.A00(r2, i));
            if (0fL.A02()) {
                0fL.A00(1908988824);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            C59347JFz.A00(ASQ, i, i2, 8);
        }
    }

    public static final void A02(C286575Wy r8, int i, int i2, int i3) {
        int i4;
        C286575Wy r2 = r8;
        r8.ExV(-158627040);
        if ((i3 & 6) == 0) {
            i4 = G9t.A05(r8, i) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= G9t.A06(r8, i2);
        }
        if ((i4 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1844526630, "com.instagram.direct.fragment.managefolders.Folder (DirectManageFoldersEducationSheet.kt:76)");
            }
            C52636GaA.A07(r2, (Modifier) null, (AnonymousClass2DO) null, (C59489JLn) null, C288035bG.A00(r8, i), C288035bG.A00(r8, i2), 131054);
            if (0fL.A02()) {
                0fL.A00(1668385253);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7I(i, i2, i3, 1);
        }
    }
}
