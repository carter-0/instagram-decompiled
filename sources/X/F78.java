package X;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class F78 {
    public static final boolean A01(long j, boolean z) {
        if (!z || j > A00(13) || j <= A00(18)) {
            return false;
        }
        return true;
    }

    public static final long A00(int i) {
        Calendar instance = Calendar.getInstance();
        return new GregorianCalendar(instance.get(1) - i, DbZ.A06(instance), DbU.A03(instance)).getTimeInMillis();
    }
}
