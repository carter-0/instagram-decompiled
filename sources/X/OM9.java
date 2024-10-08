package X;

public final class OM9 {
    public final int A00;

    public OM9(int i) {
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OM9) && this.A00 == ((OM9) obj).A00);
    }

    public final int hashCode() {
        return ((((39122 + this.A00) * 31) + 128) * 31) + 64;
    }
}
