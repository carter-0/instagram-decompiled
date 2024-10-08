package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public abstract class RhG {
    public static Object A00(C307896Rx r8) {
        UserSession A0B = C308206Td.A0B(r8);
        FragmentActivity A04 = C308206Td.A04(r8);
        HashMap A1E = AnonymousClass7TE.A1E();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ig_activity_center_");
        String A0i = AnonymousClass7TF.A0i(AnonymousClass0HM.A00(), A1A);
        A1E.put(Dbp.A00(), A0i);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) A0B);
        igBloksScreenConfig.A0R = "com.bloks.www.bloks.browser_history.main_screen";
        igBloksScreenConfig.A0i = true;
        igBloksScreenConfig.A0j = false;
        C46649DiU.A04("com.bloks.www.bloks.browser_history.main_screen", A1E).A0D(A04, igBloksScreenConfig);
        C11242SHc.A00(new C11242SHc(A0B, A0i, "in_app_browser_v2", true), "view_link_history_entry_clicked", (String) null);
        return null;
    }
}
