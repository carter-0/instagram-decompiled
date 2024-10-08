package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.4LB  reason: invalid class name */
public final class AnonymousClass4LB implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ 2NU A01;

    public AnonymousClass4LB(1WY r1, 2NU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1WY r5;
        Cursor query;
        C251983oI r6 = this.A01.A02;
        r6.beginTransaction();
        try {
            r5 = this.A00;
            query = r6.query((AnonymousClass1WA) r5, (CancellationSignal) null);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new AnonymousClass5Hr(query.getString(0)));
            }
            r6.setTransactionSuccessful();
            query.close();
            r5.A00();
            r6.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            r6.endTransaction();
            throw th;
        }
    }
}
