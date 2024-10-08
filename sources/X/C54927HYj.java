package X;

import androidx.compose.ui.Modifier;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.HYj  reason: case insensitive filesystem */
public abstract class C54927HYj {
    public static final void A00(C286575Wy r15, Modifier modifier, Badge.AchievementBadge achievementBadge, 0sP r18, int i, int i2) {
        int i3;
        String A14;
        Modifier modifier2 = modifier;
        0sP r2 = r18;
        Badge.AchievementBadge achievementBadge2 = achievementBadge;
        AnonymousClass7TF.A1H(achievementBadge2, r2);
        C286575Wy r7 = r15;
        r15.ExV(-517578117);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r7, achievementBadge2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r7, r2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r7, modifier2);
        }
        if ((i3 & 147) != 146 || !r7.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-2015675787, "com.instagram.creator.achievements.modules.fragments.EarnedAchievementTierRow (AchievementTiersFragment.kt:165)");
            }
            String str = achievementBadge2.A06;
            String str2 = achievementBadge2.A08;
            Integer num = achievementBadge2.A03;
            r7.ExS(1680165782);
            if (num == null) {
                A14 = null;
            } else {
                A14 = C51968G9o.A14(r7, HZ7.A00(num.intValue()), 2131952122);
            }
            C286565Wx A0H = C51965G9l.A0H(r7, false);
            String str3 = achievementBadge2.A05;
            r7.ExS(1680175274);
            boolean AGw = r7.AGw(achievementBadge2) | C51972G9s.A1M(i3);
            Object ECw = r7.ECw();
            if (AGw || ECw == AnonymousClass5XT.A00) {
                ECw = new MMY(45, r2, achievementBadge2);
                r7.FLL(ECw);
            }
            C54936HYs.A00(r7, C51969G9p.A0V(A0H, modifier2, ECw), str, str2, A14, str3, 0, 0);
            if (0fL.A02()) {
                0fL.A00(1696092479);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 23, achievementBadge2, r2, modifier2);
        }
    }
}
