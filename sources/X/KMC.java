package X;

public final class KMC extends L40 {
    public final int A00;

    public KMC(int i) {
        super(0, String.valueOf(0));
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KMC) && this.A00 == ((KMC) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }
}
