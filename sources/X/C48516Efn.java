package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.Efn  reason: case insensitive filesystem */
public abstract class C48516Efn {
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        Object A03 = r15.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.Boolean");
        UserSession A0W = DbX.A0W(r14);
        1Av A00 = 1Au.A00(A0W);
        DbS.A1a(A00, A03, A00.A0H, 1Av.A8a, 367);
        DbZ.A1M(new PandoGraphQLRequest(C41845B3m.A05(), "BasicAdsOptInQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C228992mf.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_user_basic_ads_preferences", AnonymousClass7TE.A1C()), new H50(A0W, 1), A0W);
        return null;
    }
}
