package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.OSg  reason: case insensitive filesystem */
public final class C70933OSg {
    public final 0wc A00;

    public C70933OSg(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public static final void A00(C70933OSg oSg, String str, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(oSg.A00, "direct_custom_folder");
        DbS.A1J(A0e, str);
        A0e.A9H("event_data", map);
        A0e.Cgf();
    }
}
