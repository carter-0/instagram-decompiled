package X;

/* renamed from: X.5zy  reason: invalid class name and case insensitive filesystem */
public final class C301775zy implements Comparable {
    public final long A00;
    public final C264814Rj A01;

    public final int compareTo(Object obj) {
        C301775zy r6 = (C301775zy) obj;
        long j = this.A00 - r6.A00;
        if (j < 0) {
            return -1;
        }
        if (j <= 0) {
            if (this.A01 == null) {
                return -1;
            }
            if (r6.A01 == null) {
                return 1;
            }
            return 0;
        }
        return 1;
    }

    public C301775zy(C264814Rj r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
