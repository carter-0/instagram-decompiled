package X;

import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class SGm {
    public static final SGm A01 = new SGm();
    public static final C10268RpS A02 = new C10268RpS("LibraryVersion", "");
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[SYNTHETIC, Splitter:B:31:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008d A[SYNTHETIC, Splitter:B:40:0x008d] */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r8 = "Failed to get app version for libraryName: "
            java.lang.String r6 = "LibraryVersion"
            java.lang.String r0 = "Please provide a valid libraryName"
            X.AnonymousClass3Qk.A06(r11, r0)
            java.util.concurrent.ConcurrentHashMap r5 = r10.A00
            boolean r0 = r5.containsKey(r11)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = X.DbS.A0r(r11, r5)
            return r0
        L_0x0016:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r4 = 0
            java.lang.String r1 = "/%s.properties"
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch:{ IOException -> 0x005d }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ IOException -> 0x005d }
            java.lang.Class<X.SGm> r0 = X.SGm.class
            java.io.InputStream r7 = r0.getResourceAsStream(r1)     // Catch:{ IOException -> 0x005d }
            if (r7 == 0) goto L_0x003d
            r2.load(r7)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r0 = "version"
            java.lang.String r4 = r2.getProperty(r0, r4)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r0 = 2
            android.util.Log.isLoggable(r6, r0)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x0079
        L_0x003d:
            X.RpS r2 = A02     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r1 = X.002.A0R(r8, r11)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = r2.A00     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x0052:
            android.util.Log.w(r6, r1)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x0079
        L_0x0056:
            r0 = move-exception
            r4 = r7
            goto L_0x008b
        L_0x0059:
            r3 = move-exception
            r9 = r4
            r4 = r7
            goto L_0x005f
        L_0x005d:
            r3 = move-exception
            r9 = r4
        L_0x005f:
            X.RpS r2 = A02     // Catch:{ all -> 0x008a }
            java.lang.String r1 = X.002.A0R(r8, r11)     // Catch:{ all -> 0x008a }
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = r0.concat(r1)     // Catch:{ all -> 0x008a }
        L_0x0074:
            android.util.Log.e(r6, r1, r3)     // Catch:{ all -> 0x008a }
        L_0x0077:
            r7 = r4
            r4 = r9
        L_0x0079:
            if (r7 == 0) goto L_0x007e
            r7.close()     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            if (r4 != 0) goto L_0x0086
            r0 = 3
            android.util.Log.isLoggable(r6, r0)
            java.lang.String r4 = "UNKNOWN"
        L_0x0086:
            r5.put(r11, r4)
            return r4
        L_0x008a:
            r0 = move-exception
        L_0x008b:
            if (r4 == 0) goto L_0x0090
            r4.close()     // Catch:{ IOException -> 0x0090 }
        L_0x0090:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SGm.A00(java.lang.String):java.lang.String");
    }
}
