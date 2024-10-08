package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

public final class SH7 {
    public static final List A02 = Collections.unmodifiableList(0sr.A1P(new C8945RGn[]{C8945RGn.IAB_LANDING_PAGE_STARTED, C8945RGn.IAB_LANDING_PAGE_INTERACTIVE, C8945RGn.IAB_LANDING_PAGE_FINISHED, C8945RGn.IAB_LANDING_PAGE_VIEW_ENDED}));
    public 2IP A00;
    public final UserSession A01;

    public final String A00(String str) {
        if (this.A00 == null || !2IP.A00 || str == null) {
            return str;
        }
        return "[Sanitized for ePD Compliance]";
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.2IP] */
    public SH7(UserSession userSession) {
        if (182.A06(0Tu.A05, userSession, 2342156158837524270L)) {
            ? obj = new Object();
            this.A00 = obj;
            obj.A00(userSession);
        }
        this.A01 = userSession;
    }
}
