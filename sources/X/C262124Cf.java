package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.4Cf  reason: invalid class name and case insensitive filesystem */
public abstract class C262124Cf extends C262134Cg implements C262114Ce {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02;
    public volatile /* synthetic */ Object _delayed$volatile;
    public volatile /* synthetic */ int _isCompleted$volatile = 0;
    public volatile /* synthetic */ Object _queue$volatile;

    static {
        Class<C262124Cf> cls = C262124Cf.class;
        Class<Object> cls2 = Object.class;
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue$volatile");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed$volatile");
        A00 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted$volatile");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = A02
        L_0x0002:
            java.lang.Object r5 = r4.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = A00
            int r1 = r0.get(r6)
            r0 = 0
            if (r1 == 0) goto L_0x0010
            r0 = 1
        L_0x0010:
            r1 = 0
            if (r0 != 0) goto L_0x004f
            r3 = 1
            if (r5 != 0) goto L_0x001e
            r0 = 0
            boolean r0 = X.1Ev.A00(r6, r0, r7, r4)
        L_0x001b:
            if (r0 == 0) goto L_0x0002
        L_0x001d:
            return r3
        L_0x001e:
            boolean r0 = r5 instanceof X.12p
            if (r0 == 0) goto L_0x0039
            r2 = r5
            X.12p r2 = (X.12p) r2
            int r0 = r2.A02(r7)
            if (r0 == 0) goto L_0x001d
            if (r0 != r3) goto L_0x004f
            long r0 = X.12p.A00(r2)
            X.12p r0 = X.12p.A01(r2, r0)
            X.1Ev.A00(r6, r5, r0, r4)
            goto L_0x0002
        L_0x0039:
            X.0zk r0 = X.C67411tL.A00
            if (r5 == r0) goto L_0x004f
            r1 = 8
            X.12p r0 = new X.12p
            r0.<init>(r1, r3)
            r0.A02(r5)
            r0.A02(r7)
            boolean r0 = X.1Ev.A00(r6, r5, r0, r4)
            goto L_0x001b
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262124Cf.A01(java.lang.Runnable):boolean");
    }

    public void A0Q() {
        C241633Py r0;
        boolean A002;
        C67361tB.A00.set((Object) null);
        A00.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof 12p)) {
                    if (obj == C67411tL.A00) {
                        break;
                    }
                    12p r02 = new 12p(8, true);
                    r02.A02(obj);
                    A002 = 1Ev.A00(this, obj, r02, atomicReferenceFieldUpdater);
                    continue;
                } else {
                    ((12p) obj).A04();
                    break;
                }
            } else {
                A002 = 1Ev.A00(this, (Object) null, C67411tL.A00, atomicReferenceFieldUpdater);
                continue;
            }
            if (A002) {
                break;
            }
        }
        do {
        } while (A0P() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C67401tJ r3 = (C67401tJ) A01.get(this);
            if (r3 != null) {
                synchronized (r3) {
                    if (C67401tJ.A01.get(r3) > 0) {
                        r0 = r3.A02(0);
                    } else {
                        r0 = null;
                    }
                }
                C241623Px r03 = (C241623Px) r0;
                if (r03 != null) {
                    A0V(r03, nanoTime);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.3Px} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.3Px} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.3Px} */
    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, X.3Pz] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        if ((r7 - r3) > 0) goto L_0x0062;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0X(X.C241623Px r19, long r20) {
        /*
            r18 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = A00
            r11 = r18
            int r0 = r3.get(r11)
            r5 = r20
            r10 = r19
            if (r0 != 0) goto L_0x00e3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = A01
            java.lang.Object r9 = r12.get(r11)
            X.3Pz r9 = (X.C241643Pz) r9
            if (r9 != 0) goto L_0x002c
            r1 = 0
            X.3Pz r0 = new X.3Pz
            r0.<init>()
            r0.A00 = r5
            X.1Ev.A00(r11, r1, r0, r12)
            java.lang.Object r9 = r12.get(r11)
            X.0qQ.A0A(r9)
            X.3Pz r9 = (X.C241643Pz) r9
        L_0x002c:
            r2 = r10
            r7 = r5
            monitor-enter(r2)
            java.lang.Object r0 = r10._heap     // Catch:{ all -> 0x00e0 }
            X.0zk r13 = X.C67411tL.A01     // Catch:{ all -> 0x00e0 }
            if (r0 != r13) goto L_0x0037
            r1 = 2
            goto L_0x00ab
        L_0x0037:
            monitor-enter(r9)     // Catch:{ all -> 0x00e0 }
            X.3Py[] r1 = r9.A00     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x0048
            r0 = 0
            r1 = r1[r0]     // Catch:{ all -> 0x00dd }
        L_0x003f:
            X.3Px r1 = (X.C241623Px) r1     // Catch:{ all -> 0x00dd }
            int r0 = r3.get(r11)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x004d
            goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x003f
        L_0x004a:
            r1 = 1
            monitor-exit(r9)     // Catch:{ all -> 0x00e0 }
            goto L_0x00ab
        L_0x004d:
            r16 = 0
            if (r1 == 0) goto L_0x0062
            long r0 = r1.A01     // Catch:{ all -> 0x00dd }
            long r14 = r0 - r20
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x005a
            r7 = r0
        L_0x005a:
            long r3 = r9.A00     // Catch:{ all -> 0x00dd }
            long r14 = r7 - r3
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
        L_0x0062:
            r9.A00 = r7     // Catch:{ all -> 0x00dd }
            r3 = r7
        L_0x0065:
            long r0 = r10.A01     // Catch:{ all -> 0x00dd }
            long r0 = r0 - r3
            int r7 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x006e
            r10.A01 = r3     // Catch:{ all -> 0x00dd }
        L_0x006e:
            java.lang.Object r0 = r10._heap     // Catch:{ all -> 0x00dd }
            if (r0 == r13) goto L_0x00d5
            r10._heap = r9     // Catch:{ all -> 0x00dd }
            X.3Py[] r0 = r9.A00     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x0090
            r0 = 4
            X.3Py[] r0 = new X.C241633Py[r0]     // Catch:{ all -> 0x00dd }
        L_0x007b:
            r9.A00 = r0     // Catch:{ all -> 0x00dd }
        L_0x007d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = X.C67401tJ.A01     // Catch:{ all -> 0x00dd }
            int r3 = r4.get(r9)     // Catch:{ all -> 0x00dd }
            int r1 = r3 + 1
            r4.set(r9, r1)     // Catch:{ all -> 0x00dd }
            r0[r3] = r19     // Catch:{ all -> 0x00dd }
            r10.A00 = r3     // Catch:{ all -> 0x00dd }
            X.C67401tJ.A01(r9, r3)     // Catch:{ all -> 0x00dd }
            goto L_0x00a9
        L_0x0090:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = X.C67401tJ.A01     // Catch:{ all -> 0x00dd }
            int r3 = r4.get(r9)     // Catch:{ all -> 0x00dd }
            int r1 = r0.length     // Catch:{ all -> 0x00dd }
            if (r3 < r1) goto L_0x007d
            int r1 = r4.get(r9)     // Catch:{ all -> 0x00dd }
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x00dd }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00dd }
            X.3Py[] r0 = (X.C241633Py[]) r0     // Catch:{ all -> 0x00dd }
            goto L_0x007b
        L_0x00a9:
            monitor-exit(r9)     // Catch:{ all -> 0x00e0 }
            r1 = 0
        L_0x00ab:
            monitor-exit(r2)
            if (r1 == 0) goto L_0x00b2
            r0 = 1
            if (r1 == r0) goto L_0x00e3
            return
        L_0x00b2:
            java.lang.Object r2 = r12.get(r11)
            X.1tJ r2 = (X.C67401tJ) r2
            if (r2 == 0) goto L_0x00e6
            monitor-enter(r2)
            X.3Py[] r1 = r2.A00     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00c3
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00e0 }
            goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            monitor-exit(r2)
            if (r0 != r10) goto L_0x00e6
            java.lang.Thread r1 = r11.A0U()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L_0x00e6
            java.util.concurrent.locks.LockSupport.unpark(r1)
            return
        L_0x00d5:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00dd }
            r0.<init>(r1)     // Catch:{ all -> 0x00dd }
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00e0 }
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00e3:
            r11.A0V(r10, r5)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262124Cf.A0X(X.3Px, long):void");
    }

    public final boolean A0Y() {
        boolean z;
        Object obj;
        01W r0 = this.A01;
        if (r0 != null) {
            z = r0.isEmpty();
        } else {
            z = true;
        }
        if (z && ((obj = A01.get(this)) == null || C67401tJ.A01.get(obj) == 0)) {
            Object obj2 = A02.get(this);
            if (obj2 == null) {
                return true;
            }
            if (obj2 instanceof 12p) {
                long j = 12p.A05.get(obj2);
                if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                    return true;
                }
                return false;
            } else if (obj2 == C67411tL.A00) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass19L CO5(Runnable runnable, C262094Cc r3, long j) {
        return C634912w.A00.CO5(runnable, r3, j);
    }

    public final void EKQ(1IX r6, long j) {
        long j2 = 0;
        if (j > 0) {
            if (j < 9223372036854L) {
                j2 = 1000000 * j;
                if (j2 >= 4611686018427387903L) {
                    return;
                }
            } else {
                return;
            }
        }
        long nanoTime = System.nanoTime();
        C241613Pw r0 = new C241613Pw(r6, this, j2 + nanoTime);
        A0X(r0, nanoTime);
        AnonymousClass1IV.A01(r6, r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b0, code lost:
        if (((int) ((1073741823 & r4) >> 0)) == ((int) ((r4 & 1152921503533105152L) >> 30))) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0080 A[EDGE_INSN: B:78:0x0080->B:42:0x0080 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0P() {
        /*
            r13 = this;
            boolean r0 = r13.A0T()
            r11 = 0
            if (r0 != 0) goto L_0x00df
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = A01
            java.lang.Object r7 = r8.get(r13)
            X.1tJ r7 = (X.C67401tJ) r7
            if (r7 == 0) goto L_0x0043
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C67401tJ.A01
            int r0 = r0.get(r7)
            if (r0 == 0) goto L_0x0043
            long r9 = java.lang.System.nanoTime()
        L_0x001e:
            monitor-enter(r7)
            X.3Py[] r1 = r7.A00     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0027
            r0 = 0
            r6 = r1[r0]     // Catch:{ all -> 0x007d }
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            r0 = 0
            if (r6 == 0) goto L_0x0040
            X.3Px r6 = (X.C241623Px) r6     // Catch:{ all -> 0x007d }
            long r4 = r6.A01     // Catch:{ all -> 0x007d }
            long r2 = r9 - r4
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 < 0) goto L_0x0040
            r2 = 0
            boolean r1 = r13.A01(r6)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0040
            X.3Py r0 = r7.A02(r2)     // Catch:{ all -> 0x007d }
        L_0x0040:
            monitor-exit(r7)
            if (r0 != 0) goto L_0x001e
        L_0x0043:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = A02
        L_0x0045:
            java.lang.Object r3 = r4.get(r13)
            r1 = 0
            if (r3 == 0) goto L_0x0080
            boolean r0 = r3 instanceof X.12p
            if (r0 == 0) goto L_0x006f
            r2 = r3
            X.12p r2 = (X.12p) r2
            java.lang.Object r1 = r2.A03()
            X.0zk r0 = X.12p.A04
            if (r1 == r0) goto L_0x0063
            java.lang.Runnable r1 = (java.lang.Runnable) r1
        L_0x005d:
            if (r1 == 0) goto L_0x0080
            r1.run()
            return r11
        L_0x0063:
            long r0 = X.12p.A00(r2)
            X.12p r0 = X.12p.A01(r2, r0)
            X.1Ev.A00(r13, r3, r0, r4)
            goto L_0x0045
        L_0x006f:
            X.0zk r0 = X.C67411tL.A00
            if (r3 == r0) goto L_0x0080
            boolean r0 = X.1Ev.A00(r13, r3, r1, r4)
            if (r0 == 0) goto L_0x0045
            r1 = r3
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            goto L_0x005d
        L_0x007d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0080:
            X.01W r0 = r13.A01
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00df
        L_0x008a:
            java.lang.Object r1 = r4.get(r13)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x00b2
            boolean r0 = r1 instanceof X.12p
            if (r0 == 0) goto L_0x00da
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.12p.A05
            long r4 = r0.get(r1)
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r4
            r6 = 0
            long r0 = r0 >> r6
            int r6 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r0
            r0 = 30
            long r4 = r4 >> r0
            int r0 = (int) r4
            if (r6 != r0) goto L_0x00df
        L_0x00b2:
            java.lang.Object r4 = r8.get(r13)
            X.1tJ r4 = (X.C67401tJ) r4
            if (r4 == 0) goto L_0x00de
            monitor-enter(r4)
            X.3Py[] r1 = r4.A00     // Catch:{ all -> 0x00d7 }
            if (r1 == 0) goto L_0x00c3
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00d7 }
            goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            monitor-exit(r4)
            X.3Px r0 = (X.C241623Px) r0
            if (r0 == 0) goto L_0x00de
            long r2 = r0.A01
            long r0 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00de
            r2 = 0
            return r2
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00da:
            X.0zk r0 = X.C67411tL.A00
            if (r1 != r0) goto L_0x00df
        L_0x00de:
            return r2
        L_0x00df:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262124Cf.A0P():long");
    }

    public void A0W(Runnable runnable) {
        if (A01(runnable)) {
            Thread A0U = A0U();
            if (Thread.currentThread() != A0U) {
                LockSupport.unpark(A0U);
                return;
            }
            return;
        }
        12x.A00.A0W(runnable);
    }

    public final void A0O(Runnable runnable, C262094Cc r2) {
        A0W(runnable);
    }
}
