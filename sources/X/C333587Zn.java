package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Zn  reason: invalid class name and case insensitive filesystem */
public final class C333587Zn implements C333597Zo {
    public final UserSession A00;

    public C333587Zn(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void Cfp(C254743sy r6) {
        DirectThreadKey A03 = C66647MaG.A03(r6);
        UserSession userSession = this.A00;
        C66665MaY A08 = C66669Mac.A08(userSession, C65871hZ.class);
        0qQ.A0B(A08, 1);
        0qQ.A0B(A03, 2);
        1OS r1 = new 1OS(A08);
        if (A03.A00 != null) {
            r1.A00 = A03;
            1Ou.A01(userSession).A0A(r1);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
