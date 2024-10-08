package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.AchievementIntf;

/* renamed from: X.HYw  reason: case insensitive filesystem */
public abstract class C54940HYw {
    public static final void A00(C286575Wy r17, Modifier modifier, AchievementIntf achievementIntf, C62320sa r20, int i, int i2) {
        Modifier modifier2 = modifier;
        AchievementIntf achievementIntf2 = achievementIntf;
        C62320sa r11 = r20;
        boolean A1U = AnonymousClass7TF.A1U(0, achievementIntf2, r11);
        C286575Wy r12 = r17;
        r12.ExV(-657231137);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        if (0fL.A02()) {
            0fL.A01(236502933, "com.instagram.creator.achievements.modules.views.EarnedOnMediaRow (EarnedOnMediaRow.kt:37)");
        }
        String Azo = achievementIntf2.Azo();
        int i4 = i;
        if (Azo != null) {
            C287245Zp r3 = C287215Zl.A04;
            Modifier A0B = C287195Zj.A0B(modifier2, 0.0f, 8.0f, 0.0f, 16.0f);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r12, r3, 48);
            int A00 = C287425a7.A00(r12);
            C286565Wx r5 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r12, A0B);
            C51973G9u.A0y(r12, r5);
            C51971G9r.A12(r12, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r1, A00);
            }
            C51965G9l.A18(r12, A01);
            AnonymousClass2DN A0W = C51975G9x.A0W(r12, Azo);
            C285245Qk r32 = Modifier.A00;
            boolean z = true;
            Modifier A0P = C51968G9o.A0P(C304816Fi.A01(AnonymousClass6C9.A00(1.0f, C51966G9m.A0F(r12)), C287205Zk.A0C(r32, 56.0f), AnonymousClass5ZN.A01(4.0f)), 4.0f);
            r12.ExS(1296950920);
            if ((((i & 112) ^ 48) <= 32 || !r12.AGu(r11)) && (i & 48) != 32) {
                z = false;
            }
            Object ECw = r12.ECw();
            if (z || ECw == AnonymousClass5XT.A00) {
                ECw = new C58683Ivs(r11, 36);
                r12.FLL(ECw);
            }
            AnonymousClass6G3.A04(r12, C287635aW.A05(A0P, (C287625aV) null, (String) null, C51965G9l.A0y(r5, ECw, false), A1U), A0W);
            String Azn = achievementIntf2.Azn();
            r12.ExS(1296954526);
            if (Azn != null) {
                AnonymousClass5ZZ.A05(r12, C287195Zj.A0B(r32, 16.0f, 0.0f, 0.0f, 0.0f), C51966G9m.A0c(r12), Azn);
            }
            C286565Wx.A0L(r5, false);
            r12.ASN();
        }
        if (0fL.A02()) {
            0fL.A00(1877921242);
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i4, i3, 25, achievementIntf2, r11, modifier2);
        }
    }
}
