package X;

/* renamed from: X.Pas  reason: case insensitive filesystem */
public final class C73333Pas implements Runnable {
    public final /* synthetic */ OVF A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ 0sP A02;

    public C73333Pas(OVF ovf, C62320sa r2, 0sP r3) {
        this.A00 = ovf;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        OVF ovf = this.A00;
        OVF.A00(ovf, this.A01);
        N4R n4r = ovf.A00;
        if (n4r != null) {
            this.A02.invoke(n4r);
        }
    }
}
