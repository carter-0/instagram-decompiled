package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashSet;

/* renamed from: X.Xsu  reason: case insensitive filesystem */
public abstract class C22019Xsu {
    public static void A03(SQLiteDatabase sQLiteDatabase, String str, C21503Xd8[] xd8Arr) {
        sQLiteDatabase.delete("sqliteproc_schema", "table_name = ?", new String[]{str});
        ContentValues contentValues = new ContentValues();
        for (C21503Xd8 xd8 : xd8Arr) {
            contentValues.put("table_name", str);
            contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, xd8.A03);
            contentValues.put("type_name", xd8.A06);
            contentValues.put("default_value", xd8.A00);
            contentValues.put("is_nullable", Boolean.valueOf(xd8.A0A));
            contentValues.put("is_primary", Boolean.valueOf(xd8.A0B));
            contentValues.put("is_autoincrement", Boolean.valueOf(xd8.A08));
            contentValues.put("is_deleted", Boolean.valueOf(xd8.A09));
            contentValues.put("is_added", Boolean.valueOf(xd8.A07));
            contentValues.put("foreign_table", xd8.A02);
            contentValues.put("foreign_column", xd8.A01);
            contentValues.put("on_foreign_key_update", xd8.A05);
            contentValues.put("on_foreign_key_delete", xd8.A04);
            AnonymousClass0fa.A00(-497728300);
            sQLiteDatabase.insert("sqliteproc_schema", (String) null, contentValues);
            AnonymousClass0fa.A00(1954988663);
        }
    }

    public static String A00(YBX ybx, String str) {
        Cursor query;
        String str2;
        Object[] objArr = {"sqliteproc_metadata ", new String[]{"_id", "hash"}, "table_name = ?", new String[]{String.valueOf(str)}, null, null, null};
        if (objArr[5] != null) {
            query = YBX.A00(ybx, objArr);
        } else {
            query = ybx.AWy().query((String) objArr[0], (String[]) objArr[1], (String) objArr[2], (String[]) objArr[3], (String) null, (String) null, (String) objArr[4]);
        }
        if (query != null) {
            try {
                if (!query.isClosed()) {
                    if (query.moveToFirst()) {
                        str2 = query.getString(1);
                    } else {
                        str2 = null;
                    }
                    return str2;
                }
                String stackTraceString = Log.getStackTraceString((Throwable) null);
                0KC.A0C("AbstractDAOItem", stackTraceString);
                throw DbW.A0c(C273654mx.A00(54), stackTraceString);
            } finally {
                query.close();
            }
        } else {
            throw AnonymousClass7TE.A0w("cursor is null");
        }
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("table_name", str);
        contentValues.put("hash", str2);
        contentValues.put("index_hash", str3);
        AnonymousClass0fa.A00(318032543);
        sQLiteDatabase.insertWithOnConflict("sqliteproc_metadata", (String) null, contentValues, 5);
        AnonymousClass0fa.A00(-1918534415);
    }

    public static C21503Xd8[] A04(YBX ybx, String str) {
        Cursor query;
        IllegalStateException illegalStateException;
        Object[] objArr = {"sqliteproc_schema ", new String[]{"_id", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "type_name", "default_value", "is_nullable", "is_primary", "is_autoincrement", "is_deleted", "is_added", "foreign_table", "foreign_column", "on_foreign_key_update", "on_foreign_key_delete"}, "table_name = ?", new String[]{String.valueOf(str)}, null, null, null};
        YBX ybx2 = ybx;
        if (objArr[5] != null) {
            query = YBX.A00(ybx2, objArr);
        } else {
            query = ybx2.AWy().query((String) objArr[0], (String[]) objArr[1], (String) objArr[2], (String[]) objArr[3], (String) null, (String) null, (String) objArr[4]);
        }
        if (query != null) {
            try {
                if (!query.isClosed()) {
                    C21503Xd8[] xd8Arr = new C21503Xd8[query.getCount()];
                    int i = 0;
                    while (!query.isClosed()) {
                        if (!query.moveToNext()) {
                            return xd8Arr;
                        }
                        if (!(query.getString(1) == null || query.getString(2) == null)) {
                            xd8Arr[i] = new C21503Xd8(query.getString(1), query.getString(2), query.getString(3), query.getString(9), query.getString(10), query.getString(11), query.getString(12), AnonymousClass7TF.A1P(query.getInt(4)), AnonymousClass7TF.A1P(query.getInt(5)), AnonymousClass7TF.A1P(query.getInt(6)), AnonymousClass7TF.A1P(query.getInt(7)), AnonymousClass7TF.A1P(query.getInt(8)));
                        }
                        i++;
                    }
                    String stackTraceString = Log.getStackTraceString((Throwable) null);
                    0KC.A0C("AbstractDAOItem", stackTraceString);
                    illegalStateException = DbW.A0c(C273654mx.A00(54), stackTraceString);
                } else {
                    String stackTraceString2 = Log.getStackTraceString((Throwable) null);
                    0KC.A0C("AbstractDAOItem", stackTraceString2);
                    illegalStateException = DbW.A0c(C273654mx.A00(54), stackTraceString2);
                }
                throw illegalStateException;
            } finally {
                query.close();
            }
        } else {
            throw AnonymousClass7TE.A0w("cursor is null");
        }
    }

    public static HashSet A01(YBX ybx) {
        Cursor cursor;
        HashSet A1F = AnonymousClass7TE.A1F();
        Object[] objArr = {"sqliteproc_metadata ", new String[]{"_id", "table_name"}, null, null, null, null, null};
        if (objArr[5] != null) {
            cursor = YBX.A00(ybx, objArr);
        } else {
            cursor = ybx.AWy().query((String) objArr[0], (String[]) objArr[1], (String) objArr[2], (String[]) objArr[3], (String) null, (String) null, (String) objArr[4]);
        }
        try {
            if (cursor.moveToFirst()) {
                do {
                    A1F.add(cursor.getString(1));
                } while (cursor.moveToNext());
            }
            cursor.close();
            A1F.remove("__database__");
            return A1F;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
