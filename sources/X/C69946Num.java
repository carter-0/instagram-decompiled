package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;

/* renamed from: X.Num  reason: case insensitive filesystem */
public abstract class C69946Num {
    public static final boolean A00(UserSession userSession, N4P n4p) {
        AnonymousClass7TF.A1H(userSession, n4p);
        if (!N4P.A05(n4p) || n4p.A0i || !n4p.A0v) {
            return false;
        }
        String str = userSession.A06;
        boolean contains = n4p.A0S.contains(str);
        int i = n4p.A09;
        String str2 = null;
        if (i != 28) {
            if (i != 29) {
                if (i != 32) {
                    if (i != 61) {
                        if (i != 62) {
                            return false;
                        }
                    }
                }
                return contains;
            }
            C242243Te r0 = n4p.A0E;
            if (r0 != null) {
                str2 = r0.A07;
            }
            if (!0qQ.A0K(str2, str) || !182.A06(0Tu.A05, userSession, 36315868340751996L)) {
                return false;
            }
            return true;
        }
        CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = n4p.A0G;
        if (creatorSubscriberThreadInfo != null) {
            str2 = creatorSubscriberThreadInfo.A02;
        }
        return 0qQ.A0K(str2, str);
    }
}
