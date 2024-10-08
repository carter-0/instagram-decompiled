package X;

/* renamed from: X.3Fj  reason: invalid class name and case insensitive filesystem */
public final class C239203Fj extends 1GK {
    public final /* synthetic */ 1NU A00;
    public final /* synthetic */ 1GK A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C239203Fj(1NU r1, 1GK r2, int i, int i2, boolean z, boolean z2) {
        super(i, i2, z, z2);
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        Exception e;
        1GK r2 = this.A01;
        r2.run();
        if (!r2.A0D()) {
            try {
                1NU r1 = this.A00;
                Object A07 = r2.A07();
                0qQ.A0A(A07);
                A0A(r1.then(A07));
            } catch (Exception e2) {
                e = e2;
                if (e instanceof RuntimeException) {
                    throw e;
                }
            }
        } else {
            e = r2.A06();
            A09(e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HttpEngine");
        sb.append(this.A01);
        return sb.toString();
    }
}
