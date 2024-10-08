package X;

/* renamed from: X.SqG  reason: case insensitive filesystem */
public final class C12262SqG implements C13719Tfk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C12262SqG(AnonymousClass46Z r1, C12139Snk snk, int i) {
        this.A00 = i;
        this.A01 = snk;
        this.A02 = r1;
    }

    public final void DEe(Integer num) {
        Runnable tBk;
        int i = this.A00;
        C12139Snk snk = (C12139Snk) this.A01;
        if (i != 0) {
            tBk = new C12872TBm(this);
        } else {
            tBk = new C12870TBk(this);
        }
        C12139Snk.A03(snk, tBk);
    }

    public final void DoA(long j) {
        Runnable tBj;
        int i = this.A00;
        C12139Snk snk = (C12139Snk) this.A01;
        if (i != 0) {
            tBj = new C12871TBl(this);
        } else {
            tBj = new C12869TBj(this);
        }
        C12139Snk.A03(snk, tBj);
    }
}
