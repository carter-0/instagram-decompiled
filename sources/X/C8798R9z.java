package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.R9z  reason: case insensitive filesystem */
public final class C8798R9z extends 0ng {
    public final /* synthetic */ C327527Bd A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8798R9z(C327527Bd r2) {
        super(676);
        this.A00 = r2;
    }

    public final void run() {
        AnonymousClass7OV A002 = AnonymousClass7OV.A00(this.A00.A01);
        SQLiteDatabase A01 = AnonymousClass7OZ.A00().A01();
        if (A01 != null) {
            AnonymousClass0fa.A01(A01, 1008738445);
            try {
                A01.delete("recent_searches", 002.A0g("user_id=='", A002.A00.A06, "'"), (String[]) null);
                A01.setTransactionSuccessful();
            } finally {
                AnonymousClass0fa.A03(A01, -462770975);
            }
        }
    }
}
