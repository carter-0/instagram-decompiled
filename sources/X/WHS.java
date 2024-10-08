package X;

public final class WHS implements X9F {
    public int A00 = -1;
    public C249903kY A01;

    private final synchronized void A00() {
        C249903kY.A01(this.A01);
        this.A01 = null;
        this.A00 = -1;
    }

    public final synchronized C249903kY Afy(int i, int i2, int i3) {
        C249903kY r0;
        try {
            C249903kY r02 = this.A01;
            if (r02 != null) {
                r0 = r02.A04();
            } else {
                r0 = null;
            }
            A00();
        } catch (Throwable th) {
            A00();
            throw th;
        }
        return r0;
    }

    public final synchronized C249903kY AjM(int i) {
        C249903kY r0;
        C249903kY r02;
        if (this.A00 != i || (r02 = this.A01) == null) {
            r0 = null;
        } else {
            r0 = r02.A04();
        }
        return r0;
    }

    public final synchronized C249903kY B3s(int i) {
        C249903kY r0;
        C249903kY r02 = this.A01;
        if (r02 != null) {
            r0 = r02.A04();
        } else {
            r0 = null;
        }
        return r0;
    }

    public final void DGs(C249903kY r1, int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void DGy(X.C249903kY r3, int r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            X.3kY r0 = r2.A01     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r3.A05()     // Catch:{ all -> 0x002c }
            X.3kY r0 = r2.A01     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.A05()     // Catch:{ all -> 0x002c }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x002c }
        L_0x0013:
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x002c }
            goto L_0x0028
        L_0x0018:
            r0 = 0
            goto L_0x0013
        L_0x001a:
            X.3kY r0 = r2.A01     // Catch:{ all -> 0x002c }
            X.C249903kY.A01(r0)     // Catch:{ all -> 0x002c }
            X.3kY r0 = r3.A04()     // Catch:{ all -> 0x002c }
            r2.A01 = r0     // Catch:{ all -> 0x002c }
            r2.A00 = r4     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x0028:
            if (r0 == 0) goto L_0x001a
        L_0x002a:
            monitor-exit(r2)
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WHS.DGy(X.3kY, int, int):void");
    }

    public final synchronized void clear() {
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (X.C249903kY.A02(r2.A01) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean contains(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0011 }
            if (r3 != r0) goto L_0x000e
            X.3kY r0 = r2.A01     // Catch:{ all -> 0x0011 }
            boolean r1 = X.C249903kY.A02(r0)     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WHS.contains(int):boolean");
    }
}
