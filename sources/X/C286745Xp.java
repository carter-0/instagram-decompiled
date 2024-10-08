package X;

/* renamed from: X.5Xp  reason: invalid class name and case insensitive filesystem */
public final class C286745Xp implements C286605Xb {
    public final 0sP A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C286745Xp) && 0qQ.A0K(this.A00, ((C286745Xp) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComputedValueHolder(compute=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final Object E6r(AnonymousClass5RM r2) {
        return this.A00.invoke(r2);
    }

    public C286745Xp(0sP r1) {
        this.A00 = r1;
    }
}
