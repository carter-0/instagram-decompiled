package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.6bE  reason: invalid class name and case insensitive filesystem */
public final class C310546bE {
    public boolean A00 = true;
    public final QuickPerformanceLogger A01;
    public final AnonymousClass4HF A02 = new C310556bF(this);
    public final String A03;

    public C310546bE(QuickPerformanceLogger quickPerformanceLogger, String str) {
        0qQ.A0B(quickPerformanceLogger, 1);
        0qQ.A0B(str, 2);
        this.A01 = quickPerformanceLogger;
        this.A03 = str;
    }

    public static final void A00(C310546bE r3, String str, int i, int i2) {
        QuickPerformanceLogger quickPerformanceLogger = r3.A01;
        quickPerformanceLogger.markerAnnotate(i, "view_type", str);
        quickPerformanceLogger.markerAnnotate(i, "view_type_id", i2);
        quickPerformanceLogger.markerAnnotate(i, "analytics_module", r3.A03);
        quickPerformanceLogger.markerAnnotate(i, "is_scroll_idle", r3.A00);
    }
}
