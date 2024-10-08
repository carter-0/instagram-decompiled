package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class EPX extends C319156q8 {
    public final void A02() {
        C323256xC r1 = this.A01;
        FragmentActivity requireActivity = r1.A07.requireActivity();
        UserSession userSession = r1.A09;
        String moduleName = r1.A0A.getModuleName();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("event_source", "settings_menu");
        if (moduleName != null) {
            A1E.put("container_module", moduleName);
        }
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(2889), A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(requireActivity, A0N, 2131965837);
        A0N.A0l = true;
        A04.A0D(requireActivity, A0N);
    }
}
