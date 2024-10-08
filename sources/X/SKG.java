package X;

import com.facebook.quicklog.QuickPerformanceLogger;

public final class SKG {
    public static final void A01(Exception exc, String str, String str2, String str3, String str4, int i) {
        C11159SCp sCp = C11159SCp.A00;
        0f9 AEf = 0wj.A01.AEf(str, i);
        if (exc != null) {
            AEf.ERJ(exc);
        }
        AEf.ABQ("script_url", str2);
        AEf.ABQ("script_name", str3);
        AEf.ABQ("script_version", str4);
        AEf.report();
    }

    public static final void A00(QuickPerformanceLogger quickPerformanceLogger, String str, String str2, int i, int i2) {
        quickPerformanceLogger.markerAnnotate(i2, i, str, str2);
        quickPerformanceLogger.markerPoint(i2, i, str);
        quickPerformanceLogger.markerEnd(i2, i, 3);
    }
}
