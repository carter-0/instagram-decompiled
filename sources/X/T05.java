package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class T05 implements C635813i {
    public static T05 A01;
    public final Q6O A00;

    public final /* bridge */ /* synthetic */ Object get() {
        return this.A00.getWritableDatabase();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.database.sqlite.SQLiteOpenHelper, X.Q6O] */
    public T05(Context context) {
        this.A00 = new SQLiteOpenHelper(context, "OnDemandResources.db", (SQLiteDatabase.CursorFactory) null, 12);
    }
}
