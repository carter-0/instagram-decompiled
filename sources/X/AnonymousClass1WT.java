package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.1WT  reason: invalid class name */
public final class AnonymousClass1WT extends 1WD implements AnonymousClass1WV {
    public final SQLiteStatement A00;

    public final long ATO() {
        SQLiteStatement sQLiteStatement = this.A00;
        AnonymousClass0fa.A00(745323083);
        long executeInsert = sQLiteStatement.executeInsert();
        AnonymousClass0fa.A00(-776476116);
        return executeInsert;
    }

    public final int ATQ() {
        SQLiteStatement sQLiteStatement = this.A00;
        AnonymousClass0fa.A00(-959512267);
        int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
        AnonymousClass0fa.A00(1643129917);
        return executeUpdateDelete;
    }

    public AnonymousClass1WT(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.A00 = sQLiteStatement;
    }
}
