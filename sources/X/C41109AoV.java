package X;

/* renamed from: X.AoV  reason: case insensitive filesystem */
public final class C41109AoV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C39904AIm A02;

    public C41109AoV(C39904AIm aIm, int i, int i2) {
        this.A02 = aIm;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        C39904AIm aIm = this.A02;
        aIm.A01 = this.A01;
        aIm.A00 = this.A00;
    }
}
