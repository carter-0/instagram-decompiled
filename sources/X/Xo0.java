package X;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class Xo0 {
    public static final List A0M = Collections.singletonList(XRO.HTTP_1_1);
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public ScheduledExecutorService A05;
    public ScheduledFuture A06;
    public Y1T A07;
    public Y1F A08;
    public C22001XqA A09;
    public C11256SHq A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final long A0E;
    public final Runnable A0F;
    public final String A0G;
    public final ArrayDeque A0H = new ArrayDeque();
    public final ArrayDeque A0I = new ArrayDeque();
    public final Random A0J;
    public final C21464Xbw A0K;
    public final XTa A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = (X.Y7C) r5.A0L;
        r0.A00.scheduleCallback(new X.Y2W(r0, r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        X.SUS.A09(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.Exception r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.A0D     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            return
        L_0x0007:
            r0 = 1
            r5.A0D = r0     // Catch:{ all -> 0x0038 }
            X.Y1F r4 = r5.A08     // Catch:{ all -> 0x0038 }
            r0 = 0
            r5.A08 = r0     // Catch:{ all -> 0x0038 }
            java.util.concurrent.ScheduledFuture r1 = r5.A06     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0017
            r0 = 0
            r1.cancel(r0)     // Catch:{ all -> 0x0038 }
        L_0x0017:
            java.util.concurrent.ScheduledExecutorService r0 = r5.A05     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x001e
            r0.shutdown()     // Catch:{ all -> 0x0038 }
        L_0x001e:
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            X.XTa r0 = r5.A0L     // Catch:{ all -> 0x0033 }
            X.Y7C r0 = (X.Y7C) r0     // Catch:{ all -> 0x0033 }
            com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl r3 = r0.A00     // Catch:{ all -> 0x0033 }
            X.Y2W r2 = new X.Y2W     // Catch:{ all -> 0x0033 }
            r2.<init>(r0, r6)     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.scheduleCallback(r2, r0)     // Catch:{ all -> 0x0033 }
            X.SUS.A09(r4)
            return
        L_0x0033:
            r0 = move-exception
            X.SUS.A09(r4)
            throw r0
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Xo0.A00(java.lang.Exception):void");
    }

    public Xo0(Random random, C21464Xbw xbw, XTa xTa, long j) {
        String str = xbw.A00;
        if ("GET".equals(str)) {
            this.A0K = xbw;
            this.A0L = xTa;
            this.A0J = random;
            this.A0E = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.A0G = TAH.A03(bArr).A06();
            this.A0F = new Y2D(this);
            return;
        }
        throw AnonymousClass7TF.A0W("Request must be GET: ", str);
    }
}
