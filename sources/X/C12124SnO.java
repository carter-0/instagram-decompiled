package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.SnO  reason: case insensitive filesystem */
public final class C12124SnO implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;
    public 2IS A04 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A01);
        17k.A0E(this.A02);
        return new PandoGraphQLRequest(C41845B3m.A06(this.A03), "AddCreditCardsToAutofillMutation", this.A00.getParamsCopy(), this.A04.getParamsCopy(), C7810QXv.class, true, (PandoRealtimeInfoJNI) null, 64, (String) null, "add_multiple_credit_cards_proof_to_autofill", AnonymousClass7TE.A1C());
    }
}
