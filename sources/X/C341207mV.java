package X;

/* renamed from: X.7mV  reason: invalid class name and case insensitive filesystem */
public final class C341207mV implements C345237tA {
    public final /* synthetic */ C345227t8 A00;

    public final void EiW(C344847sW r1) {
    }

    public C341207mV(C345227t8 r1) {
        this.A00 = r1;
    }

    public final void Ddr(C344907sc r3) {
        if (r3.CAG() == C344877sZ.CONFIGURATION) {
            AVX avx = (AVX) r3;
            C345227t8 r1 = this.A00;
            synchronized (r1) {
                if (r1.A05) {
                    r1.A01 = avx.A00;
                }
            }
        }
    }
}
