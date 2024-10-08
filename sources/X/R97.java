package X;

public final class R97 extends C8804RAf {
    public final /* synthetic */ 1QS A00;
    public final /* synthetic */ 1QU A01;
    public final /* synthetic */ C12773T6h A02;
    public final /* synthetic */ C10626RvK A03;
    public final /* synthetic */ AnonymousClass0vF A04;

    public R97(1QS r1, 1QU r2, C12773T6h t6h, C10626RvK rvK, AnonymousClass0vF r5) {
        this.A03 = rvK;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = t6h;
        this.A04 = r5;
    }

    public final void run() {
        C13667Teb teb = this.A03.A00;
        1QS r3 = this.A00;
        1QU r2 = this.A01;
        C12773T6h t6h = this.A02;
        t6h.A00 = teb.ExU(r3, r2, t6h, this.A04);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LigerExecutorDispatcher: ");
        return AnonymousClass7TF.A0i(this.A00.A09, A1A);
    }
}
