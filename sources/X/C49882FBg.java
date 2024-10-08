package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.FBg  reason: case insensitive filesystem */
public final class C49882FBg {
    public final UserSession A00;
    public final AnonymousClass4DU A01;

    public C49882FBg(UserSession userSession, AnonymousClass4DU r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public static 0wc A00(C49882FBg fBg) {
        UserSession userSession = fBg.A00;
        AnonymousClass4DU r1 = fBg.A01;
        0qQ.A0C(r1, Pxd.A00(3));
        return AnonymousClass0kN.A01(r1, userSession);
    }

    public final void A01(String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(A00(this), "change_notification_setting");
        A0e.AAJ("ui_type", str3);
        A0e.AAJ("setting_value", str2);
        A0e.AAJ(TraceFieldType.ContentType, str);
        A0e.Cgf();
    }

    public final void A02(String str, String str2, String str3, boolean z) {
        AnonymousClass7TG.A1N(str, str2);
        0Aj A0e = AnonymousClass7TE.A0e(A00(this), "change_notifications_setting_request");
        A0e.AAJ(TraceFieldType.ContentType, str);
        A0e.AAJ("setting_value", str2);
        A0e.A7p(RealtimeConstants.SEND_SUCCESS, Boolean.valueOf(z));
        A0e.AAJ("ui_type", str3);
        A0e.Cgf();
    }

    public final void A03(boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(A00(this), "fetch_notifications_setting");
        A0e.A7p(RealtimeConstants.SEND_SUCCESS, Boolean.valueOf(z));
        A0e.Cgf();
    }
}
