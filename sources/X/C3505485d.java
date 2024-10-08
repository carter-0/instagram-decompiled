package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.85d  reason: invalid class name and case insensitive filesystem */
public abstract class C3505485d {
    public static final Set A00;
    public static final Set A01;

    public static final Integer A00(28D r5, UserSession userSession) {
        0qQ.A0B(r5, 1);
        User A012 = AnonymousClass0t1.A01.A01(userSession);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(A01);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36318136081520523L) || (!A012.A1a() && 182.A06(r2, userSession, 36318136081651597L))) {
            linkedHashSet.add(28D.A3t);
        }
        if (linkedHashSet.isEmpty()) {
            return AnonymousClass05K.A0C;
        }
        if (linkedHashSet.contains(r5)) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }

    public static final boolean A01(28D r1, UserSession userSession) {
        0qQ.A0B(r1, 1);
        if (A00(r1, userSession) != AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }

    static {
        28D[] r0 = {28D.A0a, 28D.A5X, 28D.A5Y, 28D.A42, 28D.A4c};
        0qQ.A0B(r0, 0);
        A01 = 03t.A0K(r0);
        28D[] r02 = {28D.A0o, 28D.A1F};
        0qQ.A0B(r02, 0);
        A00 = 03t.A0K(r02);
    }
}
