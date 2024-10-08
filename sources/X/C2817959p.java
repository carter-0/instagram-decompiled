package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.59p  reason: invalid class name and case insensitive filesystem */
public final class C2817959p extends SQLiteOpenHelper {
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0fa.A00(971073106);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS DUPLICATE_REQUEST_DETECTOR_LOGS (_id INTEGER PRIMARY KEY AUTOINCREMENT,log_date INTEGER,log_diff_since_prev_ms INTEGER,log_request_name TEXT,log_request_url TEXT,log_request_real_time_ms INTEGER)");
        AnonymousClass0fa.A00(-95813766);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass0fa.A00(604719033);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DUPLICATE_REQUEST_DETECTOR_LOGS");
        AnonymousClass0fa.A00(-1888347271);
        onCreate(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}
