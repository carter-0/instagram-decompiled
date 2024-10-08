package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class IID implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;
    public 2IS A04 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A03);
        17k.A0E(this.A02);
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "MetaAIIntentCardNuxImpresionMutation", this.A00.getParamsCopy(), this.A04.getParamsCopy(), BWT.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_create_genai_meta_ai_intent_card_user_status", AnonymousClass7TE.A1C());
    }
}
