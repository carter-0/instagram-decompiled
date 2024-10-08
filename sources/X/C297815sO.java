package X;

/* renamed from: X.5sO  reason: invalid class name and case insensitive filesystem */
public final class C297815sO extends C239803Ii {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C297815sO) && 0qQ.A0K(this.A00, ((C297815sO) obj).A00));
    }

    public final int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure(error=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C297815sO(Object obj) {
        this.A00 = obj;
    }
}
