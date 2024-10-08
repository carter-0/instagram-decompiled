package X;

/* renamed from: X.8RJ  reason: invalid class name */
public final class AnonymousClass8RJ extends C361278fx {
    public final Object A00;

    public AnonymousClass8RJ(Object obj) {
        super(2, obj);
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8RJ) && 0qQ.A0K(this.A00, ((AnonymousClass8RJ) obj).A00));
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
        sb.append("LoadingWithData(data=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
