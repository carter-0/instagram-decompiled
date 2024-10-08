package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public final class QG7 extends C293075k0 {
    public final /* synthetic */ AnonymousClass385 A00;
    public final /* synthetic */ String A01;

    public QG7(AnonymousClass385 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void A00() {
        1WY A002;
        Cursor query;
        String str;
        AnonymousClass385 r7 = this.A00;
        WorkDatabase workDatabase = r7.A04;
        workDatabase.beginTransaction();
        try {
            C2377438z A05 = workDatabase.A05();
            String str2 = this.A01;
            C238313Bj r4 = (C238313Bj) A05;
            TreeMap treeMap = 1WY.A08;
            A002 = 1Wa.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
            if (str2 == null) {
                A002.ADb(1);
            } else {
                A002.ADh(1, str2);
            }
            C251983oI r0 = r4.A02;
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
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            C255313tv.A00(workDatabase, r7.A07);
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
