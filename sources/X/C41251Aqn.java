package X;

/* renamed from: X.Aqn  reason: case insensitive filesystem */
public final class C41251Aqn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ A3D A05;
    public final /* synthetic */ C39904AIm A06;

    public C41251Aqn(A3D a3d, C39904AIm aIm, int i, int i2, int i3, int i4, int i5) {
        this.A06 = aIm;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = a3d;
    }

    public final void run() {
        C39904AIm.A01(this.A05, this.A06, this.A01, this.A02, this.A00, this.A04, this.A03);
    }
}
