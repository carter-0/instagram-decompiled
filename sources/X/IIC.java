package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class IIC implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public boolean A02 = false;
    public 2IS A03 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A01);
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "MetaAIWriteWithAIGenerateSuggestionMutation", this.A00.getParamsCopy(), this.A03.getParamsCopy(), C42234BWd.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_metagen_ai_write_with_ai_suggestion", AnonymousClass7TE.A1C());
    }
}
