package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.SRw  reason: case insensitive filesystem */
public abstract class C11401SRw {
    public static final QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();

    public static final void A03(int i, String str, String str2, String str3) {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerAnnotate(i, "iaw_session_id", str);
            quickPerformanceLogger.markerAnnotate(i, "checkout_session_id", str2);
            if (str3 == null) {
                str3 = "";
            }
            quickPerformanceLogger.markerAnnotate(i, "sdk_version", str3);
        }
    }

    public static final Integer A00(Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue == 0) {
            i = 37355529;
        } else if (intValue == 1) {
            i = 23273330;
        } else if (intValue != 2) {
            return null;
        } else {
            i = 507383195;
        }
        return Integer.valueOf(i);
    }

    public static final Integer A01(Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue == 0) {
            i = 37355531;
        } else if (intValue == 1) {
            i = 23281173;
        } else if (intValue != 2) {
            return null;
        } else {
            i = 507388547;
        }
        return Integer.valueOf(i);
    }

    public static final Integer A02(Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue == 0) {
            i = 37356947;
        } else if (intValue == 1) {
            i = 23270272;
        } else if (intValue != 2) {
            return null;
        } else {
            i = 507385469;
        }
        return Integer.valueOf(i);
    }
}
