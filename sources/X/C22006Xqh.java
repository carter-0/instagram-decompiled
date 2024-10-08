package X;

import android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;

/* renamed from: X.Xqh  reason: case insensitive filesystem */
public final class C22006Xqh {
    public static final ThreadLocal A07 = new Y5N();
    public boolean A00;
    public final SQLiteDatabase A01;
    public final XZ0 A02 = new XZ0(this);
    public final XZ2 A03;
    public final YBX A04;
    public final XTk A05;
    public final XTk A06;

    public static C10948S2g A00(C22006Xqh xqh) {
        SQLiteDatabase sQLiteDatabase = xqh.A01;
        WeakHashMap weakHashMap = ((XZ1) A07.get()).A00;
        C10948S2g s2g = (C10948S2g) weakHashMap.get(sQLiteDatabase);
        if (s2g != null) {
            return s2g;
        }
        C10948S2g s2g2 = new C10948S2g();
        weakHashMap.put(sQLiteDatabase, s2g2);
        return s2g2;
    }

    public final void A01() {
        int i;
        try {
            SQLiteDatabase sQLiteDatabase = this.A01;
            AnonymousClass0fa.A03(sQLiteDatabase, -1768553881);
            try {
                boolean inTransaction = sQLiteDatabase.inTransaction();
                int A002 = A00(this).A00(AnonymousClass7TF.A1P(this.A00 ? 1 : 0));
                if (inTransaction && A002 <= 0) {
                    0KC.A0Q("DirectTransaction", "push/popTransaction state imbalance: newDepth=%d", new Object[]{Integer.valueOf(A002)});
                }
                0ff.A00(925232199);
            } catch (Throwable th) {
                th = th;
                i = -180753045;
                0ff.A00(i);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 1823735658;
        }
    }

    public final void A02() {
        this.A01.setTransactionSuccessful();
        this.A00 = true;
    }

    public final void A03() {
        AnonymousClass0fa.A01(this.A01, -744652577);
        C10948S2g A002 = A00(this);
        A002.A00++;
        if (A002.A01 == null) {
            A002.A01 = this;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XTk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.XTk, java.lang.Object] */
    public C22006Xqh(XZ2 xz2, YBX ybx) {
        ? obj = new Object();
        obj.A00 = 0;
        this.A05 = obj;
        ? obj2 = new Object();
        obj2.A00 = 0;
        this.A06 = obj2;
        this.A04 = ybx;
        this.A03 = xz2;
        this.A01 = ybx.AWy();
    }
}
