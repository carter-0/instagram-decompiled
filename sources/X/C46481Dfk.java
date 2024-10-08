package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsQueryResponseImpl;

/* renamed from: X.Dfk  reason: case insensitive filesystem */
public final class C46481Dfk extends C252733pa {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = C46573DhF.A00(this, 0eO.A02, 38);
    public final 05G A02 = 106.A01((Object) null);
    public final 05G A03 = 106.A01((Object) null);
    public final 05G A04 = 106.A01((Object) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46481Dfk(UserSession userSession) {
        super(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass43D.A00(989658741));
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00() {
        1vn A012 = 1vm.A01(this.A00);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGDirectPrivacySettingsQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), IGDirectPrivacySettingsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "viewer", AnonymousClass7TE.A1C());
        A012.ATL(C46569DhB.A00, new FSC(this, 15), pandoGraphQLRequest);
    }
}
