package X;

import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.SHw  reason: case insensitive filesystem */
public final class C11262SHw {
    public int A00 = 0;
    public int A01 = 0;
    public long A02;
    public C13893TjG A03;
    public C13576Td1 A04;
    public AnonymousClass452 A05;
    public C13776Tgr A06;
    public Runnable A07;
    public Runnable A08;
    public Future A09;
    public boolean A0A;
    public final Handler A0B;
    public final C13575Td0 A0C;
    public final ExecutorService A0D;
    public final ScheduledExecutorService A0E;
    public final RealtimeSinceBootClock A0F;
    public final S2N A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r8.A0A != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r0 == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01() {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            java.lang.String r5 = "ConnectionRetryManager"
            r4 = 0
            X.Tgr r0 = r8.A06     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "next is called before having a strategy."
            X.0KC.A0D(r5, r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00db
        L_0x0011:
            X.Td1 r0 = r8.A04     // Catch:{ all -> 0x00dd }
            boolean r0 = r0.AGz()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00db
            java.util.concurrent.Future r0 = r8.A09     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x0025
            goto L_0x00db
        L_0x0025:
            int r0 = r8.A01     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x002f
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00dd }
            r8.A02 = r0     // Catch:{ all -> 0x00dd }
        L_0x002f:
            X.Td0 r0 = r8.A0C     // Catch:{ all -> 0x00dd }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00dd }
            boolean r0 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r8.A0A     // Catch:{ all -> 0x00d9 }
            r6 = 1
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            X.Tgr r1 = r8.A06     // Catch:{ all -> 0x00dd }
            boolean r3 = r1.CKH(r6)     // Catch:{ all -> 0x00dd }
            X.RDh r2 = r1.C1W()     // Catch:{ all -> 0x00dd }
            X.RDh r0 = X.C8866RDh.BACK_TO_BACK     // Catch:{ all -> 0x00dd }
            if (r3 != 0) goto L_0x007a
            if (r2 != r0) goto L_0x0074
            java.util.concurrent.Future r0 = r8.A09     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x005b
            r0.cancel(r4)     // Catch:{ all -> 0x00dd }
            r0 = 0
            r8.A09 = r0     // Catch:{ all -> 0x00dd }
        L_0x005b:
            X.452 r0 = r8.A05     // Catch:{ all -> 0x00dd }
            X.453 r0 = r0.A00()     // Catch:{ all -> 0x00dd }
            int r3 = r0.A02     // Catch:{ all -> 0x00dd }
            int r2 = r0.A06     // Catch:{ all -> 0x00dd }
            int r0 = r0.A03     // Catch:{ all -> 0x00dd }
            X.SqL r1 = new X.SqL     // Catch:{ all -> 0x00dd }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x00dd }
            r8.A06 = r1     // Catch:{ all -> 0x00dd }
            boolean r0 = r1.CKH(r6)     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x007a
        L_0x0074:
            java.lang.String r0 = "No more retry!"
            X.0KC.A0D(r5, r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00db
        L_0x007a:
            int r1 = r1.CrX(r6)     // Catch:{ all -> 0x00dd }
            java.util.concurrent.Future r0 = r8.A09     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0088
            r0.cancel(r4)     // Catch:{ all -> 0x00dd }
            r0 = 0
            r8.A09 = r0     // Catch:{ all -> 0x00dd }
        L_0x0088:
            int r0 = r8.A01     // Catch:{ all -> 0x00dd }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x00dd }
            if (r1 > 0) goto L_0x00b5
            android.os.Handler r0 = r8.A0B     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00ac
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x00dd }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x00dd }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00dd }
            if (r1 != r0) goto L_0x00ac
            java.lang.Runnable r0 = r8.A08     // Catch:{ all -> 0x00dd }
            r0.run()     // Catch:{ all -> 0x00dd }
            X.TOA r0 = X.TOA.A01     // Catch:{ all -> 0x00dd }
        L_0x00a9:
            r8.A09 = r0     // Catch:{ all -> 0x00dd }
            goto L_0x00db
        L_0x00ac:
            java.util.concurrent.ExecutorService r1 = r8.A0D     // Catch:{ all -> 0x00dd }
            java.lang.Runnable r0 = r8.A08     // Catch:{ all -> 0x00dd }
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00a9
        L_0x00b5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00dd }
            java.util.concurrent.ScheduledExecutorService r4 = r8.A0E     // Catch:{ all -> 0x00dd }
            java.lang.Runnable r3 = r8.A08     // Catch:{ all -> 0x00dd }
            long r1 = (long) r1     // Catch:{ all -> 0x00dd }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00dd }
            java.util.concurrent.ScheduledFuture r0 = r4.schedule(r3, r1, r0)     // Catch:{ all -> 0x00dd }
            r8.A09 = r0     // Catch:{ all -> 0x00dd }
            X.TjG r2 = r8.A03     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x00db
            java.lang.String r1 = "retry in %d seconds"
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = X.Pxf.A0m(r1, r0)     // Catch:{ all -> 0x00dd }
            r2.Cgi(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00db
        L_0x00d9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r7)
            return
        L_0x00dd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00df:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11262SHw.A01():void");
    }

    public static void A00(C11262SHw sHw) {
        Future future = sHw.A09;
        if (future != null) {
            future.cancel(false);
            sHw.A09 = null;
        }
        AnonymousClass453 A002 = sHw.A05.A00();
        sHw.A06 = new C12265SqK(A002.A04, A002.A07, A002.A05);
        S2N s2n = sHw.A0G;
        s2n.A00 = s2n.A01;
        sHw.A01 = 0;
    }

    public C11262SHw(Handler handler, C13893TjG tjG, RealtimeSinceBootClock realtimeSinceBootClock, C13575Td0 td0, C13576Td1 td1, AnonymousClass452 r9, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A0F = realtimeSinceBootClock;
        this.A0C = td0;
        this.A0D = executorService;
        this.A0E = scheduledExecutorService;
        this.A0B = handler;
        this.A05 = r9;
        this.A04 = td1;
        this.A03 = tjG;
        AnonymousClass453 A002 = r9.A00();
        this.A0G = new S2N(A002.A02, A002.A03);
    }
}
