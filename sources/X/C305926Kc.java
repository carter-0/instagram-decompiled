package X;

import java.util.Collections;

/* renamed from: X.6Kc  reason: invalid class name and case insensitive filesystem */
public final class C305926Kc {
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if (X.AnonymousClass2Po.A01 == false) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A01(java.lang.Object r5, java.util.Map r6) {
        /*
            java.lang.Class<X.6Kc> r4 = X.C305926Kc.class
            monitor-enter(r4)
            X.AnonymousClass2Po.A00()     // Catch:{ all -> 0x00c8 }
            boolean r0 = X.AnonymousClass2Po.A00     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x0014
            X.AnonymousClass2Po.A00()     // Catch:{ all -> 0x00c8 }
            X.AnonymousClass2Po.A00()     // Catch:{ all -> 0x00c8 }
            boolean r0 = X.AnonymousClass2Po.A01     // Catch:{ all -> 0x00c8 }
            goto L_0x00c4
        L_0x0014:
            X.2QF r1 = X.2QF.A00()     // Catch:{ IllegalStateException -> 0x00bb }
            boolean r0 = X.C70452Ph.A00()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r2 = "endpoint"
            java.lang.String r0 = X.0LA.A00()     // Catch:{ all -> 0x00c8 }
            java.util.Map r6 = java.util.Collections.singletonMap(r2, r0)     // Catch:{ all -> 0x00c8 }
        L_0x0028:
            boolean r0 = r5 instanceof androidx.fragment.app.Fragment     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x008c
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.2Ps r0 = r0.A07()     // Catch:{ all -> 0x00c8 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x004f
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.3pW r0 = r0.A05()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x004f
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.3pW r0 = r0.A05()     // Catch:{ all -> 0x00c8 }
            r0.A01(r5, r6)     // Catch:{ all -> 0x00c8 }
        L_0x004f:
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.2Ps r0 = r0.A07()     // Catch:{ all -> 0x00c8 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c6
            X.0eK r0 = r1.A0J     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c6
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.3xR r0 = r0.A01()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c6
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.3xR r3 = r0.A01()     // Catch:{ all -> 0x00c8 }
            int r1 = r3.A00     // Catch:{ all -> 0x00c8 }
            java.util.Random r0 = X.C257463xR.A02     // Catch:{ all -> 0x00c8 }
            int r0 = r0.nextInt(r1)     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x00c6
            java.lang.Class r0 = r5.getClass()     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x00c8 }
            r1 = 0
            java.lang.String r0 = "fragment"
            r3.A00(r2, r0, r1)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c6
        L_0x008c:
            boolean r0 = r5 instanceof android.app.Activity     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0094
            r1.A0B(r5, r6)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c6
        L_0x0094:
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.2Ps r0 = r0.A07()     // Catch:{ all -> 0x00c8 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c6
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.3pW r0 = r0.A05()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c6
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x00c8 }
            X.3pW r0 = r0.A05()     // Catch:{ all -> 0x00c8 }
            r0.getClass()     // Catch:{ all -> 0x00c8 }
            r0.A02(r5, r6)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c6
        L_0x00bb:
            r2 = move-exception
            java.lang.String r1 = "IgLeakDetector:memoryManagerNotInitialized"
            java.lang.String r0 = "couldn't get memory manager"
            X.0KC.A0J(r1, r0, r2)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c6
        L_0x00c4:
            if (r0 != 0) goto L_0x0014
        L_0x00c6:
            monitor-exit(r4)
            return
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305926Kc.A01(java.lang.Object, java.util.Map):void");
    }

    public static void A00(Object obj) {
        A01(obj, Collections.emptyMap());
    }
}
