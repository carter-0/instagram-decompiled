package X;

import com.instagram.common.session.UserSession;

public abstract class DdQ {
    public static final void A00(AnonymousClass0iw r2, UserSession userSession, String str, int i) {
        AnonymousClass7TF.A1C(userSession, 0, r2);
        0Aj A0H = DbZ.A0H(AnonymousClass0kN.A01(r2, userSession), "follow_request_accept_tapped", str, i);
        DbW.A15(A0H, r2);
        A0H.Cgf();
    }

    public static final void A01(AnonymousClass0iw r2, UserSession userSession, String str, int i) {
        AnonymousClass7TF.A1C(userSession, 0, r2);
        0Aj A0H = DbZ.A0H(AnonymousClass0kN.A01(r2, userSession), "follow_request_ignore_tapped", str, i);
        DbW.A15(A0H, r2);
        A0H.Cgf();
    }

    public static final void A02(AnonymousClass0iw r3, UserSession userSession, String str, int i) {
        0qQ.A0B(r3, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "follow_request_impression");
        A0e.A8k("position", Integer.valueOf(i));
        A0e.AAJ("target_id", str);
        DbS.A1O(A0e, r3.getModuleName());
        A0e.Cgf();
    }

    public static final void A03(AnonymousClass0iw r2, UserSession userSession, String str, int i) {
        0Aj A0H = DbZ.A0H(AnonymousClass0kN.A01(r2, userSession), "follow_request_tapped", str, i);
        DbW.A15(A0H, r2);
        A0H.Cgf();
    }
}
