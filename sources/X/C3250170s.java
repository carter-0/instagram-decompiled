package X;

import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.70s  reason: invalid class name and case insensitive filesystem */
public abstract class C3250170s {
    public static final boolean A00(C253443qn r3, UserSession userSession, User user) {
        boolean A06;
        0qQ.A0B(userSession, 1);
        if (r3.BMt() != IgUserBioLinkTypeEnum.FACEBOOK) {
            return false;
        }
        if (0qQ.A0K(user.getId(), userSession.A06)) {
            A06 = A02(userSession, user);
        } else {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36314017207552370L)) {
                return false;
            }
            A06 = 182.A06(r2, userSession, 36320120356479009L);
        }
        if (!A06) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, User user) {
        Boolean valueOf;
        if (!0qQ.A0K(user.A03.BvN(), true)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36320120355889179L)) {
            return false;
        }
        if (0qQ.A0K(userSession.A06, user.getId())) {
            valueOf = C46452DfG.A00(userSession);
        } else {
            valueOf = Boolean.valueOf(182.A06(r2, userSession, 36320120356544546L));
        }
        return valueOf.booleanValue();
    }

    public static final boolean A02(UserSession userSession, User user) {
        Boolean valueOf;
        if (!0qQ.A0K(user.A03.BvM(), true)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36314017207552370L)) {
            return false;
        }
        if (0qQ.A0K(userSession.A06, user.getId())) {
            valueOf = C46452DfG.A00(userSession);
        } else {
            valueOf = Boolean.valueOf(182.A06(r2, userSession, 36320120356479009L));
        }
        return valueOf.booleanValue();
    }
}
