package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.Hvq  reason: case insensitive filesystem */
public abstract class C56282Hvq {
    public static final Badge.AchievementBadge A00(Achievement achievement, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        Achievement achievement2 = achievement;
        0qQ.A0B(achievement, 0);
        long j = achievement.A01;
        String obj = achievement2.A03.toString();
        if (z2) {
            str = achievement2.A0A;
        } else {
            str = achievement2.A08;
        }
        if (z) {
            str2 = achievement2.A09;
        } else {
            str2 = achievement2.A0B;
        }
        if (z) {
            str3 = achievement2.A07;
        } else {
            str3 = achievement2.A06;
        }
        return new Badge.AchievementBadge(achievement2, achievement2.A05, achievement2.A04, Integer.valueOf(achievement2.A00), obj, str, str3, str2, j, z);
    }

    public static final Badge.ChallengeBadge A01(Challenge challenge, boolean z) {
        String str;
        Challenge challenge2 = challenge;
        0qQ.A0B(challenge2, 0);
        long j = challenge2.A02;
        String obj = challenge2.A05.toString();
        String str2 = challenge2.A0C;
        String str3 = challenge2.A0F;
        String str4 = challenge2.A0B;
        String str5 = challenge2.A0A;
        String str6 = challenge2.A0E;
        ChallengeButtonInfo challengeButtonInfo = challenge2.A04;
        if (challengeButtonInfo != null) {
            str = challengeButtonInfo.Air();
        } else {
            str = null;
        }
        return new Badge.ChallengeBadge(challenge2, challenge2.A07, Integer.valueOf(challenge2.A00), Integer.valueOf(challenge2.A01), obj, str2, str3, str4, str5, str6, str, challenge2.A0D, str4, j, z, AnonymousClass7TF.A1W(challenge2.A06, ChallengeState.STARTED));
    }
}
