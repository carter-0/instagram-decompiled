package X;

import java.util.concurrent.Callable;

/* renamed from: X.7uc  reason: invalid class name and case insensitive filesystem */
public final class C346107uc implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ C311976dc A01;

    public C346107uc(1WY r1, C311976dc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r17 = this;
            r2 = r17
            X.6dc r0 = r2.A01
            X.3oI r1 = r0.A07
            X.1WY r4 = r2.A00
            r0 = 0
            r9 = 0
            android.database.Cursor r3 = X.1wT.A00(r1, r4, r0)
            java.lang.String r0 = "productId"
            int r8 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "collectionName"
            int r7 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "syncedAt"
            int r6 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "lastSyncedNextCursor"
            int r5 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "hasMore"
            int r2 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "collectionId"
            int r1 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0069 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r10 = r3.getString(r8)     // Catch:{ all -> 0x0069 }
            java.lang.String r11 = r3.getString(r7)     // Catch:{ all -> 0x0069 }
            long r14 = r3.getLong(r6)     // Catch:{ all -> 0x0069 }
            boolean r0 = r3.isNull(r5)     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x004e
            java.lang.String r9 = r3.getString(r5)     // Catch:{ all -> 0x0069 }
        L_0x004e:
            r12 = r9
            int r0 = r3.getInt(r2)     // Catch:{ all -> 0x0069 }
            r16 = 0
            if (r0 == 0) goto L_0x0059
            r16 = 1
        L_0x0059:
            java.lang.String r13 = r3.getString(r1)     // Catch:{ all -> 0x0069 }
            X.7ud r9 = new X.7ud     // Catch:{ all -> 0x0069 }
            r9.<init>(r10, r11, r12, r13, r14, r16)     // Catch:{ all -> 0x0069 }
        L_0x0062:
            r3.close()
            r4.A00()
            return r9
        L_0x0069:
            r0 = move-exception
            r3.close()
            r4.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346107uc.call():java.lang.Object");
    }
}
