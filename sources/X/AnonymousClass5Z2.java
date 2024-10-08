package X;

/* renamed from: X.5Z2  reason: invalid class name */
public final class AnonymousClass5Z2 {
    public final AnonymousClass5Z3 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5Z2) && 0qQ.A0K(this.A00, ((AnonymousClass5Z2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlatformTextStyle(spanStyle=");
        sb.append((Object) null);
        sb.append(", paragraphSyle=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass5Z2(AnonymousClass5Z3 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5Z3, java.lang.Object] */
    public AnonymousClass5Z2() {
        this(new Object());
    }
}
