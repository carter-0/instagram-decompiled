package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.util.HashSet;

public final class Q6Q extends SQLiteOpenHelper {
    public final /* synthetic */ C8491Qvd A00;

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.String, android.database.Cursor] */
    private final boolean A01(SQLiteDatabase sQLiteDatabase, String str) {
        ? r9 = 0;
        try {
            Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, "name=?", new String[]{str}, r9, r9, r9);
            boolean moveToFirst = query.moveToFirst();
            query.close();
            return moveToFirst;
        } catch (SQLiteException e) {
            this.A00.A0D(str, e, "Error querying for table");
            if (r9 != 0) {
                r9.close();
            }
            return false;
        } catch (Throwable th) {
            if (r9 != 0) {
                r9.close();
            }
            throw th;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q6Q(Context context, C8491Qvd qvd) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A00 = qvd;
    }

    public final SQLiteDatabase getWritableDatabase() {
        C8491Qvd qvd = this.A00;
        C11233SGt sGt = qvd.A01;
        if (sGt.A00(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                sGt.A00 = SystemClock.elapsedRealtime();
                ST5.A0B(qvd, "Opening the database failed, dropping the table and recreating it", 6);
                qvd.A00.A00.getDatabasePath("google_analytics_v4.db").delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    sGt.A00 = 0;
                    return writableDatabase;
                } catch (SQLiteException e) {
                    qvd.A0H("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r13) {
        /*
            r12 = this;
            java.lang.String r1 = "hits2"
            boolean r0 = r12.A01(r13, r1)
            r6 = 4
            r5 = 0
            if (r0 != 0) goto L_0x0036
            java.lang.String r1 = X.C8491Qvd.A03
            r0 = 1798324468(0x6b3040f4, float:2.1307768E26)
            X.AnonymousClass0fa.A00(r0)
            r13.execSQL(r1)
            r0 = -1547315388(0xffffffffa3c5d744, float:-2.1449951E-17)
        L_0x0018:
            X.AnonymousClass0fa.A00(r0)
        L_0x001b:
            java.lang.String r1 = "properties"
            boolean r0 = r12.A01(r13, r1)
            if (r0 != 0) goto L_0x007e
            r0 = -704795070(0xffffffffd5fdae42, float:-3.48656092E13)
            X.AnonymousClass0fa.A00(r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;"
            r13.execSQL(r0)
            r0 = -32037223(0xfffffffffe172699, float:-5.022846E37)
            X.AnonymousClass0fa.A00(r0)
            return
        L_0x0036:
            java.util.HashSet r4 = A00(r13, r1)
            java.lang.String r3 = "hit_id"
            java.lang.String r2 = "hit_string"
            java.lang.String r1 = "hit_time"
            java.lang.String r0 = "hit_url"
            java.lang.String[] r3 = new java.lang.String[]{r3, r2, r1, r0}
            r2 = 0
        L_0x0047:
            r1 = r3[r2]
            boolean r0 = r4.remove(r1)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "Database hits2 is missing required column: "
            java.lang.String r1 = X.Pxh.A0l(r0, r1)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x005b:
            int r2 = r2 + 1
            if (r2 < r6) goto L_0x0047
            java.lang.String r0 = "hit_app_id"
            boolean r0 = r4.remove(r0)
            r1 = r0 ^ 1
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00bc
            if (r1 == 0) goto L_0x001b
            r0 = 1723904935(0x66c0b3a7, float:4.550042E23)
            X.AnonymousClass0fa.A00(r0)
            java.lang.String r0 = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER"
            r13.execSQL(r0)
            r0 = -879796319(0xffffffffcb8f5fa1, float:-1.8792258E7)
            goto L_0x0018
        L_0x007e:
            java.util.HashSet r4 = A00(r13, r1)
            r3 = 6
            java.lang.String r6 = "app_uid"
            java.lang.String r7 = "cid"
            java.lang.String r8 = "tid"
            java.lang.String r9 = "params"
            java.lang.String r10 = "adid"
            java.lang.String r11 = "hits_count"
            java.lang.String[] r2 = new java.lang.String[]{r6, r7, r8, r9, r10, r11}
        L_0x0095:
            r1 = r2[r5]
            boolean r0 = r4.remove(r1)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "Database properties is missing required column: "
            java.lang.String r1 = X.Pxh.A0l(r0, r1)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            int r5 = r5 + 1
            if (r5 < r3) goto L_0x0095
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00b4
            return
        L_0x00b4:
            java.lang.String r1 = "Database properties table has extra columns"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            java.lang.String r1 = "Database hits2 has extra columns"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q6Q.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public static HashSet A00(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet A1F = AnonymousClass7TE.A1F();
        StringBuilder A14 = Pxe.A14(Pxf.A09(str) + 22);
        A14.append("SELECT * FROM ");
        A14.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery(AnonymousClass7TF.A0l(" LIMIT 0", A14), (String[]) null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                A1F.add(add);
            }
            return A1F;
        } finally {
            rawQuery.close();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File A0t = AnonymousClass7TE.A0t(path);
                A0t.setReadable(false, false);
                A0t.setWritable(false, false);
                A0t.setReadable(true, true);
                A0t.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            C9712RfV.A00("Invalid version number", Build.VERSION.SDK);
        }
    }
}
