package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ii7  reason: case insensitive filesystem */
public final class C57890Ii7 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6LP A01;
    public final /* synthetic */ String A02;

    public C57890Ii7(AnonymousClass6LP r1, String str, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass6LP r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A04;
        int hashCode = r0.A05.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("error", this.A02);
        AnonymousClass6QC.A04(quickPerformanceLogger, A1E, timeUnit, 906037831, hashCode, j, 3);
    }
}
