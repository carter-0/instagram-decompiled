package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.43B  reason: invalid class name */
public abstract class AnonymousClass43B {
    public static final AnonymousClass43G A00(UserSession userSession, 2EM r7, 2Eo r8) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r8, 2);
        1Ng A00 = AnonymousClass1Nd.A00(userSession);
        2Dm A002 = 1bJ.A00(userSession);
        return new AnonymousClass43G(A00, userSession2, AnonymousClass43C.A00(userSession2), r7, r8, A002);
    }

    public static final ArrayList A01(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C69415Nkv) it.next()).A00));
            }
        }
        return arrayList;
    }
}
