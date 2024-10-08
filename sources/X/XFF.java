package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class XFF implements BusinessFlowAnalyticsLogger {
    public final 0wc A00;
    public final String A01;

    public static 0wc A00(XFF xff, Object obj) {
        0qQ.A0B(obj, 0);
        return xff.A00;
    }

    public final void ChY(C22030Xtl xtl) {
    }

    public final void ClC(C22030Xtl xtl) {
    }

    public XFF(AnonymousClass0iw r2, 0lg r3, String str) {
        this.A01 = str;
        this.A00 = AnonymousClass0kN.A01(r2, r3);
    }

    public final void ChP(C22030Xtl xtl) {
        0Aj A002 = C22030Xtl.A00(xtl, A00(this, xtl), "business_conversion_cancel");
        C21055XCg.A0c(A002);
        C21053XCe.A15(A002, this.A01);
        A002.Cgf();
    }

    public final void Ci5(C22030Xtl xtl) {
        0Aj A0e = AnonymousClass7TE.A0e(A00(this, xtl), "business_conversion_fetch_data");
        C22030Xtl.A08(A0e, xtl, "step", xtl.A04);
        A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        C21055XCg.A0c(A0e);
        C22030Xtl.A05(A0e, xtl, this.A01);
        C22030Xtl.A01(A0e, xtl);
        C22030Xtl.A04(A0e, xtl);
        A0e.Cgf();
    }

    public final void Ci6(C22030Xtl xtl) {
        0Aj A0e = AnonymousClass7TE.A0e(A00(this, xtl), "business_conversion_fetch_data_error");
        C22030Xtl.A08(A0e, xtl, "step", xtl.A04);
        A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        C21055XCg.A0c(A0e);
        A0e.AAJ("error_message", xtl.A03);
        C21053XCe.A15(A0e, this.A01);
        C22030Xtl.A01(A0e, xtl);
        A0e.Cgf();
    }

    public final void Ci7(C22030Xtl xtl) {
        0Aj A002 = C22030Xtl.A00(xtl, A00(this, xtl), "business_conversion_finish_step");
        C21055XCg.A0c(A002);
        C21053XCe.A15(A002, this.A01);
        A002.A9H("default_values", xtl.A0A());
        A002.A9H("selected_values", xtl.A0B());
        A002.Cgf();
    }

    public final void CkV(C22030Xtl xtl) {
        0Aj A002 = C22030Xtl.A00(xtl, A00(this, xtl), "business_conversion_skip");
        C21055XCg.A0c(A002);
        C21053XCe.A15(A002, this.A01);
        A002.Cgf();
    }

    public final void Cka(C22030Xtl xtl) {
        0Aj A002 = C22030Xtl.A00(xtl, A00(this, xtl), "business_conversion_start_step");
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }

    public final void Ckg(C22030Xtl xtl) {
        0Aj A002 = C22030Xtl.A00(xtl, A00(this, xtl), "business_conversion_submit");
        C22030Xtl.A02(A002, xtl);
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }

    public final void Ckh(C22030Xtl xtl) {
        0Aj A002 = C22030Xtl.A00(xtl, A00(this, xtl), "business_conversion_submit_error");
        C22030Xtl.A02(A002, xtl);
        A002.AAJ("error_message", xtl.A03);
        A002.AAJ("error_identifier", xtl.A02);
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }

    public final void Ckp(C22030Xtl xtl) {
        0Aj A002 = C22030Xtl.A00(xtl, A00(this, xtl), "business_conversion_tap_component");
        C22030Xtl.A02(A002, xtl);
        C21055XCg.A0c(A002);
        C22030Xtl.A05(A002, xtl, this.A01);
        C22030Xtl.A01(A002, xtl);
        A002.Cgf();
    }
}
