package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.36s  reason: invalid class name and case insensitive filesystem */
public final class C2372036s extends AnonymousClass1GX implements C2372136t {
    public boolean A00;
    public String A01 = "idle";
    public final QuickPerformanceLogger A02;
    public final String A03;

    public C2372036s(QuickPerformanceLogger quickPerformanceLogger, String str) {
        0qQ.A0B(str, 2);
        this.A02 = quickPerformanceLogger;
        this.A03 = str;
    }

    public static final void A00(C2372036s r3, String str, int i, int i2) {
        QuickPerformanceLogger quickPerformanceLogger = r3.A02;
        quickPerformanceLogger.markerAnnotate(i, "view_type", str);
        quickPerformanceLogger.markerAnnotate(i, "view_type_id", i2);
        quickPerformanceLogger.markerAnnotate(i, "analytics_module", r3.A03);
        quickPerformanceLogger.markerAnnotate(i, "scroll_state", r3.A01);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        String str;
        int A032 = AnonymousClass0fD.A03(1392575315);
        if (i == 0) {
            str = "idle";
        } else if (i == 1) {
            str = "dragging";
        } else if (i != 2) {
            str = "invalid";
        } else {
            str = "setting";
        }
        this.A01 = str;
        AnonymousClass0fD.A0A(739433416, A032);
    }
}
