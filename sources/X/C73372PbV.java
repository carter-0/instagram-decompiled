package X;

/* renamed from: X.PbV  reason: case insensitive filesystem */
public final class C73372PbV implements Runnable {
    public final /* synthetic */ C69486NmU A00;
    public final /* synthetic */ C69028NdD A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C73372PbV(C69486NmU nmU, C69028NdD ndD, boolean z, boolean z2) {
        this.A01 = ndD;
        this.A02 = z;
        this.A00 = nmU;
        this.A03 = z2;
    }

    public final void run() {
        C69028NdD ndD = this.A01;
        boolean z = this.A02;
        ndD.A0P(new PH1(this.A00, new GA1(34, ndD, z), new C59100J6i(ndD, 46), z, this.A03));
    }
}
