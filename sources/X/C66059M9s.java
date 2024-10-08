package X;

/* renamed from: X.M9s  reason: case insensitive filesystem */
public final class C66059M9s implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C62680Kkg A01;
    public final /* synthetic */ C60107Jfn A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0sP A04;

    public C66059M9s(C62680Kkg kkg, C60107Jfn jfn, 0sP r3, 0sP r4, int i) {
        this.A01 = kkg;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = r4;
        this.A02 = jfn;
    }

    public final void run() {
        0sP r1;
        if (this.A01.A00()) {
            r1 = this.A03;
        } else {
            r1 = this.A04;
        }
        C51967G9n.A0w(this.A00, r1);
        this.A02.A00 = null;
    }
}
