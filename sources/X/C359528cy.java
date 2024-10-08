package X;

/* renamed from: X.8cy  reason: invalid class name and case insensitive filesystem */
public final class C359528cy implements AnonymousClass2gO {
    public final /* synthetic */ C359318cb A00;

    public C359528cy(C359318cb r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        float floatValue;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C359318cb r0 = this.A00;
        C3506885u r1 = r0.A0k;
        if (booleanValue) {
            floatValue = 0.0f;
        } else {
            floatValue = ((Number) r0.A0r.A01.A0n.getValue()).floatValue();
        }
        r1.Eqq(floatValue);
    }
}
