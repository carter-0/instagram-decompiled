package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4aO  reason: invalid class name and case insensitive filesystem */
public final class C266814aO implements Comparator {
    public static final C266814aO A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C266724aF r0 = ((C266774aK) obj).A01;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        long A02 = r0.A02(timeUnit);
        long A03 = ((C266774aK) obj2).A01.A03(timeUnit);
        if (A02 < A03) {
            return -1;
        }
        if (A02 > A03) {
            return 1;
        }
        return 0;
    }
}
