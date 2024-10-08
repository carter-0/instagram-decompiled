package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.SwA  reason: case insensitive filesystem */
public final class C12524SwA implements C13969TmX, C13631Tdx, C13459Tam {
    public static final S5K A05 = new S5K("proto");
    public final C13629Tdv A00;
    public final C9980RkZ A01;
    public final C13632Tdy A02;
    public final C13632Tdy A03;
    public final Q6R A04;

    public static Long A00(SQLiteDatabase sQLiteDatabase, C9144RQv rQv) {
        Long l;
        StringBuilder A16 = Pxe.A16("backend_name = ? and priority = ?");
        C8311Qnr qnr = (C8311Qnr) rQv;
        ArrayList A0q = Pxf.A0q(new String[]{qnr.A01, String.valueOf(C11149SCe.A00(qnr.A00))});
        byte[] bArr = qnr.A02;
        if (bArr != null) {
            A16.append(" and extras = ?");
            A0q.add(Base64.encodeToString(bArr, 0));
        } else {
            A16.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, A16.toString(), (String[]) A0q.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            if (!query.moveToNext()) {
                l = null;
            } else {
                l = Long.valueOf(query.getLong(0));
            }
            return l;
        } finally {
            query.close();
        }
    }

    public static String A01(Iterable iterable) {
        StringBuilder A16 = Pxe.A16("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A16.append(((C8316Qnw) ((C9018RLt) it.next())).A00);
            if (it.hasNext()) {
                A16.append(',');
            }
        }
        return AnonymousClass7TG.A0p(A16);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, C12524SwA swA) {
        C13632Tdy tdy = swA.A02;
        long C7E = tdy.C7E();
        while (true) {
            try {
                AnonymousClass0fa.A01(sQLiteDatabase, -1888240604);
                return;
            } catch (SQLiteDatabaseLockedException e) {
                if (tdy.C7E() >= ((long) ((C8315Qnv) swA.A01).A00) + C7E) {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public final SQLiteDatabase A03() {
        Q6R q6r = this.A04;
        q6r.getClass();
        C13632Tdy tdy = this.A02;
        long C7E = tdy.C7E();
        while (true) {
            try {
                return q6r.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (tdy.C7E() >= ((long) ((C8315Qnv) this.A01).A00) + C7E) {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public final void close() {
        this.A04.close();
    }

    public C12524SwA(C13629Tdv tdv, C9980RkZ rkZ, Q6R q6r, C13632Tdy tdy, C13632Tdy tdy2) {
        this.A04 = q6r;
        this.A03 = tdy;
        this.A02 = tdy2;
        this.A01 = rkZ;
        this.A00 = tdv;
    }

    public final void EAr(RJF rjf, String str, long j) {
        Cursor rawQuery;
        int i;
        SQLiteDatabase A032 = A03();
        AnonymousClass0fa.A01(A032, -1684447961);
        try {
            int i2 = rjf.A00;
            String num = Integer.toString(i2);
            rawQuery = A032.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
            boolean A1R = AnonymousClass7TF.A1R(rawQuery.getCount());
            rawQuery.close();
            if (!A1R) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i2));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                AnonymousClass0fa.A00(-1871575072);
                A032.insert("log_event_dropped", (String) null, contentValues);
                i = 1157403685;
            } else {
                AnonymousClass0fa.A00(-776868755);
                A032.execSQL(002.A0e("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?", j), new String[]{str, num});
                i = -195764110;
            }
            AnonymousClass0fa.A00(i);
            A032.setTransactionSuccessful();
            AnonymousClass0fa.A03(A032, 1571926387);
        } catch (Throwable th) {
            AnonymousClass0fa.A03(A032, -1029534431);
            throw th;
        }
    }

    public final void EAu(C9144RQv rQv, long j) {
        SQLiteDatabase A032 = A03();
        AnonymousClass0fa.A01(A032, -1684447961);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("next_request_ms", Long.valueOf(j));
            C8311Qnr qnr = (C8311Qnr) rQv;
            String str = qnr.A01;
            RE0 re0 = qnr.A00;
            if (A032.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(C11149SCe.A00(re0))}) < 1) {
                contentValues.put("backend_name", str);
                contentValues.put("priority", Integer.valueOf(C11149SCe.A00(re0)));
                AnonymousClass0fa.A00(498492685);
                A032.insert("transport_contexts", (String) null, contentValues);
                AnonymousClass0fa.A00(1077678408);
            }
            A032.setTransactionSuccessful();
        } finally {
            AnonymousClass0fa.A03(A032, -1029534431);
        }
    }
}
