package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.7we  reason: invalid class name and case insensitive filesystem */
public abstract class C347337we implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C347337we.class);
    public static final String __redex_internal_original_name = "FxIsUpsellEligibilityFetcher";

    public static void A00(UserSession userSession, C347377wi r6, C347347wf r7, String[] strArr, boolean z) {
        if (!(!2Lv.A00(userSession).A03(A00, "fx_growth_ig4a_is_eligibility_linkage_check"))) {
            C348157xy r4 = new C348157xy(userSession);
            02m r2 = r4.A00;
            r2.markerStart(857806587);
            r2.markerAnnotate(857806587, "flows", strArr);
            r2.markerAnnotate(857806587, "use_server_impressions", z);
            1vn A01 = 1vm.A01(userSession);
            1Ef maxToleratedCacheAgeMs = r7.A01.build().setMaxToleratedCacheAgeMs(0);
            A01.ATL(new C348187y1(r6, r4), new C348177y0(r6, r4), maxToleratedCacheAgeMs);
        }
    }
}
