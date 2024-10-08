package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class Na3 extends PAC {
    public final UserSession A00;
    public final C333517Zg A01;

    public Na3(FragmentActivity fragmentActivity, UserSession userSession, C333517Zg r4) {
        super(fragmentActivity, userSession, r4, 32);
        this.A00 = userSession;
        this.A01 = r4;
    }

    public final boolean isEnabled() {
        C254763t0 r0;
        AnonymousClass7S7 C6l = this.A01.C6l();
        C254793t3 CBU = C6l.CBU();
        if (CBU != null) {
            r0 = C300965yF.A02(CBU);
        } else {
            r0 = null;
        }
        if (r0 == null) {
            return false;
        }
        C254763t0 A012 = C300965yF.A01(CBU);
        UserSession userSession = this.A00;
        if ((!0qQ.A0K(userSession.A06, C6l.BiB()) || !182.A06(0Tu.A05, userSession, 36315881223556754L)) && !AnonymousClass9HV.A00(userSession).A00(A012, 24)) {
            return false;
        }
        return true;
    }
}
