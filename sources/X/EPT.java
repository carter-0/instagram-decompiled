package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

public final class EPT extends C319156q8 {
    public final void A02() {
        C323256xC r0 = this.A01;
        FragmentActivity fragmentActivity = r0.A06;
        UserSession userSession = r0.A09;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        int i = 2131957140;
        if (182.A06(0Tu.A05, userSession, 36321541990262271L)) {
            i = 2131957049;
        }
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(2826), DbY.A0m("entrypoint", "profile_menu_native"));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(fragmentActivity, A0N, i);
        A0M.A0E(C49891FBs.A02(A0N, A04));
        A0M.A04();
    }
}
