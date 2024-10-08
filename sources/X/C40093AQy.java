package X;

/* renamed from: X.AQy  reason: case insensitive filesystem */
public final class C40093AQy implements C41808B1n {
    public final /* synthetic */ AH4 A00;

    public C40093AQy(AH4 ah4) {
        this.A00 = ah4;
    }

    public final void Css(String str, Throwable th) {
        B2N b2n = this.A00.A03;
        if (b2n != null) {
            b2n.onFailure(th);
        }
    }

    public final void Cst(String str) {
        B2N b2n = this.A00.A03;
        if (b2n != null) {
            b2n.Doe(str);
        }
    }
}
