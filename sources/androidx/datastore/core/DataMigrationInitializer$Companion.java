package androidx.datastore.core;

public final class DataMigrationInitializer$Companion {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.0rm} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Ja, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(androidx.datastore.core.DataMigrationInitializer$Companion r6, X.C284245Lp r7, java.util.List r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 4
            boolean r0 = X.C376709Ja.A00(r3, r9)
            if (r0 == 0) goto L_0x002c
            r4 = r9
            X.9Ja r4 = (X.C376709Ja) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r3) goto L_0x004f
            if (r0 != r5) goto L_0x0090
            java.lang.Object r2 = r4.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r4.A01
            X.0rm r3 = (X.0rm) r3
            goto L_0x0032
        L_0x002c:
            X.9Ja r4 = new X.9Ja
            r4.<init>(r6, r9, r3)
            goto L_0x0015
        L_0x0032:
            X.0eS.A00(r1)     // Catch:{ all -> 0x0078 }
            goto L_0x005f
        L_0x0036:
            X.0eS.A00(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = 0
            X.9KS r0 = new X.9KS
            r0.<init>((java.util.List) r8, (java.util.List) r2, (X.AnonymousClass4D7) r1)
            r4.A01 = r2
            r4.A00 = r3
            java.lang.Object r0 = r7.FK3(r4, r0)
            if (r0 != r6) goto L_0x0056
            return r6
        L_0x004f:
            java.lang.Object r2 = r4.A01
            java.util.List r2 = (java.util.List) r2
            X.0eS.A00(r1)
        L_0x0056:
            X.0rm r3 = new X.0rm
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x005f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r2.next()
            X.0sP r0 = (X.0sP) r0
            r4.A01 = r3     // Catch:{ all -> 0x0078 }
            r4.A02 = r2     // Catch:{ all -> 0x0078 }
            r4.A00 = r5     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.invoke(r4)     // Catch:{ all -> 0x0078 }
            if (r0 != r6) goto L_0x005f
            goto L_0x0086
        L_0x0078:
            r1 = move-exception
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L_0x0080
            r3.A00 = r1
            goto L_0x005f
        L_0x0080:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.2Og.A01(r0, r1)
            goto L_0x005f
        L_0x0086:
            return r6
        L_0x0087:
            java.lang.Object r1 = r3.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 != 0) goto L_0x0097
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0090:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L_0x0097:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion.A00(androidx.datastore.core.DataMigrationInitializer$Companion, X.5Lp, java.util.List, X.4D7):java.lang.Object");
    }
}
