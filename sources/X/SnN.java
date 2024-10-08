package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class SnN implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public boolean A02 = false;
    public 2IS A03 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A01);
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "OAuthAccountLinkingGetAccessToken", this.A00.getParamsCopy(), this.A03.getParamsCopy(), QU9.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_oauth_account_linking_create_access_token", AnonymousClass7TE.A1C());
    }
}
