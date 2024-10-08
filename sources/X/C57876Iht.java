package X;

/* renamed from: X.Iht  reason: case insensitive filesystem */
public final class C57876Iht implements Runnable {
    public final /* synthetic */ GFP A00;
    public final /* synthetic */ 0eP A01;

    public C57876Iht(GFP gfp, 0eP r2) {
        this.A00 = gfp;
        this.A01 = r2;
    }

    public final void run() {
        GFP gfp = this.A00;
        0eP r0 = this.A01;
        int A0B = C51970G9q.A0B(r0);
        C51969G9p.A0A(r0);
        if (gfp instanceof GFO) {
            GFO gfo = (GFO) gfp;
            gfo.A0I.A0B(A0B);
            2V5 r1 = gfo.A0A;
            if (C51970G9q.A09(r1) != A0B) {
                C51967G9n.A1A(r1, A0B);
                return;
            }
            return;
        }
        C54588HJx hJx = (C54588HJx) gfp;
        C54588HJx.A00((C53372Gmw) C51966G9m.A19(hJx.A03.A00, A0B), hJx);
        2V5 r12 = hJx.A04;
        if (C51970G9q.A09(r12) != A0B) {
            C51967G9n.A1A(r12, A0B);
            C54588HJx.A01(hJx, A0B);
        }
    }
}
