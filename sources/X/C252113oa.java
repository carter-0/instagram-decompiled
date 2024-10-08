package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3oa  reason: invalid class name and case insensitive filesystem */
public final class C252113oa {
    public final UserSession A00;

    public static final List A00(Collection collection) {
        0qQ.A0B(collection, 0);
        ArrayList arrayList = new ArrayList(0Yv.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String A30 = ((1Xj) it.next()).A30();
            if (A30 != null) {
                arrayList.add(A30);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return arrayList;
    }

    public C252113oa(UserSession userSession) {
        this.A00 = userSession;
    }
}
