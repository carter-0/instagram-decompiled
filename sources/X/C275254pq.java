package X;

/* renamed from: X.4pq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C275254pq implements Runnable {
    public final /* synthetic */ C275244pp A00;
    public final /* synthetic */ C274774p4 A01;

    public /* synthetic */ C275254pq(C275244pp r1, C274774p4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.4pt} */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.4qY] */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.4pv, X.4ps] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.5BI] */
    /* JADX WARNING: type inference failed for: r5v5, types: [X.4ps, X.4pu] */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01c5, code lost:
        if (r6 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01e3, code lost:
        if (r1 == null) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r6.A03() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r6.A02() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r0 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fa, code lost:
        if (0 != 0) goto L_0x0169;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0181 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x019f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x01b6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0185 A[Catch:{ all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d3 A[Catch:{ all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01ef A[Catch:{ all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[Catch:{ all -> 0x00fc }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            X.4pp r5 = r12.A00
            X.4p4 r6 = r12.A01
            X.4pO r4 = X.C274974pO.A04
            if (r4 == 0) goto L_0x01fa
            java.lang.String r1 = android.os.Build.BRAND
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r1.toLowerCase(r0)
            java.lang.String[] r0 = X.C275244pp.A07
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r2 = r0.contains(r3)
            java.lang.String[] r0 = X.C275244pp.A08
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r1 = r0.contains(r3)
            boolean r0 = X.C275244pp.A03
            r11 = 1
            if (r0 == 0) goto L_0x0035
            java.lang.String[] r0 = X.C275244pp.A06
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x003d
        L_0x0035:
            boolean r0 = X.C275244pp.A05
            if (r0 == 0) goto L_0x0082
            if (r2 != 0) goto L_0x003d
            if (r1 == 0) goto L_0x0082
        L_0x003d:
            r3 = 1
        L_0x003e:
            boolean r0 = X.C275244pp.A04
            if (r0 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x004b
            boolean r0 = r6.A03()
            r2 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            boolean r0 = X.C275244pp.A05
            if (r0 == 0) goto L_0x0059
            if (r1 == 0) goto L_0x0059
            boolean r0 = r6.A02()
            r1 = 1
            if (r0 != 0) goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r3 != 0) goto L_0x0080
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0080
        L_0x0062:
            boolean r0 = r6.A00()
            if (r0 == 0) goto L_0x006e
            com.facebook.common.hiddenapis2.ApiExemption.enableUnsafeExemption()
            com.facebook.common.hiddenapis2.ApiExemption.removeRestriction_DO_NOT_USE()
        L_0x006e:
            if (r2 == 0) goto L_0x0090
            android.os.Looper r3 = r5.A00
            X.5BI r2 = new X.5BI
            r2.<init>()
            r9 = 0
            r2.A04 = r9
            java.lang.Class<android.os.Looper> r7 = android.os.Looper.class
            java.lang.String r6 = "getMessageMonitor"
            r1 = 0
            goto L_0x0084
        L_0x0080:
            r11 = 0
            goto L_0x0062
        L_0x0082:
            r3 = 0
            goto L_0x003e
        L_0x0084:
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x00fa }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r6, r0)     // Catch:{ all -> 0x00fa }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x00fa }
            goto L_0x0169
        L_0x0090:
            if (r1 == 0) goto L_0x00e8
            android.os.Looper r3 = r5.A00
            X.4qY r8 = new X.4qY
            r8.<init>()
            r9 = 0
            r8.A03 = r9
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.String r0 = "mLooperExt"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x00ab }
            r10 = 1
            r0.setAccessible(r10)     // Catch:{ all -> 0x00a9 }
            goto L_0x00b9
        L_0x00a9:
            if (r0 != 0) goto L_0x00b9
        L_0x00ab:
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x00e8
            X.4pA r6 = r5.A01
            X.4pv r5 = new X.4pv
            r5.<init>(r3, r6, r4)
            r5.A00 = r8
            goto L_0x0119
        L_0x00b9:
            r8.A01 = r0
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00dc }
            r8.A00 = r0     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00dc
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x00dc }
            java.lang.String r6 = "stopLooperMessageMonitor"
            java.lang.Class<android.os.Message> r2 = android.os.Message.class
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00dc }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00dc }
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r1, r0}     // Catch:{ all -> 0x00dc }
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r6, r0)     // Catch:{ all -> 0x00dc }
            r8.A02 = r0     // Catch:{ all -> 0x00dc }
            r0.setAccessible(r10)     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            java.lang.Object r0 = r8.A00
            if (r0 == 0) goto L_0x00e5
            java.lang.reflect.Method r0 = r8.A02
            if (r0 == 0) goto L_0x00e5
            r9 = 1
        L_0x00e5:
            r8.A03 = r9
            goto L_0x00ab
        L_0x00e8:
            android.os.Looper r3 = r5.A00
            X.4pA r6 = r5.A01
            if (r11 != 0) goto L_0x00f4
            X.4pt r5 = new X.4pt
            r5.<init>(r3, r6, r4)
            goto L_0x0119
        L_0x00f4:
            X.4pr r5 = new X.4pr
            r5.<init>(r3, r6, r4)
            goto L_0x0119
        L_0x00fa:
            if (r1 != 0) goto L_0x0169
        L_0x00fc:
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x00e8
            java.lang.reflect.Field r0 = r2.A01
            if (r0 == 0) goto L_0x00e8
            java.lang.reflect.Method r0 = r2.A03
            if (r0 == 0) goto L_0x00e8
            java.lang.reflect.Method r0 = r2.A02
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r2.A04
            X.4pA r6 = r5.A01
            if (r0 == 0) goto L_0x00f4
            X.4pu r5 = new X.4pu
            r5.<init>(r3, r6, r4)
            r5.A00 = r2
        L_0x0119:
            boolean r0 = r5 instanceof X.C275264pr
            if (r0 == 0) goto L_0x0166
            r1 = r5
            X.4pr r1 = (X.C275264pr) r1
            boolean r0 = r1 instanceof X.C275294pu
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = "looperMi"
        L_0x0126:
            r6.Ex8(r3, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            X.AnonymousClass18k.A06 = r0
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x014f
            r0 = 1
            r5.A02 = r0
            android.os.Message r0 = android.os.Message.obtain()
            r5.A01 = r0
            r0.setTarget(r5)
            X.4pA r1 = r5.A03
            android.os.Message r0 = r5.A01
            r1.Ewt(r0)
            android.os.Message r0 = android.os.Message.obtain(r5, r5)
            r5.A00 = r0
            r5.sendMessageAtFrontOfQueue(r0)
        L_0x014f:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r3 != r0) goto L_0x01fa
            long r0 = android.os.SystemClock.uptimeMillis()
            X.AnonymousClass18k.A05 = r0
            return
        L_0x015c:
            boolean r0 = r1 instanceof X.C275304pv
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = "looperRealme"
            goto L_0x0126
        L_0x0163:
            java.lang.String r0 = "looper"
            goto L_0x0126
        L_0x0166:
            java.lang.String r0 = "proxy"
            goto L_0x0126
        L_0x0169:
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch:{ all -> 0x00fc }
            r2.A00 = r0     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00fc
            java.lang.Class<android.os.Message> r6 = android.os.Message.class
            java.lang.String r0 = "monitorInfo"
            java.lang.reflect.Field r7 = r6.getDeclaredField(r0)     // Catch:{ all -> 0x0180 }
            r0 = 1
            r7.setAccessible(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x0181
        L_0x0180:
            r7 = 0
        L_0x0181:
            r2.A01 = r7     // Catch:{ all -> 0x00fc }
            if (r7 == 0) goto L_0x00fc
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x00fc }
            java.lang.Class r8 = r0.getClass()     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = "markDispatch"
            java.lang.Class r0 = r7.getType()     // Catch:{ all -> 0x00fc }
            r7 = 1
            java.lang.Class[] r0 = new java.lang.Class[]{r6, r0}     // Catch:{ all -> 0x00fc }
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r1, r0)     // Catch:{ all -> 0x019e }
            r0.setAccessible(r7)     // Catch:{ all -> 0x019f }
            goto L_0x019f
        L_0x019e:
            r0 = 0
        L_0x019f:
            r2.A02 = r0     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = "markFinish"
            java.lang.reflect.Field r0 = r2.A01     // Catch:{ all -> 0x00fc }
            java.lang.Class r0 = r0.getType()     // Catch:{ all -> 0x00fc }
            java.lang.Class[] r0 = new java.lang.Class[]{r6, r0}     // Catch:{ all -> 0x00fc }
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r1, r0)     // Catch:{ all -> 0x01b5 }
            r0.setAccessible(r7)     // Catch:{ all -> 0x01b6 }
            goto L_0x01b6
        L_0x01b5:
            r0 = 0
        L_0x01b6:
            r2.A03 = r0     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = "isMonitorLooper"
            r6 = 0
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x01c5 }
            java.lang.reflect.Method r6 = r8.getDeclaredMethod(r1, r0)     // Catch:{ all -> 0x01c5 }
            r6.setAccessible(r7)     // Catch:{ all -> 0x01c5 }
            goto L_0x01c7
        L_0x01c5:
            if (r6 == 0) goto L_0x01d9
        L_0x01c7:
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x00fc }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r6.invoke(r1, r0)     // Catch:{ all -> 0x00fc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x01d9
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00fc }
            r2.A04 = r0     // Catch:{ all -> 0x00fc }
        L_0x01d9:
            java.lang.String r0 = "mEnableMonitorMessage"
            java.lang.reflect.Field r1 = r8.getDeclaredField(r0)     // Catch:{ all -> 0x00fc }
            r1.setAccessible(r7)     // Catch:{ all -> 0x01e3 }
            goto L_0x01e5
        L_0x01e3:
            if (r1 == 0) goto L_0x00fc
        L_0x01e5:
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00fc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00fc
            boolean r1 = r2.A04     // Catch:{ all -> 0x00fc }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00fc }
            r0 = r0 | r1
            r2.A04 = r0     // Catch:{ all -> 0x00fc }
            goto L_0x00fc
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C275254pq.run():void");
    }
}
