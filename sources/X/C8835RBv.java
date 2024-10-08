package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.RBv  reason: case insensitive filesystem */
public final class C8835RBv extends C51086FoG {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C7572QKn A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C8835RBv(AnonymousClass0iw r1, UserSession userSession, C7572QKn qKn, String str, String str2) {
        this.A02 = qKn;
        this.A01 = userSession;
        this.A00 = r1;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void Do1(String str) {
        String str2;
        C7572QKn qKn = this.A02;
        String A002 = SDT.A00(qKn);
        UserSession userSession = this.A01;
        1Xj A0U = DbV.A0U(userSession, A002);
        if (A0U != null) {
            str2 = A0U.C9L();
        } else {
            str2 = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A00, userSession), "iab_report_submit");
        A0e.AAJ("iab_session_id", qKn.A00.getString("Tracking.ARG_SESSION_ID"));
        A0e.AAJ("target_url", this.A04);
        A0e.AAJ("initial_url", this.A03);
        A0e.AAJ("report_reason", str);
        C51965G9l.A1L(A0e, str2);
        A0e.AAJ("click_source", qKn.A00.getString("Tracking.ARG_CLICK_SOURCE"));
        A0e.A8D("event_ts", Double.valueOf((double) System.currentTimeMillis()));
        A0e.Cgf();
    }
}
