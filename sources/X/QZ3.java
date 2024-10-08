package X;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;

public final class QZ3 extends C7360Q6r {
    public final int A00;
    public final Context A01;
    public final C13904TjR A02;
    public final ReadableArray A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARNING: type inference failed for: r5v0, types: [android.os.CancellationSignal] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        r8.append(r0);
        r4 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r4 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r4.size() <= 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r8.append(" AND mime_type IN (");
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if (r3 >= r4.size()) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        r8.append("?,");
        r7.add(r4.getString(r3));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        r8.replace(r8.length() - 1, r8.length(), ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r3 = X.Pxe.A0U();
        r13 = r2.A01.getContentResolver();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r11 = X.AnonymousClass7TE.A0a();
        r6 = r2.A00;
        r11.putInt("android:query-arg-limit", r6 + 1);
        r4 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        r11.putInt("android:query-arg-offset", java.lang.Integer.parseInt(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        r11.putStringArray("android:query-arg-sort-columns", new java.lang.String[]{"date_added"});
        r11.putInt("android:query-arg-sort-direction", 1);
        r11.putString("android:query-arg-sql-selection", r8.toString());
        r11.putStringArray("android:query-arg-sql-selection-args", X.Pxf.A1a(r7, r7.size()));
        r10 = android.provider.MediaStore.Files.getContentUri("external");
        r9 = com.facebook.catalyst.modules.cameraroll.CameraRollManager.PROJECTION_LIST;
        r7 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0105, code lost:
        if (r10 == null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0107, code lost:
        r0 = r10.getAuthority();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        X.0Um.A00(r0, -910059163, r7);
        r5 = r13.query(r10, r9, r11, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0113, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r6 = r2.A00;
        r11 = r6 + 1;
        r9 = X.002.A0O("limit=", r11);
        r4 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0125, code lost:
        r9 = X.002.A07(r11, "limit=", r4, ",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012b, code lost:
        r5 = X.0fM.A01(r13, android.provider.MediaStore.Files.getContentUri("external").buildUpon().encodedQuery(r9).build(), r8.toString(), "date_added DESC, date_modified DESC", com.facebook.catalyst.modules.cameraroll.CameraRollManager.PROJECTION_LIST, (java.lang.String[]) r7.toArray(new java.lang.String[r7.size()]), 790849953);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0158, code lost:
        if (r5 != null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015a, code lost:
        X.Pxi.A1K(com.facebook.catalyst.modules.cameraroll.CameraRollManager.ERROR_UNABLE_TO_LOAD, r2.A02, "Could not get media");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0164, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        com.facebook.catalyst.modules.cameraroll.CameraRollManager.putEdges(r13, r5, r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016b, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016d, code lost:
        r1 = java.lang.Integer.parseInt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0171, code lost:
        com.facebook.catalyst.modules.cameraroll.CameraRollManager.putPageInfo(r5, r3, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0174, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2.A02.resolve(r3);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017b, code lost:
        r2.A02.resolve(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0180, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0181, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        ((com.facebook.react.bridge.PromiseImpl) r2.A02).reject(com.facebook.catalyst.modules.cameraroll.CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", r4, (X.C13948Tm8) null);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0193, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0194, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0196, code lost:
        if (r5 != 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0198, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        X.Pxi.A1K(com.facebook.catalyst.modules.cameraroll.CameraRollManager.ERROR_UNABLE_TO_FILTER, r2.A02, X.002.A18("Invalid filter option: '", r11, "'. Expected one of '", com.facebook.catalyst.modules.cameraroll.CameraRollManager.ASSET_TYPE_PHOTOS, "', '", com.facebook.catalyst.modules.cameraroll.CameraRollManager.ASSET_TYPE_VIDEOS, "' or '", com.facebook.catalyst.modules.cameraroll.CameraRollManager.ASSET_TYPE_ALL, "'."));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A00(java.lang.Object[] r21) {
        /*
            r20 = this;
            java.lang.String r10 = "limit="
            java.lang.String r0 = "1"
            java.lang.StringBuilder r8 = X.Pxe.A16(r0)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r2 = r20
            java.lang.String r1 = r2.A07
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = " AND bucket_display_name = ?"
            r8.append(r0)
            r7.add(r1)
        L_0x001e:
            java.lang.Integer r1 = r2.A04
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = " AND _size < ?"
            r8.append(r0)
            X.DbU.A1X(r1, r7)
        L_0x002a:
            java.lang.String r11 = r2.A06
            int r0 = r11.hashCode()
            java.lang.String r3 = "All"
            java.lang.String r15 = "Videos"
            java.lang.String r13 = "Photos"
            r1 = 0
            r9 = 1
            switch(r0) {
                case -1905167199: goto L_0x0065;
                case -1732810888: goto L_0x005c;
                case 65921: goto L_0x0053;
                default: goto L_0x003b;
            }
        L_0x003b:
            X.TjR r2 = r2.A02
            java.lang.String r10 = "Invalid filter option: '"
            java.lang.String r12 = "'. Expected one of '"
            java.lang.String r14 = "', '"
            java.lang.String r16 = "' or '"
            java.lang.String r18 = "'."
            r17 = r3
            java.lang.String r1 = X.002.A18(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = "E_UNABLE_TO_FILTER"
            X.Pxi.A1K(r0, r2, r1)
        L_0x0052:
            return
        L_0x0053:
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = " AND media_type IN (3,1)"
            goto L_0x006d
        L_0x005c:
            boolean r0 = r11.equals(r15)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = " AND media_type = 3"
            goto L_0x006d
        L_0x0065:
            boolean r0 = r11.equals(r13)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = " AND media_type = 1"
        L_0x006d:
            r8.append(r0)
            com.facebook.react.bridge.ReadableArray r4 = r2.A03
            if (r4 == 0) goto L_0x00a3
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x00a3
            java.lang.String r0 = " AND mime_type IN ("
            r8.append(r0)
            r3 = 0
        L_0x0080:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0095
            java.lang.String r0 = "?,"
            r8.append(r0)
            java.lang.String r0 = r4.getString(r3)
            r7.add(r0)
            int r3 = r3 + 1
            goto L_0x0080
        L_0x0095:
            int r4 = r8.length()
            int r4 = r4 - r9
            int r3 = r8.length()
            java.lang.String r0 = ")"
            r8.replace(r4, r3, r0)
        L_0x00a3:
            com.facebook.react.bridge.WritableNativeMap r3 = X.Pxe.A0U()
            android.content.Context r0 = r2.A01
            android.content.ContentResolver r13 = r0.getContentResolver()
            r5 = 0
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0181 }
            r0 = 29
            java.lang.String r12 = "external"
            if (r4 < r0) goto L_0x0115
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r4 = "android:query-arg-limit"
            int r6 = r2.A00     // Catch:{ SecurityException -> 0x0181 }
            int r0 = r6 + 1
            r11.putInt(r4, r0)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r4 = r2.A05     // Catch:{ SecurityException -> 0x0181 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 != 0) goto L_0x00d4
            java.lang.String r10 = "android:query-arg-offset"
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ SecurityException -> 0x0181 }
            r11.putInt(r10, r0)     // Catch:{ SecurityException -> 0x0181 }
        L_0x00d4:
            java.lang.String r10 = "android:query-arg-sort-columns"
            java.lang.String r0 = "date_added"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ SecurityException -> 0x0181 }
            r11.putStringArray(r10, r0)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r0 = "android:query-arg-sort-direction"
            r11.putInt(r0, r9)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r9 = "android:query-arg-sql-selection"
            java.lang.String r0 = r8.toString()     // Catch:{ SecurityException -> 0x0181 }
            r11.putString(r9, r0)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r8 = "android:query-arg-sql-selection-args"
            int r0 = r7.size()     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String[] r0 = X.Pxf.A1a(r7, r0)     // Catch:{ SecurityException -> 0x0181 }
            r11.putStringArray(r8, r0)     // Catch:{ SecurityException -> 0x0181 }
            android.net.Uri r10 = android.provider.MediaStore.Files.getContentUri(r12)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String[] r9 = com.facebook.catalyst.modules.cameraroll.CameraRollManager.PROJECTION_LIST     // Catch:{ SecurityException -> 0x0181 }
            r8 = -910059163(0xffffffffc9c19965, float:-1585964.6)
            java.lang.Integer r7 = X.AnonymousClass05K.A01     // Catch:{ SecurityException -> 0x0181 }
            if (r10 == 0) goto L_0x0113
            java.lang.String r0 = r10.getAuthority()     // Catch:{ SecurityException -> 0x0181 }
        L_0x010b:
            X.0Um.A00(r0, r8, r7)     // Catch:{ SecurityException -> 0x0181 }
            android.database.Cursor r5 = r13.query(r10, r9, r11, r5)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x0158
        L_0x0113:
            r0 = 0
            goto L_0x010b
        L_0x0115:
            int r6 = r2.A00     // Catch:{ SecurityException -> 0x0181 }
            int r11 = r6 + 1
            java.lang.String r9 = X.002.A0O(r10, r11)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r4 = r2.A05     // Catch:{ SecurityException -> 0x0181 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = ","
            java.lang.String r9 = X.002.A07(r11, r10, r4, r0)     // Catch:{ SecurityException -> 0x0181 }
        L_0x012b:
            android.net.Uri r0 = android.provider.MediaStore.Files.getContentUri(r12)     // Catch:{ SecurityException -> 0x0181 }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ SecurityException -> 0x0181 }
            android.net.Uri$Builder r0 = r0.encodedQuery(r9)     // Catch:{ SecurityException -> 0x0181 }
            android.net.Uri r14 = r0.build()     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String[] r17 = com.facebook.catalyst.modules.cameraroll.CameraRollManager.PROJECTION_LIST     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r15 = r8.toString()     // Catch:{ SecurityException -> 0x0181 }
            int r0 = r7.size()     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ SecurityException -> 0x0181 }
            java.lang.Object[] r0 = r7.toArray(r0)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r16 = "date_added DESC, date_modified DESC"
            r19 = 790849953(0x2f2369a1, float:1.486229E-10)
            r18 = r0
            android.database.Cursor r5 = X.0fM.A01(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SecurityException -> 0x0181 }
        L_0x0158:
            if (r5 != 0) goto L_0x0164
            X.TjR r3 = r2.A02     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r1 = "E_UNABLE_TO_LOAD"
            java.lang.String r0 = "Could not get media"
            X.Pxi.A1K(r1, r3, r0)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x0194
        L_0x0164:
            com.facebook.catalyst.modules.cameraroll.CameraRollManager.putEdges(r13, r5, r3, r6)     // Catch:{ all -> 0x017a }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x017a }
            if (r0 != 0) goto L_0x0171
            int r1 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x017a }
        L_0x0171:
            com.facebook.catalyst.modules.cameraroll.CameraRollManager.putPageInfo(r5, r3, r6, r1)     // Catch:{ all -> 0x017a }
            X.TjR r0 = r2.A02     // Catch:{ SecurityException -> 0x0181 }
            r0.resolve(r3)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x0190
        L_0x017a:
            r1 = move-exception
            X.TjR r0 = r2.A02     // Catch:{ SecurityException -> 0x0181 }
            r0.resolve(r3)     // Catch:{ SecurityException -> 0x0181 }
            throw r1     // Catch:{ SecurityException -> 0x0181 }
        L_0x0181:
            r4 = move-exception
            X.TjR r3 = r2.A02     // Catch:{ all -> 0x0195 }
            java.lang.String r2 = "E_UNABLE_TO_LOAD_PERMISSION"
            java.lang.String r1 = "Could not get media: need READ_EXTERNAL_STORAGE permission"
            com.facebook.react.bridge.PromiseImpl r3 = (com.facebook.react.bridge.PromiseImpl) r3     // Catch:{ all -> 0x0195 }
            r0 = 0
            r3.reject(r2, r1, r4, r0)     // Catch:{ all -> 0x0195 }
            if (r5 == 0) goto L_0x0052
        L_0x0190:
            r5.close()
            return
        L_0x0194:
            return
        L_0x0195:
            r0 = move-exception
            if (r5 == 0) goto L_0x019b
            r5.close()
        L_0x019b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QZ3.A00(java.lang.Object[]):void");
    }

    public QZ3(C13904TjR tjR, Q6H q6h, ReadableArray readableArray, Integer num, String str, String str2, String str3, int i) {
        super(q6h);
        this.A01 = q6h;
        this.A00 = i;
        this.A05 = str;
        this.A07 = str2;
        this.A03 = readableArray;
        this.A02 = tjR;
        this.A06 = str3;
        this.A04 = num;
    }
}
