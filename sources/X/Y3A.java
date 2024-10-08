package X;

import android.os.Handler;

public final class Y3A implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C22018Xss A01;
    public final /* synthetic */ C341687nM A02;

    public Y3A(Handler handler, C22018Xss xss, C341687nM r3) {
        this.A01 = xss;
        this.A02 = r3;
        this.A00 = handler;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.9tX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.9dT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.9dT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.9dT} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            X.Xss r4 = r6.A01
            X.7nM r5 = r6.A02
            android.os.Handler r3 = r6.A00
            monitor-enter(r4)
            java.lang.Integer r1 = r4.A0F     // Catch:{ all -> 0x0061 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0061 }
            if (r1 == r0) goto L_0x001b
            java.lang.String r0 = "prepare() must be called before starting audio recording."
            X.9dT r1 = new X.9dT     // Catch:{ all -> 0x0061 }
            r1.<init>(r0)     // Catch:{ all -> 0x0061 }
        L_0x0014:
            X.C22018Xss.A02(r1, r4)     // Catch:{ all -> 0x0061 }
            X.C18097VlR.A00(r3, r1, r5)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x001b:
            X.7mw r1 = r4.A09     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = "stAR"
            r1.A01(r0)     // Catch:{ Exception -> 0x0030 }
            r0 = 0
            r4.A03 = r0     // Catch:{ Exception -> 0x0030 }
            android.media.AudioRecord r0 = r4.A02     // Catch:{ Exception -> 0x0030 }
            r0.startRecording()     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = "stARs"
            r1.A01(r0)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0040
        L_0x0030:
            r2 = move-exception
            X.7mw r1 = r4.A09     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "stARe"
            r1.A01(r0)     // Catch:{ all -> 0x0061 }
            r0 = 22002(0x55f2, float:3.0831E-41)
            X.9dT r1 = new X.9dT     // Catch:{ all -> 0x0061 }
            r1.<init>((int) r0, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0061 }
            goto L_0x0014
        L_0x0040:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0061 }
            r4.A0F = r0     // Catch:{ all -> 0x0061 }
            boolean r0 = r4.A0D     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0053
            boolean r0 = r4.A0C     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0057
            android.os.Handler r1 = r4.A06     // Catch:{ all -> 0x0061 }
            java.lang.Runnable r0 = r4.A0A     // Catch:{ all -> 0x0061 }
            r1.post(r0)     // Catch:{ all -> 0x0061 }
        L_0x0053:
            X.C18097VlR.A01(r5, r3)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x0057:
            android.os.Handler r1 = r4.A06     // Catch:{ all -> 0x0061 }
            java.lang.Runnable r0 = r4.A0B     // Catch:{ all -> 0x0061 }
            r1.post(r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0053
        L_0x005f:
            monitor-exit(r4)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y3A.run():void");
    }
}
