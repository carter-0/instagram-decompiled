package X;

public final class ONM {
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONM) {
                ONM onm = (ONM) obj;
                if (!0qQ.A0K(this.A01, onm.A01) || !0qQ.A0K(this.A00, onm.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public ONM(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FieldState(id=");
        A1A.append(this.A01);
        A1A.append(", value=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
