package X;

public final class SJ7 {
    public static final SJ7 A02 = new SJ7(0, 0);
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SJ7 sj7 = (SJ7) obj;
            if (!(this.A01 == sj7.A01 && this.A00 == sj7.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return 002.A0t("[timeUs=", ", position=", "]", this.A01, this.A00);
    }

    public SJ7(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
