package X;

/* renamed from: X.Apt  reason: case insensitive filesystem */
public final class C41195Apt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ A3D A02;
    public final /* synthetic */ C39904AIm A03;

    public C41195Apt(A3D a3d, C39904AIm aIm, int i, int i2) {
        this.A03 = aIm;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = a3d;
    }

    public final void run() {
        C39904AIm.A00(this.A02, this.A03, this.A01, this.A00);
    }
}
