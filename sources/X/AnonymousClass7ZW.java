package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7ZW  reason: invalid class name */
public final class AnonymousClass7ZW {
    public final 0xa A00;

    public AnonymousClass7ZW(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = 1Al.A01(userSession).A04(1An.A08, getClass());
    }

    public final Boolean A00(String str) {
        String A0R = 002.A0R("agent_embodiment_enabled_", str);
        0xa r1 = this.A00;
        if (r1.contains(A0R)) {
            return Boolean.valueOf(r1.getBoolean(A0R, false));
        }
        return null;
    }

    public final void A01(String str, boolean z) {
        0qQ.A0B(str, 0);
        0xY AR4 = this.A00.AR4();
        AR4.E5T(002.A0R("agent_embodiment_enabled_", str), z);
        AR4.apply();
    }
}
