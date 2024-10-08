package X;

/* renamed from: X.Dgf  reason: case insensitive filesystem */
public final class C46538Dgf implements C51910G7e {
    public final long A00;

    public final String AK4() {
        return "NF_REACHABILITY_UPSELL_LAST_FIBONACCI_COOL_DOWN_UNTIL";
    }

    public final boolean CRT() {
        return true;
    }

    public final long AK3(int i) {
        int min = Math.min(i, 15);
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int i4 = i2;
            i2 = i3;
            if (min <= 0) {
                return ((long) i4) * this.A00;
            }
            min--;
            i3 += i4;
        }
    }

    public C46538Dgf(long j) {
        this.A00 = j;
    }
}
