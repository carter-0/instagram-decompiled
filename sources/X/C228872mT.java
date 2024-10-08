package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.2mT  reason: invalid class name and case insensitive filesystem */
public final class C228872mT implements AnonymousClass11X {
    public final 11W A00;
    public final AnonymousClass1GR A01;
    public final CountDownLatch A02 = new CountDownLatch(1);
    public final int A03;
    public final boolean A04;

    public C228872mT(11W r3, AnonymousClass1GR r4, int i, boolean z) {
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = z;
        this.A03 = i;
        r3.A03(new C228882mU(this), r3.getName());
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public final String getName() {
        return this.A00.getName();
    }

    public final int getRunnableId() {
        return this.A00.A00.A03;
    }

    public final void onFinish() {
        if (this.A02.getCount() > 0) {
            0wb.A03("StreamingHttpRequestConnectTask", "onFinish could not be called before the task is finished");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|(1:6)|7|8|9|10|11|12|(2:14|15)(1:26)) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        android.os.Process.setThreadPriority(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        X.0fS.A00(-868066012);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r0 = "This operation can't be run on UI thread."
            X.11Z.A05(r0)
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0073
            int r6 = r7.A03
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            int r0 = android.os.Process.myTid()
            int r5 = android.os.Process.getThreadPriority(r0)
            if (r6 >= r5) goto L_0x0073
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0 = -1292234652(0xffffffffb2fa1064, float:-2.9111284E-8)
            X.0fS.A01(r1, r0)
        L_0x003c:
            android.os.Process.setThreadPriority(r6)
            java.util.concurrent.CountDownLatch r0 = r7.A02     // Catch:{ InterruptedException -> 0x0044 }
            r0.await()     // Catch:{ InterruptedException -> 0x0044 }
        L_0x0044:
            X.11W r2 = r7.A00     // Catch:{ all -> 0x0062 }
            r2.getName()     // Catch:{ all -> 0x0062 }
            X.1GR r1 = r7.A01     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x0062 }
            r2.A03(r1, r0)     // Catch:{ all -> 0x0062 }
            android.os.Process.setThreadPriority(r5)
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0086
            r0 = 1169411848(0x45b3cf08, float:5753.879)
            X.0fS.A00(r0)
            return
        L_0x0062:
            r1 = move-exception
            android.os.Process.setThreadPriority(r5)
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0072
            r0 = -868066012(0xffffffffcc425d24, float:-5.0951312E7)
            X.0fS.A00(r0)
        L_0x0072:
            throw r1
        L_0x0073:
            java.util.concurrent.CountDownLatch r0 = r7.A02     // Catch:{ InterruptedException -> 0x0078 }
            r0.await()     // Catch:{ InterruptedException -> 0x0078 }
        L_0x0078:
            X.11W r2 = r7.A00
            r2.getName()
            X.1GR r1 = r7.A01
            java.lang.String r0 = r2.getName()
            r2.A03(r1, r0)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228872mT.run():void");
    }
}
