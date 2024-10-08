package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class AGf {
    public static final C39871ACs A00 = new C39871ACs(C39856ACc.A00);

    public static final boolean A00(UserSession userSession, User user) {
        C333937aO A01;
        1YZ r1 = 1YZ.A02;
        if (!AnonymousClass7TF.A1V(r1) || r1 == null || (A01 = r1.A01(userSession)) == null || !A01.A00 || A01.A02.contains(user.getId())) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, User user) {
        C333937aO A01;
        1YZ r1 = 1YZ.A02;
        if (!AnonymousClass7TF.A1V(r1) || r1 == null || (A01 = r1.A01(userSession)) == null || !A01.A00 || !A01.A02.contains(user.getId())) {
            return false;
        }
        return true;
    }
}
