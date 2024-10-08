package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public final /* synthetic */ class AL7 implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ AnonymousClass1WA A00;

    public /* synthetic */ AL7(AnonymousClass1WA r1) {
        this.A00 = r1;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AnonymousClass1WA r1 = this.A00;
        0qQ.A0A(sQLiteQuery);
        r1.ADk(new 1WD(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
