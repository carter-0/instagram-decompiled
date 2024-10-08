package X;

import com.instagram.common.session.UserSession;

public final class DcZ implements AnonymousClass0iw, AnonymousClass0lh {
    public static final String __redex_internal_original_name = "QPAnalyticsLoggerImpl";
    public final UserSession A00;

    public final String getModuleName() {
        return "quick_promotion";
    }

    public final void A00(String str, String str2, boolean z) {
        if (z) {
            Long A10 = AnonymousClass7TE.A10(str2);
            if (A10 == null) {
                C46436Dey.A00(this.A00, AnonymousClass05K.A01, "method: maybeLogEligibilityWaterfallStep promotion id is null", (Throwable) null);
                return;
            }
            1Ln r1 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, this.A00), "qp_eligibility_waterfall"), 359);
            r1.A0Q("promotion_id", A10);
            r1.A0R("step", str);
            r1.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A00.A03(DcZ.class);
    }

    public DcZ(UserSession userSession) {
        this.A00 = userSession;
    }
}
