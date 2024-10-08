package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Dcr  reason: case insensitive filesystem */
public final class C46348Dcr implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C272584kz A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;

    public C46348Dcr(C272584kz r1, String str, WeakReference weakReference, int i, int i2) {
        this.A02 = r1;
        this.A04 = weakReference;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    public final void run() {
        0VY r0;
        String A05;
        C272584kz r2 = this.A02;
        long A002 = C272584kz.A00(this.A04);
        QuickPerformanceLogger quickPerformanceLogger = r2.A07;
        int i = this.A01;
        int i2 = this.A00;
        quickPerformanceLogger.markerAnnotate(i, i2, "surface_state_after_end", A002);
        quickPerformanceLogger.markerPoint(i, i2, "timeout_after_exit");
        if (0 == r2.A06) {
            System.gc();
        }
        for (C272404ke AIH : r2.A08) {
            Iterator A0s = AnonymousClass7TF.A0s(AIH.AIH(i2));
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                quickPerformanceLogger.markerAnnotate(i, i2, (String) A1J.getKey(), AnonymousClass7TE.A0R(A1J.getValue()));
            }
        }
        if (r2.A09 && i2 == r2.A00 && C59470Vi.A00 && (r0 = 0VY.A0A) != null && (A05 = r0.A05(21371299)) != null) {
            2QF.A00().A02().A09("Daily", 002.A0u("endpoint visit end (", this.A03, ") trace_id: ", A05), 0);
        }
        quickPerformanceLogger.markerEndAtPoint(i, i2, 2, "surface_exit");
    }
}
