package X;

/* renamed from: X.93l  reason: invalid class name and case insensitive filesystem */
public final class C3729693l extends 0Yg implements C62320sa {
    public static final C3729693l A00 = new C3729693l();

    public C3729693l() {
        super(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            X.0eM r0 = X.C3729193f.A07     // Catch:{ all -> 0x00b7 }
            r0 = 856(0x358, float:1.2E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x00b7 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x00b7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b7 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x00b7 }
            r3.<init>(r1)     // Catch:{ all -> 0x00b7 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00b0 }
            r2.<init>()     // Catch:{ all -> 0x00b0 }
            r1 = 30
            X.9LR r0 = new X.9LR     // Catch:{ all -> 0x00b0 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00b0 }
            X.1r9.A01(r3, r0)     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00b0 }
            r7.<init>()     // Catch:{ all -> 0x00b0 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x002a:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00b0 }
            r6 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x00b0 }
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "BogoMIPS"
            boolean r0 = X.00p.A0k(r1, r0, r6)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x002a
            r7.add(r2)     // Catch:{ all -> 0x00b0 }
            goto L_0x002a
        L_0x0044:
            r0 = 10
            int r0 = X.0Yv.A1E(r7, r0)     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00b0 }
            r5.<init>(r0)     // Catch:{ all -> 0x00b0 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x0053:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00b0 }
            r4 = 1
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x00b0 }
            java.util.List r2 = X.00l.A0R(r1, r0, r6)     // Catch:{ all -> 0x00b0 }
            int r0 = r2.size()     // Catch:{ all -> 0x00b0 }
            r1 = 0
            if (r0 <= r4) goto L_0x0089
            java.lang.Object r0 = X.00k.A0K(r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00b0 }
            java.lang.CharSequence r0 = X.00l.A0B(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b0 }
            java.lang.Float r0 = X.012.A0q(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0089
            float r1 = r0.floatValue()     // Catch:{ all -> 0x00b0 }
        L_0x0089:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x00b0 }
            r5.add(r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x0053
        L_0x0091:
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x00b0 }
            r1 = 0
        L_0x0096:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00b0 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x00b0 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x00b0 }
            float r1 = r1 + r0
            goto L_0x0096
        L_0x00a8:
            r3.close()     // Catch:{ all -> 0x00b7 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x00bd
        L_0x00b0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r0)
        L_0x00bd:
            boolean r0 = r1 instanceof X.0eQ
            if (r0 == 0) goto L_0x00c2
            r1 = 0
        L_0x00c2:
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x00cf
            float r0 = r1.floatValue()
        L_0x00ca:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x00cf:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3729693l.invoke():java.lang.Object");
    }
}
