package X;

/* renamed from: X.78B  reason: invalid class name */
public final class AnonymousClass78B extends AnonymousClass78C {
    public final AnonymousClass7L3 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass78B) && 0qQ.A0K(this.A00, ((AnonymousClass78B) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Single(videoPlayer=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass78B(AnonymousClass7L3 r1) {
        this.A00 = r1;
    }
}
