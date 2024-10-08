package X;

/* renamed from: X.4Tz  reason: invalid class name and case insensitive filesystem */
public final class C265474Tz {
    public final double A00;
    public final int A01;
    public final long A02;
    public final C265454Tx A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(this.A00);
        sb.append(", bwe delta=");
        sb.append(Math.round(((double) this.A02) - this.A03.A00));
        sb.append(" (C");
        sb.append(this.A01);
        sb.append(")}");
        return sb.toString();
    }

    public C265474Tz(C265454Tx r1, double d, int i, long j) {
        this.A02 = j;
        this.A01 = i;
        this.A00 = d;
        this.A03 = r1;
    }
}
