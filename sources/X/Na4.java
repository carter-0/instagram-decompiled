package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class Na4 extends PAC {
    public final UserSession A00;
    public final C333517Zg A01;

    public Na4(FragmentActivity fragmentActivity, UserSession userSession, C333517Zg r4) {
        super(fragmentActivity, userSession, r4, 28);
        this.A00 = userSession;
        this.A01 = r4;
    }

    public final boolean isEnabled() {
        UserSession userSession = this.A00;
        if (!0qQ.A0K(userSession.A06, this.A01.C6l().BiB()) || !182.A06(0Tu.A05, userSession, 36322882019732115L)) {
            return false;
        }
        return true;
    }
}
