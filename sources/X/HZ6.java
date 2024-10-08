package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;

public abstract class HZ6 {
    public static final void A00(C286575Wy r25, Modifier modifier, Badge badge, 0sP r28, int i, int i2) {
        Integer num;
        boolean z;
        Integer num2;
        Modifier modifier2 = modifier;
        Badge badge2 = badge;
        boolean A1U = AnonymousClass7TF.A1U(0, badge2, r28);
        C286575Wy r2 = r25;
        r2.ExV(-1123983569);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        if (0fL.A02()) {
            0fL.A01(1268818838, "com.instagram.creator.achievements.modules.views.UnearnedAchievement (UnearnedAchievement.kt:40)");
        }
        UserSession A0h = C51968G9o.A0h(r2);
        Modifier A0B = C287195Zj.A0B(modifier2, 0.0f, 0.0f, 0.0f, 16.0f);
        AnonymousClass5RD A0M = G9w.A0M(r2);
        int A00 = C287425a7.A00(r2);
        C286565Wx r0 = (C286565Wx) r2;
        AnonymousClass5RM A04 = C286565Wx.A04(r0);
        Modifier A01 = C287435a8.A01(r2, A0B);
        C51973G9u.A0y(r2, r0);
        C51971G9r.A12(r2, A0M, A04);
        0sL r8 = C287485aD.A02;
        if (r0.A0K || !C51972G9s.A1Q(r2, A00)) {
            C51971G9r.A13(r2, r8, A00);
        }
        C51965G9l.A18(r2, A01);
        AnonymousClass2DN A002 = 1zC.A00(r2, DbS.A0V(badge2.A02()));
        C286575Wy r82 = r2;
        AnonymousClass6G3.A00(r82, C287215Zl.A09, C287635aW.A05(C287205Zk.A0C(modifier2, 96.0f), (C287625aV) null, (String) null, new C58689Ivy(11, r28, badge2), A1U), (C288195bW) null, A002, (C288095bM) null, "", 0.0f, 3128, 112);
        AnonymousClass5ZZ.A07(r2, C287205Zk.A0D(modifier2, 80.0f), C51966G9m.A0f(r2), badge2.A03());
        boolean z2 = badge2 instanceof Badge.ChallengeBadge;
        if (z2) {
            num = ((Badge.ChallengeBadge) badge2).A02;
        } else if (badge2 instanceof Badge.AchievementBadge) {
            num = ((Badge.AchievementBadge) badge2).A02;
        } else {
            num = badge2.A00;
        }
        r2.ExS(-1553193078);
        if (num != null) {
            int intValue = num.intValue();
            r2.ExS(-1553192065);
            if (z2) {
                z = ((Badge.ChallengeBadge) badge2).A0D;
            } else {
                z = badge2.A02;
            }
            if (z) {
                if (z2) {
                    num2 = ((Badge.ChallengeBadge) badge2).A04;
                } else if (badge2 instanceof Badge.AchievementBadge) {
                    num2 = ((Badge.AchievementBadge) badge2).A04;
                } else {
                    num2 = badge2.A01;
                }
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    0Tu A0J = DbS.A0J(A0h, 0);
                    if (182.A06(A0J, A0h, 36323058113784618L)) {
                        HZT.A00(A0h, "ig_achievements_2024", 182.A04(A0J, A0h, 36886008067130034L), "achievements_hub");
                    }
                    if (182.A06(A0J, A0h, 36323058113456934L)) {
                        r2.ExS(-417688449);
                        HZ0.A00(r2, C287205Zk.A08(C287205Zk.A0D(C287195Zj.A0B(modifier2, 0.0f, 4.0f, 0.0f, 0.0f), 80.0f), 4.0f), ((float) intValue) / ((float) intValue2), 0, 12, 0, 0);
                    } else {
                        r2.ExS(-417480935);
                        HZ5.A00(r2, C287205Zk.A0D(modifier2, 80.0f), (AnonymousClass5Z4) null, intValue, intValue2, 0, 24, 0);
                    }
                    C286565Wx.A0L(r0, false);
                }
            }
            C286565Wx.A0L(r0, false);
        }
        if (C51971G9r.A1S(r2, r0, false)) {
            0fL.A00(-782012006);
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i, i3, 27, badge, r28, modifier2);
        }
    }
}
