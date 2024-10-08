package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.8w7  reason: invalid class name and case insensitive filesystem */
public final class C370268w7 implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ C311976dc A01;

    public C370268w7(1WY r1, C311976dc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r0 = this.A01.A07;
        1WY r4 = this.A00;
        Cursor A002 = 1wT.A00(r0, r4, false);
        try {
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                arrayList.add(A002.getString(0));
            }
            return arrayList;
        } finally {
            A002.close();
            r4.A00();
        }
    }
}
