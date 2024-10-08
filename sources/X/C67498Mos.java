package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Mos  reason: case insensitive filesystem */
public final class C67498Mos {
    public final 0wc A00;

    public C67498Mos(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static final void A00(C67498Mos mos, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        if (str2 != null) {
            A1E.put("message_type", str2);
        }
        0Aj A0e = AnonymousClass7TE.A0e(mos.A00, "direct_bulk_reply_events");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9H("event_data", A1E);
            A0e.Cgf();
        }
    }
}
