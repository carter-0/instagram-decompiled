package X;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6NZ  reason: invalid class name */
public final class AnonymousClass6NZ implements C307816Rp {
    public static final AtomicInteger A0Q = new AtomicInteger(0);
    public C307426Qb A00;
    public C245663dH A01;
    public C14118TqD A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public int A06 = -1;
    public int A07;
    public int A08;
    public long A09;
    public AnonymousClass6OQ A0A;
    public AnonymousClass2TS A0B;
    public C307996Sh A0C;
    public C306686Nc A0D;
    public Object A0E;
    public boolean A0F;
    public final int A0G;
    public final long A0H;
    public final C306666Na A0I;
    public final Object A0J;
    public final List A0K = new ArrayList();
    public final Context A0L;
    public final AnonymousClass6NY A0M;
    public final Object A0N;
    public final Executor A0O;
    public final C245603dB[] A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r1 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        r1.A00(r5.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass6NZ r5) {
        /*
            monitor-enter(r5)
            X.6NY r4 = r5.A0M     // Catch:{ all -> 0x003a }
            X.6Sh r1 = r5.A0C     // Catch:{ all -> 0x003a }
            r0 = 0
            if (r1 == 0) goto L_0x0020
            X.3dH r3 = r1.A01     // Catch:{ all -> 0x003a }
            java.lang.Object r2 = r1.A02     // Catch:{ all -> 0x003a }
        L_0x000c:
            int r1 = r5.A03     // Catch:{ all -> 0x003a }
            r4.AIW(r3, r2, r1)     // Catch:{ all -> 0x003a }
            X.3dH r2 = r5.A01     // Catch:{ all -> 0x003a }
            X.6Sh r1 = r5.A0C     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x001e
            X.3dH r1 = r1.A01     // Catch:{ all -> 0x003a }
        L_0x0019:
            boolean r1 = X.0qQ.A0K(r2, r1)     // Catch:{ all -> 0x003a }
            goto L_0x0023
        L_0x001e:
            r1 = r0
            goto L_0x0019
        L_0x0020:
            r3 = r0
            r2 = r0
            goto L_0x000c
        L_0x0023:
            if (r1 == 0) goto L_0x0027
            monitor-exit(r5)
        L_0x0026:
            return
        L_0x0027:
            X.6Sh r1 = r5.A0C     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x002d
            X.3dH r0 = r1.A01     // Catch:{ all -> 0x003a }
        L_0x002d:
            r5.A01 = r0     // Catch:{ all -> 0x003a }
            monitor-exit(r5)
            X.TqD r1 = r5.A02
            if (r1 == 0) goto L_0x0026
            X.3dH r0 = r5.A01
            r1.A00(r0)
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NZ.A01(X.6NZ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r1.A02 == r14.A09) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r5 = (X.C307996Sh) r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        monitor-enter(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r6.A02 != r14.A09) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r0 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (r1 <= r14.A04) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (X.0qQ.A0K(r14.A0C, r5) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r14.A04 = r1;
        r14.A03 = r6.A00;
        r14.A0C = r5;
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (X.0qQ.A0K(r14.A0A, r6) == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        r14.A0A = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        if (r15 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        r1 = r5.A01;
        r15[0] = r1.A01();
        r15[1] = r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (X.C245983dn.A03() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
        A01(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        r2 = r14.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        if (r2.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        r2.sendEmptyMessage(99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass6NZ r14, int[] r15) {
        /*
            monitor-enter(r14)
            boolean r0 = r14.A0F     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x0007
            goto L_0x00a5
        L_0x0007:
            X.2TS r5 = r14.A0B     // Catch:{ all -> 0x00b7 }
            if (r5 == 0) goto L_0x00af
            X.6OQ r1 = r14.A0A     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x0024
            X.2TS r0 = r1.A03     // Catch:{ all -> 0x00b7 }
            boolean r0 = X.0qQ.A0K(r0, r5)     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x0024
            long r3 = r14.A09     // Catch:{ all -> 0x00b7 }
            long r1 = r1.A02     // Catch:{ all -> 0x00b7 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
        L_0x001f:
            X.6OQ r6 = r14.A0A     // Catch:{ all -> 0x00b7 }
            if (r6 == 0) goto L_0x00a7
            goto L_0x0040
        L_0x0024:
            android.content.Context r4 = r14.A0L     // Catch:{ all -> 0x00b7 }
            java.lang.Object r7 = r14.A0N     // Catch:{ all -> 0x00b7 }
            java.lang.Object r8 = r14.A0E     // Catch:{ all -> 0x00b7 }
            int r10 = r14.A07     // Catch:{ all -> 0x00b7 }
            int r0 = r10 + 1
            r14.A07 = r0     // Catch:{ all -> 0x00b7 }
            int r11 = r14.A06     // Catch:{ all -> 0x00b7 }
            X.6Sh r6 = r14.A0C     // Catch:{ all -> 0x00b7 }
            X.3dB[] r9 = r14.A0P     // Catch:{ all -> 0x00b7 }
            long r12 = r14.A09     // Catch:{ all -> 0x00b7 }
            X.6OQ r3 = new X.6OQ     // Catch:{ all -> 0x00b7 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00b7 }
            r14.A0A = r3     // Catch:{ all -> 0x00b7 }
            goto L_0x001f
        L_0x0040:
            monitor-exit(r14)
            java.lang.Object r5 = r6.A00()
            X.6Sh r5 = (X.C307996Sh) r5
            monitor-enter(r14)
            long r2 = r14.A09     // Catch:{ all -> 0x00b7 }
            long r0 = r6.A02     // Catch:{ all -> 0x00b7 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r4 != 0) goto L_0x0052
            r0 = 1
        L_0x0052:
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x006e
            int r1 = r6.A01     // Catch:{ all -> 0x00b7 }
            int r0 = r14.A04     // Catch:{ all -> 0x00b7 }
            if (r1 <= r0) goto L_0x006e
            X.6Sh r0 = r14.A0C     // Catch:{ all -> 0x00b7 }
            boolean r0 = X.0qQ.A0K(r0, r5)     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x006e
            r14.A04 = r1     // Catch:{ all -> 0x00b7 }
            int r0 = r6.A00     // Catch:{ all -> 0x00b7 }
            r14.A03 = r0     // Catch:{ all -> 0x00b7 }
            r14.A0C = r5     // Catch:{ all -> 0x00b7 }
            r2 = 1
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            X.6OQ r0 = r14.A0A     // Catch:{ all -> 0x00b7 }
            boolean r1 = X.0qQ.A0K(r0, r6)     // Catch:{ all -> 0x00b7 }
            r0 = 0
            if (r1 == 0) goto L_0x007a
            r14.A0A = r0     // Catch:{ all -> 0x00b7 }
        L_0x007a:
            monitor-exit(r14)
            if (r15 == 0) goto L_0x008b
            X.3dH r1 = r5.A01
            int r0 = r1.A01()
            r15[r4] = r0
            int r0 = r1.A00()
            r15[r3] = r0
        L_0x008b:
            if (r2 == 0) goto L_0x00a6
            boolean r0 = X.C245983dn.A03()
            if (r0 == 0) goto L_0x0097
            A01(r14)
            return
        L_0x0097:
            X.6Na r2 = r14.A0I
            r1 = 99
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto L_0x00a6
            r2.sendEmptyMessage(r1)
            return
        L_0x00a5:
            monitor-exit(r14)
        L_0x00a6:
            return
        L_0x00a7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x00b6
        L_0x00af:
            java.lang.String r0 = "Tried executing the layout step before resolving a tree"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b7 }
        L_0x00b6:
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NZ.A02(X.6NZ, int[]):void");
    }

    public static final synchronized boolean A03(AnonymousClass6NZ r3, C306686Nc r4, AnonymousClass6SH r5) {
        boolean z;
        synchronized (r3) {
            int i = r4.A01;
            z = true;
            if (i > r3.A05) {
                r3.A05 = i;
                r3.A0B = r5.A00;
                r3.A06 = r4.A00;
                r3.A0E = r5.A01;
                List list = r5.A02;
                if (list != null && !list.isEmpty()) {
                    0u4.A00(r3.A0K).removeAll(list);
                }
            } else {
                z = false;
            }
            if (0qQ.A0K(r3.A0D, r4)) {
                r3.A0D = null;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r1 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        A03(r11, r1, (X.AnonymousClass6SH) r1.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        A02(r11, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(long r12, int[] r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.A0F     // Catch:{ all -> 0x0091 }
            r1 = 1
            r5 = r12
            if (r0 == 0) goto L_0x0025
            long r2 = r11.A09     // Catch:{ all -> 0x0091 }
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
        L_0x000d:
            X.3dH r3 = r11.A01     // Catch:{ all -> 0x0091 }
            r4 = 0
            if (r3 == 0) goto L_0x003b
            long r7 = r3.A01     // Catch:{ all -> 0x0091 }
            int r2 = r3.A01()     // Catch:{ all -> 0x0091 }
            int r0 = r3.A00()     // Catch:{ all -> 0x0091 }
            long r9 = X.C245133cN.A00(r2, r0)     // Catch:{ all -> 0x0091 }
            boolean r0 = X.C245063cG.A02(r5, r7, r9)     // Catch:{ all -> 0x0091 }
            goto L_0x002a
        L_0x0025:
            r11.A0F = r1     // Catch:{ all -> 0x0091 }
            r11.A09 = r12     // Catch:{ all -> 0x0091 }
            goto L_0x000d
        L_0x002a:
            if (r0 == 0) goto L_0x003b
            if (r14 == 0) goto L_0x0073
            int r0 = r3.A01()     // Catch:{ all -> 0x0091 }
            r14[r4] = r0     // Catch:{ all -> 0x0091 }
            int r0 = r3.A00()     // Catch:{ all -> 0x0091 }
            r14[r1] = r0     // Catch:{ all -> 0x0091 }
            goto L_0x0073
        L_0x003b:
            X.6Sh r3 = r11.A0C     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x0069
            X.3dH r0 = r3.A01     // Catch:{ all -> 0x0091 }
            long r7 = r0.A01     // Catch:{ all -> 0x0091 }
            int r2 = r0.A01()     // Catch:{ all -> 0x0091 }
            int r0 = r0.A00()     // Catch:{ all -> 0x0091 }
            long r9 = X.C245133cN.A00(r2, r0)     // Catch:{ all -> 0x0091 }
            boolean r0 = X.C245063cG.A02(r5, r7, r9)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0069
            A01(r11)     // Catch:{ all -> 0x0091 }
            if (r14 == 0) goto L_0x0073
            X.3dH r2 = r3.A01     // Catch:{ all -> 0x0091 }
            int r0 = r2.A01()     // Catch:{ all -> 0x0091 }
            r14[r4] = r0     // Catch:{ all -> 0x0091 }
            int r0 = r2.A00()     // Catch:{ all -> 0x0091 }
            r14[r1] = r0     // Catch:{ all -> 0x0091 }
            goto L_0x0073
        L_0x0069:
            X.6Qb r0 = r11.A00     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x0075
            if (r14 == 0) goto L_0x0073
            r14[r4] = r4     // Catch:{ all -> 0x0091 }
            r14[r1] = r4     // Catch:{ all -> 0x0091 }
        L_0x0073:
            monitor-exit(r11)
            return
        L_0x0075:
            X.2TS r0 = r11.A0B     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x007a
            goto L_0x0080
        L_0x007a:
            X.6Nc r1 = r11.A0D     // Catch:{ all -> 0x0091 }
            r1.getClass()     // Catch:{ all -> 0x0091 }
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            monitor-exit(r11)
            if (r1 == 0) goto L_0x008d
            java.lang.Object r0 = r1.A00()
            X.6SH r0 = (X.AnonymousClass6SH) r0
            A03(r11, r1, r0)
        L_0x008d:
            A02(r11, r14)
            return
        L_0x0091:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NZ.A04(long, int[]):void");
    }

    public final void ASZ(C59476JLa jLa) {
        C307426Qb r0;
        synchronized (this) {
            this.A0K.add(jLa);
            r0 = this.A00;
        }
        if (r0 != null) {
            C306666Na r4 = this.A0I;
            Object obj = this.A0J;
            r4.removeCallbacksAndMessages(obj);
            r4.postAtTime(new C57707IfA(this), obj, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r14 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r13.A0O.execute(new X.C306706Ne(r13, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        r1 = (X.C306686Nc) r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (A03(r13, r1, (X.AnonymousClass6SH) r1.A00()) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        A02(r13, (int[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C307426Qb r12, X.AnonymousClass6NZ r13, boolean r14) {
        /*
            X.0rm r4 = new X.0rm
            r4.<init>()
            monitor-enter(r13)
            if (r12 != 0) goto L_0x0012
            java.util.List r0 = r13.A0K     // Catch:{ all -> 0x0081 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r13)
            return
        L_0x0012:
            r13.A00 = r12     // Catch:{ all -> 0x0081 }
        L_0x0014:
            X.6Qb r7 = r13.A00     // Catch:{ all -> 0x0081 }
            if (r7 == 0) goto L_0x0079
            java.lang.Object r0 = r13.A0N     // Catch:{ all -> 0x0081 }
            X.6S4 r8 = new X.6S4     // Catch:{ all -> 0x0081 }
            r8.<init>(r13, r0)     // Catch:{ all -> 0x0081 }
            X.2TS r6 = r13.A0B     // Catch:{ all -> 0x0081 }
            java.lang.Object r9 = r13.A0E     // Catch:{ all -> 0x0081 }
            java.util.List r1 = r13.A0K     // Catch:{ all -> 0x0081 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0050
            X.0sn r10 = X.0sn.A00     // Catch:{ all -> 0x0081 }
        L_0x002d:
            int r11 = r13.A08     // Catch:{ all -> 0x0081 }
            int r0 = r11 + 1
            r13.A08 = r0     // Catch:{ all -> 0x0081 }
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0081 }
            long r0 = r13.A0H     // Catch:{ all -> 0x0081 }
            long r2 = r2 - r0
            double r0 = (double) r2     // Catch:{ all -> 0x0081 }
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r2
            int r2 = r13.A0G     // Catch:{ all -> 0x0081 }
            double r2 = (double) r2     // Catch:{ all -> 0x0081 }
            double r0 = r0 / r2
            int r12 = X.AnonymousClass1GB.A00(r0)     // Catch:{ all -> 0x0081 }
            X.6Nc r5 = new X.6Nc     // Catch:{ all -> 0x0081 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0081 }
            r4.A00 = r5     // Catch:{ all -> 0x0081 }
            r13.A0D = r5     // Catch:{ all -> 0x0081 }
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0081 }
            r10.<init>(r1)     // Catch:{ all -> 0x0081 }
            goto L_0x002d
        L_0x0056:
            monitor-exit(r13)
            if (r14 == 0) goto L_0x0064
            java.util.concurrent.Executor r1 = r13.A0O
            X.6Ne r0 = new X.6Ne
            r0.<init>(r13, r4)
            r1.execute(r0)
        L_0x0063:
            return
        L_0x0064:
            java.lang.Object r1 = r4.A00
            X.6Nc r1 = (X.C306686Nc) r1
            java.lang.Object r0 = r1.A00()
            X.6SH r0 = (X.AnonymousClass6SH) r0
            boolean r0 = A03(r13, r1, r0)
            if (r0 == 0) goto L_0x0063
            r0 = 0
            A02(r13, r0)
            return
        L_0x0079:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            r0.<init>(r1)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NZ.A00(X.6Qb, X.6NZ, boolean):void");
    }

    public AnonymousClass6NZ(Context context, AnonymousClass6NY r5, Object obj, Executor executor, C245603dB[] r8) {
        this.A0L = context;
        this.A0M = r5;
        this.A0N = obj;
        this.A0P = r8;
        this.A0O = executor;
        Looper mainLooper = Looper.getMainLooper();
        0qQ.A07(mainLooper);
        this.A0I = new C306666Na(mainLooper, this);
        A0Q.incrementAndGet();
        this.A0G = C229622nl.A00(context);
        this.A0H = System.nanoTime();
        this.A04 = -1;
        this.A03 = -1;
        this.A09 = C244913bx.A00.A00(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0J = new Object();
    }
}
