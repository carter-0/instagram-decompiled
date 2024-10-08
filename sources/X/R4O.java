package X;

public abstract class R4O extends T5K {
    public R5b A00;
    public boolean A01 = false;
    public final R5b A02;

    public final R5b A03() {
        if (!this.A01) {
            R5b r5b = this.A00;
            Pxg.A0U(r5b).ClW(r5b);
            this.A01 = true;
        }
        return this.A00;
    }

    public final void A04() {
        if (this.A01) {
            R5b r5b = (R5b) this.A00.A0K(AnonymousClass05K.A0N, (Object) null, (Object) null);
            Pxg.A0U(r5b).Co5(r5b, this.A00);
            this.A00 = r5b;
            this.A01 = false;
        }
    }

    public final /* bridge */ /* synthetic */ R5b Avt() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        R4O r4o = (R4O) this.A02.A0K(AnonymousClass05K.A0Y, (Object) null, (Object) null);
        r4o.A05(A03());
        return r4o;
    }

    public R4O(R5b r5b) {
        this.A02 = r5b;
        this.A00 = (R5b) r5b.A0K(AnonymousClass05K.A0N, (Object) null, (Object) null);
    }

    public final R5b A02() {
        R5b A03 = A03();
        if (R5b.A0C(A03)) {
            return A03;
        }
        throw new RuntimeException(C273654mx.A00(59));
    }

    public final void A05(R5b r5b) {
        A04();
        R5b r5b2 = this.A00;
        Pxg.A0U(r5b2).Co5(r5b2, r5b);
    }
}
