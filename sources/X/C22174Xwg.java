package X;

import android.database.Cursor;
import android.util.Log;

/* renamed from: X.Xwg  reason: case insensitive filesystem */
public abstract class C22174Xwg implements XCJ {
    public Exception A00;
    public final Cursor A01;

    public final void close() {
        this.A01.close();
        this.A00 = new Exception();
    }

    public final boolean moveToNext() {
        Cursor cursor = this.A01;
        if (!cursor.isClosed()) {
            return cursor.moveToNext();
        }
        String stackTraceString = Log.getStackTraceString(this.A00);
        0KC.A0C("AbstractDAOItem", stackTraceString);
        throw DbW.A0c(C273654mx.A00(54), stackTraceString);
    }

    public C22174Xwg(Cursor cursor) {
        if (cursor != null) {
            this.A01 = cursor;
            return;
        }
        throw AnonymousClass7TE.A0w("cursor is null");
    }
}
