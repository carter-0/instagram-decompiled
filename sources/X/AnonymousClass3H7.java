package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3H7  reason: invalid class name */
public abstract class AnonymousClass3H7 {
    public static final int A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        int i = 0;
        for (User A02 : AnonymousClass0BO.A00(userSession).BO1(0eE.A00(userSession).A00())) {
            i += A02.A02();
        }
        return i;
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        List<User> BO1 = AnonymousClass0BO.A00(userSession).BO1(0eE.A00(userSession).A00());
        if (!(BO1 instanceof Collection) || !BO1.isEmpty()) {
            for (User user : BO1) {
                if (user.A02() > 0) {
                    return true;
                }
                ImmutableMap copyOf = ImmutableMap.copyOf(user.A05);
                0qQ.A07(copyOf);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : copyOf.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int A01(UserSession userSession) {
        int i;
        int i2 = 0;
        for (User user : AnonymousClass0BO.A00(userSession).BO1(AnonymousClass0t1.A01.A01(userSession))) {
            ImmutableMap copyOf = ImmutableMap.copyOf(user.A05);
            0qQ.A07(copyOf);
            Number number = (Number) copyOf.get(2aD.A0I);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
