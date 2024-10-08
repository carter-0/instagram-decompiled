package X;

/* renamed from: X.34S  reason: invalid class name */
public final class AnonymousClass34S {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass34S)) {
            return false;
        }
        AnonymousClass34S r4 = (AnonymousClass34S) obj;
        if (!02S.A00(r4.A00, this.A00) || !02S.A00(r4.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.A00;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.A01;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass34S(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
