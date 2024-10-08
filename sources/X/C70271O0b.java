package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.O0b  reason: case insensitive filesystem */
public abstract class C70271O0b {
    public static final boolean A00(UserSession userSession, N3L n3l, boolean z) {
        0Tu r2;
        if (n3l.A02 == AnonymousClass05K.A0C) {
            1Av A00 = 1Au.A00(userSession);
            String valueOf = String.valueOf(n3l.A00);
            String name = n3l.A01.name();
            0qQ.A0B(name, 1);
            if (!A00.A01.getBoolean(002.A0u("proactive_warning_banner_dismissed/userid/", valueOf, "/flowtype/", name), false)) {
                if (z) {
                    r2 = 0Tu.A05;
                } else {
                    r2 = 0Tu.A06;
                }
                if (!182.A06(r2, userSession, 36320970759349231L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
