package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ell  reason: case insensitive filesystem */
public abstract class C48885Ell {
    public static final boolean A00(UserSession userSession) {
        Boolean CUd;
        Boolean CXy;
        User A0j = DbT.A0j(userSession);
        if (A0j.A2H() || (((CUd = A0j.A03.CUd()) != null && CUd.booleanValue()) || ((CXy = A0j.A03.CXy()) != null && CXy.booleanValue()))) {
            return true;
        }
        return false;
    }
}
