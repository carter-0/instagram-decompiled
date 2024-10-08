package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Rht  reason: case insensitive filesystem */
public abstract class C9831Rht {
    public static final void A00(0lg r2, String str, String str2, HashMap hashMap, boolean z) {
        if (r2 instanceof UserSession) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r2), "ig_facebook_connect");
            A0e.AAJ(TraceFieldType.AdhocEventName, str);
            A0e.A7p("is_cal", Boolean.valueOf(z));
            A0e.AAJ("location", str2);
            A0e.A9H("event_info", hashMap);
            A0e.Cgf();
        }
    }
}
