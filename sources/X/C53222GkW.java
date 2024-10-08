package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.GkW  reason: case insensitive filesystem */
public final class C53222GkW extends HP9 {
    public static C53222GkW A01;
    public final QuickPerformanceLogger A00;

    public C53222GkW() {
        0eg qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A00 = qPLInstance == null ? QuickPerformanceLoggerProvider.A01 : qPLInstance;
    }
}
