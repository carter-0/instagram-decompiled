package X;

public final class EKX extends C48174EaG {
    public final String A00;

    public EKX(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EKX) && 0qQ.A0K(this.A00, ((EKX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
