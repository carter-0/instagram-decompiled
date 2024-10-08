package X;

public final class KY8 extends C64185LSs {
    public final C66460MSo A00;
    public final C62230ry A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KY8) {
                KY8 ky8 = (KY8) obj;
                if (!0qQ.A0K(this.A00, ky8.A00) || !0qQ.A0K(this.A01, ky8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + this.A01.hashCode();
    }

    public KY8(C66460MSo mSo, C62230ry r2) {
        this.A00 = mSo;
        this.A01 = r2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C64185LSs.A03(A1A, super.toString());
        return C64185LSs.A01(this.A00, A1A);
    }
}
