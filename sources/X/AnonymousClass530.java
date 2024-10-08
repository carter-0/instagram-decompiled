package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.TimeUnit;

/* renamed from: X.530  reason: invalid class name */
public final class AnonymousClass530 extends 0ng {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 1CY A03;
    public final /* synthetic */ ImageUrl A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass530(1CY r4, ImageUrl imageUrl, double d, int i, long j) {
        super(723, 5, false, false);
        this.A03 = r4;
        this.A04 = imageUrl;
        this.A00 = d;
        this.A02 = j;
        this.A01 = i;
    }

    public final void run() {
        1CY r4 = this.A03;
        ImageUrl imageUrl = this.A04;
        double d = this.A00;
        long j = this.A02;
        int i = this.A01;
        int incrementAndGet = 1CY.A06.incrementAndGet();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = r4.A04;
        lightweightQuickPerformanceLogger.markerPoint(23396353, i, "DID_SEND_REQUEST", j, TimeUnit.MILLISECONDS);
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "BANDWIDTH_KBPS", d);
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "TRACE_TOKEN", "Stub");
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "NETWORK_REQUEST_NUMBER", incrementAndGet);
        1wo.A00().A01(imageUrl.CCJ().hashCode(), "NETWORK", j);
    }
}
