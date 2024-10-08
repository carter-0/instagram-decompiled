package X;

import android.os.Handler;

public final /* synthetic */ class PyQ implements Handler.Callback {
    public final PyP A00;

    public PyQ(PyP pyP) {
        this.A00 = pyP;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r1 = r7.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (X.DbT.A1X(r1, "unsupported") == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r1 = new X.RKU(4, "Not supported by GmsCore");
        X.PyR.A00(r3, r1);
        r3.A03.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if ((r3 instanceof X.R29) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (X.DbT.A1X(r1, "ack") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        X.PyR.A00(r3, (java.lang.Object) null);
        r3.A03.A01((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r1 = new X.RKU(4, "Invalid response to one way request");
        X.PyR.A00(r3, r1);
        r3.A03.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        r1 = r1.getBundle("data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r1 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        r1 = android.os.Bundle.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        X.PyR.A00(r3, r1);
        r3.A03.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            X.PyP r5 = r6.A00
            int r4 = r7.arg1
            java.lang.String r2 = "MessengerIpcClient"
            r0 = 3
            android.util.Log.isLoggable(r2, r0)
            monitor-enter(r5)
            android.util.SparseArray r0 = r5.A03     // Catch:{ all -> 0x0086 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0086 }
            X.PyR r3 = (X.PyR) r3     // Catch:{ all -> 0x0086 }
            if (r3 != 0) goto L_0x0026
            r0 = 50
            java.lang.StringBuilder r1 = X.Pxe.A14(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "Received response for unknown request: "
            java.lang.String r0 = X.Pxg.A0t(r0, r1, r4)     // Catch:{ all -> 0x0086 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0086 }
            monitor-exit(r5)     // Catch:{ all -> 0x0086 }
            goto L_0x004a
        L_0x0026:
            r0.remove(r4)     // Catch:{ all -> 0x0086 }
            r5.A00()     // Catch:{ all -> 0x0086 }
            monitor-exit(r5)     // Catch:{ all -> 0x0086 }
            android.os.Bundle r1 = r7.getData()
            java.lang.String r0 = "unsupported"
            boolean r0 = X.DbT.A1X(r1, r0)
            if (r0 == 0) goto L_0x004c
            r2 = 4
            java.lang.String r0 = "Not supported by GmsCore"
            X.RKU r1 = new X.RKU
            r1.<init>(r2, r0)
            X.PyR.A00(r3, r1)
            X.8nD r0 = r3.A03
            r0.A00(r1)
        L_0x004a:
            r0 = 1
            return r0
        L_0x004c:
            boolean r0 = r3 instanceof X.R29
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "ack"
            boolean r0 = X.DbT.A1X(r1, r0)
            if (r0 == 0) goto L_0x0062
            r1 = 0
            X.PyR.A00(r3, r1)
            X.8nD r0 = r3.A03
            r0.A01(r1)
            goto L_0x004a
        L_0x0062:
            r2 = 4
            java.lang.String r0 = "Invalid response to one way request"
            X.RKU r1 = new X.RKU
            r1.<init>(r2, r0)
            X.PyR.A00(r3, r1)
            X.8nD r0 = r3.A03
            r0.A00(r1)
            goto L_0x004a
        L_0x0073:
            java.lang.String r0 = "data"
            android.os.Bundle r1 = r1.getBundle(r0)
            if (r1 != 0) goto L_0x007d
            android.os.Bundle r1 = android.os.Bundle.EMPTY
        L_0x007d:
            X.PyR.A00(r3, r1)
            X.8nD r0 = r3.A03
            r0.A01(r1)
            goto L_0x004a
        L_0x0086:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0086 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PyQ.handleMessage(android.os.Message):boolean");
    }
}
