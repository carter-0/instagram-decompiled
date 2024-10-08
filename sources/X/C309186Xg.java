package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Xg  reason: invalid class name and case insensitive filesystem */
public abstract class C309186Xg {
    public static final boolean A01(C19476WaO waO) {
        long j;
        String str = null;
        if (waO != null && (str = waO.A00.A0B) == null) {
            str = "";
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        if (waO != null) {
            j = waO.A00();
        } else {
            j = 0;
        }
        if (j > TimeUnit.MILLISECONDS.toSeconds(new Date().getTime()) || (waO != null && waO.A00.A06 != null)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C19476WaO waO) {
        if (waO == null) {
            return false;
        }
        BGi bGi = waO.A00;
        Boolean bool = bGi.A01;
        return (bool == null || bool.booleanValue()) && !0qQ.A0K(bGi.A02, true);
    }

    public static final boolean A00(C19476WaO waO) {
        long j;
        if (waO != null) {
            j = waO.A00();
        } else {
            j = 0;
        }
        if (j <= TimeUnit.MILLISECONDS.toSeconds(new Date().getTime())) {
            return true;
        }
        return false;
    }
}
