package X;

public final class NYG extends AnonymousClass7FV implements C232262tL, AnonymousClass7FW {
    public final AnonymousClass79c A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NYG(AnonymousClass79c r2, String str) {
        super(r2.A02);
        0qQ.A0B(str, 2);
        this.A00 = r2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYG) {
                NYG nyg = (NYG) obj;
                if (!0qQ.A0K(this.A00, nyg.A00) || !0qQ.A0K(this.A01, nyg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
