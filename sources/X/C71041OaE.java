package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OaE  reason: case insensitive filesystem */
public abstract class C71041OaE {
    public static final void A00(UserSession userSession, boolean z) {
        17i A00 = 17h.A00(userSession);
        User A02 = A00.A02(userSession.A06);
        if (A02 == null) {
            A02 = AnonymousClass7TF.A0Q(userSession);
        }
        if (!z) {
            A02.A03.ETD(false);
        }
        A02.A03.Ej7(Boolean.valueOf(z));
        A00.A03(A02);
        A02.A0d(userSession);
    }

    public static final boolean A01(UserSession userSession) {
        User A02 = 17h.A00(userSession).A02(userSession.A06);
        if (A02 == null) {
            A02 = AnonymousClass7TF.A0Q(userSession);
        }
        if (!182.A06(0Tu.A05, userSession, 36322993690192606L) || A02.A2O()) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        User A02 = 17h.A00(userSession).A02(userSession.A06);
        if (A02 == null) {
            A02 = AnonymousClass7TF.A0Q(userSession);
        }
        if (A02.A2O() || A02.CQp(new C317986oA(userSession))) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, AnonymousClass7SD r8) {
        Object obj;
        boolean A1X = DbW.A1X(r8);
        List list = r8.A0b;
        User A0j = DbT.A0j(userSession);
        if (r8.A08 == 1003) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!C51966G9m.A1W(userSession, DbS.A0q(obj))) {
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                0sm r2 = r8.A0e;
                if (r2 == null) {
                    r2 = 0Yt.A0E();
                }
                boolean A1X2 = AnonymousClass7TG.A1X((Boolean) r2.get(A0j.getId()));
                boolean A1X3 = AnonymousClass7TG.A1X((Boolean) r2.get(user.getId()));
                if (!A1X2 || !A1X3) {
                    return false;
                }
                return true;
            }
        }
        return A1X;
    }
}
