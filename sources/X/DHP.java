package X;

import android.app.Activity;
import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

public final class DHP implements MVB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;

    public final void onShow() {
    }

    public final void onTextClick(View view) {
        0qQ.A0B(view, 0);
        onButtonClick(view);
    }

    public DHP(Activity activity, UserSession userSession, 1Xj r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = activity;
    }

    public final void onButtonClick(View view) {
        I5X.A00(this.A00, this.A01, this.A02);
    }

    public final void onDismiss() {
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, this.A02.A2n(), "media_id");
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        C41848B3p.A1L(A03, A04);
        UserSession userSession = this.A01;
        C45925DFf dFf = C45925DFf.A00;
        0qQ.A0B(dFf, 2);
        1vm.A01(userSession).ATL((2Kw) null, dFf, new PandoGraphQLRequest(C41845B3m.A05(), "OpenCarouselDismissPendingMediaProfileBannerMutation", A04.getParamsCopy(), A042.getParamsCopy(), C7O.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_dismiss_open_carousel_pending_media_profile_banner", AnonymousClass7TE.A1C()));
    }
}
