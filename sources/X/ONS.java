package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

public abstract class ONS {
    public final int A00;
    public final int A01;
    public final LightweightQuickPerformanceLogger A02;

    public final void A00() {
        this.A02.markerStartWithCancelPolicy(this.A00, false, this.A01, -1, TimeUnit.NANOSECONDS);
    }

    public final void A01(C69552Nnw nnw) {
        String str;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i;
        int i2;
        short s;
        N0J n0j;
        Exception exc;
        if (nnw instanceof N0I) {
            lightweightQuickPerformanceLogger = this.A02;
            i = this.A00;
            i2 = this.A01;
            s = 2;
        } else {
            if (!(nnw instanceof N0J) || (n0j = (N0J) nnw) == null || (exc = n0j.A00) == null || (str = exc.toString()) == null) {
                str = "Empty response from api";
            }
            lightweightQuickPerformanceLogger = this.A02;
            i = this.A00;
            i2 = this.A01;
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.ErrorCode, str);
            s = 3;
        }
        lightweightQuickPerformanceLogger.markerEnd(i, i2, s);
    }

    public final void A02(String str) {
        this.A02.markerAnnotate(this.A00, this.A01, TraceFieldType.TransportType, str);
    }

    public ONS(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i, int i2) {
        this.A02 = lightweightQuickPerformanceLogger;
        this.A00 = i;
        this.A01 = i2;
    }
}
