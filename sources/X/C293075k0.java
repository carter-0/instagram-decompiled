package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

/* renamed from: X.5k0  reason: invalid class name and case insensitive filesystem */
public abstract class C293075k0 implements Runnable {
    public final C375679Ep A00 = new C375679Ep();

    public void A00() {
        1WY A002;
        Cursor query;
        String str;
        C293065jz r7 = (C293065jz) this;
        AnonymousClass385 r6 = r7.A00;
        WorkDatabase workDatabase = r6.A04;
        workDatabase.beginTransaction();
        try {
            C2377438z A05 = workDatabase.A05();
            String str2 = r7.A01;
            C238313Bj r5 = (C238313Bj) A05;
            TreeMap treeMap = 1WY.A08;
            A002 = 1Wa.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str2 == null) {
                A002.ADb(1);
            } else {
                A002.ADh(1, str2);
            }
            C251983oI r0 = r5.A02;
            r0.assertNotSuspendingTransaction();
            query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    str = null;
                } else {
                    str = query.getString(0);
                }
                arrayList.add(str);
            }
            query.close();
            A002.A00();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r7.A01(r6, (String) it.next());
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (r7.A02) {
                C255313tv.A00(workDatabase, r6.A07);
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    public final void A01(AnonymousClass385 r9, String str) {
        C282905Ff A002;
        WorkDatabase workDatabase = r9.A04;
        C2377438z A05 = workDatabase.A05();
        AnonymousClass390 A003 = workDatabase.A00();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C2379139t Bz2 = A05.Bz2(str2);
            if (!(Bz2 == C2379139t.SUCCEEDED || Bz2 == C2379139t.FAILED)) {
                C238313Bj r0 = (C238313Bj) A05;
                C251983oI r3 = r0.A02;
                r3.assertNotSuspendingTransaction();
                1Vg r2 = r0.A07;
                AnonymousClass1WV acquire = r2.acquire();
                if (str2 == null) {
                    acquire.ADb(1);
                } else {
                    acquire.ADh(1, str2);
                }
                r3.beginTransaction();
                try {
                    acquire.ATQ();
                    r3.setTransactionSuccessful();
                } finally {
                    r3.endTransaction();
                    r2.release(acquire);
                }
            }
            linkedList.addAll(A003.AwN(str2));
        }
        AnonymousClass39K r32 = r9.A03;
        synchronized (r32.A09) {
            AnonymousClass389.A00();
            r32.A07.add(str);
            A002 = AnonymousClass39K.A00(r32, str);
        }
        AnonymousClass39K.A01(A002, 1);
        for (AnonymousClass39P AG6 : r9.A07) {
            AG6.AG6(str);
        }
    }

    public final void run() {
        try {
            A00();
            this.A00.A00(C375689Eq.A01);
        } catch (Throwable th) {
            this.A00.A00(new C375729Eu(th));
        }
    }
}
