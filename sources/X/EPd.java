package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class EPd extends C319156q8 {
    public final G5B A01() {
        G5B g5b;
        UserSession userSession = this.A01.A09;
        if (!DbT.A0j(userSession).A1W() || AnonymousClass7TE.A0q(userSession).getBoolean("shopping_has_tapped_orders_navbar_icon", false)) {
            g5b = C50691Fgq.A00;
        } else {
            g5b = new C50692Fgr(0);
        }
        return g5b;
    }

    public final void A02() {
        C323256xC r0 = this.A01;
        FragmentActivity fragmentActivity = r0.A06;
        UserSession userSession = r0.A09;
        DbW.A1L(AnonymousClass7TF.A0N(userSession), "shopping_has_tapped_orders_navbar_icon");
        C324476zN.A0K(fragmentActivity, userSession, "profile_menu", (String) null, (String) null, (String) null);
    }
}
