package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public abstract class I62 {
    public static final void A00(C286575Wy r4, Modifier modifier, ImageUrl imageUrl, int i) {
        int i2;
        0qQ.A0B(modifier, 1);
        r4.ExV(-1117466180);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r4, modifier);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(317692528, "instagram.features.clips.pivot.header.composables.PivotPageReelsThumbnail (PivotPageHeaderComposables.kt:37)");
            }
            AnonymousClass6G3.A08(r4, C51968G9o.A0P(modifier, 12.0f), C51966G9m.A0o(r4, imageUrl, i2), C288075bK.A01);
            if (0fL.A02()) {
                0fL.A00(845846028);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, modifier, imageUrl, i, 31);
        }
    }

    public static final void A02(C286575Wy r12, String str, int i, boolean z) {
        int i2;
        AnonymousClass5Z4 r8;
        String str2 = str;
        0qQ.A0B(str, 0);
        C286575Wy r6 = r12;
        r12.ExV(872626303);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, str) | i;
        } else {
            i2 = i;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r12, z);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-311226925, "instagram.features.clips.pivot.header.composables.PivotPageTitle (PivotPageHeaderComposables.kt:25)");
            }
            if (z) {
                r8 = C51967G9n.A0b(r12, 1894140115).A07;
            } else {
                r8 = C51967G9n.A0b(r12, 1894141385).A06;
            }
            C51965G9l.A1X(r12, false);
            AnonymousClass5ZZ.A0D(r6, (Modifier) null, r8, str2, 1, i2 & 14, 390, 11262, 0);
            if (0fL.A02()) {
                0fL.A00(-1775670159);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7P(str2, z2, i3, 3);
        }
    }

    public static final void A03(C286575Wy r19, String str, C62320sa r21, int i, boolean z) {
        int i2;
        String str2 = str;
        C62320sa r6 = r21;
        int A02 = DbW.A02(0, str2, r6);
        C286575Wy r15 = r19;
        r15.ExV(-1044189305);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, str2) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r15, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r6);
        }
        if ((i2 & 147) != 146 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1570459878, "instagram.features.clips.pivot.header.composables.PivotPageUserName (PivotPageHeaderComposables.kt:51)");
            }
            C287245Zp r11 = C287215Zl.A04;
            C285245Qk r3 = Modifier.A00;
            Modifier A06 = C287195Zj.A06(r3);
            boolean A1P = C51973G9u.A1P(r15, -1091747171, i2);
            Object ECw = r15.ECw();
            if (A1P || ECw == AnonymousClass5XT.A00) {
                ECw = C58712IwL.A01(r6, A02);
                r15.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r15, false);
            Modifier A01 = C52638GaC.A01(r15, A06, (C62320sa) ECw);
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r15, r11);
            int A00 = C287425a7.A00(r15);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r15, A01);
            C51973G9u.A0y(r15, A0H);
            C51971G9r.A12(r15, A0Q, A04);
            0sL r112 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r112, A00);
            }
            C51965G9l.A18(r15, A012);
            String str3 = str2;
            AnonymousClass5ZZ.A0E(r15, (Modifier) null, C51966G9m.A0h(r15), str3, 1, i2 & 14, 15354, C51966G9m.A0H(r15));
            r15.ExS(20406187);
            if (z2) {
                AnonymousClass6FU.A00(r15, C287195Zj.A0B(r3, 4.0f, 0.0f, 0.0f, 0.0f), 0.0f, 6, A02);
            }
            if (C51971G9r.A1S(r15, A0H, false)) {
                0fL.A00(-897018066);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59140J7w(r6, str2, i3, 7, z2);
        }
    }

    public static final void A04(String str, C286575Wy r11, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str, 0);
        C286575Wy r3 = r11;
        r11.ExV(669556831);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1960376479, "instagram.features.clips.pivot.header.composables.PivotPageReelsCount (PivotPageHeaderComposables.kt:67)");
            }
            AnonymousClass5ZZ.A0E(r3, C287195Zj.A06(Modifier.A00), C51966G9m.A0c(r11), str2, 1, (i2 & 14) | 48, 15352, C51966G9m.A0M(r11));
            if (0fL.A02()) {
                0fL.A00(1937718700);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i, 17);
        }
    }

    public static final void A01(C286575Wy r4, ImageUrl imageUrl, int i) {
        int i2;
        r4.ExV(657405143);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-280598579, "instagram.features.clips.pivot.header.composables.PivotPageProfilePic (PivotPageHeaderComposables.kt:77)");
            }
            AnonymousClass6G3.A08(r4, C51966G9m.A0W(C287195Zj.A0B(C287205Zk.A0G(Modifier.A00, 28.0f, 22.0f), 0.0f, 0.0f, 6.0f, 0.0f)), C51966G9m.A0o(r4, imageUrl, i2), C288075bK.A01);
            if (0fL.A02()) {
                0fL.A00(-1124647911);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, imageUrl, i, 21);
        }
    }
}
