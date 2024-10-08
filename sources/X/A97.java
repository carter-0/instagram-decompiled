package X;

public final class A97 {
    public int A00 = -1;
    public C344957sh[] A01;
    public final C344997sl A02 = ASO.A00;
    public final A3U A03;
    public final C40169AUj A04 = new C40169AUj(this);
    public final C340307l3 A05;
    public volatile boolean A06;

    public final void A00() {
        if (!this.A06) {
            C340307l3 r0 = this.A05;
            C40169AUj aUj = this.A04;
            r0.EEJ(aUj);
            synchronized (aUj) {
                if (aUj.A00 != null) {
                    aUj.A00 = null;
                    aUj.A01 = false;
                }
            }
            return;
        }
        C40169AUj aUj2 = this.A04;
        synchronized (aUj2) {
            aUj2.A01 = true;
        }
        this.A05.A9b(aUj2, 1);
    }

    public A97(C340307l3 r2, A3U a3u) {
        this.A05 = r2;
        this.A03 = a3u;
    }
}
