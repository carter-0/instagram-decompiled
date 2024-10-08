package X;

public final class R98 extends C8804RAf {
    public boolean A00;
    public final C12773T6h A01;
    public final 1QS A02;
    public final 1QU A03;
    public final AnonymousClass0vF A04;
    public final /* synthetic */ C10626RvK A05;

    public final synchronized void run() {
        if (!this.A00) {
            C13667Teb teb = this.A05.A00;
            1QS r3 = this.A02;
            1QU r2 = this.A03;
            C12773T6h t6h = this.A01;
            t6h.A00 = teb.ExU(r3, r2, t6h, this.A04);
        }
    }

    public R98(1QS r1, 1QU r2, C12773T6h t6h, C10626RvK rvK, AnonymousClass0vF r5) {
        this.A05 = rvK;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = t6h;
        this.A04 = r5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LigerExecutorDispatcher: ");
        return AnonymousClass7TF.A0i(this.A02.A09, A1A);
    }
}
