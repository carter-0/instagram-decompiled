package X;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XDl  reason: case insensitive filesystem */
public final class C21072XDl extends AtomicInteger implements 1aL, C65051aA, C22550Y9d {
    public int A00;
    public int A01;
    public C65051aA A02;
    public C3029566q A03;
    public C21073XDm A04;
    public final int A05;
    public final int A06;
    public final 1aL A07;
    public final C3032668b A08;
    public final AnonymousClass6FI A09 = new AtomicReference();
    public final Integer A0A;
    public final ArrayDeque A0B = new ArrayDeque();
    public volatile boolean A0C;
    public volatile boolean A0D;

    public final void dispose() {
        this.A0C = true;
        if (getAndIncrement() == 0) {
            this.A03.clear();
            A00();
        }
    }

    public final void onComplete() {
        this.A0D = true;
        AQE();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        if (r0 != null) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        X.1af.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = (java.util.concurrent.atomic.AtomicReference) r1.A0B.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r0 != null) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r1 = this;
            X.XDm r0 = r1.A04
            if (r0 == 0) goto L_0x0007
        L_0x0004:
            X.1af.A01(r0)
        L_0x0007:
            java.util.ArrayDeque r0 = r1.A0B
            java.lang.Object r0 = r0.poll()
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            if (r0 != 0) goto L_0x0004
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21072XDl.A00():void");
    }

    public final void DUK(Object obj) {
        if (this.A01 == 0) {
            this.A03.offer(obj);
        }
        AQE();
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
            X.1aA r0 = r2.A02
            boolean r0 = X.1af.A02(r0, r3)
            if (r0 == 0) goto L_0x0026
            r2.A02 = r3
            boolean r0 = r3 instanceof X.AnonymousClass66o
            if (r0 == 0) goto L_0x0027
            X.66p r3 = (X.C3029466p) r3
            r0 = 3
            int r1 = r3.EHR(r0)
            r0 = 1
            if (r1 != r0) goto L_0x002f
            r2.A01 = r1
            r2.A03 = r3
            r2.A0D = r0
            X.1aL r0 = r2.A07
            r0.Do4(r2)
            r2.AQE()
        L_0x0026:
            return
        L_0x0027:
            int r0 = r2.A06
            X.XCy r3 = new X.XCy
            r3.<init>(r0)
            goto L_0x0034
        L_0x002f:
            r0 = 2
            if (r1 != r0) goto L_0x0027
            r2.A01 = r1
        L_0x0034:
            r2.A03 = r3
            X.1aL r0 = r2.A07
            r0.Do4(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21072XDl.Do4(X.1aA):void");
    }

    public final void onError(Throwable th) {
        if (C22013Xr3.A02(th, this.A09)) {
            this.A0D = true;
            AQE();
            return;
        }
        C318176oW.A01(th);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, X.6FI] */
    public C21072XDl(1aL r2, C3032668b r3, Integer num, int i, int i2) {
        this.A07 = r2;
        this.A08 = r3;
        this.A05 = i;
        this.A06 = i2;
        this.A0A = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r13.A00 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r13.A0C != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r11 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r6 != r11) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r1 = r13.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r1.get() == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r10 = r13.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r10 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r6 != X.AnonymousClass05K.A01) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        r1 = r13.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r1.get() == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r1 = r13.A0D;
        r10 = (X.C21073XDm) r7.poll();
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r10 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r1 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r0 == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r1 = r13.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        if (r1.get() != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        r3.onComplete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r0 != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        r13.A04 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        if (r10 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        r9 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a1, code lost:
        if (r13.A0C != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        r8 = r10.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        if (r6 != r11) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        r1 = r13.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
        if (r1.get() == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r1 = r9.poll();
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b7, code lost:
        if (r1 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        if (r8 == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        if (r0 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00be, code lost:
        r13.A04 = null;
        r13.A00--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c7, code lost:
        if (r0 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        r4 = addAndGet(-r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ce, code lost:
        if (r4 != 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d1, code lost:
        r3.DUK(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d6, code lost:
        X.C9877Riq.A00(r1);
        X.C22013Xr3.A02(r1, r13.A09);
        r13.A04 = null;
        r13.A00--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0103, code lost:
        r5.clear();
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0109, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQE() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 != 0) goto L_0x0033
            X.66q r5 = r13.A03
            java.util.ArrayDeque r7 = r13.A0B
            X.1aL r3 = r13.A07
            java.lang.Integer r6 = r13.A0A
            r12 = 1
            r4 = 1
        L_0x0010:
            int r8 = r13.A00
        L_0x0012:
            int r0 = r13.A05
            if (r8 == r0) goto L_0x0057
            boolean r0 = r13.A0C
            if (r0 != 0) goto L_0x0103
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r6 != r0) goto L_0x0034
            X.6FI r1 = r13.A09
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0034
        L_0x0026:
            r5.clear()
            r13.A00()
            java.lang.Throwable r0 = X.C22013Xr3.A01(r1)
            r3.onError(r0)
        L_0x0033:
            return
        L_0x0034:
            java.lang.Object r1 = r5.poll()     // Catch:{ all -> 0x00e7 }
            if (r1 == 0) goto L_0x0057
            X.68b r0 = r13.A08     // Catch:{ all -> 0x00e7 }
            java.lang.Object r2 = r0.apply(r1)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "The mapper returned a null ObservableSource"
            X.1aP.A01(r2, r0)     // Catch:{ all -> 0x00e7 }
            X.1aK r2 = (X.C65071aK) r2     // Catch:{ all -> 0x00e7 }
            int r1 = r13.A06
            X.XDm r0 = new X.XDm
            r0.<init>(r13, r1)
            r7.offer(r0)
            r2.Eyt(r0)
            int r8 = r8 + 1
            goto L_0x0012
        L_0x0057:
            r13.A00 = r8
            boolean r0 = r13.A0C
            if (r0 != 0) goto L_0x0103
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            if (r6 != r11) goto L_0x006a
            X.6FI r1 = r13.A09
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x006a
            goto L_0x0026
        L_0x006a:
            X.XDm r10 = r13.A04
            if (r10 != 0) goto L_0x009d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 != r0) goto L_0x007b
            X.6FI r1 = r13.A09
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x007b
            goto L_0x0026
        L_0x007b:
            boolean r1 = r13.A0D
            java.lang.Object r10 = r7.poll()
            X.XDm r10 = (X.C21073XDm) r10
            r0 = 0
            if (r10 != 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            if (r1 == 0) goto L_0x0097
            if (r0 == 0) goto L_0x0099
            X.6FI r1 = r13.A09
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x0026
            r3.onComplete()
            return
        L_0x0097:
            if (r0 != 0) goto L_0x009b
        L_0x0099:
            r13.A04 = r10
        L_0x009b:
            if (r10 == 0) goto L_0x00c9
        L_0x009d:
            X.66q r9 = r10.A01
        L_0x009f:
            boolean r0 = r13.A0C
            if (r0 != 0) goto L_0x0103
            boolean r8 = r10.A04
            if (r6 != r11) goto L_0x00b1
            X.6FI r1 = r13.A09
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x00b1
            goto L_0x0026
        L_0x00b1:
            r2 = 0
            java.lang.Object r1 = r9.poll()     // Catch:{ all -> 0x00d5 }
            r0 = 0
            if (r1 != 0) goto L_0x00ba
            r0 = 1
        L_0x00ba:
            if (r8 == 0) goto L_0x00c7
            if (r0 == 0) goto L_0x00d1
            r13.A04 = r2
            int r0 = r13.A00
            int r0 = r0 - r12
            r13.A00 = r0
            goto L_0x0010
        L_0x00c7:
            if (r0 == 0) goto L_0x00d1
        L_0x00c9:
            int r0 = -r4
            int r4 = r13.addAndGet(r0)
            if (r4 != 0) goto L_0x0010
            return
        L_0x00d1:
            r3.DUK(r1)
            goto L_0x009f
        L_0x00d5:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            X.6FI r0 = r13.A09
            X.C22013Xr3.A02(r1, r0)
            r13.A04 = r2
            int r0 = r13.A00
            int r0 = r0 - r12
            r13.A00 = r0
            goto L_0x0010
        L_0x00e7:
            r1 = move-exception
            X.C9877Riq.A00(r1)
            X.1aA r0 = r13.A02
            r0.dispose()
            r5.clear()
            r13.A00()
            X.6FI r0 = r13.A09
            X.C22013Xr3.A02(r1, r0)
            java.lang.Throwable r0 = X.C22013Xr3.A01(r0)
            r3.onError(r0)
            return
        L_0x0103:
            r5.clear()
            r13.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21072XDl.AQE():void");
    }
}
