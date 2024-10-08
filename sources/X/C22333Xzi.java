package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* renamed from: X.Xzi  reason: case insensitive filesystem */
public final class C22333Xzi implements BusinessFlowAnalyticsLogger {
    public final 0wc A00;
    public final String A01;

    public final void ChP(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A002 = C22030Xtl.A00(xtl, this.A00, "creator_conversion_cancel");
        C21055XCg.A0c(A002);
        C21053XCe.A15(A002, this.A01);
        A002.Cgf();
    }

    public final void ChY(C22030Xtl xtl) {
    }

    public final void Ci5(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "creator_conversion_fetch_data");
        String str = xtl.A01;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        C22030Xtl.A06(A0e, xtl, str);
        String str3 = this.A01;
        if (str3 != null) {
            str2 = str3;
        }
        C22030Xtl.A08(A0e, xtl, "waterfall_id", str2);
        C22030Xtl.A03(A0e, xtl);
        C22030Xtl.A01(A0e, xtl);
        A0e.Cgf();
    }

    public final void Ci6(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "creator_conversion_fetch_data_error");
        String str = xtl.A01;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        C22030Xtl.A06(A0e, xtl, str);
        String str3 = this.A01;
        if (str3 != null) {
            str2 = str3;
        }
        C22030Xtl.A08(A0e, xtl, "waterfall_id", str2);
        A0e.AAJ("error_identifier", xtl.A02);
        A0e.AAJ("error_message", xtl.A03);
        C22030Xtl.A01(A0e, xtl);
        A0e.Cgf();
    }

    public final void Ci7(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A002 = C22030Xtl.A00(xtl, this.A00, "creator_conversion_finish_step");
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }

    public final void CkV(C22030Xtl xtl) {
    }

    public final void Cka(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A002 = C22030Xtl.A00(xtl, this.A00, "creator_conversion_start_step");
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }

    public final void Ckg(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A002 = C22030Xtl.A00(xtl, this.A00, "creator_conversion_submit");
        C22030Xtl.A02(A002, xtl);
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }

    public final void Ckh(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A002 = C22030Xtl.A00(xtl, this.A00, "creator_conversion_submit_error");
        C22030Xtl.A02(A002, xtl);
        A002.AAJ("error_message", xtl.A03);
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }

    public final void Ckp(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A002 = C22030Xtl.A00(xtl, this.A00, "creator_conversion_tap_component");
        C22030Xtl.A02(A002, xtl);
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }

    public final void ClC(C22030Xtl xtl) {
    }

    public C22333Xzi(AnonymousClass0iw r2, 0lg r3, String str) {
        this.A01 = str;
        this.A00 = AnonymousClass0kN.A01(r2, r3);
    }
}
