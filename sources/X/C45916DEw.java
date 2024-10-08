package X;

/* renamed from: X.DEw  reason: case insensitive filesystem */
public final class C45916DEw implements 2Kw {
    public final /* synthetic */ 1P0 A00;

    public C45916DEw(1P0 r1) {
        this.A00 = r1;
    }

    public final void invoke(Throwable th) {
        0KC.A0F("CommerceCartAddProductToCartController", "Failed to request CommerceCartGlobalCartQuery", th);
        1P0 r1 = this.A00;
        0qQ.A0A(th);
        r1.onFail(new C268664dn(th));
    }
}
