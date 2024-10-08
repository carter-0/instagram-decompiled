package X;

public final class S5U {
    public final Class A00;
    public final String A01;

    public S5U(String str, Class cls) {
        0qQ.A0B(cls, 2);
        this.A01 = str;
        this.A00 = cls;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S5U) {
                S5U s5u = (S5U) obj;
                if (!0qQ.A0K(this.A01, s5u.A01) || !0qQ.A0K(this.A00, s5u.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FieldCacheKey(fieldName=");
        A1A.append(this.A01);
        A1A.append(", clazz=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
