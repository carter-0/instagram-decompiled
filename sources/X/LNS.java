package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class LNS {
    public static final LNS A00 = new Object();

    public final ArrayList A00(UserSession userSession, 1Xj r8) {
        List list;
        0qQ.A0B(userSession, 0);
        ArrayList arrayList = null;
        if (r8 != null) {
            arrayList = r8.A3E();
            list = r8.A0C.getCoauthorProducers();
        } else {
            list = null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!(arrayList == null || list == null)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PeopleTag peopleTag = (PeopleTag) it.next();
                JTR.A1R(peopleTag.A07(), peopleTag, A1C, list);
            }
        }
        if (r8 != null) {
            User A2A = r8.A2A(userSession);
            if (A2A != null) {
                A1C.add(0, new PeopleTag(A2A));
            }
            if (r8.A28() != null) {
                A1C.add(new PeopleTag(r8.A28()));
            }
        }
        return A1C;
    }
}
