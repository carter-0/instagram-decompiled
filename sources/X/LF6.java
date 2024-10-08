package X;

import com.instagram.common.session.UserSession;

public final class LF6 {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;

    public LF6(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(String str, String str2, String str3, String str4) {
        long j;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "ig_live_moderator_resign");
        JTQ.A14(A0e, str3);
        DbS.A1H(A0e, "confirm");
        if (str2 == null || (A10 = AnonymousClass7TE.A10(str2)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        JTQ.A10(A0e, j);
        if (str4 == null) {
            str4 = "0";
        }
        C51965G9l.A1I(A0e, str4);
        C51969G9p.A1A(A0e, this.A00);
        JTO.A1R(A0e, "moderator");
        if (str == null) {
            str = "";
        }
        A0e.AAJ("method", str);
        A0e.Cgf();
    }

    public final void A01(String str, String str2, String str3, String str4, String str5, String str6) {
        long j;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "ig_live_moderator_selection");
        if (str4 == null) {
            str4 = "0";
        }
        JTQ.A14(A0e, str4);
        DbS.A1H(A0e, str);
        long j2 = 0;
        if (str3 == null || (A10 = AnonymousClass7TE.A10(str3)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        JTQ.A10(A0e, j);
        if (str5 == null) {
            str5 = "0";
        }
        C51965G9l.A1I(A0e, str5);
        C51969G9p.A1A(A0e, this.A00);
        JTP.A1G(A0e);
        if (str6 == null) {
            str6 = "";
        }
        A0e.AAJ("method", str6);
        if (str2 != null) {
            j2 = JTR.A0M(str2);
        }
        A0e.A9F("target_user_id", Long.valueOf(j2));
        A0e.Cgf();
    }
}
