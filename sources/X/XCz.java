package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class XCz extends AtomicInteger implements 1aL, C65051aA {
    public static final XD0[] A0F = new XD0[0];
    public static final XD0[] A0G = new XD0[0];
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C65051aA A04;
    public Queue A05;
    public final int A06;
    public final int A07;
    public final 1aL A08;
    public final C3032668b A09;
    public final AnonymousClass6FI A0A = new AtomicReference();
    public final AtomicReference A0B;
    public volatile YCO A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r9 != 0) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x010d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r14 = this;
            X.1aL r2 = r14.A08
            r13 = 1
            r3 = 1
        L_0x0004:
            boolean r0 = r14.A04()
            if (r0 != 0) goto L_0x0118
            X.YCO r1 = r14.A0C
            if (r1 == 0) goto L_0x001e
        L_0x000e:
            boolean r0 = r14.A04()
            if (r0 != 0) goto L_0x0118
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x001e
            r2.DUK(r0)
            goto L_0x000e
        L_0x001e:
            boolean r5 = r14.A0E
            X.YCO r4 = r14.A0C
            java.util.concurrent.atomic.AtomicReference r0 = r14.A0B
            java.lang.Object r10 = r0.get()
            X.XD0[] r10 = (X.XD0[]) r10
            int r9 = r10.length
            int r7 = r14.A07
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r6) goto L_0x003b
            monitor-enter(r14)
            java.util.Queue r0 = r14.A05     // Catch:{ all -> 0x010e }
            int r1 = r0.size()     // Catch:{ all -> 0x010e }
            monitor-exit(r14)     // Catch:{ all -> 0x010e }
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            if (r5 == 0) goto L_0x005a
            if (r4 == 0) goto L_0x0046
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x005a
        L_0x0046:
            if (r9 != 0) goto L_0x005c
            if (r1 != 0) goto L_0x0106
            X.6FI r0 = r14.A0A
            java.lang.Throwable r1 = X.C22013Xr3.A01(r0)
            java.lang.Throwable r0 = X.C22013Xr3.A00
            if (r1 == r0) goto L_0x0118
            if (r1 != 0) goto L_0x0111
            r2.onComplete()
            return
        L_0x005a:
            if (r9 == 0) goto L_0x0106
        L_0x005c:
            long r4 = r14.A02
            int r8 = r14.A00
            if (r9 <= r8) goto L_0x006a
            r0 = r10[r8]
            long r0 = r0.A01
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0088
        L_0x006a:
            if (r9 > r8) goto L_0x006d
            r8 = 0
        L_0x006d:
            r12 = 0
        L_0x006e:
            r0 = r10[r8]
            long r0 = r0.A01
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0080
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x007b
            r8 = 0
        L_0x007b:
            int r12 = r12 + 1
            if (r12 >= r9) goto L_0x0080
            goto L_0x006e
        L_0x0080:
            r14.A00 = r8
            r0 = r10[r8]
            long r0 = r0.A01
            r14.A02 = r0
        L_0x0088:
            r4 = 0
            r11 = 0
        L_0x008a:
            boolean r0 = r14.A04()
            if (r0 != 0) goto L_0x0118
            r5 = r10[r8]
            X.66q r1 = r5.A03
            if (r1 == 0) goto L_0x00a6
        L_0x0096:
            java.lang.Object r0 = r1.poll()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00a6
            r2.DUK(r0)
            boolean r0 = r14.A04()
            if (r0 == 0) goto L_0x0096
            return
        L_0x00a6:
            boolean r1 = r5.A04
            X.66q r0 = r5.A03
            if (r1 == 0) goto L_0x00d5
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d5
        L_0x00b4:
            r14.A03(r5)
            boolean r0 = r14.A04()
            if (r0 == 0) goto L_0x00d3
            return
        L_0x00be:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            X.1af.A01(r5)
            X.6FI r0 = r14.A0A
            X.C22013Xr3.A02(r1, r0)
            boolean r0 = r14.A04()
            if (r0 != 0) goto L_0x0118
            r14.A03(r5)
        L_0x00d3:
            int r11 = r11 + 1
        L_0x00d5:
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x00da
            r8 = 0
        L_0x00da:
            int r4 = r4 + 1
            if (r4 < r9) goto L_0x008a
            r14.A00 = r8
            r0 = r10[r8]
            long r0 = r0.A01
            r14.A02 = r0
            if (r11 == 0) goto L_0x0106
            if (r7 == r6) goto L_0x0004
        L_0x00ea:
            int r1 = r11 + -1
            if (r11 == 0) goto L_0x0004
            monitor-enter(r14)
            java.util.Queue r0 = r14.A05     // Catch:{ all -> 0x0115 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0115 }
            X.1aK r0 = (X.C65071aK) r0     // Catch:{ all -> 0x0115 }
            if (r0 != 0) goto L_0x0100
            int r0 = r14.A01     // Catch:{ all -> 0x0115 }
            int r0 = r0 - r13
            r14.A01 = r0     // Catch:{ all -> 0x0115 }
            monitor-exit(r14)     // Catch:{ all -> 0x0115 }
            goto L_0x0104
        L_0x0100:
            monitor-exit(r14)     // Catch:{ all -> 0x0115 }
            r14.A02(r0)
        L_0x0104:
            r11 = r1
            goto L_0x00ea
        L_0x0106:
            int r0 = -r3
            int r3 = r14.addAndGet(r0)
            if (r3 != 0) goto L_0x0004
            return
        L_0x010e:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x010e }
            throw r0
        L_0x0111:
            r2.onError(r1)
            return
        L_0x0115:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0115 }
            throw r0
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XCz.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (decrementAndGet() == 0) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C65071aK r7) {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r7 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L_0x008c
            java.util.concurrent.Callable r7 = (java.util.concurrent.Callable) r7
            r2 = 1
            java.lang.Object r4 = r7.call()     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x005d
            int r1 = r6.get()
            r0 = 0
            if (r1 != 0) goto L_0x0026
            boolean r0 = r6.compareAndSet(r0, r2)
            if (r0 == 0) goto L_0x0026
            X.1aL r0 = r6.A08
            r0.DUK(r4)
            int r0 = r6.decrementAndGet()
            if (r0 != 0) goto L_0x006e
            goto L_0x005d
        L_0x0026:
            X.YCO r3 = r6.A0C
            if (r3 != 0) goto L_0x003a
            int r1 = r6.A07
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x004b
            int r0 = r6.A06
            X.XCy r3 = new X.XCy
            r3.<init>(r0)
        L_0x0038:
            r6.A0C = r3
        L_0x003a:
            boolean r0 = r3.offer(r4)
            if (r0 != 0) goto L_0x0067
            java.lang.String r1 = "Scalar queue full?!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            r6.onError(r0)
            goto L_0x005d
        L_0x004b:
            X.XDL r3 = new X.XDL
            r3.<init>(r1)
            goto L_0x0038
        L_0x0051:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            X.6FI r0 = r6.A0A
            X.C22013Xr3.A02(r1, r0)
            r6.A00()
        L_0x005d:
            int r1 = r6.A07
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x006d
            r1 = 0
            monitor-enter(r6)
            goto L_0x0072
        L_0x0067:
            int r0 = r6.getAndIncrement()
            if (r0 == 0) goto L_0x006e
        L_0x006d:
            return
        L_0x006e:
            r6.A01()
            goto L_0x005d
        L_0x0072:
            java.util.Queue r0 = r6.A05     // Catch:{ all -> 0x0089 }
            java.lang.Object r7 = r0.poll()     // Catch:{ all -> 0x0089 }
            X.1aK r7 = (X.C65071aK) r7     // Catch:{ all -> 0x0089 }
            if (r7 != 0) goto L_0x0082
            int r0 = r6.A01     // Catch:{ all -> 0x0089 }
            int r0 = r0 - r2
            r6.A01 = r0     // Catch:{ all -> 0x0089 }
            r1 = 1
        L_0x0082:
            monitor-exit(r6)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0000
            r6.A00()
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0089 }
            throw r0
        L_0x008c:
            long r2 = r6.A03
            r0 = 1
            long r0 = r0 + r2
            r6.A03 = r0
            X.XD0 r5 = new X.XD0
            r5.<init>(r6, r2)
        L_0x0098:
            java.util.concurrent.atomic.AtomicReference r4 = r6.A0B
            java.lang.Object r3 = r4.get()
            X.XD0[] r3 = (X.XD0[]) r3
            X.XD0[] r0 = A0F
            r2 = 0
            if (r3 != r0) goto L_0x00a9
            X.1af.A01(r5)
            return
        L_0x00a9:
            int r1 = r3.length
            int r0 = r1 + 1
            X.XD0[] r0 = new X.XD0[r0]
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            r0[r1] = r5
            boolean r0 = X.1FH.A00(r3, r0, r4)
            if (r0 == 0) goto L_0x0098
            r7.Eyt(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XCz.A02(X.1aK):void");
    }

    public final void A03(XD0 xd0) {
        AtomicReference atomicReference;
        XD0[] xd0Arr;
        XD0[] xd0Arr2;
        do {
            atomicReference = this.A0B;
            xd0Arr = (XD0[]) atomicReference.get();
            int length = xd0Arr.length;
            if (length != 0) {
                int i = 0;
                while (xd0Arr[i] != xd0) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    xd0Arr2 = A0G;
                } else {
                    xd0Arr2 = new XD0[(length - 1)];
                    System.arraycopy(xd0Arr, 0, xd0Arr2, 0, i);
                    System.arraycopy(xd0Arr, i + 1, xd0Arr2, i, (length - i) - 1);
                }
            } else {
                return;
            }
        } while (!1FH.A00(xd0Arr, xd0Arr2, atomicReference));
    }

    public final boolean A04() {
        if (!this.A0D) {
            AnonymousClass6FI r1 = this.A0A;
            if (r1.get() == null) {
                return false;
            }
            A05();
            Throwable A012 = C22013Xr3.A01(r1);
            if (A012 != C22013Xr3.A00) {
                this.A08.onError(A012);
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.XD0[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.XEr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05() {
        /*
            r4 = this;
            X.1aA r0 = r4.A04
            r0.dispose()
            java.util.concurrent.atomic.AtomicReference r2 = r4.A0B
            java.lang.Object r1 = r2.get()
            X.XD0[] r0 = A0F
            r3 = 0
            if (r1 == r0) goto L_0x0025
            java.lang.Object r2 = r2.getAndSet(r0)
            X.XD0[] r2 = (X.XD0[]) r2
            if (r2 == r0) goto L_0x0025
            int r1 = r2.length
        L_0x0019:
            if (r3 >= r1) goto L_0x0023
            r0 = r2[r3]
            X.1af.A01(r0)
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0023:
            r0 = 1
            return r0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XCz.A05():boolean");
    }

    public final void DUK(Object obj) {
        if (!this.A0E) {
            try {
                Object apply = this.A09.apply(obj);
                1aP.A01(apply, "The mapper returned a null ObservableSource");
                C65071aK r2 = (C65071aK) apply;
                int i = this.A07;
                if (i != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i2 = this.A01;
                        if (i2 == i) {
                            this.A05.offer(r2);
                            return;
                        }
                        this.A01 = i2 + 1;
                    }
                }
                A02(r2);
            } catch (Throwable th) {
                C9877Riq.A00(th);
                this.A04.dispose();
                onError(th);
            }
        }
    }

    public final void Do4(C65051aA r2) {
        if (1af.A02(this.A04, r2)) {
            this.A04 = r2;
            this.A08.Do4(this);
        }
    }

    public final void dispose() {
        Throwable A012;
        if (!this.A0D) {
            this.A0D = true;
            if (A05() && (A012 = C22013Xr3.A01(this.A0A)) != null && A012 != C22013Xr3.A00) {
                C318176oW.A01(A012);
            }
        }
    }

    public final void onComplete() {
        if (!this.A0E) {
            this.A0E = true;
            A00();
        }
    }

    public final void onError(Throwable th) {
        if (this.A0E || !C22013Xr3.A02(th, this.A0A)) {
            C318176oW.A01(th);
            return;
        }
        this.A0E = true;
        A00();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, X.6FI] */
    public XCz(1aL r3, C3032668b r4, int i, int i2) {
        this.A08 = r3;
        this.A09 = r4;
        this.A07 = i;
        this.A06 = i2;
        if (i != Integer.MAX_VALUE) {
            this.A05 = new ArrayDeque(i);
        }
        this.A0B = new AtomicReference(A0G);
    }

    public final void A00() {
        if (getAndIncrement() == 0) {
            A01();
        }
    }
}
