package X;

/* renamed from: X.5iw  reason: invalid class name and case insensitive filesystem */
public final class C292435iw extends AnonymousClass0T0 {
    public final float A00;
    public final long A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C292435iw) {
                C292435iw r8 = (C292435iw) obj;
                if (!(0qQ.A0K(this.A02, r8.A02) && this.A01 == r8.A01 && Float.compare(this.A00, r8.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScrollMetrics(scrollContext=");
        sb.append(this.A02);
        sb.append(", scrollDurationMs=");
        sb.append(this.A01);
        sb.append(", scrollDistanceDp=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.A01;
        return (((this.A02.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.A00);
    }

    public C292435iw(String str, float f, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = f;
    }
}
