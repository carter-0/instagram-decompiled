package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TLk  reason: case insensitive filesystem */
public final class C13101TLk implements Comparator {
    public final boolean A00;

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C266724aF r2 = ((RRJ) obj).A00;
        C266724aF r1 = ((RRJ) obj2).A00;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long A03 = r2.A03(timeUnit);
        long A02 = r2.A02(timeUnit);
        long A032 = r1.A03(timeUnit);
        long A022 = r1.A02(timeUnit);
        if (this.A00) {
            int i = (A03 > A032 ? 1 : (A03 == A032 ? 0 : -1));
            if (i == 0) {
                return (A02 > A022 ? 1 : (A02 == A022 ? 0 : -1));
            }
            return i;
        }
        int i2 = (A02 > A022 ? 1 : (A02 == A022 ? 0 : -1));
        if (i2 == 0) {
            return (A03 > A032 ? 1 : (A03 == A032 ? 0 : -1));
        }
        return i2;
    }

    public C13101TLk(boolean z) {
        this.A00 = z;
    }
}
