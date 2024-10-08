package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class PAI implements C74405PuL {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C333517Zg A02;
    public final C332907Wx A03;

    public final boolean isEnabled() {
        AnonymousClass7S7 C6l = this.A02.C6l();
        if (AnonymousClass48O.A02(C66580MXl.A05(C6l))) {
            UserSession userSession = this.A01;
            if (!0qQ.A0K(userSession.A06, C6l.BiB()) || !182.A06(0Tu.A05, userSession, 36322882019666578L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public PAI(FragmentActivity fragmentActivity, UserSession userSession, C333517Zg r3, C332907Wx r4) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final List getItems() {
        01N A1H = 0jo.A1H();
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C333517Zg r3 = this.A02;
        Na4 na4 = new Na4(fragmentActivity, userSession, r3);
        if (na4.isEnabled()) {
            A1H.add(na4);
        }
        A1H.add(new PAE(r3, this.A03, C66581MXm.A0Z(r3).A08));
        return 0jo.A1I(A1H);
    }
}
