package X;

/* renamed from: X.8kk  reason: invalid class name and case insensitive filesystem */
public final class C364028kk implements C364018kj {
    public final /* synthetic */ C345387tP A00;
    public final /* synthetic */ C364018kj A01;

    public C364028kk(C345387tP r1, C364018kj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void D16() {
        this.A01.D16();
    }

    public final void DCn(Exception exc) {
        C345387tP r0 = this.A00;
        C344037rD r4 = r0.A00;
        C363808kN.A00(new C391719tX(10015, (Throwable) exc), r4, "BasicPhotoCaptureCoordinator", "high", r0.hashCode());
        r4.Ew8("OneCamera", exc, false);
        this.A01.DCn(exc);
    }

    public final void DX5(C363858kS r2) {
        this.A01.DX5(r2);
    }

    public final void DaE(float f) {
        this.A01.DaE(f);
    }

    public final void DsK(C363858kS r4) {
        C345387tP r0 = this.A00;
        C363808kN.A01(r0.A00, "BasicPhotoCaptureCoordinator", r0.hashCode());
        this.A01.DsK(r4);
    }
}
