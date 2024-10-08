package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FEu  reason: case insensitive filesystem */
public final class C49919FEu {
    public static final C49919FEu A00 = new Object();

    public final void A01(QP5 qp5, UserSession userSession, String str) {
        0qQ.A0B(qp5, 1);
        A00(qp5, userSession, "deeplink_pass", "deeplink", str, (String) null);
    }

    public final void A02(QP5 qp5, UserSession userSession, String str, String str2) {
        0qQ.A0B(qp5, 1);
        A00(qp5, userSession, "deeplink_fail", "deeplink", str, str2);
    }

    public static final void A00(QP5 qp5, UserSession userSession, String str, String str2, String str3, String str4) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_permissions_event");
        DbS.A1I(A0e, str);
        DbS.A1G(A0e, qp5.A01);
        A0e.AAJ("flow_id", qp5.A02);
        DbS.A1N(A0e, qp5.A00);
        A0e.AAJ("component", str3);
        DbS.A1H(A0e, str2);
        DbS.A1M(A0e, qp5.A03);
        A0e.AAJ("error_identifier", str4);
        A0e.Cgf();
    }
}
