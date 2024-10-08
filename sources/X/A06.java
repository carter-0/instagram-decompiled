package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class A06 {
    public static final void A00(AnonymousClass0iw r4, UserSession userSession, String str, List list, int i, int i2, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "direct_requests_thread_allow");
        A0e.A9F("folder", Long.valueOf((long) i));
        if (str != null) {
            A0e.AAJ("origin_filter", str);
        }
        A0e.A7p("is_interop", Boolean.valueOf(z));
        if (AnonymousClass7TE.A1b(list)) {
            A0e.AAJ("labels", list.toString());
        }
        A0e.A7p("is_unread", false);
        A0e.A9F("trigger", Long.valueOf((long) i2));
        A0e.Cgf();
    }
}
