package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Y5i  reason: case insensitive filesystem */
public final class C22469Y5i extends AtomicInteger implements 1aL, C65051aA {
    public int A00;
    public C65051aA A01;
    public C3029566q A02;
    public final int A03;
    public final 1aL A04;
    public final C3032668b A05;
    public final C22472Y5p A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public final void dispose() {
        this.A08 = true;
        1af.A01(this.A06);
        this.A01.dispose();
        if (getAndIncrement() == 0) {
            this.A02.clear();
        }
    }

    public final void DUK(Object obj) {
        if (!this.A09) {
            if (this.A00 == 0) {
                this.A02.offer(obj);
            }
            A00();
        }
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
            r2.A09 = r0
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
        throw new UnsupportedOperationException("Method not decompiled: X.C22469Y5i.Do4(X.1aA):void");
    }

    public final void onComplete() {
        if (!this.A09) {
            this.A09 = true;
            A00();
        }
    }

    public final void onError(Throwable th) {
        if (this.A09) {
            C318176oW.A01(th);
            return;
        }
        this.A09 = true;
        dispose();
        this.A04.onError(th);
    }

    public C22469Y5i(1aL r2, C3032668b r3, int i) {
        this.A04 = r2;
        this.A05 = r3;
        this.A03 = i;
        this.A06 = new C22472Y5p(r2, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r4 = this;
            int r0 = r4.getAndIncrement()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0011
            X.66q r0 = r4.A02
            r0.clear()
            return
        L_0x0011:
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x0044
            boolean r3 = r4.A09
            X.66q r0 = r4.A02     // Catch:{ all -> 0x004b }
            java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x004b }
            r2 = 1
            boolean r0 = X.DbW.A1a(r1)
            if (r3 == 0) goto L_0x002e
            if (r0 == 0) goto L_0x0030
            r4.A08 = r2
            X.1aL r0 = r4.A04
            r0.onComplete()
            return
        L_0x002e:
            if (r0 != 0) goto L_0x0044
        L_0x0030:
            X.68b r0 = r4.A05     // Catch:{ all -> 0x004b }
            java.lang.Object r1 = r0.apply(r1)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "The mapper returned a null ObservableSource"
            X.1aP.A01(r1, r0)     // Catch:{ all -> 0x004b }
            X.1aK r1 = (X.C65071aK) r1     // Catch:{ all -> 0x004b }
            r4.A07 = r2
            X.Y5p r0 = r4.A06
            r1.Eyt(r0)
        L_0x0044:
            int r0 = r4.decrementAndGet()
            if (r0 != 0) goto L_0x0007
            return
        L_0x004b:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            r4.dispose()
            X.66q r0 = r4.A02
            r0.clear()
            X.1aL r0 = r4.A04
            r0.onError(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22469Y5i.A00():void");
    }
}
