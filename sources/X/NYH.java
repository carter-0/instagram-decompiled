package X;

public final class NYH extends AnonymousClass7FV implements C232262tL, AnonymousClass7FW {
    public final N4R A00;
    public final AnonymousClass79c A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYH) {
                NYH nyh = (NYH) obj;
                if (!0qQ.A0K(this.A01, nyh.A01) || !0qQ.A0K(this.A00, nyh.A00) || !0qQ.A0K(this.A02, nyh.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass5FV BeQ() {
        return this.A01.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NYH(N4R n4r, AnonymousClass79c r4) {
        super(r4.A02);
        String CBF = r4.CBF();
        0qQ.A0B(CBF, 3);
        this.A01 = r4;
        this.A00 = n4r;
        this.A02 = CBF;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
