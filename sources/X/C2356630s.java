package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.30s  reason: invalid class name and case insensitive filesystem */
public final class C2356630s {
    public final 0wc A00;

    public C2356630s(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(String str, Map map) {
        0qQ.A0B(str, 0);
        0qQ.A0B(map, 1);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ads_consent_value_engagement");
        if (A002.isSampled()) {
            A002.AAJ(TraceFieldType.AdhocEventName, str);
            A002.AAJ("event_target", AnonymousClass000.A00(2920));
            A002.A9H("event_target_info", map);
            A002.Cgf();
        }
    }
}
