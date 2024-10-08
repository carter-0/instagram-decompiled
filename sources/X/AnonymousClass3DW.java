package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3DW  reason: invalid class name */
public final class AnonymousClass3DW {
    public final UserSession A00;
    public final HashMap A01 = new HashMap();
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C377209Ky(this, 45));

    public AnonymousClass3DW(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(C233022up r6) {
        0qQ.A0B(r6, 0);
        for (Object next : r6.Bsw()) {
            HashMap hashMap = this.A01;
            List list = (List) hashMap.get(next);
            if (list == null) {
                list = new ArrayList();
            }
            if (!list.contains(r6)) {
                list.add(r6);
                hashMap.put(next, list);
            }
        }
    }

    public final void A01(C233022up r5) {
        0qQ.A0B(r5, 0);
        for (Object next : r5.Bsw()) {
            HashMap hashMap = this.A01;
            List list = (List) hashMap.get(next);
            if (list != null) {
                list.remove(r5);
            }
            Collection collection = (Collection) hashMap.get(next);
            if (collection == null || collection.isEmpty()) {
                hashMap.remove(next);
            }
        }
    }
}
