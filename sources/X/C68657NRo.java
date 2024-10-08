package X;

import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import java.util.List;

/* renamed from: X.NRo  reason: case insensitive filesystem */
public final class C68657NRo extends 0ng {
    public final /* synthetic */ C67502Mow A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68657NRo(C67502Mow mow, List list) {
        super(457641138, 3, false, false);
        this.A00 = mow;
        this.A01 = list;
    }

    public final void run() {
        try {
            C67511Mp6 A012 = this.A00.A05.A01();
            List list = this.A01;
            C251983oI r3 = A012.A01;
            r3.beginTransaction();
            try {
                0qQ.A0B(list, 0);
                r3.assertNotSuspendingTransaction();
                1Vg r2 = A012.A02;
                AnonymousClass1WV acquire = r2.acquire();
                try {
                    r3.beginTransaction();
                    acquire.ATQ();
                    r3.setTransactionSuccessful();
                    r3.endTransaction();
                    r2.release(acquire);
                    r3.assertNotSuspendingTransaction();
                    r3.beginTransaction();
                    A012.A00.insert(list);
                    r3.setTransactionSuccessful();
                    r3.endTransaction();
                    r3.setTransactionSuccessful();
                    r3.endTransaction();
                } catch (Throwable th) {
                    th = th;
                    r2.release(acquire);
                    throw th;
                }
            } catch (Throwable th2) {
                r3.endTransaction();
                throw th2;
            }
        } catch (Exception e) {
            if ((e instanceof SQLiteDiskIOException) || (e instanceof SQLiteReadOnlyDatabaseException)) {
                0wb.A07("Error clearing Ranking Models", e);
                return;
            }
            throw e;
        }
    }
}
