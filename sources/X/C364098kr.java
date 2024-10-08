package X;

/* renamed from: X.8kr  reason: invalid class name and case insensitive filesystem */
public final class C364098kr {
    public final /* synthetic */ C364088kq A00;

    public C364098kr(C364088kq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.7v2, java.lang.RuntimeException] */
    public final void A00(C364128ku r5) {
        C364088kq r3;
        if (r5.A04 == null && r5.A01 == null) {
            r3 = this.A00;
            r3.A09 = false;
            r3.A07 = new RuntimeException("Could not retrieve data from photo processor.");
        } else {
            r3 = this.A00;
            r3.A09 = true;
            r3.A08 = r5;
            if (r3.A05) {
                C343567qQ r2 = r3.A02;
                if (r2.A01[((r2.A00 + 3) - 1) % 3] == null) {
                    return;
                }
            }
        }
        r3.A03.A01();
    }
}
