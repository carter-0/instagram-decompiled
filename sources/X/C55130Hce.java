package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hce  reason: case insensitive filesystem */
public abstract class C55130Hce {
    public static final void A00(String str, C286575Wy r14, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str, 0);
        C286575Wy r8 = r14;
        r14.ExV(-1174723944);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1546456934, "com.instagram.schools.management.components.SettingsHeading (SettingsHeading.kt:16)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r6);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r14);
            C286565Wx r4 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r14, A0T);
            C51973G9u.A0y(r14, r4);
            C51971G9r.A12(r14, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51965G9l.A18(r14, A01);
            int i4 = i2 & 14;
            AnonymousClass5ZZ.A0H(r8, C287195Zj.A08(r6, 14.0f).Ezh(C289515dj.A00.AAz(C287215Zl.A0B, r6)), C51966G9m.A0h(r14), str2, 5, i4, C51966G9m.A0M(r14));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(-604061726);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i3, 16);
        }
    }
}
