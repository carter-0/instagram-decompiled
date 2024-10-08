package X;

public final class GQM {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof GQM) || j != ((GQM) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public final String toString() {
        return 002.A0K("PointerId(value=", ')', this.A00);
    }

    public /* synthetic */ GQM(long j) {
        this.A00 = j;
    }
}
