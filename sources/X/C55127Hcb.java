package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hcb  reason: case insensitive filesystem */
public abstract class C55127Hcb {
    public static final void A00(String str, C286575Wy r8, int i) {
        int i2;
        0qQ.A0B(str, 0);
        r8.ExV(1676781912);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(364554104, "com.instagram.schools.management.components.BottomSheetHeader (BottomSheetHeader.kt:16)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r5);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r8);
            C286565Wx r3 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r8, A0T);
            C51973G9u.A0y(r8, r3);
            C51971G9r.A12(r8, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r1, A00);
            }
            C51965G9l.A18(r8, A01);
            AnonymousClass5ZZ.A08(r8, C51967G9n.A0C(r5, 12.0f).Ezh(C51965G9l.A0L(C289515dj.A00, r5)), C51966G9m.A0d(r8), str, i2 & 14);
            if (C51967G9n.A1R(r8)) {
                0fL.A00(1194922209);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str, i, 15);
        }
    }
}
