package X;

import android.os.SystemClock;
import java.util.List;

public final class LNj {
    public static long A00;
    public static final C61071Jw9 A01 = new C61071Jw9(AnonymousClass05K.A00, AnonymousClass7TE.A1C());
    public static final LNj A02 = new Object();

    public final C61071Jw9 A00() {
        C61071Jw9 jw9 = A01;
        if (((List) jw9.A04).isEmpty() || SystemClock.uptimeMillis() - A00 >= 1800000) {
            return null;
        }
        return jw9;
    }
}
