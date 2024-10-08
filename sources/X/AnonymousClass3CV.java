package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.TreeMap;

/* renamed from: X.3CV  reason: invalid class name */
public final class AnonymousClass3CV implements AnonymousClass395 {
    public final 1Vf A00;
    public final C251983oI A01;

    public final Long BOY(String str) {
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT long_value FROM Preference where `key`=?", 1);
        A002.ADh(1, str);
        C251983oI r0 = this.A01;
        r0.assertNotSuspendingTransaction();
        Long l = null;
        Cursor query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                l = Long.valueOf(query.getLong(0));
            }
            return l;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final void CNV(C255423u6 r3) {
        C251983oI r1 = this.A01;
        r1.assertNotSuspendingTransaction();
        r1.beginTransaction();
        try {
            this.A00.insert(r3);
            r1.setTransactionSuccessful();
        } finally {
            r1.endTransaction();
        }
    }

    public AnonymousClass3CV(C251983oI r2) {
        this.A01 = r2;
        this.A00 = new C238503Cc(r2, this);
    }
}
