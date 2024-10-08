package X;

import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.4B2  reason: invalid class name */
public final class AnonymousClass4B2 implements 1UV {
    public final /* synthetic */ AnonymousClass454 A00;
    public final /* synthetic */ PendingMediaStore A01;

    public AnonymousClass4B2(AnonymousClass454 r1, PendingMediaStore pendingMediaStore) {
        this.A01 = pendingMediaStore;
        this.A00 = r1;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean apply(java.lang.Object r10) {
        /*
            r9 = this;
            java.io.File r10 = (java.io.File) r10
            r8 = 0
            if (r10 == 0) goto L_0x0056
            long r6 = java.lang.System.currentTimeMillis()
            r4 = 60000(0xea60, double:2.9644E-319)
            com.instagram.pendingmedia.store.PendingMediaStore r0 = r9.A01
            com.instagram.common.session.UserSession r3 = r0.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604266802582567(0x820b6300081427, double:3.212023947280444E-306)
            long r1 = X.182.A01(r2, r3, r0)
            int r0 = (int) r1
            long r0 = (long) r0
            long r0 = r0 * r4
            long r6 = r6 - r0
            long r3 = r10.lastModified()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            X.454 r2 = r9.A00
            java.lang.String r1 = r10.getPath()
            monitor-enter(r2)
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0039 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            boolean r0 = r2.A03     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x003e
            goto L_0x0045
        L_0x003e:
            java.util.HashMap r0 = r2.A07     // Catch:{ all -> 0x0053 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0053 }
            goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0056
            long r1 = r10.lastModified()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0056
            r8 = 1
            return r8
        L_0x0053:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0056:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4B2.apply(java.lang.Object):boolean");
    }
}
