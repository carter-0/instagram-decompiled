package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.5Fc  reason: invalid class name and case insensitive filesystem */
public final class C282875Fc implements AnonymousClass391 {
    public final 1Vf A00;
    public final C251983oI A01;
    public final 1Vg A02;

    public final ArrayList C40(String str) {
        String str2;
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        A002.ADh(1, str);
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

    public C282875Fc(C251983oI r2) {
        this.A01 = r2;
        this.A00 = new C282885Fd(r2, this);
        this.A02 = new C282895Fe(r2, this);
    }

    public final void CNY(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass9Fh r2 = new AnonymousClass9Fh((String) it.next(), str);
            C251983oI r1 = this.A01;
            r1.assertNotSuspendingTransaction();
            r1.beginTransaction();
            try {
                this.A00.insert(r2);
                r1.setTransactionSuccessful();
            } finally {
                r1.endTransaction();
            }
        }
    }
}
