package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ii8  reason: case insensitive filesystem */
public final class C57891Ii8 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6LQ A01;
    public final /* synthetic */ Map A02;

    public C57891Ii8(AnonymousClass6LQ r1, Map map, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = map;
    }

    public final void run() {
        AnonymousClass6LQ r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        int hashCode = r0.A02.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        AnonymousClass6QC.A03(quickPerformanceLogger, this.A02, timeUnit, 906040838, hashCode, j);
        AnonymousClass6QC.A04(quickPerformanceLogger, 0Yt.A0E(), timeUnit, 906040838, hashCode, j, 2);
    }
}
