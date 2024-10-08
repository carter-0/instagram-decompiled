package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

public final class JZD implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ 2NU A01;

    public JZD(1WY r1, 2NU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1WY r4;
        Cursor query;
        C251983oI r5 = this.A01.A02;
        r5.beginTransaction();
        try {
            r4 = this.A00;
            C2801950r r3 = null;
            query = r5.query((AnonymousClass1WA) r4, (CancellationSignal) null);
            if (query.moveToFirst()) {
                r3 = JUQ.A00(query.getString(0));
            }
            r5.setTransactionSuccessful();
            query.close();
            r4.A00();
            r5.endTransaction();
            return r3;
        } catch (Throwable th) {
            r5.endTransaction();
            throw th;
        }
    }
}
