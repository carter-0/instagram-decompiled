package X;

import androidx.compose.ui.Modifier;

public abstract class HZC {
    public static final void A00(C286575Wy r33, String str, String str2, String str3, C62320sa r37, int i, boolean z) {
        int i2;
        String str4 = str;
        String str5 = str3;
        boolean A1b = C51973G9u.A1b(str4, str2, str5);
        C62320sa r3 = r37;
        0qQ.A0B(r3, 4);
        C286575Wy r5 = r33;
        r5.ExV(-546780930);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r5, str4) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r5, str2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r5, str5);
        }
        boolean z2 = z;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0b(r5, z2);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r5, r3);
        }
        if ((i2 & 9363) != 9362 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1738655893, "com.instagram.creator.agent.onboarding.fragment.CreatorAiPreparationScreen (CreatorAiPreparationScreen.kt:33)");
            }
            C285245Qk r9 = Modifier.A00;
            Modifier A0U = C51966G9m.A0U(r9);
            AnonymousClass5RD A0Z = C51970G9q.A0Z(r5, C287215Zl.A00);
            int A00 = C287425a7.A00(r5);
            C286565Wx r8 = (C286565Wx) r5;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r5, A0U);
            C51973G9u.A0y(r5, r8);
            C51971G9r.A12(r5, A0Z, A04);
            0sL r10 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r5, A00)) {
                C51971G9r.A13(r5, r10, A00);
            }
            C51965G9l.A18(r5, A01);
            C304676Et r6 = C304676Et.A00;
            C289585dr.A00(r5, r6.A00(r9, A1b));
            AnonymousClass6G3.A03(r5, C51976G9y.A0C(r5, C287195Zj.A0B(r9, 0.0f, 0.0f, 0.0f, 44.0f), 140.0f), 1zC.A00(r5, C51976G9y.A0G(r5)));
            AnonymousClass5ZZ.A08(r5, C287195Zj.A0B(C287195Zj.A09(r9, 32.0f, 0.0f), 0.0f, 0.0f, 0.0f, 15.0f), AnonymousClass5aQ.A01(r5).A04, str4, (i2 & 14) | 48);
            C286575Wy r19 = r5;
            String str6 = str2;
            AnonymousClass5ZZ.A0O(r19, C287195Zj.A09(r9, 32.0f, 0.0f), C51966G9m.A0b(r5), str6, C51965G9l.A03(i2), C51966G9m.A0M(r5));
            boolean z3 = false;
            C289585dr.A00(r5, r6.A00(r9, A1b));
            Modifier A0T = C51966G9m.A0T(r9);
            r5.ExS(412779175);
            if ((i2 & 57344) == 16384) {
                z3 = true;
            }
            Object ECw = r5.ECw();
            if (z3 || ECw == AnonymousClass5XT.A00) {
                ECw = C58702IwB.A01(r3, 12);
                r5.FLL(ECw);
            }
            I7L.A03(r5, A0T, (CharSequence) null, str5, (String) null, C51965G9l.A0y(r8, ECw, false), (C62320sa) null, (0sP) null, ((i2 >> 6) & 14) | 384 | ((i2 << 3) & 57344), 3072, 24552, false, z2, false, false, false, false, A1b, false);
            if (C51967G9n.A1R(r5)) {
                0fL.A00(-983885743);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8E(str4, str2, str5, r3, i3, z2);
        }
    }
}
