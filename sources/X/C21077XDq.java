package X;

/* renamed from: X.XDq  reason: case insensitive filesystem */
public final class C21077XDq implements C59660JSf {
    public final int A00;
    public final int A01;
    public final AnonymousClass64n A02;
    public final JNL A03;

    public final /* synthetic */ C287725af B1n(C287725af r7, C287725af r8, C287725af r9) {
        long AzR = AzR(r7, r8, r9);
        return this.A02.CDd(r7, r8, r9, AzR);
    }

    public final /* synthetic */ long AzR(C287725af r5, C287725af r6, C287725af r7) {
        return ((long) (this.A00 + this.A01)) * 1000000;
    }

    public final C287725af CDS(C287725af r7, C287725af r8, C287725af r9, long j) {
        return this.A02.CDS(r7, r8, r9, j);
    }

    public final C287725af CDd(C287725af r7, C287725af r8, C287725af r9, long j) {
        return this.A02.CDd(r7, r8, r9, j);
    }

    public C21077XDq(JNL jnl, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = jnl;
        this.A02 = new AnonymousClass64n(new C21078XDr(new C21079XDs(jnl, i, i2)));
    }

    public final int Aw8() {
        return this.A00;
    }

    public final int AzL() {
        return this.A01;
    }

    public final /* synthetic */ boolean CVL() {
        return false;
    }

    public C21077XDq() {
        this(C52518GVv.A01, 300, 0);
    }
}
