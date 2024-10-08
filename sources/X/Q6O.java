package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class Q6O extends SQLiteOpenHelper {
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0fa.A00(-827918443);
        sQLiteDatabase.execSQL("CREATE TABLE cached_resources (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, flavor TEXT NOT NULL, build_number INTEGER NOT NULL, version INTEGER NOT NULL, js_segment_hash TEXT)");
        AnonymousClass0fa.A00(1735183231);
        AnonymousClass0fa.A00(-1375424180);
        sQLiteDatabase.execSQL("CREATE INDEX index_name_flavor ON cached_resources (name, flavor)");
        AnonymousClass0fa.A00(763175481);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass0fa.A00(876313557);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cached_resources");
        AnonymousClass0fa.A00(848790150);
        onCreate(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass0fa.A00(876313557);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cached_resources");
        AnonymousClass0fa.A00(848790150);
        onCreate(sQLiteDatabase);
    }
}
