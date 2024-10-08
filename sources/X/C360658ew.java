package X;

/* renamed from: X.8ew  reason: invalid class name and case insensitive filesystem */
public final class C360658ew {
    public final C307556Qo A00;

    public C360658ew(C307556Qo r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, X.8fd] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.1zE.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c2, code lost:
        if (r6 == false) goto L_0x00cc;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba A[ExcHandler: IOException (e java.io.IOException), PHI: r6 
      PHI: (r6v2 boolean) = (r6v0 boolean), (r6v0 boolean), (r6v3 boolean), (r6v0 boolean), (r6v0 boolean) binds: [B:12:0x0046, B:13:?, B:40:0x00b6, B:34:0x00af, B:35:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268654dm A00(X.C382959en r18) {
        /*
            r17 = this;
            r3 = r18
            if (r18 == 0) goto L_0x00d0
            java.lang.Class<X.9em> r2 = X.C382949em.class
            r6 = 0
            java.lang.String r1 = "action"
            r0 = 921594722(0x36ee6b62, float:7.1054537E-6)
            X.3lr r3 = r3.getOptionalTreeField(r6, r1, r2, r0)
            if (r3 == 0) goto L_0x00d0
            java.lang.Class<X.9el> r2 = X.C382939el.class
            java.lang.String r1 = "action_bundle"
            r0 = 1572491068(0x5dba4f3c, float:1.67812687E18)
            X.3lr r1 = r3.getOptionalTreeField(r6, r1, r2, r0)
            if (r1 == 0) goto L_0x00d0
            java.lang.String r0 = "bloks_bundle_action"
            java.lang.String r1 = r1.getOptionalStringField(r6, r0)
            if (r1 == 0) goto L_0x00d0
            r0 = r17
            X.6Qo r4 = r0.A00
            r0 = 1
            X.0qQ.A0B(r4, r0)
            r12 = 0
            java.lang.Class<X.1xI> r0 = X.AnonymousClass1xI.class
            monitor-enter(r0)
            monitor-exit(r0)
            java.util.Random r0 = X.C360998fV.A00
            int r3 = r0.nextInt()
            r2 = 3
            r4.AT5(r2, r3)
            java.lang.String r0 = "GraphQLBlokParse.parseBloksBundleActionWithData"
            X.1KZ.A01(r0)
            r4.currentMonotonicTimestamp()
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x00ba, all -> 0x00cb }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00ba, all -> 0x00cb }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException -> 0x00ba, all -> 0x00cb }
            r5.<init>(r0)     // Catch:{ IOException -> 0x00ba, all -> 0x00cb }
            X.8fW r0 = new X.8fW     // Catch:{ all -> 0x00b3 }
            r0.<init>(r5)     // Catch:{ all -> 0x00b3 }
            r0.Crg()     // Catch:{ all -> 0x00b3 }
            X.8fY r0 = X.C361028fY.A00(r0)     // Catch:{ all -> 0x00b3 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00b3 }
            X.4tN r0 = r0.A00     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00af
            X.3ew r1 = r0.A00     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00af
            X.4uI r7 = r1.A03     // Catch:{ all -> 0x00ac }
            java.util.List r10 = r1.A07     // Catch:{ all -> 0x00ac }
            java.util.List r13 = r1.A09     // Catch:{ all -> 0x00ac }
            java.util.List r0 = r1.A08     // Catch:{ all -> 0x00ac }
            java.util.Map r15 = X.C3034368u.A06(r0)     // Catch:{ all -> 0x00ac }
            X.68t r9 = r1.A02     // Catch:{ all -> 0x00ac }
            java.util.List r11 = r1.A0A     // Catch:{ all -> 0x00ac }
            java.util.Map r0 = r1.A0F     // Catch:{ all -> 0x00ac }
            java.util.List r14 = r1.A0E     // Catch:{ all -> 0x00ac }
            X.4uM r1 = r1.A01     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x0096
            java.lang.String r6 = r1.A00     // Catch:{ all -> 0x00ac }
        L_0x0081:
            r4.currentMonotonicTimestamp()     // Catch:{ all -> 0x00ac }
            X.8fd r1 = new X.8fd     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            X.68v r8 = new X.68v     // Catch:{ all -> 0x00ac }
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00ac }
            X.Di0 r0 = new X.Di0     // Catch:{ all -> 0x00ac }
            r0.<init>(r1, r8, r7, r6)     // Catch:{ all -> 0x00ac }
            goto L_0x0098
        L_0x0096:
            r6 = r12
            goto L_0x0081
        L_0x0098:
            r5.close()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r4.AT4(r2, r3)
            X.1KZ.A00()
            X.4do r1 = new X.4do
            r1.<init>(r0)
            return r1
        L_0x00a7:
            r0 = move-exception
            goto L_0x00c4
        L_0x00a9:
            r1 = move-exception
            r6 = 1
            goto L_0x00bb
        L_0x00ac:
            r1 = move-exception
            r6 = 1
            goto L_0x00b4
        L_0x00af:
            r5.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00ed
        L_0x00b3:
            r1 = move-exception
        L_0x00b4:
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            X.1zE.A00(r5, r1)     // Catch:{ IOException -> 0x00ba }
            throw r0     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
        L_0x00bb:
            java.lang.String r0 = "BloksBundleParser"
            X.1Kn.A03(r0, r1)     // Catch:{ all -> 0x00c1 }
            goto L_0x00d8
        L_0x00c1:
            r0 = move-exception
            if (r6 == 0) goto L_0x00cc
        L_0x00c4:
            r4.AT4(r2, r3)
        L_0x00c7:
            X.1KZ.A00()
            throw r0
        L_0x00cb:
            r0 = move-exception
        L_0x00cc:
            r4.AT3(r2, r3)
            goto L_0x00c7
        L_0x00d0:
            java.lang.String r0 = "Null response from BloksAsyncActionQueryResponse"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            goto L_0x00e7
        L_0x00d8:
            if (r6 == 0) goto L_0x00ed
            r4.AT4(r2, r3)
        L_0x00dd:
            X.1KZ.A00()
            java.lang.String r0 = "Failed to parse Bloks bundle action"
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r0)
        L_0x00e7:
            X.4dn r1 = new X.4dn
            r1.<init>(r2)
            return r1
        L_0x00ed:
            r4.AT3(r2, r3)
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360658ew.A00(X.9en):X.4dm");
    }
}
