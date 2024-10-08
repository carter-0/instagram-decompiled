package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class F2M {
    public final 0wc A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public F2M(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(String str, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_wellbeing_safety_check_action");
        DbS.A1M(A0e, "evergreen_safety_check");
        A0e.AAJ("entrypoint", "quick_promotion");
        A0e.A9H("extra_values", map);
        DbS.A1J(A0e, "click");
        DbS.A1H(A0e, str);
        A0e.Cgf();
    }
}
