package X;

public final class KVQ extends C62842KnI {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KVQ) && this.A00 == ((KVQ) obj).A00);
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public KVQ(boolean z) {
        this.A00 = z;
    }
}
