package X;

public final class Y1V implements Comparable {
    public final int A00;
    public final long A01;
    public final Runnable A02;
    public volatile boolean A03;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Y1V y1v = (Y1V) obj;
        long j = this.A01;
        long j2 = y1v.A01;
        if (j < j2) {
            return -1;
        }
        if (j <= j2) {
            int i = this.A00;
            int i2 = y1v.A00;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return 0;
        }
        return 1;
    }

    public Y1V(Long l, Runnable runnable, int i) {
        this.A02 = runnable;
        this.A01 = l.longValue();
        this.A00 = i;
    }
}
