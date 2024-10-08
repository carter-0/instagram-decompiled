package X;

import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.7OZ  reason: invalid class name */
public final class AnonymousClass7OZ extends SQLiteOpenHelper {
    public static AnonymousClass7OZ A01;
    public SQLiteDatabase A00;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.database.sqlite.SQLiteDatabase A01() {
        /*
            r3 = this;
            r2 = r3
            monitor-enter(r2)
            android.database.sqlite.SQLiteDatabase r1 = r3.A00     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000d
            boolean r0 = r1.isOpen()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000d
            goto L_0x001d
        L_0x000d:
            android.database.sqlite.SQLiteDatabase r0 = r3.getWritableDatabase()     // Catch:{ SQLException | IllegalStateException -> 0x0014 }
            r3.A00 = r0     // Catch:{ SQLException | IllegalStateException -> 0x0014 }
            goto L_0x001b
        L_0x0014:
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "recent_searches.db"
            r1.deleteDatabase(r0)     // Catch:{ all -> 0x001f }
        L_0x001b:
            android.database.sqlite.SQLiteDatabase r1 = r3.A00     // Catch:{ all -> 0x0021 }
        L_0x001d:
            monitor-exit(r2)
            return r1
        L_0x001f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7OZ.A01():android.database.sqlite.SQLiteDatabase");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.7OZ, android.database.sqlite.SQLiteOpenHelper] */
    public static synchronized AnonymousClass7OZ A00() {
        AnonymousClass7OZ r2;
        synchronized (AnonymousClass7OZ.class) {
            AnonymousClass7OZ r22 = A01;
            r2 = r22;
            if (r22 == null) {
                ? sQLiteOpenHelper = new SQLiteOpenHelper(C60960kU.A00, "recent_searches.db", (SQLiteDatabase.CursorFactory) null, 1, new DefaultDatabaseErrorHandler());
                A01 = sQLiteOpenHelper;
                r2 = sQLiteOpenHelper;
            }
        }
        return r2;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0fa.A00(-1359514729);
        sQLiteDatabase.execSQL("create table if not exists recent_searches(user_id text not null, target_key text not null, target_info text not null, last_picked_time_ms text not null,  primary key(user_id, target_key));");
        AnonymousClass0fa.A00(-1451991036);
    }
}
