package X;

/* renamed from: X.Pbf  reason: case insensitive filesystem */
public final class C73382Pbf implements Runnable {
    public final /* synthetic */ C69302Nj3 A00;
    public final /* synthetic */ C69294Niu A01;
    public final /* synthetic */ C69295Niv A02;
    public final /* synthetic */ C69295Niv A03;
    public final /* synthetic */ 0sJ A04;

    public C73382Pbf(C69302Nj3 nj3, C69294Niu niu, C69295Niv niv, C69295Niv niv2, 0sJ r5) {
        this.A04 = r5;
        this.A00 = nj3;
        this.A01 = niu;
        this.A03 = niv;
        this.A02 = niv2;
    }

    public final void run() {
        this.A04.invoke(this.A00, this.A01, this.A03, this.A02);
    }
}
