package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

public final class EPU extends C319156q8 {
    public final void A02() {
        Fragment e2g;
        C323256xC r4 = this.A01;
        UserSession userSession = r4.A09;
        FFF.A03(userSession, "hamburger_menu", "creator_tools_row");
        boolean A06 = 182.A06(0Tu.A05, userSession, 36315799618719281L);
        C309516Yo A0M = DbS.A0M(r4.A06, userSession);
        if (A06) {
            e2g = F5N.A00(ValuePropsFlow.ACCOUNTS.A00, (String) null);
        } else {
            e2g = new E2G();
        }
        A0M.A0E(e2g);
        A0M.A04();
    }
}
