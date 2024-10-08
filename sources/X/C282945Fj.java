package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: X.5Fj  reason: invalid class name and case insensitive filesystem */
public final class C282945Fj implements AnonymousClass390 {
    public final 1Vf A00;
    public final C251983oI A01;

    public final ArrayList AwN(String str) {
        String str2;
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            A002.ADb(1);
        } else {
            A002.ADh(1, str);
        }
        C251983oI r0 = this.A01;
        r0.assertNotSuspendingTransaction();
        Cursor query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = query.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public C282945Fj(C251983oI r2) {
        this.A01 = r2;
        this.A00 = new C282955Fk(r2, this);
    }
}
