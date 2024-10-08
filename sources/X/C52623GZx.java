package X;

/* renamed from: X.GZx  reason: case insensitive filesystem */
public final class C52623GZx implements C305286Hh {
    public final GZF A00;
    public final int A01;

    public final int B67() {
        return Math.max(0, this.A00.A02 - this.A01);
    }

    public final boolean BCT() {
        return AnonymousClass7TE.A1b(C51970G9q.A0Q(this.A00.A0C).A0F);
    }

    public final int BLE() {
        GZF gzf = this.A00;
        return Math.min(gzf.A04() - 1, ((C52640GaE) ((JLG) 00k.A0K(C51970G9q.A0Q(gzf.A0C).A0F))).A03 + this.A01);
    }

    public final void ECv() {
        AnonymousClass5R7 r0 = (AnonymousClass5R7) this.A00.A0W.getValue();
        if (r0 != null) {
            r0.AWL();
        }
    }

    public final int getItemCount() {
        return this.A00.A04();
    }

    public C52623GZx(GZF gzf, int i) {
        this.A00 = gzf;
        this.A01 = i;
    }
}
