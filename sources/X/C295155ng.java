package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.5ng  reason: invalid class name and case insensitive filesystem */
public final class C295155ng implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ C332407Ux A01;

    public C295155ng(1WY r1, C332407Ux r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1 = this.A01.A00;
        1WY r5 = this.A00;
        Cursor A002 = 1wT.A00(r1, r5, false);
        try {
            int A012 = 1Wd.A01(A002, "intervention_type");
            int A013 = 1Wd.A01(A002, "total_impressions");
            int A014 = 1Wd.A01(A002, "last_impression_timestamp");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                arrayList.add(new C381649c6(A002.getString(A012), A002.getLong(A013), A002.getLong(A014)));
            }
            return arrayList;
        } finally {
            A002.close();
            r5.A00();
        }
    }
}
