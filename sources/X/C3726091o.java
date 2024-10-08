package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.91o  reason: invalid class name and case insensitive filesystem */
public final class C3726091o {
    public final 0wc A00;

    public C3726091o(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
        r0.A00 = r2;
        this.A00 = r0.A00();
    }

    public final void A00(long j, String str, long j2, String str2) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_birthday_opt_in_dismissed");
        if (A002.isSampled()) {
            A002.A9F("celebrant_id", Long.valueOf(j));
            A002.A9F("viewer_id", Long.valueOf(j2));
            A002.AAJ("surface", str);
            A002.AAJ("feature", str2);
            A002.AAJ("option", (String) null);
            A002.AAJ("device_os", "android");
            A002.Cgf();
        }
    }

    public final void A01(long j, String str, long j2, String str2) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_birthday_opt_in_impression");
        if (A002.isSampled()) {
            A002.A9F("celebrant_id", Long.valueOf(j));
            A002.A9F("viewer_id", Long.valueOf(j2));
            A002.AAJ("surface", str);
            A002.AAJ("feature", str2);
            A002.AAJ("option", (String) null);
            A002.AAJ("device_os", "android");
            A002.Cgf();
        }
    }

    public final void A02(String str, String str2, String str3, long j, long j2) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_birthday_opt_in_clicked");
        if (A002.isSampled()) {
            A002.A9F("celebrant_id", Long.valueOf(j));
            A002.A9F("viewer_id", Long.valueOf(j2));
            A002.AAJ("surface", str);
            A002.AAJ("feature", str2);
            A002.AAJ("option", str3);
            A002.AAJ("device_os", "android");
            A002.Cgf();
        }
    }
}
