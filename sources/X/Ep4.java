package X;

public abstract class Ep4 {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        throw X.AnonymousClass7TE.A0j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C283955Jz parseFromJson(X.16F r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.5Jz r5 = new X.5Jz     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            r5.<init>()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            if (r1 == r0) goto L_0x0016
            r6.A0z()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            r5 = 0
            return r5
        L_0x0016:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            if (r1 == r0) goto L_0x004f
            java.lang.String r1 = X.AnonymousClass7TE.A17(r6)     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            java.lang.String r0 = "states"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            if (r0 == 0) goto L_0x004b
            r2 = 0
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            if (r1 != r0) goto L_0x0049
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
        L_0x0037:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            if (r1 == r0) goto L_0x0049
            X.4VB r0 = X.AnonymousClass4VI.parseFromJson(r6)     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0037
            r2.add(r0)     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            goto L_0x0037
        L_0x0049:
            r5.A00 = r2     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
        L_0x004b:
            r6.A0z()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            goto L_0x0016
        L_0x004f:
            java.util.List r4 = r5.A00     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            if (r4 != 0) goto L_0x005a
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            r5.A00 = r0     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            return r5
        L_0x005a:
            monitor-enter(r4)     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x007f }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x007f }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x007f }
        L_0x0064:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007d
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x007f }
            X.4VB r2 = (X.AnonymousClass4VB) r2     // Catch:{ all -> 0x007f }
            java.util.Map r1 = r5.A01     // Catch:{ all -> 0x007f }
            X.0qQ.A06(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = X.AnonymousClass5K0.A00(r2)     // Catch:{ all -> 0x007f }
            r1.put(r0, r2)     // Catch:{ all -> 0x007f }
            goto L_0x0064
        L_0x007d:
            monitor-exit(r4)     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            return r5
        L_0x007f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
            throw r0     // Catch:{ IOException -> 0x0088, Exception -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0088:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ep4.parseFromJson(X.16F):X.5Jz");
    }
}
