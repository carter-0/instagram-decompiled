package X;

import java.util.concurrent.Callable;

/* renamed from: X.51o  reason: invalid class name and case insensitive filesystem */
public final class C2803951o implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ C279014xw A01;

    public C2803951o(1WY r1, C279014xw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.5Iu] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r8 = this;
            X.4xw r0 = r8.A01
            X.3oI r1 = r0.A01
            X.1WY r6 = r8.A00
            r0 = 0
            r7 = 0
            android.database.Cursor r5 = X.1wT.A00(r1, r6, r0)
            java.lang.String r0 = "id"
            int r3 = X.1Wd.A01(r5, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "last_sync_time"
            int r2 = X.1Wd.A01(r5, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "tia_last_interval_end"
            int r1 = X.1Wd.A01(r5, r0)     // Catch:{ all -> 0x0047 }
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0040
            int r4 = r5.getInt(r3)     // Catch:{ all -> 0x0047 }
            long r2 = r5.getLong(r2)     // Catch:{ all -> 0x0047 }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x003a
            long r0 = r5.getLong(r1)     // Catch:{ all -> 0x0047 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0047 }
        L_0x003a:
            X.5Iu r0 = new X.5Iu     // Catch:{ all -> 0x0047 }
            r0.<init>(r7, r4, r2)     // Catch:{ all -> 0x0047 }
            r7 = r0
        L_0x0040:
            r5.close()
            r6.A00()
            return r7
        L_0x0047:
            r0 = move-exception
            r5.close()
            r6.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2803951o.call():java.lang.Object");
    }
}
