package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GhU  reason: case insensitive filesystem */
public final class C53038GhU extends 2YL {
    public C53360Gmk A00;
    public final UserSession A01;
    public final C56005HrB A02;
    public final String A03;
    public final 0V2 A04;
    public final 0V2 A05;
    public final C61770pa A06;
    public final C61770pa A07;

    public C53038GhU(UserSession userSession, C56005HrB hrB, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = hrB;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 1, 0);
        this.A05 = A012;
        this.A07 = new 0V1((C262204Co) null, A012);
        05D A013 = 10D.A01(num, 0, 0);
        this.A04 = A013;
        this.A06 = new 0V1((C262204Co) null, A013);
        A04();
    }

    public static final void A03(Challenge challenge, C53038GhU ghU, boolean z) {
        AnonymousClass7TE.A1Z(new C59673JTe(challenge, ghU, (AnonymousClass4D7) null, 10, z), C318116oQ.A00(ghU));
    }

    public static final void A01(Achievement achievement, C53038GhU ghU) {
        I6J.A00.A08(ghU.A01, "achievements_hub", "achievement_cell", ghU.A03, (String) null, AnonymousClass7TE.A1I(String.valueOf(achievement.A01)), AnonymousClass7TE.A1I(achievement), (List) null, (Map) null);
    }

    public static final void A02(Challenge challenge, C53038GhU ghU) {
        I6J.A00.A05(ghU.A01, (ProductType) null, "achievements_hub", "challenges_cell", ghU.A03, (String) null, (List) null, (List) null, AnonymousClass7TE.A1I(Long.valueOf(challenge.A02)), (List) null, AnonymousClass7TE.A1I(challenge), (Map) null, (Map) null);
    }

    public static final List A00(Achievement achievement, List list) {
        ArrayList arrayList;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Badge badge = (Badge) it.next();
            if (badge instanceof Badge.AchievementBadge) {
                List singletonList = Collections.singletonList(badge);
                arrayList = DbV.A15(singletonList);
                for (Object next : singletonList) {
                    if (((Badge.AchievementBadge) badge).A01.A02 == achievement.A02) {
                        arrayList.add(next);
                    }
                }
            } else if (badge instanceof Badge.AchievementTieredBadge) {
                List list2 = ((Badge.AchievementTieredBadge) badge).A04;
                arrayList = AnonymousClass7TE.A1C();
                for (Object next2 : list2) {
                    if (((Badge.AchievementBadge) next2).A01.A02 == achievement.A02) {
                        arrayList.add(next2);
                    }
                }
            } else {
                arrayList = 0sn.A00;
            }
            018.A16(arrayList, A1C);
        }
        return A1C;
    }

    public final void A04() {
        C318136oS A002 = C318116oQ.A00(this);
        C58102ImO imO = new C58102ImO(this, (AnonymousClass4D7) null, 7);
        19B r3 = 19B.A00;
        1Eo.A05(r3, new C58102ImO(this, (AnonymousClass4D7) null, 9), C51967G9n.A0M(this, r3, new C58102ImO(this, (AnonymousClass4D7) null, 8), C51967G9n.A0M(this, r3, imO, A002)));
    }
}
