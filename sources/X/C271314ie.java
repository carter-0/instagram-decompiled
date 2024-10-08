package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4ie  reason: invalid class name and case insensitive filesystem */
public abstract class C271314ie {
    public static final C2611948q A00(2Eo r1) {
        int ordinal;
        if (r1 == null || ((ordinal = r1.ordinal()) != 1 && ordinal != 6 && ordinal != 7)) {
            return C2611948q.ALL;
        }
        return C2611948q.RELEVANT;
    }

    public static final boolean A01(AnonymousClass2Ep r8, Integer num) {
        List<C376659Iv> AxI;
        if (System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert(r8.BKd(), TimeUnit.MICROSECONDS) >= AnonymousClass48N.A00 || (AxI = r8.AxI()) == null) {
            return false;
        }
        if ((AxI instanceof Collection) && AxI.isEmpty()) {
            return false;
        }
        for (C376659Iv r0 : AxI) {
            if (r0.A01 == num) {
                return true;
            }
        }
        return false;
    }
}
