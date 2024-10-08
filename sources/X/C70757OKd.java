package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.OKd  reason: case insensitive filesystem */
public final class C70757OKd {
    public final long A00;
    public final QuickPerformanceLogger A01 = C51965G9l.A0l();
    public final String A02;

    public C70757OKd(String str, long j) {
        0qQ.A0B(str, 3);
        this.A00 = j;
        this.A02 = str;
    }

    public final void A00(String str, String str2, int i, int i2, Integer num) {
        String str3;
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        long j = this.A00;
        int i3 = i * 31;
        int hashCode = 002.A0A(j, str).hashCode() + i3;
        switch (num.intValue()) {
            case 0:
                str3 = "exception";
                break;
            case 1:
                str3 = "max_retries_exceeded";
                break;
            case 2:
                str3 = "not_retry_eligible";
                break;
            default:
                str3 = "empty_file";
                break;
        }
        quickPerformanceLogger.markerAnnotate(396371619, hashCode, "error_kind", str3);
        quickPerformanceLogger.markerAnnotate(396371619, C51966G9m.A04(002.A0A(j, str), i3), AnonymousClass000.A00(1838), i2);
        if (!(str2 == null || str2.length() == 0)) {
            quickPerformanceLogger.markerAnnotate(396371619, C51966G9m.A04(002.A0A(j, str), i3), "error", str2);
        }
        quickPerformanceLogger.markerEnd(396371619, C51966G9m.A04(002.A0A(j, str), i3), 3);
    }
}
