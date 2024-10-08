package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class Y5j extends AtomicInteger implements 1aL, C65051aA {
    public int A00;
    public C65051aA A01;
    public C3029566q A02;
    public final int A03;
    public final 1aL A04;
    public final C3032668b A05;
    public final C22471Y5o A06;
    public final AnonymousClass6FI A07 = new AtomicReference();
    public final boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    public final void dispose() {
        this.A0A = true;
        this.A01.dispose();
        1af.A01(this.A06);
    }

    public final void onComplete() {
        this.A0B = true;
        A00();
    }

    public final void DUK(Object obj) {
        if (this.A00 == 0) {
            this.A02.offer(obj);
        }
        A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.XCy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.66p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.XCy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.XCy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Do4(X.C65051aA r3) {
        /*
            r2 = this;
            X.1aA r0 = r2.A01
            boolean r0 = X.1af.A02(r0, r3)
            if (r0 == 0) goto L_0x0026
            r2.A01 = r3
            boolean r0 = r3 instanceof X.AnonymousClass66o
            if (r0 == 0) goto L_0x0027
            X.66p r3 = (X.C3029466p) r3
            r0 = 3
            int r1 = r3.EHR(r0)
            r0 = 1
            if (r1 != r0) goto L_0x002f
            r2.A00 = r1
            r2.A02 = r3
            r2.A0B = r0
            X.1aL r0 = r2.A04
            r0.Do4(r2)
            r2.A00()
        L_0x0026:
            return
        L_0x0027:
            int r0 = r2.A03
            X.XCy r3 = new X.XCy
            r3.<init>(r0)
            goto L_0x0034
        L_0x002f:
            r0 = 2
            if (r1 != r0) goto L_0x0027
            r2.A00 = r1
        L_0x0034:
            r2.A02 = r3
            X.1aL r0 = r2.A04
            r0.Do4(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y5j.Do4(X.1aA):void");
    }

    public final void onError(Throwable th) {
        if (C22013Xr3.A02(th, this.A07)) {
            this.A0B = true;
            A00();
            return;
        }
        C318176oW.A01(th);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, X.6FI] */
    public Y5j(1aL r2, C3032668b r3, int i, boolean z) {
        this.A04 = r2;
        this.A05 = r3;
        this.A03 = i;
        this.A08 = z;
        this.A06 = new C22471Y5o(r2, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        if (r0 == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r7 = this;
            int r0 = r7.getAndIncrement()
            if (r0 != 0) goto L_0x0017
            X.1aL r3 = r7.A04
            X.66q r4 = r7.A02
            X.6FI r2 = r7.A07
        L_0x000c:
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x009c
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0018
            r4.clear()
        L_0x0017:
            return
        L_0x0018:
            boolean r0 = r7.A08
            r6 = 1
            if (r0 != 0) goto L_0x0030
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x0030
            r4.clear()
            r7.A0A = r6
        L_0x0028:
            java.lang.Throwable r0 = X.C22013Xr3.A01(r2)
        L_0x002c:
            r3.onError(r0)
            return
        L_0x0030:
            boolean r5 = r7.A0B
            java.lang.Object r1 = r4.poll()     // Catch:{ all -> 0x005a }
            boolean r0 = X.DbW.A1a(r1)
            if (r5 == 0) goto L_0x004a
            if (r0 == 0) goto L_0x004c
            r7.A0A = r6
            java.lang.Throwable r0 = X.C22013Xr3.A01(r2)
            if (r0 != 0) goto L_0x002c
            r3.onComplete()
            return
        L_0x004a:
            if (r0 != 0) goto L_0x009c
        L_0x004c:
            X.68b r0 = r7.A05     // Catch:{ all -> 0x0066 }
            java.lang.Object r1 = r0.apply(r1)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "The mapper returned a null ObservableSource"
            X.1aP.A01(r1, r0)     // Catch:{ all -> 0x0066 }
            X.1aK r1 = (X.C65071aK) r1     // Catch:{ all -> 0x0066 }
            goto L_0x0078
        L_0x005a:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            r7.A0A = r6
            X.1aA r0 = r7.A01
            r0.dispose()
            goto L_0x0074
        L_0x0066:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            r7.A0A = r6
            X.1aA r0 = r7.A01
            r0.dispose()
            r4.clear()
        L_0x0074:
            X.C22013Xr3.A02(r1, r2)
            goto L_0x0028
        L_0x0078:
            boolean r0 = r1 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L_0x0095
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch:{ all -> 0x008c }
            java.lang.Object r1 = r1.call()     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x000c
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x000c
            r3.DUK(r1)
            goto L_0x000c
        L_0x008c:
            r0 = move-exception
            X.C9877Riq.A00(r0)
            X.C22013Xr3.A02(r0, r2)
            goto L_0x000c
        L_0x0095:
            r7.A09 = r6
            X.Y5o r0 = r7.A06
            r1.Eyt(r0)
        L_0x009c:
            int r0 = r7.decrementAndGet()
            if (r0 != 0) goto L_0x000c
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y5j.A00():void");
    }
}
