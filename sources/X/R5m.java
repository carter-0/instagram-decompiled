package X;

public abstract class R5m extends T5S {
    public R5n A00;
    public boolean A01 = false;
    public final R5n A02;

    public final void A00(R5n r5n) {
        if (this.A01) {
            R5n r5n2 = (R5n) this.A00.A03(AnonymousClass05K.A0N);
            SH6.A02.A00(r5n2).Co5(r5n2, this.A00);
            this.A00 = r5n2;
            this.A01 = false;
        }
        R5n r5n3 = this.A00;
        SH6.A02.A00(r5n3).Co5(r5n3, r5n);
    }

    public final /* bridge */ /* synthetic */ R5n Avs() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        R5m r5m = (R5m) this.A02.A03(AnonymousClass05K.A0Y);
        if (!this.A01) {
            R5n r5n = this.A00;
            SH6.A02.A00(r5n).ClW(r5n);
            this.A01 = true;
        }
        r5m.A00(this.A00);
        return r5m;
    }

    public R5m(R5n r5n) {
        this.A02 = r5n;
        this.A00 = (R5n) r5n.A03(AnonymousClass05K.A0N);
    }
}
