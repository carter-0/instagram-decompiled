package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.OSf  reason: case insensitive filesystem */
public final class C70932OSf {
    public final 0wc A00;

    public C70932OSf(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static final void A00(C70932OSf oSf, String str, String str2, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(oSf.A00, "direct_icebreaker_settings_events");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9H("event_data", map);
            A0e.AAJ("error_message", str2);
            A0e.Cgf();
        }
    }
}
