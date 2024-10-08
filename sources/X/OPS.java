package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class OPS {
    public static final int A00(UserSession userSession, Collection collection) {
        0qQ.A0B(collection, 0);
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass3U9 A0a = C66581MXm.A0a(1bJ.A00(userSession), AnonymousClass7TE.A18(it));
            if (A0a != null && A0a.CVr()) {
                i++;
            }
        }
        return i;
    }

    public static final int A01(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C66754Mbz) it.next()).A0A) {
                i++;
            }
        }
        return i;
    }
}
