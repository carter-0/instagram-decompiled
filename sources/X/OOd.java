package X;

import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;

public abstract class OOd {
    public static final void A00(C290935gF r4, C290935gF r5) {
        if (r4 != null) {
            Iterator it = r4.A04.keySet().iterator();
            while (it.hasNext()) {
                Object A0a = AnonymousClass7TF.A0a(it);
                if (!r5.A04.containsKey(A0a)) {
                    HashMap hashMap = r5.A04;
                    Object obj = r4.A04.get(A0a);
                    0qQ.A0A(obj);
                    hashMap.put(A0a, obj);
                }
            }
        }
    }

    public static final boolean A01(User user, String str) {
        String username = user.getUsername();
        String fullName = user.getFullName();
        if (0mp.A0I(username, str, 0) || (fullName != null && fullName.length() != 0 && 0mp.A0H(fullName, str))) {
            return true;
        }
        return false;
    }
}
