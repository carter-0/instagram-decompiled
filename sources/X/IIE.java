package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class IIE implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public 2IS A06 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A03);
        17k.A0E(this.A04);
        17k.A0E(this.A01);
        17k.A0E(this.A02);
        return new PandoGraphQLRequest(C41845B3m.A06(this.A05), "MetaAIFeedbackMutation", this.A00.getParamsCopy(), this.A06.getParamsCopy(), C7707QTw.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_meta_ai_intents_feedback", AnonymousClass7TE.A1C());
    }
}
