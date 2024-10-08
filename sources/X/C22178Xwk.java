package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.Xwk  reason: case insensitive filesystem */
public final class C22178Xwk implements YBX {
    public static C22178Xwk A01;
    public final SQLiteOpenHelper A00;

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.XcE] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.XUo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.XUp, java.lang.Object] */
    public C22178Xwk(Context context) {
        Context context2 = context;
        this.A00 = new C21125XFq(context2, new Object(), new Object(), new C21387XZu("location_sharing.db", "3b5dcd93f5e7177914a5563a91f2383481c797df-53f769b8cd72a898ebbf56276cf53c61b5826d95-"), new Object());
    }

    public static C22178Xwk A00(Context context) {
        C22178Xwk xwk = A01;
        if (xwk != null) {
            return xwk;
        }
        C22178Xwk xwk2 = new C22178Xwk(context);
        A01 = xwk2;
        return xwk2;
    }

    public final SQLiteDatabase AWy() {
        return this.A00.getWritableDatabase();
    }
}
