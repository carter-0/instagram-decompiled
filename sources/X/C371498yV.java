package X;

/* renamed from: X.8yV  reason: invalid class name and case insensitive filesystem */
public final class C371498yV implements AnonymousClass6i7 {
    public final /* synthetic */ AnonymousClass6i7 A00;
    public final /* synthetic */ C314366i5 A01;
    public final /* synthetic */ C352728Ep A02;

    public C371498yV(AnonymousClass6i7 r1, C314366i5 r2, C352728Ep r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final boolean cancel() {
        C313096fr r1 = this.A01.A02;
        C352728Ep r4 = this.A02;
        C368758tH A002 = C313096fr.A00(r1, r4.A03);
        if (A002 != null) {
            C313096fr.A02(A002.onEvent(2, r4.A00, false));
        } else {
            C312156dv r3 = r1.A00;
            if (r3 != null) {
                r3.endCancel(r3.getInstanceIdWithString(16321564, r4.A00), "ARD Fetch Canceled");
            }
        }
        return this.A00.cancel();
    }
}
