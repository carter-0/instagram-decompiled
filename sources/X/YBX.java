package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public interface YBX {
    static Cursor A00(YBX ybx, Object[] objArr) {
        return ybx.AWy().rawQuery(objArr[5], objArr[6]);
    }

    SQLiteDatabase AWy();
}
