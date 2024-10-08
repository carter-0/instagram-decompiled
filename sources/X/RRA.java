package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Map;

public final class RRA {
    public long A00;
    public 0wc A01;
    public 1Xj A02;
    public Q03 A03;
    public String A04;
    public String A05;

    public final void A00(0wc r4, Double d, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(r4, "mai_play_store_events");
        if (A0e.isSampled()) {
            A0e.AAJ("mai_event_name", str);
            A0e.A7p("is_preloading_enabled", (Boolean) null);
            A0e.A9F("itunes_id", (Long) null);
            C51965G9l.A1L(A0e, str2);
            A0e.A8D("load_duration", (Double) null);
            A0e.A7p("did_load_successfully", (Boolean) null);
            A0e.A8D("time_spent", d);
            A0e.A8D("tti", (Double) null);
            A0e.A8D("background_time", (Double) null);
            A0e.AAJ("error", (String) null);
            A0e.AAJ(TraceFieldType.ErrorDomain, (String) null);
            A0e.A9F(TraceFieldType.ErrorCode, (Long) null);
            A0e.A9F("load_attempt_count", (Long) null);
            A0e.A9H("load_params", (Map) null);
            A0e.AAJ("mai_session_id", (String) null);
            A0e.AAJ("presenting_surface", (String) null);
            String str4 = this.A05;
            if (str4 == null) {
                0qQ.A0F("storeType");
                throw AnonymousClass00P.createAndThrow();
            }
            A0e.AAJ("store_type", str4);
            A0e.AAJ("app_store_uri", str3);
            A0e.Cgf();
        }
    }
}
