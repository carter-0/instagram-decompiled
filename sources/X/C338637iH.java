package X;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7iH  reason: invalid class name and case insensitive filesystem */
public abstract class C338637iH {
    public static final int A00(String str, long j, boolean z) {
        0qQ.A0B(str, 0);
        02m r4 = 02m.A0p;
        int andIncrement = C338627iG.A07.getAndIncrement();
        String lowerCase = C338647iI.A02.A00(str, "$1_$2").toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        String A03 = 00R.A03(C338647iI.A00.A00(C338647iI.A01.A00(lowerCase, "_"), "_"), 80);
        if (!C338647iI.A03.A08(A03)) {
            0KC.A0O("QplPivotValidator", "Entity %s converts to bad pivot %s", new Object[]{str, A03});
        }
        r4.markerLinkPivot(220142130, andIncrement, A03);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r4.markerStart(220142130, andIncrement, j, timeUnit);
        r4.markerPoint(220142130, andIncrement, "marker_start", SystemClock.uptimeMillis(), timeUnit);
        if (z) {
            r4.markerAnnotate(220142130, andIncrement, "anticipated", 1);
        }
        return andIncrement;
    }
}
