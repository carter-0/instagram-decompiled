package X;

public final class HJ2 extends HQB {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HJ2) && this.A00 == ((HJ2) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public HJ2(int i) {
        this.A00 = i;
    }
}
