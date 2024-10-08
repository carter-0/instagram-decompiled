package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.List;

public final class OMO {
    public final int A00 = 2SP.A01.A03();
    public final QuickPerformanceLogger A01 = C51965G9l.A0l();

    public final void A01(String str, String str2) {
        0qQ.A0B(str2, 1);
        int A012 = C41845B3m.A01(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        quickPerformanceLogger.markerAnnotate(396363750, A012, "error", str2);
        quickPerformanceLogger.markerEnd(396363750, A012, 3);
    }

    public final void A00(Integer num, String str, List list, long j) {
        String str2;
        int A012 = C41845B3m.A01(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        switch (num.intValue()) {
            case 0:
                str2 = "attachment_generated";
                break;
            case 1:
                str2 = "no_logs";
                break;
            default:
                str2 = "has_null_uri";
                break;
        }
        quickPerformanceLogger.markerAnnotate(396363750, A012, "result", str2);
        quickPerformanceLogger.markerAnnotate(396363750, A012, "file_size", j);
        quickPerformanceLogger.markerAnnotate(396363750, A012, "file_names", C66581MXm.A0w(",", list));
        quickPerformanceLogger.markerEnd(396363750, A012, 2);
    }
}
