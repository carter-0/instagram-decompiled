package X;

public final class GIM {
    public int A00 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((GIM) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }
}
