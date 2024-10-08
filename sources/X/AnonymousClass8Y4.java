package X;

/* renamed from: X.8Y4  reason: invalid class name */
public final class AnonymousClass8Y4 extends C361278fx {
    public final Object A00;

    public AnonymousClass8Y4(Object obj) {
        super(3, obj);
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8Y4) && 0qQ.A0K(this.A00, ((AnonymousClass8Y4) obj).A00));
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
        sb.append(C66579MXk.A00(102));
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
