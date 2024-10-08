package X;

public final class T5T implements C13494TbL {
    public static final SNG A01;
    public final R5n A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|(4:9|10|11|(2:13|16))|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0024 */
    static {
        /*
            X.SNG r0 = X.SNG.A02
            if (r0 != 0) goto L_0x002d
            java.lang.Class<X.SNG> r5 = X.SNG.class
            monitor-enter(r5)
            X.SNG r0 = X.SNG.A02     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028
            java.lang.String r4 = "getEmptyRegistry"
            java.lang.Class r1 = X.C10019RlE.A00     // Catch:{ all -> 0x002a }
            r3 = 0
            if (r1 == 0) goto L_0x0024
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0024 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r0)     // Catch:{ Exception -> 0x0024 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch:{ Exception -> 0x0024 }
            X.SNG r0 = (X.SNG) r0     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            X.SNG r0 = X.SNG.A01     // Catch:{ all -> 0x002a }
        L_0x0026:
            X.SNG.A02 = r0     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5T.<clinit>():void");
    }

    public T5T(R5n r5n) {
        this.A00 = r5n;
    }

    public T5T() {
    }
}
