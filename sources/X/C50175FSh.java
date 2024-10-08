package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.FSh  reason: case insensitive filesystem */
public final class C50175FSh implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public 2IS A01 = C41845B3m.A04();
    public boolean A02 = false;

    public final void A00(String str) {
        this.A02 = C41848B3p.A1Z(this.A00, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
    }

    public final /* bridge */ /* synthetic */ 1Ef build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "ProfileUserInfo", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C2G.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_users__info", AnonymousClass7TE.A1C());
    }
}
