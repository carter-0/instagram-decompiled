package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.5A0  reason: invalid class name */
public final class AnonymousClass5A0 implements AnonymousClass39G {
    public 2IS A00 = new 2IS();
    public boolean A01 = false;
    public 2IS A02 = new 2IS();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A01);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AnonymousClass1vS.A00(), "AutofillMigrateCreditCardMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), AnonymousClass5A1.class, true, (PandoRealtimeInfoJNI) null, 64, (String) null, "migrate_autofill_key", new ArrayList());
    }
}
