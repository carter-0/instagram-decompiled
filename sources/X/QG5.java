package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public final class QG5 extends C293075k0 {
    public final /* synthetic */ AnonymousClass385 A00;

    public QG5(AnonymousClass385 r1) {
        this.A00 = r1;
    }

    public final void A00() {
        1WY A002;
        Cursor query;
        String str;
        AnonymousClass385 r7 = this.A00;
        WorkDatabase workDatabase = r7.A04;
        workDatabase.beginTransaction();
        try {
            TreeMap treeMap = 1WY.A08;
            A002 = 1Wa.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
            C251983oI r0 = ((C238313Bj) workDatabase.A05()).A02;
            r0.assertNotSuspendingTransaction();
            query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
            ArrayList A0o = AnonymousClass7TF.A0o(query);
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    str = null;
                } else {
                    str = query.getString(0);
                }
                A0o.add(str);
            }
            query.close();
            A002.A00();
            Iterator it = A0o.iterator();
            while (it.hasNext()) {
                A01(r7, AnonymousClass7TE.A18(it));
            }
            workDatabase.A01().CNV(new C255423u6("last_cancel_all_time_ms", C51968G9o.A0u()));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
