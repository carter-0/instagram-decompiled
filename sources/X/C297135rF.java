package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.5rF  reason: invalid class name and case insensitive filesystem */
public final class C297135rF implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ AnonymousClass92T A01;

    public C297135rF(1WY r1, AnonymousClass92T r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1 = this.A01.A00;
        1WY r8 = this.A00;
        Cursor A002 = 1wT.A00(r1, r8, false);
        try {
            int A012 = 1Wd.A01(A002, "dictionary_id");
            int A013 = 1Wd.A01(A002, "client_id");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                arrayList.add(new C295555oT(A002.getLong(A012), A002.getInt(A013)));
            }
            return arrayList;
        } finally {
            A002.close();
            r8.A00();
        }
    }
}
