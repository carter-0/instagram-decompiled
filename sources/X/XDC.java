package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class XDC extends AtomicInteger implements C65051aA {
    public int A00;
    public int A01;
    public Object[] A02;
    public final 1aL A03;
    public final C3032668b A04;
    public final XCy A05;
    public final AnonymousClass6FI A06 = new AtomicReference();
    public final XDB[] A07;
    public volatile boolean A08;
    public volatile boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object[] r2 = r3.A02     // Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            return
        L_0x0007:
            r0 = r2[r4]     // Catch:{ all -> 0x0029 }
            int r1 = r3.A00     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            int r1 = r1 + 1
            r3.A00 = r1     // Catch:{ all -> 0x0029 }
        L_0x0011:
            r2[r4] = r5     // Catch:{ all -> 0x0029 }
            int r0 = r2.length     // Catch:{ all -> 0x0029 }
            if (r1 != r0) goto L_0x0021
            X.XCy r1 = r3.A05     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r2.clone()     // Catch:{ all -> 0x0029 }
            r1.offer(r0)     // Catch:{ all -> 0x0029 }
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0028
            r3.A01()
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDC.A02(int, java.lang.Object):void");
    }

    public final void A03(XCy xCy) {
        synchronized (this) {
            this.A02 = null;
        }
        xCy.clear();
    }

    public final void A00() {
        for (XDB A012 : this.A07) {
            1af.A01(A012);
        }
    }

    public final void dispose() {
        if (!this.A08) {
            this.A08 = true;
            A00();
            if (getAndIncrement() == 0) {
                A03(this.A05);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, X.6FI] */
    public XDC(1aL r4, C3032668b r5, int i, int i2) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = new Object[i];
        XDB[] xdbArr = new XDB[i];
        for (int i3 = 0; i3 < i; i3++) {
            xdbArr[i3] = new XDB(this, i3);
        }
        this.A07 = xdbArr;
        this.A05 = new XCy(i2);
    }

    public final void A01() {
        Throwable A012;
        if (getAndIncrement() == 0) {
            XCy xCy = this.A05;
            1aL r5 = this.A03;
            int i = 1;
            while (!this.A08) {
                AnonymousClass6FI r3 = this.A06;
                if (r3.get() != null) {
                    A00();
                    A03(xCy);
                    A012 = C22013Xr3.A01(r3);
                } else {
                    boolean z = this.A09;
                    Object poll = xCy.poll();
                    boolean z2 = false;
                    if (poll == null) {
                        z2 = true;
                    }
                    if (z) {
                        if (z2) {
                            A03(xCy);
                            A012 = C22013Xr3.A01(r3);
                            if (A012 == null) {
                                r5.onComplete();
                                return;
                            }
                        }
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                    try {
                        Object apply = this.A04.apply(poll);
                        1aP.A01(apply, "The combiner returned a null value");
                        r5.DUK(apply);
                    } catch (Throwable th) {
                        C9877Riq.A00(th);
                        C22013Xr3.A02(th, r3);
                        A00();
                        A03(xCy);
                        r5.onError(C22013Xr3.A01(r3));
                        return;
                    }
                }
                r5.onError(A012);
                return;
            }
            A03(xCy);
        }
    }
}
