package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: X.48L  reason: invalid class name */
public abstract class AnonymousClass48L {
    public static final void A00(SQLiteDatabase sQLiteDatabase) {
        2Ot r1;
        try {
            AnonymousClass0fa.A03(sQLiteDatabase, 1442574722);
            r1 = AnonymousClass2Oq.A06;
        } catch (SQLiteException e) {
            r1 = AnonymousClass2Oq.A06;
            r1.A02(e);
        } catch (IllegalStateException e2) {
            r1 = AnonymousClass2Oq.A06;
            r1.A02(e2);
        } catch (Throwable th) {
            2Ot r12 = AnonymousClass2Oq.A06;
            if (r12.A03()) {
                r12.A01();
            }
            throw th;
        }
        if (r1.A03()) {
            r1.A01();
        }
    }
}
