package X;

import java.util.concurrent.atomic.AtomicReference;

public final class XDB extends AtomicReference implements 1aL {
    public final int A00;
    public final XDC A01;

    public final void DUK(Object obj) {
        this.A01.A02(this.A00, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 == r4.length) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r2 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r5.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete() {
        /*
            r6 = this;
            X.XDC r5 = r6.A01
            int r0 = r6.A00
            monitor-enter(r5)
            java.lang.Object[] r4 = r5.A02     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x000b
            monitor-exit(r5)     // Catch:{ all -> 0x0027 }
            return
        L_0x000b:
            r0 = r4[r0]     // Catch:{ all -> 0x0027 }
            r3 = 1
            r2 = 1
            if (r0 == 0) goto L_0x001b
            r2 = 0
            int r0 = r5.A01     // Catch:{ all -> 0x0027 }
            int r1 = r0 + 1
            r5.A01 = r1     // Catch:{ all -> 0x0027 }
            int r0 = r4.length     // Catch:{ all -> 0x0027 }
            if (r1 != r0) goto L_0x001d
        L_0x001b:
            r5.A09 = r3     // Catch:{ all -> 0x0027 }
        L_0x001d:
            monitor-exit(r5)     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0023
            r5.A00()
        L_0x0023:
            r5.A01()
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDB.onComplete():void");
    }

    public final void onError(Throwable th) {
        XDC xdc = this.A01;
        if (C22013Xr3.A02(th, xdc.A06)) {
            xdc.A00();
            xdc.A01();
            return;
        }
        C318176oW.A01(th);
    }

    public XDB(XDC xdc, int i) {
        this.A01 = xdc;
        this.A00 = i;
    }

    public final void Do4(C65051aA r1) {
        1af.A03(r1, this);
    }
}
