package X;

/* renamed from: X.IjE  reason: case insensitive filesystem */
public final class C57959IjE implements Runnable {
    public final /* synthetic */ C74302Psc A00;
    public final /* synthetic */ C53007Ggy A01;
    public final /* synthetic */ H1K A02;
    public final /* synthetic */ H17 A03;

    public C57959IjE(C74302Psc psc, C53007Ggy ggy, H1K h1k, H17 h17) {
        this.A03 = h17;
        this.A01 = ggy;
        this.A00 = psc;
        this.A02 = h1k;
    }

    public final void run() {
        H17 h17 = this.A03;
        C53007Ggy ggy = this.A01;
        h17.A00(ggy.A0B);
        h17.A00 = this.A00;
        H1K h1k = this.A02;
        h1k.A00(ggy.A0A);
        ((C52991Ggi) h1k.A0D.getValue()).A00 = new C57036IMc(ggy);
    }
}
