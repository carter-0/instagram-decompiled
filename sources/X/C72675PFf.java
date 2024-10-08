package X;

/* renamed from: X.PFf  reason: case insensitive filesystem */
public final class C72675PFf implements C46199DQb {
    public final /* synthetic */ C314436iG A00;

    public C72675PFf(C314436iG r1) {
        this.A00 = r1;
    }

    public final void DOY(C257443xP r4) {
        if (r4.A06()) {
            C314436iG r2 = this.A00;
            N3L n3l = (N3L) r4.A03();
            r2.A05 = n3l;
            if (n3l != null) {
                r2.A0V.runOnUiThread(new C73110PWr(r2));
            }
        }
    }
}
