package X;

import com.instagram.common.session.UserSession;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.80I  reason: invalid class name */
public final class AnonymousClass80I {
    public final AnonymousClass80H A01(UserSession userSession, C279284yO... r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        HashSet hashSet = new HashSet(0se.A0L(r4.length));
        03t.A0M(hashSet, r4);
        return A02(hashSet);
    }

    public static final AnonymousClass80H A00(Set set, Set set2) {
        return new AnonymousClass80H(set, set2);
    }

    public final AnonymousClass80H A02(Set set) {
        EnumSet complementOf = EnumSet.complementOf(EnumSet.of(C358088aL.A0l));
        0qQ.A07(complementOf);
        return new AnonymousClass80H(complementOf, set);
    }
}
