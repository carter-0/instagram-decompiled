package X;

/* renamed from: X.WpP  reason: case insensitive filesystem */
public final class C20328WpP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ LPE A03;

    public C20328WpP(LPE lpe, int i, int i2, int i3) {
        this.A03 = lpe;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final void run() {
        LPE lpe = this.A03;
        if (lpe != null) {
            lpe.A0E(this.A00);
        }
    }
}
