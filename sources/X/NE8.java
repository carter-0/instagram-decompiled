package X;

public final class NE8 extends C69671Npt {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NE8) && this.A00 == ((NE8) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public static NE8 A00(int i) {
        return new NE8(i);
    }

    public NE8(int i) {
        this.A00 = i;
    }
}
