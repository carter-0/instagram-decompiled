package X;

public final class H9V extends HPS {
    public final String A00;

    public H9V(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H9V) && 0qQ.A0K(this.A00, ((H9V) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
