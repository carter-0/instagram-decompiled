package X;

/* renamed from: X.AoU  reason: case insensitive filesystem */
public final class C41108AoU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AU2 A02;

    public C41108AoU(AU2 au2, int i, int i2) {
        this.A02 = au2;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        C345657ts r2 = this.A02.A00;
        C39904AIm aIm = r2.A00;
        if (aIm.A0C.isEmpty() && aIm.A0D.isEmpty()) {
            r2.Ef7(this.A01, this.A00);
        }
        int i = this.A01;
        int i2 = this.A00;
        A3D a3d = r2.A08;
        if (C39904AIm.A03(aIm)) {
            C39904AIm.A00(a3d, aIm, i, i2);
        } else {
            aIm.A06.post(new C41195Apt(a3d, aIm, i, i2));
        }
    }
}
