package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class LM0 {
    public final UserSession A00;

    public LM0(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final List A00(List list) {
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList<Object> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (next != C348647yn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        for (Object A1X : A1C) {
            DbU.A1X(A1X, A0r);
        }
        return A0r;
    }
}
