package X;

import com.instagram.common.session.UserSession;

public final class OKY {
    public OWA A00;
    public final UserSession A01;

    public final void A00(C74267Prv prv) {
        0qQ.A0B(prv, 0);
        OWA owa = this.A00;
        if (owa == null) {
            DbT.A1Q(0wj.A01, "Attempt to log event while stopped.", 245701013);
        } else {
            owa.A02(prv);
        }
    }

    public OKY(UserSession userSession) {
        this.A01 = userSession;
    }
}
