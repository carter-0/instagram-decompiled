package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8X9  reason: invalid class name */
public abstract class AnonymousClass8X9 {
    public static final boolean A00(28D r7, UserSession userSession) {
        0qQ.A0B(r7, 1);
        String A04 = 182.A04(0Tu.A06, userSession, 36885591454974610L);
        if (A04.length() == 0) {
            return false;
        }
        List<String> A0R = 00l.A0R(A04, new String[]{","}, 0);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0R, 10));
        for (String str : A0R) {
            0qQ.A0B(str, 0);
            arrayList.add(00y.A0n(10, str));
        }
        if (!03t.A0O(Long.valueOf(r7.A00), arrayList.toArray(new Long[0]))) {
            return false;
        }
        if (((A5Y) userSession.A01(A5Y.class, new C51793G2c(userSession, 18))).A00.A00.getInt("last_story_posted_source_index", -1) != 1 || !182.A06(0Tu.A05, userSession, 36322641501497685L)) {
            return false;
        }
        return true;
    }
}
