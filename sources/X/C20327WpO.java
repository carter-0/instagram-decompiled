package X;

/* renamed from: X.WpO  reason: case insensitive filesystem */
public final class C20327WpO implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C313316gF A02;
    public final /* synthetic */ VQG A03;

    public C20327WpO(C313316gF r1, VQG vqg, int i, int i2) {
        this.A03 = vqg;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public final void run() {
        VQG vqg = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        C313286gC r0 = vqg.A00;
        C255773uh r1 = r0.A00;
        if (r1 != null) {
            r0.A04.A0R(r1, i, i2);
        }
        this.A02.A01 = false;
    }
}
