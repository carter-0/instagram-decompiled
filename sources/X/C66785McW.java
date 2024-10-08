package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.McW  reason: case insensitive filesystem */
public abstract class C66785McW {
    public static final List A00(UserSession userSession, String str, List list) {
        0qQ.A0B(str, 2);
        2Dm A00 = 1bJ.A00(userSession);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C254703su) it.next()).A1m(AnonymousClass05K.A0j);
        }
        return A00.FKK(list, str);
    }
}
