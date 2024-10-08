package X;

public final class NCE extends C70404O5h {
    public final boolean A00;

    public NCE(boolean z) {
        super(true);
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NCE) && this.A00 == ((NCE) obj).A00);
    }

    public final String toString() {
        return 002.A0L("Answered(withVideo=", ')', this.A00);
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }
}
