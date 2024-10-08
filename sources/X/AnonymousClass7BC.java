package X;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7BC  reason: invalid class name */
public abstract class AnonymousClass7BC {
    public static final boolean A00(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        if (!z || AnonymousClass48O.A04(i) || AnonymousClass48O.A06(Integer.valueOf(i)) || i == 1013 || z2 || z3 || z4) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C254703su r6) {
        if (r6.A1F != AnonymousClass05K.A0j || r6.A10 != 2FW.A1g) {
            return false;
        }
        List A0t = r6.A0t();
        if ((A0t == null || A0t.isEmpty()) && r6.A13 == null && TimeUnit.MICROSECONDS.toMinutes(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - r6.C7c()) < 15) {
            return true;
        }
        return false;
    }
}
