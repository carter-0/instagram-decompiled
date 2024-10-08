package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6YU  reason: invalid class name */
public abstract class AnonymousClass6YU {
    public static final boolean A00(UserSession userSession, User user) {
        int i;
        long j;
        if (user.CQp(new C317986oA(userSession)) && 182.A06(0Tu.A05, userSession, 36323736718618041L)) {
            C333357Yq r3 = new C333357Yq(userSession);
            String id = user.getId();
            Number number = (Number) C333357Yq.A01(r3).get(id);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            Number number2 = (Number) C333357Yq.A00(r3).get(id);
            if (number2 != null) {
                j = number2.longValue();
            } else {
                j = 0;
            }
            if (i < 3) {
                if (AnonymousClass30M.A02(AnonymousClass30K.A04(AnonymousClass30J.MILLISECONDS, System.currentTimeMillis() - j), AnonymousClass30K.A03(AnonymousClass30J.DAYS, 1)) < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
