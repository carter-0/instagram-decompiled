package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class DGA implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "GenAIImagineGenerateMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), C42228BVx.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "__typename", AnonymousClass7TE.A1C());
    }
}
