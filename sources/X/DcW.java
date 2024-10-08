package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public abstract class DcW {
    public static final ImageUrl A00(UserSession userSession, List list) {
        User user;
        AnonymousClass170 r2;
        if (list == null || (r2 = (AnonymousClass170) 00k.A0O(list, 0)) == null) {
            user = DbT.A0j(userSession);
        } else {
            ImageUrl Bh3 = r2.Bh3();
            if (Bh3 != null) {
                return Bh3;
            }
            user = 17h.A00(userSession).A02(r2.getId());
            if (user == null) {
                return null;
            }
        }
        return user.Bh3();
    }

    public static final String A01(List list) {
        if (AnonymousClass7TE.A1b(list)) {
            return DbT.A0z(", ", list, G4O.A00);
        }
        throw AnonymousClass7TE.A0w("Share targets cannot be empty");
    }
}
