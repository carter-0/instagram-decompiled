package X;

public final class ONX {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONX) {
                ONX onx = (ONX) obj;
                if (this.A00 != onx.A00 || !0qQ.A0K(this.A01, onx.A01) || !0qQ.A0K(this.A02, onx.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, this.A00 * 31) + AnonymousClass7TG.A0E(this.A02);
    }

    public ONX(int i, String str, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ZeroHeadersHttpResponse(statusCode=");
        A1A.append(this.A00);
        A1A.append(", content=");
        A1A.append(this.A01);
        A1A.append(", errorMessage=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
