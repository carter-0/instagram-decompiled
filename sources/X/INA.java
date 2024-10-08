package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class INA implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "SchoolsLogger";
    public final UserSession A00;
    public final List A01 = 0sr.A1L(new C54684HOp[]{C54684HOp.ADD_SCHOOL, C54684HOp.CONFIRM_ENROLLMENT, C54684HOp.CONFIRM_SCHOOL, C54684HOp.MULTI_SCHOOL, C54684HOp.GRADUATION_DATE});

    public INA(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static 0wc A01(INA ina, Object obj) {
        0qQ.A0B(obj, 0);
        return AnonymousClass0kN.A01(ina, ina.A00);
    }

    public static 0wc A00(INA ina) {
        return AnonymousClass0kN.A01(ina, ina.A00);
    }

    public final String getModuleName() {
        return "schools";
    }

    public static 0wc A02(INA ina, Object obj, int i) {
        0qQ.A0B(obj, i);
        return AnonymousClass0kN.A01(ina, ina.A00);
    }

    public static final void A03(C54672HOd hOd, C54684HOp hOp, INA ina, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(A00(ina), "ig_school_registration_link_tap");
        if (A0e.isSampled()) {
            C51971G9r.A15(hOd, hOp, A0e);
            A0e.AAJ("waterfall_id", str);
            A0e.AAJ("link_title", str2);
            DbX.A1L(A0e);
        }
    }

    public final void A04(C54672HOd hOd, C54684HOp hOp) {
        AnonymousClass7TG.A1N(hOp, hOd);
        0Aj A0e = AnonymousClass7TE.A0e(A00(this), "ig_school_reliability_page_impression");
        if (A0e.isSampled()) {
            C51965G9l.A1B(hOd, A0e);
            C51974G9v.A0j(hOp, A0e);
        }
    }

    public final void A05(C54672HOd hOd, C54684HOp hOp) {
        AnonymousClass7TG.A1N(hOp, hOd);
        0Aj A0e = AnonymousClass7TE.A0e(A00(this), "ig_school_reliability_back_button_tap");
        if (A0e.isSampled()) {
            C51965G9l.A1B(hOd, A0e);
            C51974G9v.A0j(hOp, A0e);
        }
    }

    public final void A06(C54672HOd hOd, C54684HOp hOp, String str) {
        AnonymousClass7TG.A1T(hOd, hOp, str);
        if (this.A01.contains(hOp)) {
            A03(hOd, hOp, this, str, "learn_more");
            return;
        }
        0Aj A0e = AnonymousClass7TE.A0e(A00(this), "ig_school_reliability_intro_page_learn_more");
        if (A0e.isSampled()) {
            C51965G9l.A1B(hOd, A0e);
            C51974G9v.A0j(hOp, A0e);
        }
    }

    public final void A07(String str) {
        0Aj A0e = AnonymousClass7TE.A0e(A00(this), "ig_school_client_error");
        if (A0e.isSampled()) {
            C51965G9l.A1B(C54672HOd.QP, A0e);
            C51965G9l.A1A(C54684HOp.ADD_SCHOOL, A0e);
            A0e.AAJ("waterfall_id", "");
            A0e.A8M(C54681HOm.UNKNOWN, "error");
            A0e.AAJ(AnonymousClass000.A00(241), str);
            DbX.A1L(A0e);
        }
    }
}
