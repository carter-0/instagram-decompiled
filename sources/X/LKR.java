package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;

public abstract class LKR {
    public static final boolean A01(User user) {
        Boolean CU8;
        0qQ.A0B(user, 0);
        if (!user.A21() || (CU8 = user.A03.CU8()) == null || !CU8.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final ArrayList A00(UserSession userSession, Collection collection) {
        if (collection == null) {
            return AnonymousClass7TE.A1C();
        }
        17i A00 = 17h.A00(userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object obj : collection) {
            User user = (User) A00.A02.get(obj);
            if (user != null && A01(user)) {
                A1C.add(user);
            }
        }
        return A1C;
    }
}
