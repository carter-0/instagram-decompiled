package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HXu  reason: case insensitive filesystem */
public abstract class C54912HXu {
    public static final void A00(C286575Wy r16, String str, String str2, C62320sa r19, C62320sa r20, int i) {
        int i2;
        String str3 = str2;
        C62320sa r4 = r19;
        AnonymousClass7TF.A1B(str3, 1, r4);
        C62320sa r3 = r20;
        0qQ.A0B(r3, 3);
        C286575Wy r12 = r16;
        r12.ExV(-1802682079);
        int i3 = i;
        String str4 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, str4) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r12, str3);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r4);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r12, r3);
        }
        if ((i2 & 1171) != 1170 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2026688928, "com.instagram.creation.genai.attribution.bottomsheet.FeatureNotAvailableContent (CreationGenAIFeatureUnavailableBottomSheetFragment.kt:129)");
            }
            C287265Zr r7 = C287215Zl.A00;
            C285245Qk r2 = Modifier.A00;
            AnonymousClass5RD A0Z = C51970G9q.A0Z(r12, r7);
            int A00 = C287425a7.A00(r12);
            C286565Wx r11 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r11);
            Modifier A01 = C287435a8.A01(r12, r2);
            C51973G9u.A0y(r12, r11);
            C51971G9r.A12(r12, A0Z, A04);
            0sL r8 = C287485aD.A02;
            if (r11.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r8, A00);
            }
            C51965G9l.A18(r12, A01);
            AnonymousClass5ZZ.A0l(r12, AnonymousClass5aQ.A01(r12).A04, str4, 3, i2 & 14, 16250, C51966G9m.A0H(r12));
            String A0h = G9w.A0h(r12, str3, 2131970846);
            C286575Wy r15 = r12;
            AnonymousClass5ZZ.A0X(r15, C287195Zj.A09(r2, 24.0f, 8.0f), C51966G9m.A0b(r12), A0h, C51966G9m.A0M(r12));
            String A002 = C304346Dc.A00(r12, 2131956906);
            long A0M = C51966G9m.A0M(r12);
            AnonymousClass5ZZ.A0S(r15, C287205Zk.A07(C51967G9n.A0F(r2, 20.0f), 0.75f), C51966G9m.A0c(r12), A002, A0M);
            I7L.A0A(r4, C304346Dc.A00(r12, 2131968772), r12, (i2 >> 3) & 112);
            C54915HXx.A00(r3, r12, (i2 >> 9) & 14);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(1017362193);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59145J8b(r3, r4, str4, str3, i3, 1);
        }
    }
}
