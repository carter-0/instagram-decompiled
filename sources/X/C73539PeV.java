package X;

/* renamed from: X.PeV  reason: case insensitive filesystem */
public final class C73539PeV implements C59628JQw {
    public 0sP A00;
    public final C59520Ya A01;
    public final C59520Ya A02;
    public final C59520Ya A03;

    public final void EUO(0sP r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final 0sP Ay2() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C62320sa B9B() {
        return (C62320sa) this.A01;
    }

    public final /* bridge */ /* synthetic */ 0sP Bm5() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ 0sP C2L() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.PgJ, X.0Ya] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.PgV, X.0Ya] */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.PgW, X.0Ya] */
    public C73539PeV(0r1 r14, 0rm r15, 0rm r16, 0rm r17, 0rm r18) {
        this.A01 = new C73584PgJ(r14, r15);
        0rm r3 = r16;
        0rm r4 = r17;
        0rm r5 = r18;
        this.A00 = new C73596PgW(r14, r15, r3, r4, r5, 0);
        this.A03 = new C73595PgV(r14, r4, r5);
        this.A02 = new C73596PgW(r14, r3, r15, r4, r5, 1);
    }
}
