package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3ge  reason: invalid class name and case insensitive filesystem */
public abstract class C247623ge {
    public static final boolean A00(UserSession userSession, 1Xj r4, String str) {
        0Tu r2;
        long j;
        if (!r4.CcK() || r4.A5n()) {
            return false;
        }
        if (str.equals("feed_timeline") || str.equals("explore_interest_feed") || str.equals("feed_contextual_chain")) {
            return true;
        }
        if (str.equals("feed_contextual_profile")) {
            r2 = 0Tu.A05;
            j = 36315829687291485L;
        } else if (!str.equals("feed_contextual_ads_chain")) {
            return false;
        } else {
            r2 = 0Tu.A06;
            j = 36312887643997696L;
        }
        return 182.A06(r2, userSession, j);
    }
}
