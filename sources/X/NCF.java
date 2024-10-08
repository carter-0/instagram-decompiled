package X;

public final class NCF extends C70404O5h {
    public final boolean A00;

    public NCF(boolean z) {
        super(true);
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NCF) && this.A00 == ((NCF) obj).A00);
    }

    public final String toString() {
        return 002.A0L("Ended(wasDeclined=", ')', this.A00);
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }
}
