package X;

import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Kxs  reason: case insensitive filesystem */
public abstract class C63488Kxs {
    public static final String A00(User user, Set set) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (user != null) {
            A1A.append(user.getUsername());
        }
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                if (A1A.length() > 0) {
                    A1A.append(", ");
                }
                A1A.append(A0k.getUsername());
            }
        }
        return DbT.A10(A1A);
    }
}
