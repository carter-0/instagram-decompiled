package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3VT  reason: invalid class name */
public final class AnonymousClass3VT {
    public boolean A00;
    public final UserSession A01;

    public AnonymousClass3VT(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        1Av A002 = 1Au.A00(userSession);
        this.A00 = ((Boolean) A002.A5s.CDM(A002, 1Av.A8a[155])).booleanValue();
    }

    public final void A00(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            0nY.A00().ATE(new C47813EHz(this, z));
        }
    }
}
