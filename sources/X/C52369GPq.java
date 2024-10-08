package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GPq  reason: case insensitive filesystem */
public final class C52369GPq {
    public final String A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;

    public C52369GPq(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = str;
        0xG A0O = DbS.A0O("CreatorsGenAiLogger");
        this.A01 = A0O;
        this.A02 = AnonymousClass0kN.A01(A0O, userSession);
    }

    public static final void A01(C54688HOt hOt, C52369GPq gPq) {
        A00((C54677HOi) null, (HOP) null, hOt, gPq, (Boolean) null, (Boolean) null, (String) null);
    }

    public static final void A02(C54688HOt hOt, C52369GPq gPq, String str) {
        A00((C54677HOi) null, (HOP) null, hOt, gPq, (Boolean) null, (Boolean) null, str);
    }

    public static final void A00(C54677HOi hOi, HOP hop, C54688HOt hOt, C52369GPq gPq, Boolean bool, Boolean bool2, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(gPq.A02, "ig_creator_ai_creator");
        if (A0e.isSampled()) {
            A0e.A9F(AnonymousClass000.A00(1072), DbV.A0q(gPq.A03.A06));
            C51965G9l.A19(hOt, A0e);
            DbS.A1N(A0e, str);
            if (bool != null) {
                A0e.A7p("initial_toggle_value", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool2 != null) {
                A0e.A7p("new_toggle_value", Boolean.valueOf(bool2.booleanValue()));
            }
            if (hOi != null) {
                A0e.A8M(hOi, "click_point");
            }
            if (hop != null) {
                0bb r1 = new 0bb();
                r1.A01(hop, "audience");
                A0e.AAK(r1, "audience_context");
            }
            A0e.Cgf();
        }
    }

    public static final void A03(C52369GPq gPq, Long l, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(gPq.A02, "ig_creator_ai_fan");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9F(AnonymousClass000.A00(1072), DbV.A0q(gPq.A03.A06));
            String str2 = gPq.A00;
            if (str2 != null) {
                DbS.A1N(A0e, str2);
            }
            if (l != null) {
                A0e.A9F("target_user_id", C51968G9o.A0v(l));
            }
            A0e.Cgf();
        }
    }

    public final void A04(C54677HOi hOi) {
        A00(hOi, (HOP) null, C54688HOt.A08, this, (Boolean) null, (Boolean) null, this.A00);
    }
}
