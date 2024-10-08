package X;

import com.instagram.common.session.UserSession;

public final class F2J {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;

    public final void A00(String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "ig_detected_outcomes_funnel");
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", str);
            A0e.AAJ("flow_step", "settings_entrypoint");
            A0e.AAJ("seller_country", str2);
            A0e.AAJ("seller_igid", str3);
            A0e.Cgf();
        }
    }

    public F2J(UserSession userSession) {
        this.A02 = userSession;
        0xG A0O = DbS.A0O("AutomaticOrderDetectionLogger");
        this.A00 = A0O;
        this.A01 = AnonymousClass0kN.A01(A0O, userSession);
    }
}
