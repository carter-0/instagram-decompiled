package X;

public final class OMA {
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && DbY.A1b(this, obj) && this.A00 == ((OMA) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public OMA(boolean z) {
        this.A00 = z;
    }
}
