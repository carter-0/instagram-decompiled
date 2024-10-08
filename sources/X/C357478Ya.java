package X;

import java.util.concurrent.Callable;

/* renamed from: X.8Ya  reason: invalid class name and case insensitive filesystem */
public final class C357478Ya implements Callable {
    public final /* synthetic */ C357288Xh A00;

    public C357478Ya(C357288Xh r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r9 == 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r9 != null) goto L_0x0067;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r11 = this;
            X.8Xh r0 = r11.A00
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            android.net.Uri r6 = android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI
            if (r6 == 0) goto L_0x0071
            android.content.Context r0 = r0.A06
            android.content.ContentProviderClient r5 = X.C61990qh.A00(r0, r6)
            if (r5 == 0) goto L_0x0070
            java.lang.String r8 = "kind = 1"
            java.lang.String r10 = "video_id DESC"
            r9 = 0
            java.lang.String[] r7 = X.C357288Xh.A0F     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            android.database.Cursor r9 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            if (r9 == 0) goto L_0x0062
            int r0 = r9.getCount()     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "video_id"
            int r3 = r9.getColumnIndex(r0)     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            java.lang.String r0 = "_data"
            int r2 = r9.getColumnIndex(r0)     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
        L_0x0032:
            boolean r0 = r9.moveToNext()     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            if (r0 == 0) goto L_0x0048
            int r0 = r9.getInt(r3)     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            java.lang.String r0 = r9.getString(r2)     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            r4.put(r1, r0)     // Catch:{ RemoteException -> 0x005c, all -> 0x004c }
            goto L_0x0032
        L_0x0048:
            r5.release()
            goto L_0x0067
        L_0x004c:
            r1 = move-exception
            r5.release()
            if (r9 == 0) goto L_0x005b
            boolean r0 = r9.isClosed()
            if (r0 != 0) goto L_0x005b
            r9.close()
        L_0x005b:
            throw r1
        L_0x005c:
            r5.release()
            if (r9 == 0) goto L_0x0070
            goto L_0x0067
        L_0x0062:
            r5.release()
            if (r9 == 0) goto L_0x0070
        L_0x0067:
            boolean r0 = r9.isClosed()
            if (r0 != 0) goto L_0x0070
            r9.close()
        L_0x0070:
            return r4
        L_0x0071:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357478Ya.call():java.lang.Object");
    }
}
