package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LEg  reason: case insensitive filesystem */
public final class C63942LEg {
    public final 0wc A00;

    public C63942LEg(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
    }

    public final void A00(Integer num, Integer num2) {
        String str;
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "smart_glasses_toolkit_navigation_row");
        if (num2.intValue() != 0) {
            str = "click";
        } else {
            str = "impression";
        }
        A0e.AAJ("event_type", str);
        switch (num.intValue()) {
            case 0:
                str2 = "glasses_version_number";
                break;
            case 1:
                str2 = "smart_glasses_media";
                break;
            case 2:
                str2 = "streaming_live_from_glasses";
                break;
            default:
                str2 = "more_smart_glasses_content";
                break;
        }
        A0e.AAJ("item", str2);
        A0e.Cgf();
    }

    public final void A01(String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "smart_glasses_connection_status_outcome");
        A0e.AAJ("connection_status", str);
        A0e.AAJ("error", str2);
        A0e.Cgf();
    }
}
