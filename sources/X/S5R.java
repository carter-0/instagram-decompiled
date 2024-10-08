package X;

public final class S5R {
    public Object A00;
    public Object A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass34S)) {
            return false;
        }
        AnonymousClass34S r4 = (AnonymousClass34S) obj;
        Object obj2 = r4.A00;
        Object obj3 = this.A00;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = r4.A01;
        Object obj5 = this.A01;
        if (obj4 == obj5 || (obj4 != null && obj4.equals(obj5))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00) ^ AnonymousClass7TE.A0L(this.A01);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Pair{");
        A1A.append(this.A00);
        A1A.append(" ");
        return C66582MXn.A0v(this.A01, A1A);
    }
}
