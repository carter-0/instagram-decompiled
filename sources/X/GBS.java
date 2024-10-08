package X;

import android.os.Looper;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;

public final class GBS {
    public final QuickPerformanceLogger A00;

    public final void A01(C251263mp r5, String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        int hashCode = r5.hashCode();
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerStart(994115585, hashCode);
        MarkerEditor withMarker = quickPerformanceLogger.withMarker(994115585, hashCode);
        withMarker.annotate("module", str2);
        withMarker.annotate("component_name", str);
        withMarker.annotate("is_main_thread", 0qQ.A0K(Looper.getMainLooper(), Looper.myLooper()));
        withMarker.markerEditingCompleted();
    }

    public final void A00(C251263mp r5) {
        this.A00.markerEnd(994115585, r5.hashCode(), 2);
    }

    public GBS(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }
}
