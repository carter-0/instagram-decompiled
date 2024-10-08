package X;

import com.facebook.common.dextricks.Constants;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* renamed from: X.8rQ  reason: invalid class name and case insensitive filesystem */
public final class C367698rQ<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final C367718rS A0L = new C367708rR();
    public static final Queue A0M = new C367728rT();
    public static final Logger A0N = Logger.getLogger(C367698rQ.class.getName());
    public Collection A00;
    public Set A01;
    public Set A02;
    public final int A03 = Math.min(4, Constants.LOAD_RESULT_PGO_ATTEMPTED);
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final 17u A09;
    public final 17u A0A;
    public final AnonymousClass4MQ A0B;
    public final C367668rN A0C;
    public final C368338sS A0D;
    public final C367818rc A0E;
    public final C367738rU A0F;
    public final C367738rU A0G;
    public final C367808rb A0H;
    public final C367788rZ A0I;
    public final Queue A0J;
    public final C367908rl[] A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r13.A08 > 0) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C367698rQ(X.C367658rM r18, X.C368338sS r19) {
        /*
            r17 = this;
            r13 = r17
            r13.<init>()
            r1 = 4
            r0 = 65536(0x10000, float:9.18355E-41)
            int r0 = java.lang.Math.min(r1, r0)
            r13.A03 = r0
            X.8rU r0 = X.C367738rU.A01
            r13.A0F = r0
            r13.A0G = r0
            boolean r0 = r0 instanceof X.C367748rV
            if (r0 == 0) goto L_0x00d3
            X.17t r0 = X.17t.A00
        L_0x001a:
            r13.A09 = r0
            r13.A0A = r0
            r1 = r18
            long r4 = r1.A00
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00cf
            long r2 = r1.A01
        L_0x002a:
            r13.A07 = r2
            X.8rY r8 = X.C367778rY.A01
            r13.A0I = r8
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            r4 = 0
        L_0x0038:
            r13.A06 = r4
            long r4 = r1.A02
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            r4 = 0
        L_0x0042:
            r13.A08 = r4
            X.8rb r4 = r1.A05
            X.8ra r0 = X.C367798ra.A01
            if (r4 != 0) goto L_0x004b
            r4 = r0
        L_0x004b:
            r13.A0H = r4
            if (r4 != r0) goto L_0x00c9
            java.util.Queue r0 = A0M
        L_0x0051:
            r13.A0J = r0
            long r6 = r13.A06
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0060
            long r4 = r13.A08
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L_0x0061
        L_0x0060:
            r4 = 1
        L_0x0061:
            X.4MQ r0 = r1.A04
            if (r0 != 0) goto L_0x0069
            if (r4 == 0) goto L_0x00c6
            X.4MQ r0 = X.AnonymousClass4MQ.A00
        L_0x0069:
            r13.A0B = r0
            long r4 = r13.A07
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            r9 = 0
            if (r0 < 0) goto L_0x0073
            r9 = 1
        L_0x0073:
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00c4
            long r4 = r13.A08
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00c4
            r0 = 0
        L_0x007e:
            r9 = r9 | r0
            X.8rc[] r0 = X.C367818rc.A00
            r0 = r0[r9]
            r13.A0E = r0
            X.13i r5 = r1.A03
            java.lang.Object r0 = r5.get()
            X.8rN r0 = (X.C367668rN) r0
            r13.A0C = r0
            r0 = r19
            r13.A0D = r0
            r1 = 16
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = java.lang.Math.min(r1, r0)
            long r0 = r13.A07
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r12 = 0
            if (r4 < 0) goto L_0x00ad
            r12 = 1
            X.8rZ r4 = r13.A0I
            if (r4 != r8) goto L_0x00ad
            long r6 = (long) r6
            long r2 = java.lang.Math.min(r6, r2)
            int r6 = (int) r2
        L_0x00ad:
            r4 = 0
            r14 = 1
            r8 = 1
            r11 = 0
        L_0x00b1:
            int r2 = r13.A03
            if (r8 >= r2) goto L_0x00d7
            if (r12 == 0) goto L_0x00bf
            long r2 = (long) r8
            r9 = 20
            long r2 = r2 * r9
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x00d7
        L_0x00bf:
            int r11 = r11 + 1
            int r8 = r8 << 1
            goto L_0x00b1
        L_0x00c4:
            r0 = 2
            goto L_0x007e
        L_0x00c6:
            X.4MQ r0 = X.C367658rM.A07
            goto L_0x0069
        L_0x00c9:
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            goto L_0x0051
        L_0x00cf:
            r2 = 0
            goto L_0x002a
        L_0x00d3:
            X.2zv r0 = X.C235442zv.A00
            goto L_0x001a
        L_0x00d7:
            int r2 = 32 - r11
            r13.A05 = r2
            int r2 = r8 + -1
            r13.A04 = r2
            X.8rl[] r2 = new X.C367908rl[r8]
            r13.A0K = r2
            int r3 = r6 / r8
            int r2 = r3 * r8
            if (r2 >= r6) goto L_0x00eb
            int r3 = r3 + 1
        L_0x00eb:
            if (r14 >= r3) goto L_0x00f0
            int r14 = r14 << 1
            goto L_0x00eb
        L_0x00f0:
            if (r12 == 0) goto L_0x0114
            long r2 = (long) r8
            long r15 = r0 / r2
            r8 = 1
            long r15 = r15 + r8
            long r0 = r0 % r2
        L_0x00f9:
            X.8rl[] r7 = r13.A0K
            int r2 = r7.length
            if (r4 >= r2) goto L_0x012b
            long r2 = (long) r4
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0104
            long r15 = r15 - r8
        L_0x0104:
            java.lang.Object r12 = r5.get()
            X.8rN r12 = (X.C367668rN) r12
            X.8rl r11 = new X.8rl
            r11.<init>(r12, r13, r14, r15)
            r7[r4] = r11
            int r4 = r4 + 1
            goto L_0x00f9
        L_0x0114:
            X.8rl[] r1 = r13.A0K
            int r0 = r1.length
            if (r4 >= r0) goto L_0x012b
            java.lang.Object r12 = r5.get()
            X.8rN r12 = (X.C367668rN) r12
            r15 = -1
            X.8rl r11 = new X.8rl
            r11.<init>(r12, r13, r14, r15)
            r1[r4] = r11
            int r4 = r4 + 1
            goto L_0x0114
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367698rQ.<init>(X.8rM, X.8sS):void");
    }

    public final int A00(Object obj) {
        int A002 = this.A09.A00(obj);
        int i = A002 + ((A002 << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public final C367908rl A01(int i) {
        return this.A0K[(i >>> this.A05) & this.A04];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        r2 = r1.CDT();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        if (r2.isLoading() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        r11 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (r11 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        r5.A0L(X.C390639rb.A00, r0, r11, r2.CGN());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        r5.A0A.remove(r1);
        r5.A08.remove(r1);
        r5.A0C = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (r15.A03(r1, r3) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        r5.A0L(X.C390639rb.A01, r0, r11, r2.CGN());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        r5.A08.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r5.unlock();
        r5.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ea, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00eb, code lost:
        if (r3 == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r6 = new X.AWU();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        if (r1 != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f4, code lost:
        r1 = r15.A0E.A01(r5, r7, r13, r12);
        r1.Epz(r6);
        r9.set(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0101, code lost:
        r1.Epz(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5.unlock();
        r5.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010a, code lost:
        if (r3 == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r11 = r5.A06(r6, r6.A00(r14, r13), r13, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0115, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r11 = r5.A07(r2, r1, r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            X.8sS r14 = r0.A0D
            r13 = r17
            r13.getClass()
            int r12 = r0.A00(r13)
            X.8rl r5 = r0.A01(r12)
            r14.getClass()
            int r0 = r5.A0C     // Catch:{ ExecutionException -> 0x012e }
            if (r0 == 0) goto L_0x0065
            X.8rp r9 = r5.A02(r13, r12)     // Catch:{ ExecutionException -> 0x012e }
            if (r9 == 0) goto L_0x0065
            X.8rQ r3 = r5.A05     // Catch:{ ExecutionException -> 0x012e }
            X.4MQ r0 = r3.A0B     // Catch:{ ExecutionException -> 0x012e }
            long r0 = r0.A00()     // Catch:{ ExecutionException -> 0x012e }
            java.lang.Object r10 = r5.A08(r9, r0)     // Catch:{ ExecutionException -> 0x012e }
            if (r10 == 0) goto L_0x0055
            java.util.Queue r2 = r5.A09     // Catch:{ ExecutionException -> 0x012e }
            r2.add(r9)     // Catch:{ ExecutionException -> 0x012e }
            r8 = 1
            long r2 = r3.A08     // Catch:{ ExecutionException -> 0x012e }
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0121
            long r6 = r9.CGr()     // Catch:{ ExecutionException -> 0x012e }
            long r0 = r0 - r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0121
            X.8rS r0 = r9.CDT()     // Catch:{ ExecutionException -> 0x012e }
            boolean r0 = r0.isLoading()     // Catch:{ ExecutionException -> 0x012e }
            if (r0 != 0) goto L_0x0121
            java.lang.Object r11 = r5.A05(r14, r13, r12, r8)     // Catch:{ ExecutionException -> 0x012e }
            if (r11 != 0) goto L_0x0122
            goto L_0x0121
        L_0x0055:
            X.8rS r1 = r9.CDT()     // Catch:{ ExecutionException -> 0x012e }
            boolean r0 = r1.isLoading()     // Catch:{ ExecutionException -> 0x012e }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r11 = r5.A07(r1, r9, r13)     // Catch:{ ExecutionException -> 0x012e }
            goto L_0x0122
        L_0x0065:
            r5.lock()     // Catch:{ ExecutionException -> 0x012e }
            X.8rQ r15 = r5.A05     // Catch:{ all -> 0x0126 }
            X.4MQ r0 = r15.A0B     // Catch:{ all -> 0x0126 }
            long r3 = r0.A00()     // Catch:{ all -> 0x0126 }
            r5.A0H(r3)     // Catch:{ all -> 0x0126 }
            int r0 = r5.A0C     // Catch:{ all -> 0x0126 }
            r1 = 1
            int r10 = r0 + -1
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r5.A0D     // Catch:{ all -> 0x0126 }
            int r0 = r9.length()     // Catch:{ all -> 0x0126 }
            int r0 = r0 - r1
            r8 = r12 & r0
            java.lang.Object r7 = r9.get(r8)     // Catch:{ all -> 0x0126 }
            X.8rp r7 = (X.C367948rp) r7     // Catch:{ all -> 0x0126 }
            r1 = r7
        L_0x0088:
            r6 = 0
            if (r1 == 0) goto L_0x00e9
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x0126 }
            int r2 = r1.BCU()     // Catch:{ all -> 0x0126 }
            if (r2 != r12) goto L_0x00aa
            if (r0 == 0) goto L_0x00aa
            X.17u r2 = r15.A09     // Catch:{ all -> 0x0126 }
            boolean r2 = r2.A01(r13, r0)     // Catch:{ all -> 0x0126 }
            if (r2 == 0) goto L_0x00aa
            X.8rS r2 = r1.CDT()     // Catch:{ all -> 0x0126 }
            boolean r11 = r2.isLoading()     // Catch:{ all -> 0x0126 }
            if (r11 == 0) goto L_0x00b1
            goto L_0x00af
        L_0x00aa:
            X.8rp r1 = r1.BW2()     // Catch:{ all -> 0x0126 }
            goto L_0x0088
        L_0x00af:
            r3 = 0
            goto L_0x00eb
        L_0x00b1:
            java.lang.Object r11 = r2.get()     // Catch:{ all -> 0x0126 }
            if (r11 != 0) goto L_0x00cd
            int r4 = r2.CGN()     // Catch:{ all -> 0x0126 }
            X.9rb r3 = X.C390639rb.A00     // Catch:{ all -> 0x0126 }
            r5.A0L(r3, r0, r11, r4)     // Catch:{ all -> 0x0126 }
        L_0x00c0:
            java.util.Queue r0 = r5.A0A     // Catch:{ all -> 0x0126 }
            r0.remove(r1)     // Catch:{ all -> 0x0126 }
            java.util.Queue r0 = r5.A08     // Catch:{ all -> 0x0126 }
            r0.remove(r1)     // Catch:{ all -> 0x0126 }
            r5.A0C = r10     // Catch:{ all -> 0x0126 }
            goto L_0x00ea
        L_0x00cd:
            boolean r3 = r15.A03(r1, r3)     // Catch:{ all -> 0x0126 }
            if (r3 == 0) goto L_0x00dd
            int r4 = r2.CGN()     // Catch:{ all -> 0x0126 }
            X.9rb r3 = X.C390639rb.A01     // Catch:{ all -> 0x0126 }
            r5.A0L(r3, r0, r11, r4)     // Catch:{ all -> 0x0126 }
            goto L_0x00c0
        L_0x00dd:
            java.util.Queue r0 = r5.A08     // Catch:{ all -> 0x0126 }
            r0.add(r1)     // Catch:{ all -> 0x0126 }
            r5.unlock()     // Catch:{ ExecutionException -> 0x012e }
            r5.A0E()     // Catch:{ ExecutionException -> 0x012e }
            goto L_0x0122
        L_0x00e9:
            r2 = r6
        L_0x00ea:
            r3 = 1
        L_0x00eb:
            if (r3 == 0) goto L_0x0104
            X.AWU r6 = new X.AWU     // Catch:{ all -> 0x0126 }
            r6.<init>()     // Catch:{ all -> 0x0126 }
            if (r1 != 0) goto L_0x0101
            X.8rc r0 = r15.A0E     // Catch:{ all -> 0x0126 }
            X.8rp r1 = r0.A01(r5, r7, r13, r12)     // Catch:{ all -> 0x0126 }
            r1.Epz(r6)     // Catch:{ all -> 0x0126 }
            r9.set(r8, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x0104
        L_0x0101:
            r1.Epz(r6)     // Catch:{ all -> 0x0126 }
        L_0x0104:
            r5.unlock()     // Catch:{ ExecutionException -> 0x012e }
            r5.A0E()     // Catch:{ ExecutionException -> 0x012e }
            if (r3 == 0) goto L_0x011c
            monitor-enter(r1)     // Catch:{ all -> 0x011a }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A00(r14, r13)     // Catch:{ all -> 0x0117 }
            java.lang.Object r11 = r5.A06(r6, r0, r13, r12)     // Catch:{ all -> 0x0117 }
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            goto L_0x0122
        L_0x0117:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x011a:
            r0 = move-exception
            goto L_0x012d
        L_0x011c:
            java.lang.Object r11 = r5.A07(r2, r1, r13)     // Catch:{ ExecutionException -> 0x012e }
            goto L_0x0122
        L_0x0121:
            r11 = r10
        L_0x0122:
            r5.A0D()
            return r11
        L_0x0126:
            r0 = move-exception
            r5.unlock()     // Catch:{ ExecutionException -> 0x012e }
            r5.A0E()     // Catch:{ ExecutionException -> 0x012e }
        L_0x012d:
            throw r0     // Catch:{ ExecutionException -> 0x012e }
        L_0x012e:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x0149 }
            boolean r0 = r1 instanceof java.lang.Error     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0141
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0140
            X.AvH r2 = new X.AvH     // Catch:{ all -> 0x0149 }
            r2.<init>(r1)     // Catch:{ all -> 0x0149 }
        L_0x0140:
            throw r2     // Catch:{ all -> 0x0149 }
        L_0x0141:
            java.lang.Error r1 = (java.lang.Error) r1     // Catch:{ all -> 0x0149 }
            X.9tR r2 = new X.9tR     // Catch:{ all -> 0x0149 }
            r2.<init>(r1)     // Catch:{ all -> 0x0149 }
            goto L_0x0140
        L_0x0149:
            r0 = move-exception
            r5.A0D()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367698rQ.A02(java.lang.Object):java.lang.Object");
    }

    public final boolean A03(C367948rp r8, long j) {
        long j2 = this.A06;
        if (j2 <= 0 || j - r8.CGr() < j2) {
            return false;
        }
        return true;
    }

    public final void clear() {
        C390639rb r6;
        C367908rl[] r5 = this.A0K;
        int length = r5.length;
        for (int i = 0; i < length; i++) {
            C367908rl r2 = r5[i];
            if (r2.A0C != 0) {
                r2.lock();
                try {
                    C367698rQ r7 = r2.A05;
                    r2.A0H(r7.A0B.A00());
                    AtomicReferenceArray atomicReferenceArray = r2.A0D;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (C367948rp r11 = (C367948rp) atomicReferenceArray.get(i2); r11 != null; r11 = r11.BW2()) {
                            if (r11.CDT().isActive()) {
                                Object key = r11.getKey();
                                Object obj = r11.CDT().get();
                                if (key == null || obj == null) {
                                    r6 = C390639rb.A00;
                                } else {
                                    r6 = C390639rb.A02;
                                }
                                r11.BCU();
                                r2.A0L(r6, key, obj, r11.CDT().CGN());
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, (Object) null);
                    }
                    C367738rU r0 = r7.A0F;
                    C367738rU r62 = C367738rU.A01;
                    if (r0 != r62) {
                        while (r2.A06.poll() != null) {
                        }
                    }
                    if (r7.A0G != r62) {
                        while (r2.A07.poll() != null) {
                        }
                    }
                    r2.A0A.clear();
                    r2.A08.clear();
                    r2.A0B.set(0);
                    r2.A00++;
                    r2.A0C = 0;
                } finally {
                    r2.unlock();
                    r2.A0E();
                }
            }
        }
    }

    public final boolean containsKey(Object obj) {
        C367948rp A032;
        if (obj == null) {
            return false;
        }
        int A002 = A00(obj);
        C367908rl A012 = A01(A002);
        try {
            boolean z = false;
            if (!(A012.A0C == 0 || (A032 = A012.A03(obj, A002, A012.A05.A0B.A00())) == null || A032.CDT().get() == null)) {
                z = true;
            }
            return z;
        } finally {
            A012.A0D();
        }
    }

    public final boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj == null) {
            return false;
        }
        long A002 = this.A0B.A00();
        C367908rl[] r6 = this.A0K;
        long j = -1;
        int i = 0;
        do {
            long j2 = 0;
            for (C367908rl r13 : r6) {
                AtomicReferenceArray atomicReferenceArray = r13.A0D;
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    for (C367948rp r4 = (C367948rp) atomicReferenceArray.get(i2); r4 != null; r4 = r4.BW2()) {
                        Object A082 = r13.A08(r4, A002);
                        if (A082 != null && this.A0A.A01(obj2, A082)) {
                            return true;
                        }
                    }
                }
                j2 += (long) r13.A00;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        } while (i < 3);
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Qyt, java.util.Set] */
    public final Set entrySet() {
        Set set = this.A01;
        if (set != null) {
            return set;
        }
        ? qyt = new C8656Qyt(this);
        this.A01 = qyt;
        return qyt;
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int A002 = A00(obj);
        return A01(A002).A09(obj, A002);
    }

    public final boolean isEmpty() {
        C367908rl[] r4 = this.A0K;
        long j = 0;
        for (C367908rl r1 : r4) {
            if (r1.A0C != 0) {
                return false;
            }
            j += (long) r1.A00;
        }
        if (j == 0) {
            return true;
        }
        for (C367908rl r12 : r4) {
            if (r12.A0C != 0) {
                return false;
            }
            j -= (long) r12.A00;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Qyu, java.util.Set] */
    public final Set keySet() {
        Set set = this.A02;
        if (set != null) {
            return set;
        }
        ? qyu = new C8657Qyu(this);
        this.A02 = qyu;
        return qyu;
    }

    public final boolean remove(Object obj, Object obj2) {
        C390639rb r13;
        Object obj3 = obj;
        if (obj == null) {
            return false;
        }
        Object obj4 = obj2;
        if (obj2 == null) {
            return false;
        }
        int A002 = A00(obj3);
        C367908rl A012 = A01(A002);
        A012.lock();
        try {
            C367698rQ r6 = A012.A05;
            A012.A0H(r6.A0B.A00());
            AtomicReferenceArray atomicReferenceArray = A012.A0D;
            boolean z = true;
            int length = (atomicReferenceArray.length() - 1) & A002;
            C367948rp r11 = (C367948rp) atomicReferenceArray.get(length);
            C367948rp r12 = r11;
            while (true) {
                if (r12 == null) {
                    break;
                }
                Object key = r12.getKey();
                if (r12.BCU() != A002 || key == null || !r6.A09.A01(obj3, key)) {
                    r12 = r12.BW2();
                } else {
                    C367718rS CDT = r12.CDT();
                    Object obj5 = CDT.get();
                    if (r6.A0A.A01(obj4, obj5)) {
                        r13 = C390639rb.A02;
                    } else if (obj5 == null && CDT.isActive()) {
                        r13 = C390639rb.A00;
                    }
                    A012.A00++;
                    atomicReferenceArray.set(length, A012.A00(CDT, r11, r12, r13, key, obj5));
                    A012.A0C--;
                    if (r13 != C390639rb.A02) {
                        z = false;
                    }
                    return z;
                }
            }
            A012.unlock();
            A012.A0E();
            return false;
        } finally {
            A012.unlock();
            A012.A0E();
        }
    }

    public final Object replace(Object obj, Object obj2) {
        Object obj3 = obj;
        obj3.getClass();
        Object obj4 = obj2;
        obj4.getClass();
        int A002 = A00(obj3);
        C367908rl A012 = A01(A002);
        A012.lock();
        try {
            C367698rQ r8 = A012.A05;
            long A003 = r8.A0B.A00();
            A012.A0H(A003);
            AtomicReferenceArray atomicReferenceArray = A012.A0D;
            int length = (atomicReferenceArray.length() - 1) & A002;
            C367948rp r12 = (C367948rp) atomicReferenceArray.get(length);
            C367948rp r13 = r12;
            while (true) {
                if (r13 == null) {
                    break;
                }
                Object key = r13.getKey();
                if (r13.BCU() != A002 || key == null || !r8.A09.A01(obj3, key)) {
                    r13 = r13.BW2();
                } else {
                    C367718rS CDT = r13.CDT();
                    Object obj5 = CDT.get();
                    if (obj5 != null) {
                        A012.A00++;
                        A012.A0L(C390639rb.A03, obj3, obj5, CDT.CGN());
                        A012.A0K(r13, obj4, A003);
                        A012.A0I(r13);
                        A012.unlock();
                        A012.A0E();
                        return obj5;
                    } else if (CDT.isActive()) {
                        A012.A00++;
                        atomicReferenceArray.set(length, A012.A00(CDT, r12, r13, C390639rb.A00, key, obj5));
                        A012.A0C--;
                    }
                }
            }
            return null;
        } finally {
            A012.unlock();
            A012.A0E();
        }
    }

    public final int size() {
        long j = 0;
        for (C367908rl r0 : this.A0K) {
            j += (long) Math.max(0, r0.A0C);
        }
        return 1WJ.A02(j);
    }

    public final Collection values() {
        Collection collection = this.A00;
        if (collection != null) {
            return collection;
        }
        C13235TRb tRb = new C13235TRb(this);
        this.A00 = tRb;
        return tRb;
    }

    public C367948rp copyEntry(C367948rp r2, C367948rp r3) {
        return A01(r2.BCU()).A01(r2, r3);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public boolean isLive(C367948rp r3, long j) {
        if (A01(r3.BCU()).A08(r3, j) != null) {
            return true;
        }
        return false;
    }

    public C367948rp newEntry(Object obj, int i, C367948rp r5) {
        C367908rl A012 = A01(i);
        A012.lock();
        try {
            C367818rc r0 = A012.A05.A0E;
            obj.getClass();
            return r0.A01(A012, r5, obj, i);
        } finally {
            A012.unlock();
        }
    }

    public C367718rS newValueReference(C367948rp r4, Object obj, int i) {
        int BCU = r4.BCU();
        C367738rU r1 = this.A0G;
        C367908rl A012 = A01(BCU);
        obj.getClass();
        if (r1 instanceof C367748rV) {
            if (i == 1) {
                return new C368438sc(obj);
            }
            return new C383919gT(obj, i);
        } else if (r1 instanceof C367768rX) {
            ReferenceQueue referenceQueue = A012.A07;
            if (i == 1) {
                return new C41526AvU(r4, obj, referenceQueue);
            }
            return new C383959gX(r4, obj, referenceQueue, i);
        } else {
            ReferenceQueue referenceQueue2 = A012.A07;
            if (i == 1) {
                return new C41525AvT(r4, obj, referenceQueue2);
            }
            return new C383899gR(r4, obj, referenceQueue2, i);
        }
    }

    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int A002 = A00(obj);
        return A01(A002).A04(A002, obj, obj2, false);
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int A002 = A00(obj);
        return A01(A002).A04(A002, obj, obj2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        r13 = r15.CDT();
        r4 = r13.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (r4 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r13.isActive() == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r12.A00++;
        r3.set(r2, r12.A00(r13, r14, r15, X.C390639rb.A00, r7, r4));
        r12.A0C--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r9.A0A.A01(r8, r4) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        r12.A00++;
        r12.A0L(X.C390639rb.A03, r6, r4, r13.CGN());
        r12.A0K(r15, r5, r0);
        r12.A0I(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        r12.unlock();
        r12.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r12.A08.add(r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean replace(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r6 = r20
            r6.getClass()
            r5 = r22
            r5.getClass()
            r8 = r21
            if (r21 == 0) goto L_0x00b3
            r0 = r19
            int r10 = r0.A00(r6)
            X.8rl r12 = r0.A01(r10)
            r12.lock()
            X.8rQ r9 = r12.A05     // Catch:{ all -> 0x00a5 }
            X.4MQ r0 = r9.A0B     // Catch:{ all -> 0x00a5 }
            long r0 = r0.A00()     // Catch:{ all -> 0x00a5 }
            r12.A0H(r0)     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r12.A0D     // Catch:{ all -> 0x00a5 }
            int r2 = r3.length()     // Catch:{ all -> 0x00a5 }
            r11 = 1
            int r2 = r2 - r11
            r2 = r2 & r10
            java.lang.Object r14 = r3.get(r2)     // Catch:{ all -> 0x00a5 }
            X.8rp r14 = (X.C367948rp) r14     // Catch:{ all -> 0x00a5 }
            r15 = r14
        L_0x0036:
            if (r15 == 0) goto L_0x00ad
            java.lang.Object r7 = r15.getKey()     // Catch:{ all -> 0x00a5 }
            int r4 = r15.BCU()     // Catch:{ all -> 0x00a5 }
            if (r4 != r10) goto L_0x0075
            if (r7 == 0) goto L_0x0075
            X.17u r4 = r9.A09     // Catch:{ all -> 0x00a5 }
            boolean r4 = r4.A01(r6, r7)     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x0075
            X.8rS r13 = r15.CDT()     // Catch:{ all -> 0x00a5 }
            java.lang.Object r4 = r13.get()     // Catch:{ all -> 0x00a5 }
            if (r4 != 0) goto L_0x007a
            boolean r0 = r13.isActive()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00ad
            int r0 = r12.A00     // Catch:{ all -> 0x00a5 }
            int r0 = r0 + 1
            r12.A00 = r0     // Catch:{ all -> 0x00a5 }
            X.9rb r16 = X.C390639rb.A00     // Catch:{ all -> 0x00a5 }
            r17 = r7
            r18 = r4
            X.8rp r1 = r12.A00(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00a5 }
            int r0 = r12.A0C     // Catch:{ all -> 0x00a5 }
            int r0 = r0 - r11
            r3.set(r2, r1)     // Catch:{ all -> 0x00a5 }
            r12.A0C = r0     // Catch:{ all -> 0x00a5 }
            goto L_0x00ad
        L_0x0075:
            X.8rp r15 = r15.BW2()     // Catch:{ all -> 0x00a5 }
            goto L_0x0036
        L_0x007a:
            X.17u r2 = r9.A0A     // Catch:{ all -> 0x00a5 }
            boolean r2 = r2.A01(r8, r4)     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x009f
            int r2 = r12.A00     // Catch:{ all -> 0x00a5 }
            int r2 = r2 + 1
            r12.A00 = r2     // Catch:{ all -> 0x00a5 }
            int r3 = r13.CGN()     // Catch:{ all -> 0x00a5 }
            X.9rb r2 = X.C390639rb.A03     // Catch:{ all -> 0x00a5 }
            r12.A0L(r2, r6, r4, r3)     // Catch:{ all -> 0x00a5 }
            r12.A0K(r15, r5, r0)     // Catch:{ all -> 0x00a5 }
            r12.A0I(r15)     // Catch:{ all -> 0x00a5 }
            r12.unlock()
            r12.A0E()
            r0 = 1
            return r0
        L_0x009f:
            java.util.Queue r0 = r12.A08     // Catch:{ all -> 0x00a5 }
            r0.add(r15)     // Catch:{ all -> 0x00a5 }
            goto L_0x00ad
        L_0x00a5:
            r0 = move-exception
            r12.unlock()
            r12.A0E()
            throw r0
        L_0x00ad:
            r12.unlock()
            r12.A0E()
        L_0x00b3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367698rQ.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public final Object remove(Object obj) {
        C390639rb r10;
        if (obj == null) {
            return null;
        }
        int A002 = A00(obj);
        C367908rl A012 = A01(A002);
        A012.lock();
        try {
            C367698rQ r4 = A012.A05;
            A012.A0H(r4.A0B.A00());
            AtomicReferenceArray atomicReferenceArray = A012.A0D;
            int length = (atomicReferenceArray.length() - 1) & A002;
            C367948rp r8 = (C367948rp) atomicReferenceArray.get(length);
            C367948rp r9 = r8;
            while (true) {
                if (r9 == null) {
                    break;
                }
                Object key = r9.getKey();
                if (r9.BCU() != A002 || key == null || !r4.A09.A01(obj, key)) {
                    r9 = r9.BW2();
                } else {
                    C367718rS CDT = r9.CDT();
                    Object obj2 = CDT.get();
                    if (obj2 != null) {
                        r10 = C390639rb.A02;
                    } else if (CDT.isActive()) {
                        r10 = C390639rb.A00;
                    }
                    A012.A00++;
                    atomicReferenceArray.set(length, A012.A00(CDT, r8, r9, r10, key, obj2));
                    A012.A0C--;
                    return obj2;
                }
            }
            A012.unlock();
            A012.A0E();
            return null;
        } finally {
            A012.unlock();
            A012.A0E();
        }
    }
}
