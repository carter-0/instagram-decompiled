package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;

/* renamed from: X.5go  reason: invalid class name and case insensitive filesystem */
public abstract class C291225go {
    public static final int A00(UserSession userSession, C228812mN r7, C268314dB r8, int i) {
        int i2;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r8, 3);
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession, 36321468977063328L);
        long A01 = 182.A01(r2, userSession, 36602943953834845L);
        if (!A06) {
            return i;
        }
        Collection collection = r8.A00;
        if (collection.isEmpty()) {
            return i;
        }
        int i3 = 0;
        Object obj = null;
        for (Object next : collection) {
            if (obj == null || r7.AZD(obj) < 0 || !r7.ACN(obj, next)) {
                i2 = (int) A01;
            } else {
                i2 = 1;
            }
            i3 += i2;
            obj = next;
        }
        return i - i3;
    }
}
