package X;

/* renamed from: X.PaU  reason: case insensitive filesystem */
public final class C73309PaU implements Runnable {
    public final /* synthetic */ NKE A00;
    public final /* synthetic */ Dc2 A01;
    public final /* synthetic */ boolean A02;

    public C73309PaU(NKE nke, Dc2 dc2, boolean z) {
        this.A01 = dc2;
        this.A02 = z;
        this.A00 = nke;
    }

    public final void run() {
        JTQ.A1F(1xC.A01, this.A01);
        if (this.A02) {
            DbX.A1J(this.A00);
        }
    }
}
