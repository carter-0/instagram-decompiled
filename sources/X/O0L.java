package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public abstract class O0L {
    public static final void A00(C69448Nls nls, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(C66580MXl.A0N(new AnonymousClass0kM(userSession), "business_inbox_thread_nudge"), "direct_professional_thread_nudge_events");
        if (A0e.isSampled()) {
            C51965G9l.A19(nls, A0e);
            A0e.A9H("event_data", (Map) null);
            A0e.AAe("participant_ids", AnonymousClass7TE.A1I(str));
            A0e.Cgf();
        }
    }
}
