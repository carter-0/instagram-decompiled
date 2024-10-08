package X;

public final class ONW {
    public final C70831ONd A00;
    public final boolean A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONW) {
                ONW onw = (ONW) obj;
                if (this.A01 != onw.A01 || !0qQ.A0K(this.A02, onw.A02) || !0qQ.A0K(this.A00, onw.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C51965G9l.A05(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public ONW(String str, C70831ONd oNd, boolean z) {
        this.A01 = z;
        this.A02 = str;
        this.A00 = oNd;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ZeroHeadersConfigFetchResponse(isSuccess=");
        A1A.append(this.A01);
        A1A.append(", errorMessage=");
        A1A.append(this.A02);
        A1A.append(", data=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
