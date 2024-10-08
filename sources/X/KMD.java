package X;

public final class KMD extends L40 {
    public final int A00;

    public KMD(int i) {
        super(3, String.valueOf(3));
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KMD) && this.A00 == ((KMD) obj).A00);
    }

    public final int hashCode() {
        return this.A00 + 93;
    }
}
