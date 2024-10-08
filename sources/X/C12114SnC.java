package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.SnC  reason: case insensitive filesystem */
public final class C12114SnC implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "FBPayGetServerEncryptionKeyMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), C42184BUf.class, true, (PandoRealtimeInfoJNI) null, 12, "input", (String) null, AnonymousClass7TE.A1C());
    }
}
