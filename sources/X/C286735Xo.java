package X;

/* renamed from: X.5Xo  reason: invalid class name and case insensitive filesystem */
public final class C286735Xo implements C286605Xb {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C286735Xo) && 0qQ.A0K(this.A00, ((C286735Xo) obj).A00));
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
        sb.append("StaticValueHolder(value=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C286735Xo(Object obj) {
        this.A00 = obj;
    }

    public final Object E6r(AnonymousClass5RM r2) {
        return this.A00;
    }
}
