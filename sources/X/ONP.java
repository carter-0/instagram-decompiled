package X;

import com.facebook.quicklog.QuickPerformanceLogger;

public final class ONP {
    public final int A00;
    public final QuickPerformanceLogger A01 = C51965G9l.A0l();

    public final void A00(Integer num, String str, long j) {
        String str2;
        0qQ.A0B(str, 0);
        int A012 = C41845B3m.A01(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        if (num.intValue() != 0) {
            str2 = "no_logs";
        } else {
            str2 = "attachment_generated";
        }
        quickPerformanceLogger.markerAnnotate(396363750, A012, "result", str2);
        quickPerformanceLogger.markerAnnotate(396363750, A012, "file_size", j);
        quickPerformanceLogger.markerEnd(396363750, A012, 2);
    }

    public final void A02(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1O(str2, str3);
        int A012 = C41845B3m.A01(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        quickPerformanceLogger.markerStart(396363750, A012);
        quickPerformanceLogger.markerAnnotate(396363750, A012, "file_name", str);
        quickPerformanceLogger.markerAnnotate(396363750, A012, "tag", str2);
        quickPerformanceLogger.markerAnnotate(396363750, A012, "client_server_join_key", str3);
    }

    public /* synthetic */ ONP(0lg r3) {
        int A03 = 2SP.A01.A03();
        0qQ.A0B(r3, 1);
        this.A00 = A03;
    }

    public final void A01(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        int A012 = C41845B3m.A01(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        quickPerformanceLogger.markerAnnotate(396363750, A012, "error", str2);
        quickPerformanceLogger.markerEnd(396363750, A012, 3);
    }
}
