package X;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: X.Vuj  reason: case insensitive filesystem */
public final class C18592Vuj {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public C20834X0j A0C;
    public ArrayDeque A0D = new ArrayDeque();
    public ArrayList A0E = new ArrayList();
    public ArrayList A0F = new ArrayList();
    public ArrayList A0G = new ArrayList();
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public final QZK A0K;
    public final W0R A0L;
    public final USK A0M;
    public final Object A0N = new Object();
    public final Object A0O = new Object();
    public final int[] A0P = new int[4];

    public final void A01(C17763VfZ vfZ, QZL qzl, String str, int i) {
        synchronized (this.A0O) {
            this.A00++;
            this.A0D.addLast(new C15149USf(vfZ, qzl, this, str, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r2 = android.os.SystemClock.uptimeMillis();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        ((java.lang.Runnable) r1.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r10.A0J == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r10.A02 = android.os.SystemClock.uptimeMillis() - r2;
        r10.A07 = r10.A01;
        r10.A0J = false;
        com.facebook.systrace.Systrace.A09("batchedExecutionTime", 0, 8192, 1000000 * r2);
        com.facebook.systrace.Systrace.A06(8192, "batchedExecutionTime", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r10.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C18592Vuj r10) {
        /*
            boolean r0 = r10.A0I
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "ReactNative"
            java.lang.String r0 = "Not flushing pending UI operations because of previously thrown Exception"
            X.0I1.A04(r1, r0)
            return
        L_0x000c:
            java.lang.Object r2 = r10.A0N
            monitor-enter(r2)
            java.util.ArrayList r1 = r10.A0E     // Catch:{ all -> 0x005e }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x005c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x005e }
            r0.<init>()     // Catch:{ all -> 0x005e }
            r10.A0E = r0     // Catch:{ all -> 0x005e }
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            long r2 = android.os.SystemClock.uptimeMillis()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0027
        L_0x0037:
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x0057
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r2
            r10.A02 = r0
            long r0 = r10.A01
            r10.A07 = r0
            r5 = 0
            r10.A0J = r5
            r6 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r4 = "batchedExecutionTime"
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r2
            com.facebook.systrace.Systrace.A09(r4, r5, r6, r8)
            com.facebook.systrace.Systrace.A06(r6, r4, r5)
        L_0x0057:
            r0 = 0
            r10.A01 = r0
            return
        L_0x005c:
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18592Vuj.A00(X.Vuj):void");
    }

    public C18592Vuj(QZK qzk, W0R w0r, int i) {
        this.A0L = w0r;
        this.A0M = new USK(qzk, this, i == -1 ? 8 : i);
        this.A0K = qzk;
    }
}
