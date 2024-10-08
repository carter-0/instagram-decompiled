package X;

import android.location.LocationManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Q0H extends AnonymousClass60p {
    public AnonymousClass9QC A00;
    public String A01;
    public final LocationManager A02;
    public final C270924hc A03;
    public final Q0I A04 = new Q0I(this);
    public final ExecutorService A05;
    public final AtomicBoolean A06 = new AtomicBoolean();

    public final synchronized void A05() {
        this.A06.set(false);
        LocationManager locationManager = this.A02;
        if (locationManager != null) {
            0fW.A01(this.A04, locationManager);
        }
        this.A00 = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Q0H(android.location.LocationManager r16, X.AnonymousClass0JP r17, X.AnonymousClass0JR r18, X.C270924hc r19, X.C273354mO r20, X.C270914hb r21, X.C9250RVb r22, X.C270964hg r23, com.facebook.quicklog.LightweightQuickPerformanceLogger r24, X.RQN r25, X.C270944he r26, X.C242093Sp r27, java.util.concurrent.ExecutorService r28, java.util.concurrent.ScheduledExecutorService r29) {
        /*
            r15 = this;
            r2 = r17
            r3 = r18
            X.AnonymousClass7TG.A1Q(r2, r3)
            r12 = r27
            r11 = r26
            r14 = r29
            r13 = r28
            r1 = r15
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A03 = r4
            r15.A05 = r14
            r0 = r16
            r15.A02 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r15.A06 = r0
            X.Q0I r0 = new X.Q0I
            r0.<init>(r15)
            r15.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0H.<init>(android.location.LocationManager, X.0JP, X.0JR, X.4hc, X.4mO, X.4hb, X.RVb, X.4hg, com.facebook.quicklog.LightweightQuickPerformanceLogger, X.RQN, X.4he, X.3Sp, java.util.concurrent.ExecutorService, java.util.concurrent.ScheduledExecutorService):void");
    }
}
