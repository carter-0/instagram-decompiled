package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XEt  reason: case insensitive filesystem */
public final class C21104XEt extends C3033168g {
    public final C65071aK A00;
    public final C65071aK A01;
    public final AtomicReference A02;

    public final void A02(1aL r2) {
        this.A00.Eyt(r2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C3033868n r6) {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r2 = r5.A02
            java.lang.Object r4 = r2.get()
            X.XDo r4 = (X.C21075XDo) r4
            if (r4 == 0) goto L_0x0014
            java.util.concurrent.atomic.AtomicReference r0 = r4.A02
            java.lang.Object r1 = r0.get()
            X.XEv[] r0 = X.C21075XDo.A05
            if (r1 != r0) goto L_0x0020
        L_0x0014:
            X.XDo r1 = new X.XDo
            r1.<init>(r2)
            boolean r0 = X.1FH.A00(r4, r1, r2)
            if (r0 == 0) goto L_0x0000
            r4 = r1
        L_0x0020:
            java.util.concurrent.atomic.AtomicBoolean r3 = r4.A00
            boolean r2 = r3.get()
            r1 = 1
            r0 = 0
            if (r2 != 0) goto L_0x0031
            boolean r0 = r3.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r6.accept(r4)     // Catch:{ all -> 0x0036 }
            goto L_0x003f
        L_0x0036:
            r0 = move-exception
            X.C9877Riq.A00(r0)
            java.lang.RuntimeException r0 = X.C22013Xr3.A00(r0)
            throw r0
        L_0x003f:
            if (r1 == 0) goto L_0x0046
            X.1aK r0 = r5.A01
            r0.Eyt(r4)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21104XEt.A03(X.68n):void");
    }

    public C21104XEt(C65071aK r1, C65071aK r2, AtomicReference atomicReference) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = atomicReference;
    }
}
