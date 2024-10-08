package X;

import androidx.fragment.app.Fragment;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7wL  reason: invalid class name and case insensitive filesystem */
public final class C347147wL {
    public C347327wd A00;
    public C363528js A01;
    public final Fragment A02;
    public final UserSession A03;

    public C347147wL(Fragment fragment, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragment, 2);
        this.A03 = userSession;
        this.A02 = fragment;
    }

    public static final boolean A00(C347147wL r3) {
        C347327wd r0 = r3.A00;
        if (r0 != null && r0.A00) {
            UserSession userSession = r3.A03;
            if (!C363018iu.A00(userSession) || !AnonymousClass8PU.A07(userSession) || !182.A06(0Tu.A05, userSession, 2342155841009878291L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A01() {
        UserSession userSession = this.A03;
        if (!182.A06(0Tu.A05, userSession, 36312831796708629L)) {
            return;
        }
        if ("fx_ig4a_cross_posting_story_is_upsell_universe".length() <= 0) {
            throw new IllegalStateException("qeUniverse parameter can't be empty");
        } else if ("is_in_holdout".length() > 0) {
            2IS r4 = new 2IS();
            2IS r3 = new 2IS();
            r4.A04("qe_universe", "fx_ig4a_cross_posting_story_is_upsell_universe");
            r4.A04("param_name", "is_in_holdout");
            r4.A02("default_value", false);
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGFXGrowthLogExposureQEBoolParamMutation", r4.getParamsCopy(), r3.getParamsCopy(), C347237wU.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_growth_qe_bool_param_log_exposure", new ArrayList());
            1vm.A01(userSession).ATL(C347287wZ.A00, C347277wY.A00, pandoGraphQLRequest);
        } else {
            throw new IllegalStateException("paramName parameter can't be empty");
        }
    }
}
