package X;

public final class NVY extends P8Y implements C232262tL {
    public final C254703su A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NVY(C254703su r2, String str) {
        super(r2, str);
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NVY) {
                NVY nvy = (NVY) obj;
                if (!0qQ.A0K(this.A00, nvy.A00) || !0qQ.A0K(this.A01, nvy.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A0h();
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
