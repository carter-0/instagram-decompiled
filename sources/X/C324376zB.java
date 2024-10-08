package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6zB  reason: invalid class name and case insensitive filesystem */
public abstract class C324376zB {
    public static final boolean A01(UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        if (user == null || 2R8.A04(userSession, user) || user.A0N() != AnonymousClass05K.A0C || AnonymousClass2f1.A00(userSession).A0Q(user)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        if (!C323926yK.A02(userSession, user)) {
            if (2R8.A04(userSession, user)) {
                return true;
            }
            if (user.A0N() != AnonymousClass05K.A0C || AnonymousClass2f1.A00(userSession).A0Q(user)) {
                return !user.CPV();
            }
        }
        return false;
    }

    public static final ArrayList A00(User user) {
        ArrayList arrayList = new ArrayList();
        List<User> Ama = user.A03.Ama();
        if (Ama != null) {
            for (User id : Ama) {
                arrayList.add(id.getId());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
