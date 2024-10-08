package X;

import android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;

public final class XnD {
    public final String A00;
    public final String A01;
    public final String[] A02;
    public final String[] A03;
    public final WeakHashMap A04 = new WeakHashMap(1);

    public static C21425Xaa A00(SQLiteDatabase sQLiteDatabase, XnD xnD) {
        WeakHashMap weakHashMap = xnD.A04;
        C21425Xaa xaa = (C21425Xaa) weakHashMap.get(sQLiteDatabase);
        if (xaa != null) {
            return xaa;
        }
        C21425Xaa xaa2 = new C21425Xaa();
        weakHashMap.put(sQLiteDatabase, xaa2);
        return xaa2;
    }

    public XnD(String str, String str2, String[] strArr, String[] strArr2) {
        this.A00 = str;
        this.A03 = strArr;
        this.A02 = strArr2;
        this.A01 = str2;
    }
}
