package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.6uL  reason: invalid class name and case insensitive filesystem */
public abstract class C321536uL {
    public static boolean A00;
    public static final HashSet A01 = new HashSet();
    public static final HashSet A02 = new HashSet();

    public static final void A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        HashSet hashSet = A01;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            1Xj r2 = (1Xj) it.next();
            0qQ.A0B(r2, 1);
            1sd.A00(userSession).A02(r2, false);
            AnonymousClass1Nd.A00(userSession).A00(new C57066INg(r2));
        }
        HashSet hashSet2 = A02;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            A01(userSession, (1Xj) it2.next(), false);
        }
        hashSet.clear();
        hashSet2.clear();
    }

    public static final void A01(UserSession userSession, 1Xj r3, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        1sd.A00(userSession).A02(r3, true);
        1sd.A00(userSession).A01(r3, 15);
        AnonymousClass1Nd.A00(userSession).A00(new C57066INg(r3));
        if (z) {
            A01.add(r3);
            HashSet hashSet = A02;
            if (hashSet.contains(r3)) {
                hashSet.remove(r3);
            }
        }
    }

    public static final boolean A02(UserSession userSession) {
        0Tu r2 = 0Tu.A06;
        if ((182.A06(r2, userSession, 36315649294732744L) || 182.A06(r2, userSession, 36315649294863818L)) && A00) {
            return true;
        }
        return false;
    }
}
