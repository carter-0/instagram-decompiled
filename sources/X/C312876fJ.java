package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6fJ  reason: invalid class name and case insensitive filesystem */
public final class C312876fJ {
    public C312896fL A00;
    public final C312886fK A01;
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = Collections.synchronizedMap(new HashMap());

    public final void A00(C352728Ep r7, String str, boolean z) {
        C312896fL r5 = this.A00;
        String str2 = r7.A01;
        int i = 22413316;
        if (r7.A02) {
            i = 22413315;
        }
        int hashCode = Arrays.hashCode(new Object[]{str2, str});
        short s = 3;
        if (z) {
            s = 2;
        }
        QuickPerformanceLogger quickPerformanceLogger = r5.A02;
        if (quickPerformanceLogger.isMarkerOn(i, hashCode)) {
            quickPerformanceLogger.markerEnd(i, hashCode, s);
        }
    }

    public C312876fJ(C312846fG r8, C312516eY r9, C312866fI r10, C312156dv r11, QuickPerformanceLogger quickPerformanceLogger) {
        C312886fK r2 = new C312886fK();
        this.A01 = r2;
        this.A00 = new C312896fL(r8, r2, r9, r10, r11, quickPerformanceLogger);
    }
}
