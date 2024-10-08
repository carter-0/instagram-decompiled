package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class LCS {
    public final 0wc A00;

    public final void A00(Long l, Long l2, String str, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "sable_news_event");
        if (A0e.isSampled()) {
            A0e.AAJ(TraceFieldType.AdhocEventName, str);
            long j = 0;
            A0e.A9F("ig_user_id", Long.valueOf(DbY.A04(l)));
            if (l2 != null) {
                j = l2.longValue();
            }
            A0e.A9F("account_viewed_id", Long.valueOf(j));
            A0e.A7p("viewer_is_regulated_c18", Boolean.valueOf(z));
            A0e.Cgf();
        }
    }

    public LCS(UserSession userSession) {
        this.A00 = AnonymousClass0kN.A02(userSession);
    }
}
