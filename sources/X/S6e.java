package X;

import com.instagram.common.session.UserSession;

public final class S6e {
    public C10311Rq9 A00;
    public String A01;
    public String A02;
    public long A03;
    public final 0wc A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;

    public S6e(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        this.A08 = userSession;
        this.A07 = r2;
        this.A05 = str;
        this.A01 = str2;
        this.A06 = str3;
        this.A04 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(float f) {
        A01(String.valueOf((int) (f * 100.0f)));
    }

    public final void A01(String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A04, "instagram_cnb_partial_sheet_open");
        this.A02 = str;
        if (A0e.isSampled()) {
            A0e.AAJ("launch_method", this.A06);
            A0e.AAJ("browser_size", this.A02);
            A0e.A9F("ad_id", DbZ.A0d(this.A05));
            A0e.AAJ("callsite_session_id", this.A01);
            A0e.Cgf();
        }
    }

    public final void A02(String str, String str2, String str3) {
        long j;
        int i;
        if (!0qQ.A0K(this.A02, "secondary_cta")) {
            C10311Rq9 rq9 = this.A00;
            if (rq9 != null) {
                A9z a9z = rq9.A00.A0d;
                if (a9z != null) {
                    i = a9z.A01;
                } else {
                    i = 0;
                }
                j = (long) i;
            } else {
                j = 0;
            }
            0Aj A0e = AnonymousClass7TE.A0e(this.A04, "instagram_cnb_partial_sheet_interaction");
            if (A0e.isSampled()) {
                A0e.AAJ("dismiss_method", str3);
                A0e.AAJ("from_size", this.A02);
                A0e.AAJ("to_size", str);
                A0e.A9F("ad_id", DbZ.A0d(this.A05));
                A0e.AAJ("callsite_session_id", this.A01);
                A0e.A9F("interaction_count", Long.valueOf(j - this.A03));
                if (0qQ.A0K(this.A02, str) || (0qQ.A0K(str, "anchored") && !0qQ.A0K(this.A02, "full") && !0qQ.A0K(this.A02, "collapsed") && !0qQ.A0K(this.A02, "secondary_cta") && !0qQ.A0K(this.A02, "anchored"))) {
                    str2 = "bounce";
                }
                A0e.AAJ("action_type", str2);
                A0e.AAJ("launch_method", this.A06);
                A0e.Cgf();
            }
            this.A02 = str;
            this.A03 = j;
        }
    }
}
