package X;

public final class S5t {
    public Class A00;
    public Class A01;
    public Class A02;

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                S5t s5t = (S5t) obj;
                if (this.A00.equals(s5t.A00) && this.A01.equals(s5t.A01)) {
                    Class cls = this.A02;
                    Class cls2 = s5t.A02;
                    if (cls == null) {
                        equals = DbW.A1a(cls2);
                    } else {
                        equals = cls.equals(cls2);
                    }
                    if (!equals) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)) + C51971G9r.A0E(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MultiClassKey{first=");
        A1A.append(this.A00);
        A1A.append(C66579MXk.A00(82));
        return Pxg.A0p(this.A01, A1A);
    }
}
