package X;

import android.content.Context;

/* renamed from: X.456  reason: invalid class name */
public final class AnonymousClass456 {
    public 1W6 A00;
    public 1VY A01;
    public final Context A02;
    public final 1VV A03;
    public final AnonymousClass1VH A04;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.1VG, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if ((r3.getCause() instanceof java.lang.Exception) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r2 = (java.lang.Exception) r3.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ((r3 instanceof android.database.sqlite.SQLiteException) != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r3.getMessage().contains("PRAGMA journal_mode") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r0 = "getWritableDatabaseError_writeAheadLogging";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        X.0wb.A06(r0, r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if ((r3 instanceof android.database.sqlite.SQLiteFullException) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = "getWritableDatabaseError_diskFull";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if ((r3 instanceof android.database.sqlite.SQLiteCantOpenDatabaseException) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r0 = "getWritableDatabaseError_cantOpen";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if ((r3 instanceof android.database.sqlite.SQLiteDiskIOException) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r0 = "getWritableDatabaseError_diskIO";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        r0 = "getWritableDatabaseError_other_sqlite";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r0 = "getWritableDatabaseError_other";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.A02.deleteDatabase(r4.A03.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = new java.lang.Object().AKv(X.1VU.A00(r4.A02, r4.A03.A01, (java.lang.String) null, false, false)).CGp();
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.1W6 A00(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            X.1W6 r0 = r4.A00     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0087
            X.1VY r0 = r4.A01     // Catch:{ SQLiteException -> 0x000c }
            X.1W6 r0 = r0.CGp()     // Catch:{ SQLiteException -> 0x000c }
            goto L_0x0087
        L_0x000c:
            X.1VH r1 = r4.A04     // Catch:{ Exception -> 0x0021 }
            X.1VV r0 = r4.A03     // Catch:{ Exception -> 0x0021 }
            X.1VY r1 = r1.AKv(r0)     // Catch:{ Exception -> 0x0021 }
            r4.A01 = r1     // Catch:{ Exception -> 0x0021 }
            r0 = 0
            r1.Er1(r0)     // Catch:{ Exception -> 0x0021 }
            X.1VY r0 = r4.A01     // Catch:{ Exception -> 0x0021 }
            X.1W6 r0 = r0.CGp()     // Catch:{ Exception -> 0x0021 }
            goto L_0x0087
        L_0x0021:
            r3 = move-exception
            r2 = r3
        L_0x0023:
            java.lang.Throwable r0 = r3.getCause()     // Catch:{ all -> 0x0089 }
            boolean r0 = r0 instanceof java.lang.Exception     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0032
            java.lang.Throwable r2 = r3.getCause()     // Catch:{ all -> 0x0089 }
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch:{ all -> 0x0089 }
            goto L_0x0023
        L_0x0032:
            boolean r0 = r3 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0060
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "PRAGMA journal_mode"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "getWritableDatabaseError_writeAheadLogging"
        L_0x0044:
            X.0wb.A06(r0, r5, r2)     // Catch:{ all -> 0x0089 }
            goto L_0x0063
        L_0x0048:
            boolean r0 = r3 instanceof android.database.sqlite.SQLiteFullException     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "getWritableDatabaseError_diskFull"
            goto L_0x0044
        L_0x004f:
            boolean r0 = r3 instanceof android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "getWritableDatabaseError_cantOpen"
            goto L_0x0044
        L_0x0056:
            boolean r0 = r3 instanceof android.database.sqlite.SQLiteDiskIOException     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "getWritableDatabaseError_diskIO"
            goto L_0x0044
        L_0x005d:
            java.lang.String r0 = "getWritableDatabaseError_other_sqlite"
            goto L_0x0044
        L_0x0060:
            java.lang.String r0 = "getWritableDatabaseError_other"
            goto L_0x0044
        L_0x0063:
            android.content.Context r1 = r4.A02     // Catch:{ RuntimeException -> 0x006c }
            X.1VV r0 = r4.A03     // Catch:{ RuntimeException -> 0x006c }
            java.lang.String r0 = r0.A02     // Catch:{ RuntimeException -> 0x006c }
            r1.deleteDatabase(r0)     // Catch:{ RuntimeException -> 0x006c }
        L_0x006c:
            android.content.Context r3 = r4.A02     // Catch:{ all -> 0x0089 }
            r2 = 0
            r1 = 0
            X.1VV r0 = r4.A03     // Catch:{ all -> 0x0089 }
            X.1VS r0 = r0.A01     // Catch:{ all -> 0x0089 }
            X.1VV r1 = X.1VU.A00(r3, r0, r1, r2, r2)     // Catch:{ all -> 0x0089 }
            X.1VG r0 = new X.1VG     // Catch:{ all -> 0x0089 }
            r0.<init>()     // Catch:{ all -> 0x0089 }
            X.1VY r0 = r0.AKv(r1)     // Catch:{ all -> 0x0089 }
            X.1W6 r0 = r0.CGp()     // Catch:{ all -> 0x0089 }
            r4.A00 = r0     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r4)
            return r0
        L_0x0089:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass456.A00(java.lang.String):X.1W6");
    }

    public AnonymousClass456(Context context, 1VV r4, AnonymousClass1VH r5) {
        this.A02 = context;
        this.A03 = r4;
        this.A04 = r5;
        1VY AKv = r5.AKv(r4);
        this.A01 = AKv;
        AKv.Er1(true);
    }
}
