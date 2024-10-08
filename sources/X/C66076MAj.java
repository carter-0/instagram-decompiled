package X;

import java.util.concurrent.Callable;

/* renamed from: X.MAj  reason: case insensitive filesystem */
public final class C66076MAj implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ 2NU A01;

    public C66076MAj(1WY r1, 2NU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r22 = this;
            r1 = r22
            X.2NU r0 = r1.A01
            X.3oI r3 = r0.A02
            r3.beginTransaction()
            X.1WY r2 = r1.A00     // Catch:{ all -> 0x00b1 }
            r5 = 0
            r6 = 0
            r4 = 1
            android.database.Cursor r0 = r3.query((X.AnonymousClass1WA) r2, (android.os.CancellationSignal) r6)     // Catch:{ all -> 0x00b1 }
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x009c
            java.lang.String r9 = r0.getString(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = r0.getString(r4)     // Catch:{ all -> 0x00a9 }
            X.50r r8 = X.JUQ.A00(r1)     // Catch:{ all -> 0x00a9 }
            r1 = 2
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x00a9 }
            java.util.List r15 = X.JUP.A00(r1)     // Catch:{ all -> 0x00a9 }
            r4 = 3
            boolean r1 = r0.isNull(r4)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x0036
            r1 = r6
            goto L_0x003a
        L_0x0036:
            java.lang.String r1 = r0.getString(r4)     // Catch:{ all -> 0x00a9 }
        L_0x003a:
            X.9P8 r7 = X.JUR.A00(r1)     // Catch:{ all -> 0x00a9 }
            r1 = 4
            long r16 = r0.getLong(r1)     // Catch:{ all -> 0x00a9 }
            r4 = 5
            boolean r1 = r0.isNull(r4)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x004c
            r10 = r6
            goto L_0x0050
        L_0x004c:
            java.lang.String r10 = r0.getString(r4)     // Catch:{ all -> 0x00a9 }
        L_0x0050:
            r1 = 6
            java.lang.String r11 = r0.getString(r1)     // Catch:{ all -> 0x00a9 }
            r4 = 7
            boolean r1 = r0.isNull(r4)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x005e
            r12 = r6
            goto L_0x0062
        L_0x005e:
            java.lang.String r12 = r0.getString(r4)     // Catch:{ all -> 0x00a9 }
        L_0x0062:
            r4 = 8
            boolean r1 = r0.isNull(r4)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x006c
            r13 = r6
            goto L_0x0070
        L_0x006c:
            java.lang.String r13 = r0.getString(r4)     // Catch:{ all -> 0x00a9 }
        L_0x0070:
            r1 = 9
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x00a9 }
            boolean r20 = X.AnonymousClass7TF.A1P(r1)
            r1 = 10
            long r18 = r0.getLong(r1)     // Catch:{ all -> 0x00a9 }
            r1 = 11
            boolean r4 = r0.isNull(r1)     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x008c
            java.lang.String r6 = r0.getString(r1)     // Catch:{ all -> 0x00a9 }
        L_0x008c:
            r14 = r6
            r1 = 12
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x00a9 }
            boolean r21 = X.AnonymousClass7TF.A1P(r1)
            X.9On r6 = new X.9On     // Catch:{ all -> 0x00a9 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21)     // Catch:{ all -> 0x00a9 }
        L_0x009c:
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x00a9 }
            r0.close()     // Catch:{ all -> 0x00b1 }
            r2.A00()     // Catch:{ all -> 0x00b1 }
            r3.endTransaction()
            return r6
        L_0x00a9:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00b1 }
            r2.A00()     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            r3.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66076MAj.call():java.lang.Object");
    }
}
