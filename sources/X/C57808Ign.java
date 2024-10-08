package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ign  reason: case insensitive filesystem */
public final class C57808Ign implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6LP A01;

    public C57808Ign(AnonymousClass6LP r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        AnonymousClass6LP r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A04;
        int hashCode = r0.A05.hashCode();
        long j = this.A00;
        AnonymousClass6QC.A04(quickPerformanceLogger, 0Yt.A0E(), TimeUnit.NANOSECONDS, 906037831, hashCode, j, 4);
    }
}
