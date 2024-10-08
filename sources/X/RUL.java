package X;

import com.instagram.common.session.UserSession;

public abstract class RUL {
    public static final boolean A00(C10188Ro4 ro4, C62320sa r8) {
        0qQ.A0B(ro4, 0);
        UserSession userSession = ro4.A00;
        String string = AnonymousClass7TE.A0q(userSession).getString("autofill_force_bloks_experience", (String) null);
        if (string != null && string.equals("OFF")) {
            return false;
        }
        String string2 = AnonymousClass7TE.A0q(userSession).getString("autofill_force_bloks_experience", (String) null);
        if ((string2 == null || !string2.equals("ON")) && !AnonymousClass7TE.A1a(r8.invoke())) {
            return false;
        }
        return true;
    }
}
