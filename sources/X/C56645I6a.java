package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.I6a  reason: case insensitive filesystem */
public final class C56645I6a {
    public static final C56645I6a A00 = new Object();

    public static final boolean A01(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320279269548182L) || 182.A06(r2, userSession, 36320279271973044L) || 182.A06(r2, userSession, 36320279272497338L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 2342163288486256827L)) {
            return false;
        }
        return 182.A06(r2, userSession, 36320279271252141L);
    }

    public static final int A00(UserSession userSession) {
        return DbS.A04(AnonymousClass7TF.A0H(userSession), userSession, 36601754248614215L);
    }

    public static final boolean A03(UserSession userSession) {
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36320279273349316L);
    }

    public final boolean A04(UserSession userSession, Integer num, List list) {
        int A002 = A00(userSession);
        if ((num == null || num.intValue() != A002 || !182.A06(0Tu.A05, userSession, 2342163288486650046L)) && (list == null || !00k.A0u(list, 17h.A00(userSession).A02(userSession.A06)) || !182.A06(0Tu.A05, userSession, 36320279273021631L))) {
            return false;
        }
        return true;
    }
}
