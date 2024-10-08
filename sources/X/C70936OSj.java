package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.OSj  reason: case insensitive filesystem */
public final class C70936OSj {
    public final 0wc A00;

    public C70936OSj(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static final void A00(C70936OSj oSj, String str, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(oSj.A00, "igd_pro_campaign_view_event");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9H("extra_client_data", map);
            A0e.Cgf();
        }
    }
}
