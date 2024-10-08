package X;

/* renamed from: X.Fqw  reason: case insensitive filesystem */
public final class C51241Fqw implements Runnable {
    public final /* synthetic */ FGH A00;

    public C51241Fqw(FGH fgh) {
        this.A00 = fgh;
    }

    public final void run() {
        C49575Eyk eyk = this.A00.A01;
        eyk.A02.post(new C51158FpU(eyk));
    }
}
