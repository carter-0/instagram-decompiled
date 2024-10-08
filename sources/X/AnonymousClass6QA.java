package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6QA  reason: invalid class name */
public final class AnonymousClass6QA implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6LP A01;

    public AnonymousClass6QA(AnonymousClass6LP r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        AnonymousClass6LP r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A04;
        AnonymousClass6Q8 r2 = r0.A05;
        int hashCode = r2.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap hashMap = new HashMap();
        hashMap.put(Q2M.A01(9, 10, 108), r2.A03);
        hashMap.put("client_name", r2.A01);
        hashMap.put("template_name", r2.A04);
        hashMap.put("logging_info", r2.A02);
        hashMap.put(TraceFieldType.ContentLength, String.valueOf(r2.A00));
        AnonymousClass6QC.A03(quickPerformanceLogger, hashMap, timeUnit, 906037831, hashCode, j);
    }
}
