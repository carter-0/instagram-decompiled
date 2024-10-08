package X;

import com.instagram.common.session.UserSession;

public final class LE1 {
    public Boolean A00;
    public Integer A01 = AnonymousClass05K.A00;
    public String A02 = "";
    public boolean A03;
    public boolean A04 = true;
    public boolean A05;
    public final UserSession A06;

    public LE1(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
    }

    public final void A00() {
        boolean z;
        if (this.A00 == null) {
            UserSession userSession = this.A06;
            if (182.A06(0Tu.A05, userSession, 36324101790445348L)) {
                z = DbT.A1a(C347757xK.A00(userSession).A00, "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING");
            } else {
                z = false;
            }
            this.A00 = Boolean.valueOf(z);
        }
    }
}
