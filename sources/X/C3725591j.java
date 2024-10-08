package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.91j  reason: invalid class name and case insensitive filesystem */
public final class C3725591j {
    public final 0wc A00;
    public final C3725391h A01;

    public final void A00(String str, String str2, String str3) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, C66579MXk.A00(1140));
        if (str2 != null && str3 != null && A002.isSampled()) {
            A002.A8M(this.A01.A00, "suggestion_type");
            A002.A9F("page_or_business_id", Long.valueOf(Long.parseLong(str)));
            A002.A9F("consumer_id", Long.valueOf(Long.parseLong(str2)));
            A002.AAJ(TraceFieldType.RequestID, str3);
            A002.AAJ("channel", "INSTAGRAM");
            A002.Cgf();
        }
    }

    public final void A01(String str, String str2, String str3) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, C66579MXk.A00(1141));
        if (str2 != null && str3 != null && A002.isSampled()) {
            A002.A8M(this.A01.A00, "suggestion_type");
            A002.A9F("page_or_business_id", Long.valueOf(Long.parseLong(str)));
            A002.A9F("consumer_id", Long.valueOf(Long.parseLong(str2)));
            A002.AAJ(TraceFieldType.RequestID, str3);
            A002.AAJ("channel", "INSTAGRAM");
            A002.Cgf();
        }
    }

    public final void A02(String str, String str2, String str3) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, C66579MXk.A00(1142));
        if (str2 != null && str3 != null && A002.isSampled()) {
            A002.A8M(this.A01.A00, "suggestion_type");
            A002.A9F("page_or_business_id", Long.valueOf(Long.parseLong(str)));
            A002.A9F("consumer_id", Long.valueOf(Long.parseLong(str2)));
            A002.AAJ(TraceFieldType.RequestID, str3);
            A002.AAJ("channel", "INSTAGRAM");
            A002.Cgf();
        }
    }

    public C3725591j(AnonymousClass0iw r2, UserSession userSession, C3725391h r4) {
        this.A01 = r4;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
