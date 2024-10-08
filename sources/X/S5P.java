package X;

public final class S5P {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            S5P s5p = (S5P) obj;
            if (!(s5p.A01 == this.A01 && s5p.A00 == this.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return Pxh.A06(this.A00, ((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return 002.A0Y("PeriodicityInfo{repeatIntervalMillis=", ", flexIntervalMillis=", '}', this.A01, this.A00);
    }

    public S5P(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
