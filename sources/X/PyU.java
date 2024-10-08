package X;

public final /* synthetic */ class PyU implements Runnable {
    public final PyP A00;

    public PyU(PyP pyP) {
        this.A00 = pyP;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        java.lang.String.valueOf(java.lang.String.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r6 = r9.A02;
        r1 = r2.A02;
        r5 = android.os.Message.obtain();
        r5.what = r7.A00;
        r5.arg1 = r8;
        r5.replyTo = r1;
        r4 = new android.os.Bundle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        if ((r7 instanceof X.R29) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        r4.putBoolean("oneWay", r0);
        r4.putString("pkg", r6.getPackageName());
        r4.putBundle("data", r7.A02);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = r2.A01;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r0 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r0 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        r1 = new java.lang.NullPointerException("send");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r1 = new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r0.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r2.A01(2, r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.PyP r2 = r10.A00
        L_0x0002:
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x00aa }
            r3 = 2
            if (r0 != r3) goto L_0x0013
            java.util.Queue r1 = r2.A04     // Catch:{ all -> 0x00aa }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x0016
            r2.A00()     // Catch:{ all -> 0x00aa }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x00aa }
            goto L_0x00a9
        L_0x0016:
            java.lang.Object r7 = r1.poll()     // Catch:{ all -> 0x00aa }
            X.PyR r7 = (X.PyR) r7     // Catch:{ all -> 0x00aa }
            android.util.SparseArray r0 = r2.A03     // Catch:{ all -> 0x00aa }
            int r8 = r7.A01     // Catch:{ all -> 0x00aa }
            r0.put(r8, r7)     // Catch:{ all -> 0x00aa }
            X.PyO r9 = r2.A05     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ScheduledExecutorService r6 = r9.A03     // Catch:{ all -> 0x00aa }
            X.PyV r5 = new X.PyV     // Catch:{ all -> 0x00aa }
            r5.<init>(r2, r7)     // Catch:{ all -> 0x00aa }
            r0 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00aa }
            r6.schedule(r5, r0, r4)     // Catch:{ all -> 0x00aa }
            monitor-exit(r2)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "MessengerIpcClient"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String.valueOf(r0)
        L_0x0044:
            android.content.Context r6 = r9.A02
            android.os.Messenger r1 = r2.A02
            android.os.Message r5 = android.os.Message.obtain()
            int r0 = r7.A00
            r5.what = r0
            r5.arg1 = r8
            r5.replyTo = r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = "oneWay"
            boolean r0 = r7 instanceof X.R29
            if (r0 == 0) goto L_0x0079
            r0 = 1
        L_0x0061:
            r4.putBoolean(r1, r0)
            java.lang.String r1 = "pkg"
            java.lang.String r0 = r6.getPackageName()
            r4.putString(r1, r0)
            java.lang.String r1 = "data"
            android.os.Bundle r0 = r7.A02
            r4.putBundle(r1, r0)
            r5.setData(r4)
            goto L_0x007b
        L_0x0079:
            r0 = 0
            goto L_0x0061
        L_0x007b:
            X.PyT r1 = r2.A01     // Catch:{ RemoteException -> 0x009f }
            android.os.Messenger r0 = r1.A00     // Catch:{ RemoteException -> 0x009f }
            if (r0 != 0) goto L_0x009a
            com.google.firebase.iid.zzm r0 = r1.A01     // Catch:{ RemoteException -> 0x009f }
            if (r0 == 0) goto L_0x0092
            android.os.Messenger r0 = r0.A00     // Catch:{ RemoteException -> 0x009f }
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "send"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ RemoteException -> 0x009f }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x009f }
        L_0x0091:
            throw r1     // Catch:{ RemoteException -> 0x009f }
        L_0x0092:
            java.lang.String r0 = "Both messengers are null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x009f }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x009f }
            goto L_0x0091
        L_0x009a:
            r0.send(r5)     // Catch:{ RemoteException -> 0x009f }
            goto L_0x0002
        L_0x009f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.A01(r3, r0)
            goto L_0x0002
        L_0x00a9:
            return
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PyU.run():void");
    }
}
