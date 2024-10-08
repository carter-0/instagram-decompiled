package X;

import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.FYl  reason: case insensitive filesystem */
public final class C50331FYl implements AnonymousClass0lh {
    public final UserSession A00;
    public volatile Boolean A01;
    public volatile Boolean A02;

    public final void A00(Context context, String str, String str2, Map map, C62320sa r25, boolean z) {
        C62320sa r3 = r25;
        if (this.A01 == null) {
            UserSession userSession = this.A00;
            if (DcS.A00(userSession, true)) {
                String str3 = str2;
                if (!str3.equals(C66579MXk.A00(574)) || DcS.A01(userSession, true)) {
                    1vn A012 = 1vm.A01(userSession);
                    2IS A04 = C41845B3m.A04();
                    2IS A042 = C41845B3m.A04();
                    A04.A01(C66579MXk.A00(137));
                    A04.A01(C66579MXk.A00(335));
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    FS6.A00(new FSJ(context, this, str, str3, map, r3, z), new PandoGraphQLRequest(DbU.A0J(A04, "business_ig_id", userSession.A06), C66579MXk.A00(202), A04.getParamsCopy(), A042.getParamsCopy(), C42705Bh2.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, C66579MXk.A00(414), A1C).setNetworkTimeoutSeconds(5).setMaxToleratedCacheAgeMs(0).setEnsureCacheWrite(false), A012, r3, 3);
                    return;
                }
            }
        }
        r3.invoke();
    }

    public final void A01(String str, String str2) {
        1vn A012 = 1vm.A01(this.A00);
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, str, "business_ig_id");
        0Df.A00(A03, str2, C66579MXk.A00(368));
        2IS A04 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "data"), "AdsEventSharingNoticeLogImpressionMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42703Bh0.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "xig_log_impression_for_biig_ads_event_sharing_notice", AnonymousClass7TE.A1C());
        A012.ATL(C50162FRu.A00, FSR.A00, pandoGraphQLRequest);
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C50331FYl.class);
    }

    public C50331FYl(UserSession userSession) {
        this.A00 = userSession;
    }
}
