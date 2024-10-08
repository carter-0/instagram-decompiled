package X;

/* renamed from: X.45H  reason: invalid class name */
public final class AnonymousClass45H extends 0ng {
    public final /* synthetic */ AnonymousClass454 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass45H(AnonymousClass454 r2) {
        super(516);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1 = new java.lang.StringBuilder(120);
        r1.append("SELECT ");
        r1.append("* ");
        r1.append("FROM ");
        r1.append("file_registry");
        r1 = r1.toString();
        X.0qQ.A07(r1);
        r6 = r4.E5j(new X.1W8(r1, (java.lang.Object[]) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r7 = r6.getColumnIndex("file_path");
        r5 = r6.getColumnIndex("owner_json");
        r6.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r6.isAfterLast() != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r2 = r6.getString(r7);
        r8 = r6.getString(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r8.getClass();
        r1 = X.AnonymousClass15o.A00.A03(r8);
        r1.A1J();
        r1 = (X.AnonymousClass5JO) com.instagram.fileregistry.OwnerHelper.A00.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.A07.put(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.0wb.A06("file_registry_init", X.002.A0R("Failed to parse: ", r8), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.C9153RRe.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        if (r4 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.C9153RRe.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r4 = r3.A06.A00("FileRegistry_init");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.454 r3 = r9.A00
            monitor-enter(r3)
            boolean r0 = r3.A03     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            return
        L_0x0009:
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            X.456 r1 = r3.A06     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = "FileRegistry_init"
            X.1W6 r4 = r1.A00(r0)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r5 = "file_registry"
            r2 = 0
            r0 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "SELECT "
            r1.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "* "
            r1.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "FROM "
            r1.append(r0)     // Catch:{ all -> 0x009b }
            r1.append(r5)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x009b }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x009b }
            X.1W8 r0 = new X.1W8     // Catch:{ all -> 0x009b }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x009b }
            android.database.Cursor r6 = r4.E5j(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "file_path"
            int r7 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "owner_json"
            int r5 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x0091 }
            r6.moveToFirst()     // Catch:{ all -> 0x0091 }
        L_0x004d:
            boolean r0 = r6.isAfterLast()     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x008a
            java.lang.String r2 = r6.getString(r7)     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = r6.getString(r5)     // Catch:{ all -> 0x0091 }
            r8.getClass()     // Catch:{ 1OQ | IOException -> 0x007a }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ 1OQ | IOException -> 0x007a }
            X.16F r1 = r0.A03(r8)     // Catch:{ 1OQ | IOException -> 0x007a }
            r1.A1J()     // Catch:{ 1OQ | IOException -> 0x007a }
            X.1Ow r0 = com.instagram.fileregistry.OwnerHelper.A00     // Catch:{ 1OQ | IOException -> 0x007a }
            X.1OU r1 = r0.A01(r1)     // Catch:{ 1OQ | IOException -> 0x007a }
            X.5JO r1 = (X.AnonymousClass5JO) r1     // Catch:{ 1OQ | IOException -> 0x007a }
            monitor-enter(r3)     // Catch:{ 1OQ | IOException -> 0x007a }
            java.util.HashMap r0 = r3.A07     // Catch:{ all -> 0x0077 }
            r0.put(r2, r1)     // Catch:{ all -> 0x0077 }
            monitor-exit(r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0086
        L_0x0077:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ 1OQ | IOException -> 0x007a }
        L_0x007a:
            r2 = move-exception
            java.lang.String r1 = "file_registry_init"
            java.lang.String r0 = "Failed to parse: "
            java.lang.String r0 = X.002.A0R(r0, r8)     // Catch:{ all -> 0x0091 }
            X.0wb.A06(r1, r0, r2)     // Catch:{ all -> 0x0091 }
        L_0x0086:
            r6.moveToNext()     // Catch:{ all -> 0x0091 }
            goto L_0x004d
        L_0x008a:
            r6.close()     // Catch:{ all -> 0x009b }
            r4.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00a7
        L_0x0091:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x009b }
        L_0x009a:
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            if (r4 == 0) goto L_0x00a6
            r4.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x00a7 }
        L_0x00a6:
            throw r1     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            r0 = 1
            r3.A03 = r0
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass45H.run():void");
    }
}
