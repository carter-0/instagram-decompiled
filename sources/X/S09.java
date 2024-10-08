package X;

import java.util.List;

public final class S09 {
    public final List A00 = AnonymousClass7TE.A1C();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r7.isAssignableFrom(r2.A02) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList A00(java.lang.Class r6, java.lang.Class r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x003d }
            boolean r0 = r7.isAssignableFrom(r6)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x000f
            r4.add(r7)     // Catch:{ all -> 0x003d }
            goto L_0x003b
        L_0x000f:
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x003d }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x003d }
        L_0x0015:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x003d }
            X.Rtj r2 = (X.C10530Rtj) r2     // Catch:{ all -> 0x003d }
            java.lang.Class r0 = r2.A01     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isAssignableFrom(r6)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0032
            java.lang.Class r0 = r2.A02     // Catch:{ all -> 0x003d }
            boolean r1 = r7.isAssignableFrom(r0)     // Catch:{ all -> 0x003d }
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 == 0) goto L_0x0015
            java.lang.Class r0 = r2.A02     // Catch:{ all -> 0x003d }
            X.JTR.A1S(r0, r4)     // Catch:{ all -> 0x003d }
            goto L_0x0015
        L_0x003b:
            monitor-exit(r5)
            return r4
        L_0x003d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S09.A00(java.lang.Class, java.lang.Class):java.util.ArrayList");
    }
}
