package X;

/* renamed from: X.Pa6  reason: case insensitive filesystem */
public final class C73288Pa6 implements Runnable {
    public final /* synthetic */ 1NU A00;
    public final /* synthetic */ 1GK A01;
    public final /* synthetic */ C70416O5t A02;

    public C73288Pa6(1NU r1, 1GK r2, C70416O5t o5t) {
        this.A02 = o5t;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        1GK r1 = this.A01;
        try {
            C70416O5t o5t = this.A02;
            o5t.A00.A0A(this.A00.then(r1));
        } catch (C69544Nno e) {
            this.A02.A00.A09(e);
        } catch (Exception e2) {
            if (!(e2 instanceof RuntimeException)) {
                this.A02.A00.A09(e2);
                return;
            }
            throw e2;
        }
    }
}
