package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.AchievementButtonInfo;

/* renamed from: X.HYg  reason: case insensitive filesystem */
public abstract class C54924HYg {
    public static final void A00(C286575Wy r14, QP7 qp7, 0sP r16, int i) {
        int i2;
        C286575Wy r10 = r14;
        r14.ExV(589744130);
        int i3 = i;
        QP7 qp72 = qp7;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, qp7) | i;
        } else {
            i2 = i3;
        }
        0sP r3 = r16;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r3);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(377601098, "com.instagram.creator.achievements.modules.fragments.AboutAchievementsScreen (AboutAchievementsFragment.kt:121)");
            }
            C287355a0 r0 = C287275Zs.A04;
            C285245Qk r9 = Modifier.A00;
            AnonymousClass5RD A0L = G9w.A0L(r0, r14);
            int A00 = C287425a7.A00(r14);
            C286565Wx r5 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r14, r9);
            C51973G9u.A0y(r14, r5);
            C51971G9r.A12(r14, A0L, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51965G9l.A18(r14, A01);
            Modifier A0G = C51967G9n.A0G(r9, 32.0f);
            boolean A1Z = C51967G9n.A1Z(r14, qp72, -13361567);
            Object ECw = r14.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new MP9(qp72, 25);
                r14.FLL(ECw);
            }
            AnonymousClass6HY.A06(r14, A0G, C51965G9l.A0z(r5, ECw));
            AchievementButtonInfo achievementButtonInfo = (AchievementButtonInfo) qp72.A02;
            r14.ExS(-13333144);
            if (achievementButtonInfo != null) {
                String Air = achievementButtonInfo.Air();
                boolean AGw = r14.AGw(achievementButtonInfo) | C51974G9v.A1Y(r14, -688552972, i2);
                Object ECw2 = r14.ECw();
                if (AGw || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new MMY(38, r3, achievementButtonInfo);
                    r14.FLL(ECw2);
                }
                I7L.A04(r10, (Modifier) null, Air, (String) null, C51965G9l.A0y(r5, ECw2, false), 0, 0, 32764);
            }
            if (C51971G9r.A1S(r10, r5, false)) {
                0fL.A00(-480303147);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r3, qp72, i3, 43);
        }
    }
}
