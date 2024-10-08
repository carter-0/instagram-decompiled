package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.5tJ  reason: invalid class name and case insensitive filesystem */
public final class C298365tJ implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ AnonymousClass92T A01;

    public C298365tJ(1WY r1, AnonymousClass92T r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r0 = this.A01.A00;
        1WY r7 = this.A00;
        Cursor A002 = 1wT.A00(r0, r7, false);
        try {
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                arrayList.add(new C376599Ip(A002.getLong(0), A002.getString(1)));
            }
            return arrayList;
        } finally {
            A002.close();
            r7.A00();
        }
    }
}
