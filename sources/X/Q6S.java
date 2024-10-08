package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class Q6S extends SQLiteOpenHelper implements X0Q {
    public final Object A00 = Pxe.A0p();

    public Q6S(Context context) {
        super(context, "contacts_db2", (SQLiteDatabase.CursorFactory) null, 201);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        if (i != 200) {
            AnonymousClass0fa.A00(-288956788);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts_upload_snapshot");
            AnonymousClass0fa.A00(-638734661);
            onCreate(sQLiteDatabase);
            return;
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(contacts_upload_snapshot)", (String[]) null);
        do {
            try {
                z = false;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                z = true;
            } finally {
                rawQuery.close();
            }
        } while (!"contact_extra_fields_hash".equalsIgnoreCase(rawQuery.getString(1)));
        if (!z) {
            AnonymousClass0fa.A00(-1058174775);
            sQLiteDatabase.execSQL("ALTER TABLE contacts_upload_snapshot ADD COLUMN contact_extra_fields_hash TEXT;");
            AnonymousClass0fa.A00(-945807519);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0fa.A00(1099882532);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS contacts_upload_snapshot (local_contact_id INTEGER PRIMARY KEY, contact_hash TEXT, contact_extra_fields_hash TEXT);");
        AnonymousClass0fa.A00(394701484);
    }
}
