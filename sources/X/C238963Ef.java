package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.3Ef  reason: invalid class name and case insensitive filesystem */
public final class C238963Ef extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A08 = AtomicIntegerFieldUpdater.newUpdater(C238963Ef.class, "workerCtl$volatile");
    public int A00 = 2SP.A01.A03();
    public long A01;
    public long A02;
    public Integer A03 = AnonymousClass05K.A0N;
    public boolean A04;
    public final 0rm A05 = new Object();
    public final C238973Eg A06 = new C238973Eg();
    public final /* synthetic */ 12m A07;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker = 12m.A07;
    public volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.0rm, java.lang.Object] */
    public C238963Ef(12m r2, int i) {
        this.A07 = r2;
        setDaemon(true);
        setContextClassLoader(r2.getClass().getClassLoader());
        A02(i);
    }

    private final 1F1 A00() {
        AnonymousClass12n r0;
        int i = this.A00;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >> 17);
        int i4 = i3 ^ (i3 << 5);
        this.A00 = i4;
        int i5 = i4 & 1;
        12m r1 = this.A07;
        if (i5 == 0) {
            1F1 r02 = (1F1) r1.A06.A01();
            if (r02 != null) {
                return r02;
            }
            r0 = r1.A05;
        } else {
            1F1 r03 = (1F1) r1.A05.A01();
            if (r03 != null) {
                return r03;
            }
            r0 = r1.A06;
        }
        return (1F1) r0.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (r4 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cd, code lost:
        if (r10 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x017f A[EDGE_INSN: B:133:0x017f->B:92:0x017f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1F1 A01(boolean r24) {
        /*
            r23 = this;
            r3 = r23
            java.lang.Integer r0 = r3.A03
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r0 == r4) goto L_0x007a
            X.12m r11 = r3.A07
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = X.12m.A09
        L_0x000c:
            long r12 = r10.get(r11)
            r0 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r0 & r12
            r2 = 42
            long r0 = r0 >> r2
            int r2 = (int) r0
            if (r2 != 0) goto L_0x006b
            X.3Eg r6 = r3.A06
            r8 = 1
        L_0x001f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C238973Eg.A04
            java.lang.Object r10 = r1.get(r6)
            X.1F1 r10 = (X.1F1) r10
            r7 = 0
            if (r10 == 0) goto L_0x0037
            X.12l r0 = r10.A01
            int r0 = r0.A00
            if (r0 != r8) goto L_0x0037
            boolean r0 = X.1Ev.A00(r6, r10, r7, r1)
            if (r0 == 0) goto L_0x001f
        L_0x0036:
            return r10
        L_0x0037:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C238973Eg.A02
            int r9 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C238973Eg.A03
            int r5 = r0.get(r6)
        L_0x0043:
            if (r9 == r5) goto L_0x00c5
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = X.C238973Eg.A01
            int r0 = r4.get(r6)
            if (r0 == 0) goto L_0x00c5
            int r5 = r5 + -1
            r2 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r6.A00
            java.lang.Object r10 = r1.get(r2)
            X.1F1 r10 = (X.1F1) r10
            if (r10 == 0) goto L_0x0043
            X.12l r0 = r10.A01
            int r0 = r0.A00
            if (r0 != r8) goto L_0x0043
            boolean r0 = X.1Af.A00(r10, r7, r1, r2)
            if (r0 == 0) goto L_0x0043
            r4.decrementAndGet(r6)
            return r10
        L_0x006b:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r14 = r12 - r0
            boolean r0 = r10.compareAndSet(r11, r12, r14)
            if (r0 == 0) goto L_0x000c
            r3.A03 = r4
        L_0x007a:
            if (r24 == 0) goto L_0x00bc
            X.12m r0 = r3.A07
            int r0 = r0.A00
            int r4 = r0 * 2
            int r2 = r3.A00
            int r0 = r2 << 13
            r2 = r2 ^ r0
            int r0 = r2 >> 17
            r2 = r2 ^ r0
            int r0 = r2 << 5
            r2 = r2 ^ r0
            r3.A00 = r2
            int r1 = r4 + -1
            r0 = r1 & r4
            if (r0 != 0) goto L_0x00a1
            r2 = r2 & r1
        L_0x0096:
            r4 = 0
            if (r2 != 0) goto L_0x00a7
            r4 = 1
            X.1F1 r10 = r3.A00()
            if (r10 == 0) goto L_0x00a7
            return r10
        L_0x00a1:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            int r2 = r2 % r4
            goto L_0x0096
        L_0x00a7:
            X.3Eg r2 = r3.A06
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C238973Eg.A04
            r0 = 0
            java.lang.Object r10 = r1.getAndSet(r2, r0)
            X.1F1 r10 = (X.1F1) r10
            if (r10 != 0) goto L_0x00b8
            X.1F1 r10 = X.C238973Eg.A00(r2)
        L_0x00b8:
            if (r10 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x00c3
        L_0x00bc:
            X.1F1 r10 = r3.A00()
            if (r10 == 0) goto L_0x00c3
            return r10
        L_0x00c3:
            r8 = 3
            goto L_0x00cf
        L_0x00c5:
            X.12n r0 = r11.A05
            java.lang.Object r10 = r0.A01()
            X.1F1 r10 = (X.1F1) r10
            if (r10 != 0) goto L_0x0036
        L_0x00cf:
            X.12m r0 = r3.A07
            r22 = r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = X.12m.A09
            long r4 = r1.get(r0)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r0
            int r11 = (int) r4
            r10 = 0
            r0 = 2
            if (r11 < r0) goto L_0x0036
            int r9 = r3.A00
            int r0 = r9 << 13
            r9 = r9 ^ r0
            int r0 = r9 >> 17
            r9 = r9 ^ r0
            int r0 = r9 << 5
            r9 = r9 ^ r0
            r3.A00 = r9
            int r1 = r11 + -1
            r0 = r1 & r11
            if (r0 != 0) goto L_0x01b5
            r9 = r9 & r1
        L_0x00f6:
            r7 = 0
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0101:
            r18 = 0
            if (r7 >= r11) goto L_0x01bc
            int r9 = r9 + 1
            if (r9 <= r11) goto L_0x010a
            r9 = 1
        L_0x010a:
            r0 = r22
            X.12q r0 = r0.A04
            java.lang.Object r0 = r0.A00(r9)
            X.3Ef r0 = (X.C238963Ef) r0
            if (r0 == 0) goto L_0x017f
            if (r0 == r3) goto L_0x017f
            X.3Eg r12 = r0.A06
            X.0rm r6 = r3.A05
            r0 = 3
            if (r8 != r0) goto L_0x012e
            X.1F1 r4 = X.C238973Eg.A00(r12)
            if (r4 == 0) goto L_0x014c
        L_0x0125:
            r6.A00 = r4
        L_0x0127:
            java.lang.Object r0 = r6.A00
            X.1F1 r0 = (X.1F1) r0
            r6.A00 = r10
            return r0
        L_0x012e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C238973Eg.A02
            int r4 = r0.get(r12)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C238973Eg.A03
            int r17 = r0.get(r12)
            r5 = 1
            if (r8 == r5) goto L_0x013e
            r5 = 0
        L_0x013e:
            r0 = r17
            if (r4 == r0) goto L_0x014c
            if (r5 == 0) goto L_0x018b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C238973Eg.A01
            int r0 = r0.get(r12)
            if (r0 != 0) goto L_0x018b
        L_0x014c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C238973Eg.A04
            java.lang.Object r13 = r0.get(r12)
            X.1F1 r13 = (X.1F1) r13
            if (r13 == 0) goto L_0x017f
            X.12l r4 = r13.A01
            int r5 = r4.A00
            r4 = 1
            if (r5 == r4) goto L_0x015e
            r4 = 2
        L_0x015e:
            r4 = r4 & r8
            if (r4 == 0) goto L_0x017f
            long r4 = X.C634512h.A04
            long r15 = java.lang.System.nanoTime()
            long r4 = r13.A00
            long r15 = r15 - r4
            long r4 = X.C634512h.A04
            int r14 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x0182
            long r4 = r4 - r15
            r12 = -1
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x017f
            long r1 = java.lang.Math.min(r1, r4)
        L_0x017f:
            int r7 = r7 + 1
            goto L_0x0101
        L_0x0182:
            boolean r0 = X.1Ev.A00(r12, r13, r10, r0)
            if (r0 == 0) goto L_0x014c
            r6.A00 = r13
            goto L_0x0127
        L_0x018b:
            int r16 = r4 + 1
            r14 = r4 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r12.A00
            java.lang.Object r4 = r13.get(r14)
            X.1F1 r4 = (X.1F1) r4
            if (r4 == 0) goto L_0x01b2
            X.12l r0 = r4.A01
            int r0 = r0.A00
            r15 = 1
            if (r0 == r15) goto L_0x01a1
            r15 = 0
        L_0x01a1:
            if (r15 != r5) goto L_0x01b2
            boolean r0 = X.1Af.A00(r4, r10, r13, r14)
            if (r0 == 0) goto L_0x01b2
            if (r5 == 0) goto L_0x0125
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C238973Eg.A01
            r0.decrementAndGet(r12)
            goto L_0x0125
        L_0x01b2:
            r4 = r16
            goto L_0x013e
        L_0x01b5:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r0
            int r9 = r9 % r11
            goto L_0x00f6
        L_0x01bc:
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x01c2
            r1 = 0
        L_0x01c2:
            r3.A01 = r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238963Ef.A01(boolean):X.1F1");
    }

    public final void A02(int i) {
        String valueOf;
        String str = this.A07.A03;
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        setName(002.A0g(str, "-worker-", valueOf));
        this.indexInArray = i;
    }

    public final boolean A03(Integer num) {
        Integer num2 = this.A03;
        boolean z = false;
        if (num2 == AnonymousClass05K.A00) {
            z = true;
            12m.A09.addAndGet(this.A07, 4398046511104L);
        }
        if (num2 != num) {
            this.A03 = num;
        }
        return z;
    }

    public final void run() {
        Integer num;
        long j;
        int i;
        loop0:
        while (true) {
            boolean z = false;
            while (true) {
                12m r6 = this.A07;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 12m.A08;
                if (atomicIntegerFieldUpdater.get(r6) != 0 || this.A03 == (num = AnonymousClass05K.A0Y)) {
                    A03(AnonymousClass05K.A0Y);
                } else {
                    1F1 A012 = A01(this.A04);
                    if (A012 != null) {
                        this.A01 = 0;
                        int i2 = A012.A01.A00;
                        this.A02 = 0;
                        if (this.A03 == AnonymousClass05K.A0C) {
                            this.A03 = AnonymousClass05K.A01;
                        }
                        if (i2 != 0 && A03(AnonymousClass05K.A01)) {
                            r6.A04();
                        }
                        12m.A01(A012);
                        if (i2 != 0) {
                            12m.A09.addAndGet(r6, -2097152);
                            if (this.A03 != num) {
                                this.A03 = AnonymousClass05K.A0N;
                            }
                        }
                    } else {
                        this.A04 = false;
                        if (this.A01 != 0) {
                            if (z) {
                                A03(AnonymousClass05K.A0C);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.A01);
                                this.A01 = 0;
                                break;
                            }
                            z = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            0zk r11 = 12m.A07;
                            if (obj != r11) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = A08;
                                atomicIntegerFieldUpdater2.set(this, -1);
                                while (this.nextParkedWorker != r11 && atomicIntegerFieldUpdater2.get(this) == -1 && atomicIntegerFieldUpdater.get(r6) == 0 && this.A03 != num) {
                                    A03(AnonymousClass05K.A0C);
                                    Thread.interrupted();
                                    if (this.A02 == 0) {
                                        this.A02 = System.nanoTime() + r6.A02;
                                    }
                                    LockSupport.parkNanos(r6.A02);
                                    if (System.nanoTime() - this.A02 >= 0) {
                                        this.A02 = 0;
                                        12q r14 = r6.A04;
                                        synchronized (r14) {
                                            if (atomicIntegerFieldUpdater.get(r6) == 0) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = 12m.A09;
                                                if (((int) (atomicLongFieldUpdater.get(r6) & 2097151)) > r6.A00 && atomicIntegerFieldUpdater2.compareAndSet(this, -1, 1)) {
                                                    int i3 = this.indexInArray;
                                                    A02(0);
                                                    r6.A06(this, i3, 0);
                                                    int andDecrement = (int) (2097151 & atomicLongFieldUpdater.getAndDecrement(r6));
                                                    if (andDecrement != i3) {
                                                        Object A002 = r14.A00(andDecrement);
                                                        0qQ.A0A(A002);
                                                        C238963Ef r0 = (C238963Ef) A002;
                                                        r14.A01(i3, r0);
                                                        r0.A02(i3);
                                                        r6.A06(r0, andDecrement, i3);
                                                    }
                                                    r14.A01(andDecrement, (Object) null);
                                                    this.A03 = num;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (this.nextParkedWorker == r11) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = 12m.A0A;
                                do {
                                    j = atomicLongFieldUpdater2.get(r6);
                                    i = this.indexInArray;
                                    this.nextParkedWorker = r6.A04.A00((int) (2097151 & j));
                                } while (!atomicLongFieldUpdater2.compareAndSet(r6, j, ((long) i) | ((2097152 + j) & -2097152)));
                            }
                        }
                    }
                }
            }
        }
        A03(AnonymousClass05K.A0Y);
    }
}
