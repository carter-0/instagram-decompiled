package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public abstract class FGA {
    public static final long A00 = TimeUnit.DAYS.toMillis(30);

    public static final 1OC A02(UserSession userSession, Integer num, String str, String str2, String str3) {
        AnonymousClass7TG.A1Q(str2, num);
        0qQ.A0B(str3, 4);
        int A04 = 00l.A04(str2, '_', 0);
        if (A04 > 0) {
            str2 = str2.substring(0, A04);
            0qQ.A07(str2);
        }
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        DbU.A1P(A0b, "third_party_sharing/%s/%s/get_story_item_url/", new Object[]{str, str2});
        A0b.A0C = "create_story_item_share_url";
        C49792F7a.A01(A0b, userSession, num, str3);
        DbZ.A1N(A0b, userSession);
        return DbU.A0S(A0b, DvL.class, F7Z.class);
    }

    public static final 1OC A00(UserSession userSession, 1Xj r5, AnonymousClass3W1 r6, Integer num, String str) {
        AnonymousClass7TG.A1N(userSession, r5);
        0qQ.A0B(num, 3);
        0qQ.A0B(str, 4);
        boolean z = false;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        DbU.A1P(A0b, "media/%s/permalink/", new Object[]{r5.getId()});
        C49792F7a.A01(A0b, userSession, num, str);
        DbZ.A1N(A0b, userSession);
        A0b.A0G(AnonymousClass000.A00(5015), DbT.A0x(r5));
        A0b.A0G("inventory_source", r5.A0C.BIl());
        A0b.A09(Integer.valueOf(r5.BR7().A00), "m_t");
        if (r5.A0C.C5R() != null) {
            z = true;
        }
        A0b.A0H("is_threads", z);
        if (r6 != null) {
            int i = r6.A03;
            if (i > 0) {
                A0b.A0C("img_index", i);
            }
            if (r6.getPosition() != -1) {
                A0b.A0C("m_ix", r6.getPosition());
            }
            int i2 = r6.A0W;
            if (i2 != -1) {
                A0b.A0C("recs_ix", i2);
            }
        }
        return DbU.A0S(A0b, DvJ.class, F7V.class);
    }

    public static final 1OC A01(UserSession userSession, Integer num, String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(str3, 4);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        DbU.A1P(A0b, "third_party_sharing/%s/live/%s/get_live_url/", new Object[]{str, str2});
        A0b.A0C = "create_live_link_share_url";
        C49792F7a.A01(A0b, userSession, num, str3);
        DbZ.A1N(A0b, userSession);
        return DbU.A0S(A0b, DvH.class, F7S.class);
    }

    public static final boolean A03(UserSession userSession) {
        long j = AnonymousClass7TE.A0q(userSession).getLong("external_sharing_experiment_exposure_timestamp", 0);
        if (j <= 0 || System.currentTimeMillis() - j > A00) {
            return false;
        }
        return true;
    }
}
