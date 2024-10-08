package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.95H  reason: invalid class name */
public final class AnonymousClass95H {
    public final QuickPerformanceLogger A00;

    public final void A00(String str, Throwable th) {
        String str2;
        if (str != null) {
            this.A00.markerAnnotate(966997352, TraceFieldType.FailureReason, str);
        } else if (th != null) {
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            Throwable cause = th.getCause();
            if (cause == null || (str2 = cause.getMessage()) == null) {
                str2 = th.getMessage();
            }
            quickPerformanceLogger.markerAnnotate(966997352, TraceFieldType.FailureReason, str2);
        }
        this.A00.markerEnd(966997352, 3);
    }

    public AnonymousClass95H(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }
}
