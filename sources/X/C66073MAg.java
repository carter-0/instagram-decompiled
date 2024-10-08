package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: X.MAg  reason: case insensitive filesystem */
public final class C66073MAg implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ 2NU A01;

    public C66073MAg(1WY r1, 2NU r2) {
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
            L4C l4c = null;
            query = r6.query((AnonymousClass1WA) r5, (CancellationSignal) null);
            if (query.moveToFirst()) {
                l4c = new L4C(query.getString(0), JUP.A00(query.getString(1)));
            }
            r6.setTransactionSuccessful();
            query.close();
            r5.A00();
            r6.endTransaction();
            return l4c;
        } catch (Throwable th) {
            r6.endTransaction();
            throw th;
        }
    }
}
