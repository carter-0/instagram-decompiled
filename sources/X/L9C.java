package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class L9C {
    public final UserSession A00;
    public final OVW A01;
    public final X1U A02;
    public final String A03;
    public final C65128Lnq A04;

    public L9C(FragmentActivity fragmentActivity, UserSession userSession, X1U x1u, String str, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = x1u;
        C65128Lnq lnq = new C65128Lnq(this, 0);
        this.A04 = lnq;
        this.A01 = new OVW(fragmentActivity, userSession, lnq, str, (String) null, false, true, false, z);
    }
}
