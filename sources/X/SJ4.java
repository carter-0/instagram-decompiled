package X;

public final class SJ4 {
    public static final SJ4 A02 = new SJ4(0, 0);
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SJ4 sj4 = (SJ4) obj;
            if (!(this.A01 == sj4.A01 && this.A00 == sj4.A00)) {
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

    public SJ4(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
