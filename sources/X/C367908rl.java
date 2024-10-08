package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* renamed from: X.8rl  reason: invalid class name and case insensitive filesystem */
public final class C367908rl extends ReentrantLock {
    public int A00;
    public int A01;
    public long A02;
    public final long A03;
    public final C367668rN A04;
    public final C367698rQ A05;
    public final ReferenceQueue A06;
    public final ReferenceQueue A07;
    public final Queue A08;
    public final Queue A09;
    public final Queue A0A;
    public final AtomicInteger A0B = new AtomicInteger();
    public volatile int A0C;
    public volatile AtomicReferenceArray A0D;

    public boolean removeEntry(C367948rp r13, int i, C390639rb r15) {
        AtomicReferenceArray atomicReferenceArray = this.A0D;
        int length = (atomicReferenceArray.length() - 1) & i;
        C367948rp r7 = (C367948rp) atomicReferenceArray.get(length);
        for (C367948rp r8 = r7; r8 != null; r8 = r8.BW2()) {
            if (r8 == r13) {
                this.A00++;
                atomicReferenceArray.set(length, A00(r8.CDT(), r7, r8, r15, r8.getKey(), r8.CDT().get()));
                this.A0C--;
                return true;
            }
        }
        return false;
    }

    public final C367948rp A02(Object obj, int i) {
        AtomicReferenceArray atomicReferenceArray = this.A0D;
        for (C367948rp r2 = (C367948rp) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); r2 != null; r2 = r2.BW2()) {
            if (r2.BCU() == i) {
                Object key = r2.getKey();
                if (key == null) {
                    A0F();
                } else if (this.A05.A09.A01(obj, key)) {
                    return r2;
                }
            }
        }
        return null;
    }

    public final Object A09(Object obj, int i) {
        Object obj2;
        try {
            if (this.A0C != 0) {
                C367698rQ r3 = this.A05;
                long A002 = r3.A0B.A00();
                C367948rp A032 = A03(obj, i, A002);
                if (A032 != null) {
                    Object obj3 = A032.CDT().get();
                    if (obj3 != null) {
                        this.A09.add(A032);
                        Object key = A032.getKey();
                        C368338sS r7 = r3.A0D;
                        long j = r3.A08;
                        if (j <= 0 || A002 - A032.CGr() <= j || A032.CDT().isLoading() || (obj2 = A05(r7, key, i, true)) == null) {
                            obj2 = obj3;
                        }
                        return obj2;
                    }
                    A0F();
                }
            }
            A0D();
            return null;
        } finally {
            A0D();
        }
    }

    public final void A0A() {
        while (true) {
            Object poll = this.A09.poll();
            if (poll != null) {
                Queue queue = this.A08;
                if (queue.contains(poll)) {
                    queue.add(poll);
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0B() {
        C367698rQ r0 = this.A05;
        C367738rU r1 = r0.A0F;
        C367738rU r4 = C367738rU.A01;
        if (r1 != r4) {
            int i = 0;
            do {
                Reference poll = this.A06.poll();
                if (poll == null) {
                    break;
                }
                C367948rp r2 = (C367948rp) poll;
                int BCU = r2.BCU();
                C367908rl A012 = r0.A01(BCU);
                A012.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = A012.A0D;
                    int length = (atomicReferenceArray.length() - 1) & BCU;
                    C367948rp r10 = (C367948rp) atomicReferenceArray.get(length);
                    C367948rp r11 = r10;
                    while (true) {
                        if (r11 == null) {
                            break;
                        } else if (r11 == r2) {
                            A012.A00++;
                            atomicReferenceArray.set(length, A012.A00(r11.CDT(), r10, r11, C390639rb.A00, r11.getKey(), r11.CDT().get()));
                            A012.A0C--;
                            break;
                        } else {
                            r11 = r11.BW2();
                        }
                    }
                    A012.unlock();
                    A012.A0E();
                    i++;
                } catch (Throwable th) {
                    A012.unlock();
                    A012.A0E();
                    throw th;
                }
            } while (i != 16);
        }
        if (r0.A0G != r4) {
            int i2 = 0;
            do {
                Reference poll2 = this.A07.poll();
                if (poll2 != null) {
                    C367718rS r9 = (C367718rS) poll2;
                    C367948rp B1w = r9.B1w();
                    int BCU2 = B1w.BCU();
                    C367908rl A013 = r0.A01(BCU2);
                    Object key = B1w.getKey();
                    A013.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray2 = A013.A0D;
                        int length2 = (atomicReferenceArray2.length() - 1) & BCU2;
                        C367948rp r102 = (C367948rp) atomicReferenceArray2.get(length2);
                        C367948rp r112 = r102;
                        while (true) {
                            if (r112 == null) {
                                break;
                            }
                            Object key2 = r112.getKey();
                            if (r112.BCU() != BCU2 || key2 == null || !A013.A05.A09.A01(key, key2)) {
                                r112 = r112.BW2();
                            } else if (r112.CDT() == r9) {
                                A013.A00++;
                                atomicReferenceArray2.set(length2, A013.A00(r9, r102, r112, C390639rb.A00, key2, r9.get()));
                                A013.A0C--;
                            }
                        }
                        i2++;
                    } finally {
                        A013.unlock();
                        if (!A013.isHeldByCurrentThread()) {
                            A013.A0E();
                        }
                    }
                } else {
                    return;
                }
            } while (i2 != 16);
        }
    }

    public final void A0C() {
        AtomicReferenceArray atomicReferenceArray = this.A0D;
        int length = atomicReferenceArray.length();
        if (length < 1073741824) {
            int i = this.A0C;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.A01 = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                C367948rp r4 = (C367948rp) atomicReferenceArray.get(i2);
                if (r4 != null) {
                    C367948rp BW2 = r4.BW2();
                    int BCU = r4.BCU() & length2;
                    if (BW2 == null) {
                        atomicReferenceArray2.set(BCU, r4);
                    } else {
                        C367948rp r2 = r4;
                        do {
                            int BCU2 = BW2.BCU() & length2;
                            if (BCU2 != BCU) {
                                r2 = BW2;
                                BCU = BCU2;
                            }
                            BW2 = BW2.BW2();
                        } while (BW2 != null);
                        atomicReferenceArray2.set(BCU, r2);
                        while (r4 != r2) {
                            int BCU3 = r4.BCU() & length2;
                            C367948rp A012 = A01(r4, (C367948rp) atomicReferenceArray2.get(BCU3));
                            if (A012 != null) {
                                atomicReferenceArray2.set(BCU3, A012);
                            } else {
                                A0J(r4);
                                i--;
                            }
                            r4 = r4.BW2();
                        }
                    }
                }
            }
            this.A0D = atomicReferenceArray2;
            this.A0C = i;
        }
    }

    public final void A0D() {
        if ((this.A0B.incrementAndGet() & 63) == 0) {
            A0H(this.A05.A0B.A00());
            A0E();
        }
    }

    public final void A0I(C367948rp r7) {
        if (this.A05.A07 >= 0) {
            A0A();
            long j = this.A03;
            if (((long) r7.CDT().CGN()) <= j || removeEntry(r7, r7.BCU(), C390639rb.A04)) {
                while (this.A02 > j) {
                    for (C367948rp r4 : this.A08) {
                        if (r4.CDT().CGN() > 0) {
                            if (!removeEntry(r4, r4.BCU(), C390639rb.A04)) {
                                throw new AssertionError();
                            }
                        }
                    }
                    throw new AssertionError();
                }
                return;
            }
            throw new AssertionError();
        }
    }

    public final void A0L(C390639rb r5, Object obj, Object obj2, int i) {
        this.A02 -= (long) i;
        Queue queue = this.A05.A0J;
        if (queue != C367698rQ.A0M) {
            queue.offer(new C368458se(r5, obj, obj2));
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean containsValue(Object obj) {
        try {
            if (this.A0C != 0) {
                C367698rQ r8 = this.A05;
                long A002 = r8.A0B.A00();
                AtomicReferenceArray atomicReferenceArray = this.A0D;
                int length = atomicReferenceArray.length();
                for (int i = 0; i < length; i++) {
                    C367948rp r4 = (C367948rp) atomicReferenceArray.get(i);
                    while (r4 != null) {
                        Object A082 = A08(r4, A002);
                        if (A082 == null || !r8.A0A.A01(obj, A082)) {
                            r4 = r4.BW2();
                        } else {
                            A0D();
                            return true;
                        }
                    }
                }
            }
            A0D();
            return false;
        } catch (Throwable th) {
            A0D();
            throw th;
        }
    }

    public C367908rl(C367668rN r8, C367698rQ r9, int i, long j) {
        ReferenceQueue referenceQueue;
        boolean z;
        Queue queue;
        Queue queue2;
        Queue queue3;
        this.A05 = r9;
        this.A03 = j;
        r8.getClass();
        this.A04 = r8;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.A01 = length;
        if (this.A05.A0I == C367778rY.A01 && ((long) length) == this.A03) {
            this.A01 = length + 1;
        }
        this.A0D = atomicReferenceArray;
        C367738rU r1 = r9.A0F;
        C367738rU r2 = C367738rU.A01;
        boolean z2 = r1 != r2;
        ReferenceQueue referenceQueue2 = null;
        if (z2) {
            referenceQueue = new ReferenceQueue();
        } else {
            referenceQueue = null;
        }
        this.A06 = referenceQueue;
        this.A07 = r9.A0G != r2 ? new ReferenceQueue() : referenceQueue2;
        if (r9.A07 >= 0) {
            z = true;
            queue = new ConcurrentLinkedQueue();
        } else {
            z = false;
            queue = C367698rQ.A0M;
        }
        this.A09 = queue;
        if (r9.A06 > 0) {
            queue2 = new C367918rm();
        } else {
            queue2 = C367698rQ.A0M;
        }
        this.A0A = queue2;
        if (z) {
            queue3 = new C41528AvW();
        } else {
            queue3 = C367698rQ.A0M;
        }
        this.A08 = queue3;
    }

    public final C367948rp A00(C367718rS r4, C367948rp r5, C367948rp r6, C390639rb r7, Object obj, Object obj2) {
        A0L(r7, obj, obj2, r4.CGN());
        this.A0A.remove(r6);
        this.A08.remove(r6);
        if (r4.isLoading()) {
            r4.CsB((Object) null);
            return r5;
        }
        int i = this.A0C;
        C367948rp BW2 = r6.BW2();
        while (r5 != r6) {
            C367948rp A012 = A01(r5, BW2);
            if (A012 != null) {
                BW2 = A012;
            } else {
                A0J(r5);
                i--;
            }
            r5 = r5.BW2();
        }
        this.A0C = i;
        return BW2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r7.CDT();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C367948rp A01(X.C367948rp r7, X.C367948rp r8) {
        /*
            r6 = this;
            java.lang.Object r3 = r7.getKey()
            r5 = 0
            if (r3 == 0) goto L_0x0017
            X.8rS r2 = r7.CDT()
            java.lang.Object r1 = r2.get()
            if (r1 != 0) goto L_0x0018
            boolean r0 = r2.isActive()
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            return r5
        L_0x0018:
            X.8rQ r0 = r6.A05
            X.8rc r4 = r0.A0E
            boolean r0 = r4 instanceof X.C367848rf
            if (r0 != 0) goto L_0x0052
            boolean r0 = r4 instanceof X.C367898rk
            if (r0 != 0) goto L_0x005b
            boolean r0 = r4 instanceof X.C367888rj
            if (r0 != 0) goto L_0x0052
            boolean r0 = r4 instanceof X.C367878ri
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof X.C367858rg
            if (r0 != 0) goto L_0x005b
            boolean r0 = r4 instanceof X.C367838re
            if (r0 != 0) goto L_0x0046
            int r0 = r7.BCU()
            X.8rp r5 = r4.A01(r6, r8, r3, r0)
        L_0x003c:
            java.lang.ref.ReferenceQueue r0 = r6.A07
            X.8rS r0 = r2.AKj(r5, r1, r0)
            r5.Epz(r0)
            return r5
        L_0x0046:
            int r0 = r7.BCU()
            X.8rp r5 = r4.A01(r6, r8, r3, r0)
            X.C367818rc.A00(r7, r5)
            goto L_0x003c
        L_0x0052:
            int r0 = r7.BCU()
            X.8rp r5 = r4.A01(r6, r8, r3, r0)
            goto L_0x0066
        L_0x005b:
            int r0 = r7.BCU()
            X.8rp r5 = r4.A01(r6, r8, r3, r0)
            X.C367818rc.A00(r7, r5)
        L_0x0066:
            long r3 = r7.CGr()
            r5.Er2(r3)
            X.8rp r0 = r7.BfE()
            r0.EeB(r5)
            r5.Egg(r0)
            X.8rp r0 = r7.BWA()
            r5.EeB(r0)
            r0.Egg(r5)
            X.8sb r0 = X.C368428sb.A01
            r7.EeB(r0)
            r7.Egg(r0)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367908rl.A01(X.8rp, X.8rp):X.8rp");
    }

    public final C367948rp A03(Object obj, int i, long j) {
        C367948rp A022 = A02(obj, i);
        if (A022 != null) {
            if (!this.A05.A03(A022, j)) {
                return A022;
            }
            if (tryLock()) {
                try {
                    A0G(j);
                    return null;
                } finally {
                    unlock();
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r3 = r4.CDT();
        r5 = r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (r5 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r10.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r3.isActive() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        A0L(X.C390639rb.A00, r12, r5, r3.CGN());
        A0K(r4, r13, r0);
        r0 = r10.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        A0K(r4, r13, r0);
        r0 = r10.A0C + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (r14 == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r10.A08.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        r10.A00++;
        A0L(X.C390639rb.A03, r12, r5, r3.CGN());
        A0K(r4, r13, r0);
        A0I(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        unlock();
        A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(int r11, java.lang.Object r12, java.lang.Object r13, boolean r14) {
        /*
            r10 = this;
            r10.lock()
            X.8rQ r7 = r10.A05     // Catch:{ all -> 0x00bb }
            X.4MQ r0 = r7.A0B     // Catch:{ all -> 0x00bb }
            long r0 = r0.A00()     // Catch:{ all -> 0x00bb }
            r10.A0H(r0)     // Catch:{ all -> 0x00bb }
            int r2 = r10.A0C     // Catch:{ all -> 0x00bb }
            int r3 = r2 + 1
            int r2 = r10.A01     // Catch:{ all -> 0x00bb }
            if (r3 <= r2) goto L_0x0019
            r10.A0C()     // Catch:{ all -> 0x00bb }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r10.A0D     // Catch:{ all -> 0x00bb }
            int r2 = r6.length()     // Catch:{ all -> 0x00bb }
            int r2 = r2 + -1
            r5 = r11 & r2
            java.lang.Object r3 = r6.get(r5)     // Catch:{ all -> 0x00bb }
            X.8rp r3 = (X.C367948rp) r3     // Catch:{ all -> 0x00bb }
            r4 = r3
        L_0x002a:
            r9 = 0
            if (r4 == 0) goto L_0x003a
            java.lang.Object r8 = r4.getKey()     // Catch:{ all -> 0x00bb }
            int r2 = r4.BCU()     // Catch:{ all -> 0x00bb }
            if (r2 != r11) goto L_0x008b
            if (r8 == 0) goto L_0x008b
            goto L_0x0051
        L_0x003a:
            int r2 = r10.A00     // Catch:{ all -> 0x00bb }
            int r2 = r2 + 1
            r10.A00 = r2     // Catch:{ all -> 0x00bb }
            X.8rc r2 = r7.A0E     // Catch:{ all -> 0x00bb }
            X.8rp r4 = r2.A01(r10, r3, r12, r11)     // Catch:{ all -> 0x00bb }
            r10.A0K(r4, r13, r0)     // Catch:{ all -> 0x00bb }
            r6.set(r5, r4)     // Catch:{ all -> 0x00bb }
            int r0 = r10.A0C     // Catch:{ all -> 0x00bb }
            int r0 = r0 + 1
            goto L_0x007d
        L_0x0051:
            X.17u r2 = r7.A09     // Catch:{ all -> 0x00bb }
            boolean r2 = r2.A01(r12, r8)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x008b
            X.8rS r3 = r4.CDT()     // Catch:{ all -> 0x00bb }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x00bb }
            if (r5 != 0) goto L_0x0097
            int r2 = r10.A00     // Catch:{ all -> 0x00bb }
            int r2 = r2 + 1
            r10.A00 = r2     // Catch:{ all -> 0x00bb }
            boolean r2 = r3.isActive()     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0083
            int r3 = r3.CGN()     // Catch:{ all -> 0x00bb }
            X.9rb r2 = X.C390639rb.A00     // Catch:{ all -> 0x00bb }
            r10.A0L(r2, r12, r5, r3)     // Catch:{ all -> 0x00bb }
            r10.A0K(r4, r13, r0)     // Catch:{ all -> 0x00bb }
            int r0 = r10.A0C     // Catch:{ all -> 0x00bb }
        L_0x007d:
            r10.A0C = r0     // Catch:{ all -> 0x00bb }
            r10.A0I(r4)     // Catch:{ all -> 0x00bb }
            goto L_0x0090
        L_0x0083:
            r10.A0K(r4, r13, r0)     // Catch:{ all -> 0x00bb }
            int r0 = r10.A0C     // Catch:{ all -> 0x00bb }
            int r0 = r0 + 1
            goto L_0x007d
        L_0x008b:
            X.8rp r4 = r4.BW2()     // Catch:{ all -> 0x00bb }
            goto L_0x002a
        L_0x0090:
            r10.unlock()
            r10.A0E()
            return r9
        L_0x0097:
            if (r14 == 0) goto L_0x009f
            java.util.Queue r0 = r10.A08     // Catch:{ all -> 0x00bb }
            r0.add(r4)     // Catch:{ all -> 0x00bb }
            goto L_0x00b4
        L_0x009f:
            int r2 = r10.A00     // Catch:{ all -> 0x00bb }
            int r2 = r2 + 1
            r10.A00 = r2     // Catch:{ all -> 0x00bb }
            int r3 = r3.CGN()     // Catch:{ all -> 0x00bb }
            X.9rb r2 = X.C390639rb.A03     // Catch:{ all -> 0x00bb }
            r10.A0L(r2, r12, r5, r3)     // Catch:{ all -> 0x00bb }
            r10.A0K(r4, r13, r0)     // Catch:{ all -> 0x00bb }
            r10.A0I(r4)     // Catch:{ all -> 0x00bb }
        L_0x00b4:
            r10.unlock()
            r10.A0E()
            return r5
        L_0x00bb:
            r0 = move-exception
            r10.unlock()
            r10.A0E()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367908rl.A04(int, java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    public final Object A05(C368338sS r10, Object obj, int i, boolean z) {
        AWU awu;
        lock();
        try {
            C367698rQ r4 = this.A05;
            long A002 = r4.A0B.A00();
            A0H(A002);
            AtomicReferenceArray atomicReferenceArray = this.A0D;
            int length = (atomicReferenceArray.length() - 1) & i;
            C367948rp r5 = (C367948rp) atomicReferenceArray.get(length);
            C367948rp r6 = r5;
            while (true) {
                if (r6 == null) {
                    this.A00++;
                    awu = new AWU();
                    C367818rc r0 = r4.A0E;
                    obj.getClass();
                    C367948rp A012 = r0.A01(this, r5, obj, i);
                    A012.Epz(awu);
                    atomicReferenceArray.set(length, A012);
                    break;
                }
                Object key = r6.getKey();
                if (r6.BCU() != i || key == null || !r4.A09.A01(obj, key)) {
                    r6 = r6.BW2();
                } else {
                    C367718rS CDT = r6.CDT();
                    if (!CDT.isLoading()) {
                        if (!z || A002 - r6.CGr() >= r4.A08) {
                            this.A00++;
                            awu = new AWU(CDT);
                            r6.Epz(awu);
                        }
                    }
                    awu = null;
                }
            }
            unlock();
            A0E();
            if (awu == null) {
                return null;
            }
            ListenableFuture A003 = awu.A00(r10, obj);
            A003.addListener(new C41230AqS(awu, this, A003, obj, i), 1Lf.A01);
            if (A003.isDone()) {
                try {
                    return AnonymousClass412.A00(A003);
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            unlock();
            A0E();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        r11.A0C = r6;
        A0I(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(X.AWU r12, com.google.common.util.concurrent.ListenableFuture r13, java.lang.Object r14, int r15) {
        /*
            r11 = this;
            java.lang.Object r3 = X.AnonymousClass412.A00(r13)     // Catch:{ all -> 0x00d8 }
            if (r3 == 0) goto L_0x00b4
            X.4MS r1 = r12.A00     // Catch:{ all -> 0x00db }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00db }
            r1.A00(r0)     // Catch:{ all -> 0x00db }
            r11.lock()     // Catch:{ all -> 0x00db }
            X.8rQ r9 = r11.A05     // Catch:{ all -> 0x00d0 }
            X.4MQ r0 = r9.A0B     // Catch:{ all -> 0x00d0 }
            long r0 = r0.A00()     // Catch:{ all -> 0x00d0 }
            r11.A0H(r0)     // Catch:{ all -> 0x00d0 }
            int r2 = r11.A0C     // Catch:{ all -> 0x00d0 }
            r4 = 1
            int r6 = r2 + 1
            int r2 = r11.A01     // Catch:{ all -> 0x00d0 }
            if (r6 <= r2) goto L_0x002b
            r11.A0C()     // Catch:{ all -> 0x00d0 }
            int r2 = r11.A0C     // Catch:{ all -> 0x00d0 }
            int r6 = r2 + 1
        L_0x002b:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r11.A0D     // Catch:{ all -> 0x00d0 }
            int r2 = r8.length()     // Catch:{ all -> 0x00d0 }
            int r2 = r2 - r4
            r7 = r15 & r2
            java.lang.Object r5 = r8.get(r7)     // Catch:{ all -> 0x00d0 }
            X.8rp r5 = (X.C367948rp) r5     // Catch:{ all -> 0x00d0 }
            r2 = r5
        L_0x003b:
            if (r2 == 0) goto L_0x008f
            java.lang.Object r10 = r2.getKey()     // Catch:{ all -> 0x00d0 }
            int r4 = r2.BCU()     // Catch:{ all -> 0x00d0 }
            if (r4 != r15) goto L_0x005c
            if (r10 == 0) goto L_0x005c
            X.17u r4 = r9.A09     // Catch:{ all -> 0x00d0 }
            boolean r4 = r4.A01(r14, r10)     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x005c
            X.8rS r5 = r2.CDT()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r7 = r5.get()     // Catch:{ all -> 0x00d0 }
            if (r12 == r5) goto L_0x0067
            goto L_0x0061
        L_0x005c:
            X.8rp r2 = r2.BW2()     // Catch:{ all -> 0x00d0 }
            goto L_0x003b
        L_0x0061:
            if (r7 != 0) goto L_0x0088
            X.8rS r4 = X.C367698rQ.A0L     // Catch:{ all -> 0x00d0 }
            if (r5 == r4) goto L_0x0088
        L_0x0067:
            int r4 = r11.A00     // Catch:{ all -> 0x00d0 }
            int r4 = r4 + 1
            r11.A00 = r4     // Catch:{ all -> 0x00d0 }
            X.8rS r4 = r12.A02     // Catch:{ all -> 0x00d0 }
            boolean r4 = r4.isActive()     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x00a5
            if (r7 != 0) goto L_0x007a
            X.9rb r5 = X.C390639rb.A00     // Catch:{ all -> 0x00d0 }
            goto L_0x007c
        L_0x007a:
            X.9rb r5 = X.C390639rb.A03     // Catch:{ all -> 0x00d0 }
        L_0x007c:
            X.8rS r4 = r12.A02     // Catch:{ all -> 0x00d0 }
            int r4 = r4.CGN()     // Catch:{ all -> 0x00d0 }
            r11.A0L(r5, r14, r7, r4)     // Catch:{ all -> 0x00d0 }
            int r6 = r6 + -1
            goto L_0x00a5
        L_0x0088:
            r1 = 0
            X.9rb r0 = X.C390639rb.A03     // Catch:{ all -> 0x00d0 }
            r11.A0L(r0, r14, r3, r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00ad
        L_0x008f:
            int r2 = r11.A00     // Catch:{ all -> 0x00d0 }
            int r2 = r2 + 1
            r11.A00 = r2     // Catch:{ all -> 0x00d0 }
            X.8rc r2 = r9.A0E     // Catch:{ all -> 0x00d0 }
            r14.getClass()     // Catch:{ all -> 0x00d0 }
            X.8rp r2 = r2.A01(r11, r5, r14, r15)     // Catch:{ all -> 0x00d0 }
            r11.A0K(r2, r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.set(r7, r2)     // Catch:{ all -> 0x00d0 }
            goto L_0x00a8
        L_0x00a5:
            r11.A0K(r2, r3, r0)     // Catch:{ all -> 0x00d0 }
        L_0x00a8:
            r11.A0C = r6     // Catch:{ all -> 0x00d0 }
            r11.A0I(r2)     // Catch:{ all -> 0x00d0 }
        L_0x00ad:
            r11.unlock()     // Catch:{ all -> 0x00db }
            r11.A0E()     // Catch:{ all -> 0x00db }
            return r3
        L_0x00b4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r1.<init>()     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "CacheLoader returned null for key "
            r1.append(r0)     // Catch:{ all -> 0x00db }
            r1.append(r14)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ all -> 0x00db }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00db }
            X.AvB r0 = new X.AvB     // Catch:{ all -> 0x00db }
            r0.<init>(r1)     // Catch:{ all -> 0x00db }
            goto L_0x00d7
        L_0x00d0:
            r0 = move-exception
            r11.unlock()     // Catch:{ all -> 0x00db }
            r11.A0E()     // Catch:{ all -> 0x00db }
        L_0x00d7:
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00d8:
            r7 = move-exception
            r3 = 0
            goto L_0x00dc
        L_0x00db:
            r7 = move-exception
        L_0x00dc:
            if (r3 != 0) goto L_0x0158
            X.4MS r1 = r12.A00
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            r1.A00(r0)
            r11.lock()
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r11.A0D     // Catch:{ all -> 0x014a }
            int r5 = r6.length()     // Catch:{ all -> 0x014a }
            r0 = 1
            int r5 = r5 - r0
            r5 = r5 & r15
            java.lang.Object r4 = r6.get(r5)     // Catch:{ all -> 0x014a }
            X.8rp r4 = (X.C367948rp) r4     // Catch:{ all -> 0x014a }
            r3 = r4
        L_0x00f8:
            if (r3 == 0) goto L_0x0152
            java.lang.Object r1 = r3.getKey()     // Catch:{ all -> 0x014a }
            int r0 = r3.BCU()     // Catch:{ all -> 0x014a }
            if (r0 != r15) goto L_0x011d
            if (r1 == 0) goto L_0x011d
            X.8rQ r0 = r11.A05     // Catch:{ all -> 0x014a }
            X.17u r0 = r0.A09     // Catch:{ all -> 0x014a }
            boolean r0 = r0.A01(r14, r1)     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x011d
            X.8rS r0 = r3.CDT()     // Catch:{ all -> 0x014a }
            if (r0 != r12) goto L_0x0152
            X.8rS r0 = r12.A02     // Catch:{ all -> 0x014a }
            boolean r0 = r0.isActive()     // Catch:{ all -> 0x014a }
            goto L_0x0122
        L_0x011d:
            X.8rp r3 = r3.BW2()     // Catch:{ all -> 0x014a }
            goto L_0x00f8
        L_0x0122:
            if (r0 == 0) goto L_0x012a
            X.8rS r0 = r12.A02     // Catch:{ all -> 0x014a }
            r3.Epz(r0)     // Catch:{ all -> 0x014a }
            goto L_0x0152
        L_0x012a:
            int r2 = r11.A0C     // Catch:{ all -> 0x014a }
            X.8rp r1 = r3.BW2()     // Catch:{ all -> 0x014a }
        L_0x0130:
            if (r4 == r3) goto L_0x0144
            X.8rp r0 = r11.A01(r4, r1)     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x013a
            r1 = r0
            goto L_0x013f
        L_0x013a:
            r11.A0J(r4)     // Catch:{ all -> 0x014a }
            int r2 = r2 + -1
        L_0x013f:
            X.8rp r4 = r4.BW2()     // Catch:{ all -> 0x014a }
            goto L_0x0130
        L_0x0144:
            r11.A0C = r2     // Catch:{ all -> 0x014a }
            r6.set(r5, r1)     // Catch:{ all -> 0x014a }
            goto L_0x0152
        L_0x014a:
            r0 = move-exception
            r11.unlock()
            r11.A0E()
            throw r0
        L_0x0152:
            r11.unlock()
            r11.A0E()
        L_0x0158:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367908rl.A06(X.AWU, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, int):java.lang.Object");
    }

    public final Object A07(C367718rS r3, C367948rp r4, Object obj) {
        if (r3.isLoading()) {
            17k.A0B(obj, "Recursive load of: %s", !Thread.holdsLock(r4));
            Object FNF = r3.FNF();
            if (FNF != null) {
                this.A05.A0B.A00();
                this.A09.add(r4);
                return FNF;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CacheLoader returned null for key ");
            sb.append(obj);
            sb.append(".");
            throw new RuntimeException(sb.toString());
        }
        throw new AssertionError();
    }

    public final Object A08(C367948rp r4, long j) {
        Object obj;
        if (r4.getKey() == null || (obj = r4.CDT().get()) == null) {
            A0F();
        } else if (!this.A05.A03(r4, j)) {
            return obj;
        } else {
            if (tryLock()) {
                try {
                    A0G(j);
                    return null;
                } finally {
                    unlock();
                }
            }
        }
        return null;
    }

    public final void A0E() {
        if (!isHeldByCurrentThread()) {
            C367698rQ r4 = this.A05;
            while (true) {
                C368458se r1 = (C368458se) r4.A0J.poll();
                if (r1 != null) {
                    try {
                        r4.A0H.DdG(r1);
                    } catch (Throwable th) {
                        C367698rQ.A0N.log(Level.WARNING, "Exception thrown by removal listener", th);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void A0F() {
        if (tryLock()) {
            try {
                A0B();
            } finally {
                unlock();
            }
        }
    }

    public final void A0G(long j) {
        C367948rp r2;
        C367948rp r22;
        A0A();
        do {
            r2 = (C367948rp) this.A0A.peek();
            if (r2 == null || !this.A05.A03(r2, j)) {
                do {
                    r22 = (C367948rp) this.A08.peek();
                    if (r22 == null || !this.A05.A03(r22, j)) {
                        return;
                    }
                } while (removeEntry(r22, r22.BCU(), C390639rb.A01));
                throw new AssertionError();
            }
        } while (removeEntry(r2, r2.BCU(), C390639rb.A01));
        throw new AssertionError();
    }

    public final void A0H(long j) {
        if (tryLock()) {
            try {
                A0B();
                A0G(j);
                this.A0B.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final void A0J(C367948rp r5) {
        Object key = r5.getKey();
        r5.BCU();
        A0L(C390639rb.A00, key, r5.CDT().get(), r5.CDT().CGN());
        this.A0A.remove(r5);
        this.A08.remove(r5);
    }

    public final void A0K(C367948rp r8, Object obj, long j) {
        C367718rS avT;
        C367718rS CDT = r8.CDT();
        C367698rQ r4 = this.A05;
        C367738rU r1 = r4.A0G;
        if (r1 instanceof C367748rV) {
            avT = new C368438sc(obj);
        } else if (r1 instanceof C367768rX) {
            avT = new C41526AvU(r8, obj, this.A07);
        } else {
            avT = new C41525AvT(r8, obj, this.A07);
        }
        r8.Epz(avT);
        A0A();
        this.A02++;
        if (r4.A06 > 0 || r4.A08 > 0) {
            r8.Er2(j);
        }
        this.A08.add(r8);
        this.A0A.add(r8);
        CDT.CsB(obj);
    }
}
