package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.XpF  reason: case insensitive filesystem */
public abstract class C21992XpF {
    public static void A00(SQLiteDatabase sQLiteDatabase, String str) {
        String A0R = 002.A0R("SAVEPOINT ", str);
        AnonymousClass0fa.A00(2024048005);
        sQLiteDatabase.execSQL(A0R);
        AnonymousClass0fa.A00(-409600105);
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str) {
        String A0R = 002.A0R("RELEASE SAVEPOINT ", str);
        AnonymousClass0fa.A00(-340401824);
        sQLiteDatabase.execSQL(A0R);
        AnonymousClass0fa.A00(-641267135);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str) {
        String A0R = 002.A0R(";ROLLBACK TRANSACTION TO SAVEPOINT ", str);
        AnonymousClass0fa.A00(884432524);
        sQLiteDatabase.execSQL(A0R);
        AnonymousClass0fa.A00(-1777013282);
    }
}
