package X;

/* renamed from: X.Xyu  reason: case insensitive filesystem */
public final class C22285Xyu implements AnonymousClass4TD {
    public final AnonymousClass4TD A00;
    public final long A01;

    public final boolean CaO() {
        return this.A00.CaO();
    }

    public final void Cnj() {
        this.A00.Cnj();
    }

    public final int E6J(AnonymousClass4PO r8, AnonymousClass4PQ r9, int i) {
        int E6J = this.A00.E6J(r8, r9, i);
        if (E6J == -4) {
            r9.A01 = Math.max(0, r9.A01 + this.A01);
        }
        return E6J;
    }

    public final int Evj(long j) {
        return this.A00.Evj(j - this.A01);
    }

    public C22285Xyu(AnonymousClass4TD r1, long j) {
        this.A00 = r1;
        this.A01 = j;
    }

    public final /* synthetic */ long C96(int i) {
        return -9223372036854775807L;
    }
}
