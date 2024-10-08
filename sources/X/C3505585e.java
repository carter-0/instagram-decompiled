package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.85e  reason: invalid class name and case insensitive filesystem */
public abstract class C3505585e {
    public static final Set A00;
    public static final Set A01;
    public static final Set A02;

    public static final Integer A00(28D r4, UserSession userSession) {
        0qQ.A0B(r4, 1);
        if (r4 != 28D.A0a || !182.A06(0Tu.A05, userSession, 36326369533245167L)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(A01);
            linkedHashSet.addAll(A02);
            if (182.A06(0Tu.A05, userSession, 36321971486664564L)) {
                linkedHashSet.addAll(A00);
            } else {
                linkedHashSet.add(28D.A5X);
                linkedHashSet.add(28D.A5Y);
            }
            if (linkedHashSet.isEmpty()) {
                return AnonymousClass05K.A0C;
            }
            if (!linkedHashSet.contains(r4)) {
                return AnonymousClass05K.A01;
            }
        }
        return AnonymousClass05K.A00;
    }

    static {
        28D r3 = 28D.A0a;
        28D r4 = 28D.A5X;
        28D r5 = 28D.A5Y;
        28D r6 = 28D.A42;
        28D r7 = 28D.A4c;
        28D r8 = 28D.A4V;
        28D r9 = 28D.A4W;
        28D r10 = 28D.A4X;
        28D[] r0 = {r3, r4, r5, r6, r7, r8, r9, r10, 28D.A4a};
        0qQ.A0B(r0, 0);
        A00 = 03t.A0K(r0);
        28D[] r02 = {r8, r9, r10};
        0qQ.A0B(r02, 0);
        A02 = 03t.A0K(r02);
        28D[] r03 = {28D.A3V, 28D.A3T};
        0qQ.A0B(r03, 0);
        A01 = 03t.A0K(r03);
    }

    public static final boolean A01(UserSession userSession) {
        return 182.A06(0Tu.A05, userSession, 36321971486730101L);
    }
}
