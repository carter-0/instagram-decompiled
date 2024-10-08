package X;

public final class K0U extends UV8 {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K0U) && this.A00 == ((K0U) obj).A00);
    }

    public final String toString() {
        return 002.A0K("FullBattery(batteryPercent=", ')', this.A00);
    }

    public K0U(long j) {
        super(1, AnonymousClass05K.A00);
        this.A00 = j;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public K0U() {
        this(100);
    }
}
