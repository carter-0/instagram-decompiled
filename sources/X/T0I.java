package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;

public final class T0I implements 2IR {
    public final C10382RrJ A00;
    public final C13707TfR A01;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        this.A01.onFailure(th);
        C10929S1h s1h = this.A00.A00;
        String obj = th.toString();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = s1h.A02;
        if (lightweightQuickPerformanceLogger != null) {
            int i = s1h.A00;
            lightweightQuickPerformanceLogger.markerAnnotate(18087937, i, "error", obj);
            lightweightQuickPerformanceLogger.markerEnd(18087937, i, 3);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i;
        int i2;
        short s;
        C10381RrI rrI = (C10381RrI) obj;
        try {
            0qQ.A0A(rrI);
            this.A01.Doe(rrI.A00.getCanonicalPath());
            if (rrI.A01 != AnonymousClass05K.A00) {
                C10929S1h s1h = this.A00.A00;
                lightweightQuickPerformanceLogger = s1h.A02;
                if (lightweightQuickPerformanceLogger != null) {
                    i = 18087937;
                    i2 = s1h.A00;
                    s = 2;
                } else {
                    return;
                }
            } else {
                C10929S1h s1h2 = this.A00.A00;
                lightweightQuickPerformanceLogger = s1h2.A02;
                if (lightweightQuickPerformanceLogger != null) {
                    i = 18087937;
                    i2 = s1h2.A00;
                    s = 25;
                } else {
                    return;
                }
            }
            lightweightQuickPerformanceLogger.markerEnd(i, i2, s);
        } catch (IOException e) {
            onFailure(e);
        }
    }

    public T0I(C10382RrJ rrJ, C13707TfR tfR) {
        this.A01 = tfR;
        this.A00 = rrJ;
    }
}
