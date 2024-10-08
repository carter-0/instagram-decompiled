package X;

public abstract class O1Y {
    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|6|7|8|9|10|20|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.database.Cursor r7) {
        /*
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            java.lang.String[] r5 = r7.getColumnNames()
            boolean r0 = r7.moveToFirst()
            if (r0 == 0) goto L_0x0047
            X.0qQ.A0A(r5)
            r4 = 0
            int r3 = r5.length
        L_0x0013:
            if (r4 >= r3) goto L_0x0047
            r1 = r5[r4]
            r6.append(r1)
            java.lang.String r0 = ":"
            r6.append(r0)
            int r2 = r7.getColumnIndex(r1)
            java.lang.String r0 = r7.getString(r2)     // Catch:{ Exception -> 0x0028 }
            goto L_0x003c
        L_0x0028:
            long r0 = r7.getLong(r2)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0031 }
            goto L_0x003c
        L_0x0031:
            int r0 = r7.getInt(r2)     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x003a }
            goto L_0x003c
        L_0x003a:
            java.lang.String r0 = ""
        L_0x003c:
            r6.append(r0)
            java.lang.String r0 = ";"
            r6.append(r0)
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0047:
            r7.moveToFirst()
            java.lang.String r0 = X.DbT.A10(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O1Y.A00(android.database.Cursor):java.lang.String");
    }
}
