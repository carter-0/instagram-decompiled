package X;

public final class MCu extends Thread {
    public volatile boolean A00;
    public final /* synthetic */ LSA A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MCu(LSA lsa) {
        super(002.A0R(lsa.A05, " RenderThread"));
        this.A01 = lsa;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|78|75|8|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r3.A03.Ddq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r1 = r3.A05;
        X.LSA.A02(r2, r1);
        X.0KC.A0F("RenderManager", X.002.A0R("Error while destroying callback for ", r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ea, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e3 A[Catch:{ Exception -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000d A[LOOP:1: B:7:0x000d->B:75:0x000d, LOOP_START, SYNTHETIC, Splitter:B:7:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r6 = "RenderManager"
            X.LSA r3 = r13.A01     // Catch:{ Exception -> 0x00ed }
            boolean r0 = r3.A01     // Catch:{ Exception -> 0x00ed }
            if (r0 == 0) goto L_0x000b
            android.os.Looper.prepare()     // Catch:{ Exception -> 0x00ed }
        L_0x000b:
            r12 = r13
        L_0x000c:
            monitor-enter(r12)     // Catch:{ Exception -> 0x00ed }
        L_0x000d:
            boolean r0 = r13.A00     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x001d
            java.util.Queue r0 = r3.A07     // Catch:{ all -> 0x00ea }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x001d
            r13.wait()     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x000d
        L_0x001d:
            r7 = 0
            r13.A00 = r7     // Catch:{ all -> 0x00ea }
            monitor-exit(r12)     // Catch:{ all -> 0x00ea }
        L_0x0021:
            java.util.Queue r1 = r3.A07     // Catch:{ Exception -> 0x00ed }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x00ed }
            if (r0 != 0) goto L_0x00a4
            java.lang.Object r5 = r1.poll()     // Catch:{ Exception -> 0x00ed }
            r5.getClass()     // Catch:{ Exception -> 0x00ed }
            X.MTs r5 = (X.C66489MTs) r5     // Catch:{ Exception -> 0x00ed }
            X.LNz r10 = r5.C3F()     // Catch:{ Exception -> 0x00ed }
            X.MVd r11 = r3.A02     // Catch:{ Exception -> 0x00ed }
            r9 = r11
            X.LrU r9 = (X.C65331LrU) r9     // Catch:{ Exception -> 0x00ed }
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A02     // Catch:{ Exception -> 0x00ed }
            boolean r0 = r0.get()     // Catch:{ Exception -> 0x00ed }
            if (r0 != 0) goto L_0x0050
            r11.ErI(r10)     // Catch:{ Exception -> 0x00ed }
            java.util.Map r1 = r3.A06     // Catch:{ Exception -> 0x00ed }
            r0 = 0
            r1.put(r10, r0)     // Catch:{ Exception -> 0x00ed }
        L_0x004c:
            r5.EEp()     // Catch:{ Exception -> 0x00ed }
            goto L_0x0021
        L_0x0050:
            r11.A7D()     // Catch:{ Exception -> 0x00ed }
            java.lang.Integer r0 = r10.A01     // Catch:{ Exception -> 0x00ed }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x00ed }
            java.util.Map r8 = r3.A06     // Catch:{ Exception -> 0x00ed }
            if (r0 == r7) goto L_0x0076
            boolean r0 = r8.containsKey(r10)     // Catch:{ Exception -> 0x00ed }
            if (r0 == 0) goto L_0x0098
            r8.get(r10)     // Catch:{ Exception -> 0x00ed }
        L_0x0066:
            android.view.Surface r1 = r10.A00     // Catch:{ Exception -> 0x00ed }
            if (r1 == 0) goto L_0x004c
            X.0eM r0 = r9.A03     // Catch:{ Exception -> 0x00ed }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x00ed }
            com.instagram.unifiedfilter.UnifiedFilterManager r0 = (com.instagram.unifiedfilter.UnifiedFilterManager) r0     // Catch:{ Exception -> 0x00ed }
            r0.setSurface(r1)     // Catch:{ Exception -> 0x00ed }
            goto L_0x004c
        L_0x0076:
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r8)     // Catch:{ Exception -> 0x00ed }
        L_0x007a:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00ed }
            if (r0 == 0) goto L_0x0098
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r4)     // Catch:{ Exception -> 0x00ed }
            java.lang.Object r0 = r2.getKey()     // Catch:{ Exception -> 0x00ed }
            X.LNz r0 = (X.LNz) r0     // Catch:{ Exception -> 0x00ed }
            android.graphics.SurfaceTexture r1 = r0.A00()     // Catch:{ Exception -> 0x00ed }
            android.graphics.SurfaceTexture r0 = r10.A00()     // Catch:{ Exception -> 0x00ed }
            if (r1 != r0) goto L_0x007a
            r2.getValue()     // Catch:{ Exception -> 0x00ed }
            goto L_0x0066
        L_0x0098:
            android.graphics.SurfaceTexture r0 = r10.A00()     // Catch:{ Exception -> 0x00ed }
            android.opengl.EGLSurface r0 = r11.ANO(r0)     // Catch:{ Exception -> 0x00ed }
            r8.put(r10, r0)     // Catch:{ Exception -> 0x00ed }
            goto L_0x0066
        L_0x00a4:
            java.lang.Object r1 = r3.A04     // Catch:{ Exception -> 0x00ed }
            monitor-enter(r1)     // Catch:{ Exception -> 0x00ed }
            boolean r0 = r3.A00     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00ad
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x00b0
        L_0x00ad:
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x000c
        L_0x00b0:
            X.MTr r0 = r3.A03     // Catch:{ Exception -> 0x00b6 }
            r0.Ddq()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00c5
        L_0x00b6:
            r2 = move-exception
            java.lang.String r1 = r3.A05     // Catch:{ Exception -> 0x00ed }
            X.LSA.A02(r2, r1)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r0 = "Error while destroying callback for "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ Exception -> 0x00ed }
            X.0KC.A0F(r6, r0, r2)     // Catch:{ Exception -> 0x00ed }
        L_0x00c5:
            java.util.Map r0 = r3.A06     // Catch:{ Exception -> 0x00d0 }
            r0.clear()     // Catch:{ Exception -> 0x00d0 }
            X.MVd r0 = r3.A02     // Catch:{ Exception -> 0x00d0 }
            r0.AOs()     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00df
        L_0x00d0:
            r2 = move-exception
            java.lang.String r1 = r3.A05     // Catch:{ Exception -> 0x00ed }
            X.LSA.A02(r2, r1)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r0 = "Error while destroying context for "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ Exception -> 0x00ed }
            X.0KC.A0F(r6, r0, r2)     // Catch:{ Exception -> 0x00ed }
        L_0x00df:
            boolean r0 = r3.A01     // Catch:{ Exception -> 0x00ed }
            if (r0 == 0) goto L_0x0115
            android.os.Looper.loop()     // Catch:{ Exception -> 0x00ed }
            return
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ec
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00ea }
        L_0x00ec:
            throw r0     // Catch:{ Exception -> 0x00ed }
        L_0x00ed:
            r5 = move-exception
            X.LSA r4 = r13.A01
            java.lang.String r3 = r4.A05
            X.LSA.A02(r5, r3)
            java.lang.Class r0 = r5.getClass()
            java.lang.String r2 = r0.getName()
            java.lang.String r1 = " in "
            java.lang.String r0 = " render thread"
            java.lang.String r0 = X.002.A0u(r2, r1, r3, r0)
            X.0KC.A0F(r6, r0, r5)
            X.MVd r0 = r4.A02
            r0.ECZ()
            X.LSA.A00(r4)
            X.MTr r0 = r4.A03
            r0.DCn(r5)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCu.run():void");
    }
}
