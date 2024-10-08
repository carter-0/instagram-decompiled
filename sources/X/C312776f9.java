package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.6f9  reason: invalid class name and case insensitive filesystem */
public final class C312776f9 implements AnonymousClass39G {
    public 2IS A00 = new 2IS();
    public 2IS A01 = new 2IS();

    public final /* bridge */ /* synthetic */ 1Ef build() {
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AnonymousClass1vS.A00(), "AREffectConsentStateQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C312786fA.class, false, PandoRealtimeInfoJNI.forLiveQuery("flm_ar_effect_consent_state"), 0, (String) null, "viewer", new ArrayList());
    }
}
