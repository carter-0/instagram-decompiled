package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class LFr {
    public final C58840Ae A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public LFr(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(r2, 2);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        0qQ.A0B(str, 0);
        0Aj A0d = C51969G9p.A0d(this.A00, "ig_settings_impression");
        if (A0d.isSampled()) {
            A0d.AAJ(TraceFieldType.AdhocEventName, str);
            switch (num.intValue()) {
                case 0:
                    str5 = "screen_impression";
                    break;
                case 1:
                    str5 = "setting_impression";
                    break;
                case 2:
                    str5 = "navigation_row_impression";
                    break;
                case 3:
                    str5 = "click";
                    break;
                case 4:
                    str5 = "search";
                    break;
                case 5:
                    str5 = "change_attempt";
                    break;
                default:
                    str5 = "modal_impression";
                    break;
            }
            A0d.AAJ("event_type", str5);
            A0d.AAJ("control_name", str2);
            A0d.AAJ("current_value", str3);
            A0d.A7p("is_enabled", bool);
            A0d.AAJ("entrypoint", str4);
            DbX.A1L(A0d);
        }
    }

    public final void A01(String str, Integer num, String str2) {
        String str3;
        0qQ.A0B(str, 0);
        0Aj A0d = C51969G9p.A0d(this.A00, "ig_settings_click");
        if (A0d.isSampled()) {
            A0d.AAJ(TraceFieldType.AdhocEventName, str);
            switch (num.intValue()) {
                case 3:
                    str3 = "click";
                    break;
                case 4:
                    str3 = "search";
                    break;
                case 5:
                    str3 = "change_attempt";
                    break;
                case 6:
                    str3 = "modal_impression";
                    break;
                default:
                    str3 = "modal_click";
                    break;
            }
            A0d.AAJ("event_type", str3);
            A0d.AAJ("control_name", (String) null);
            A0d.AAJ("current_value", (String) null);
            A0d.A7p("is_enabled", (Boolean) null);
            A0d.AAJ("entrypoint", str2);
            DbX.A1L(A0d);
        }
    }

    public final void A02(String str, String str2, String str3, String str4) {
        DbY.A1S(str, str3);
        0Aj A0d = C51969G9p.A0d(this.A00, "ig_settings_change");
        if (A0d.isSampled()) {
            A0d.AAJ(TraceFieldType.AdhocEventName, str);
            A0d.AAJ("event_type", "change_attempt");
            A0d.AAJ("control_name", str2);
            A0d.AAJ("current_value", str3);
            A0d.AAJ("entrypoint", str4);
            DbX.A1L(A0d);
        }
    }
}
