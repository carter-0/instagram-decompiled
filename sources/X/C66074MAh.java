package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: X.MAh  reason: case insensitive filesystem */
public final class C66074MAh implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ 2NU A01;

    public C66074MAh(1WY r1, 2NU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1WY r3;
        Cursor query;
        boolean z;
        C251983oI r4 = this.A01.A02;
        r4.beginTransaction();
        try {
            r3 = this.A00;
            boolean z2 = false;
            query = r4.query((AnonymousClass1WA) r3, (CancellationSignal) null);
            if (query.moveToFirst()) {
                if (query.getInt(0) != 0) {
                    z2 = true;
                }
                z = Boolean.valueOf(z2);
            } else {
                z = false;
            }
            r4.setTransactionSuccessful();
            query.close();
            r3.A00();
            r4.endTransaction();
            return z;
        } catch (Throwable th) {
            r4.endTransaction();
            throw th;
        }
    }
}
