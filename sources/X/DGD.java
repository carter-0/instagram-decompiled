package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;

public final class DGD implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public 2IS A01 = C41845B3m.A04();
    public boolean A02 = false;

    public final void A00(ImmutableList immutableList) {
        this.A00.A05("model_request_metadatas", immutableList);
        this.A02 = AnonymousClass7TF.A1V(immutableList);
    }

    public final /* bridge */ /* synthetic */ 1Ef build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "NativeMLModelBatchedQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), BX2.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "aim_model_batched_manifest", AnonymousClass7TE.A1C());
    }
}
