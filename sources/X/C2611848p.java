package X;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.48p  reason: invalid class name and case insensitive filesystem */
public final class C2611848p extends 0ng {
    public final /* synthetic */ 1bC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2611848p(1bC r4) {
        super(518, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        SQLiteDatabase A002;
        0fh.A01("DirectSQLiteDiskIO.retrieveRemainingInboxFromDiskAsync", 1255032256);
        1bC r2 = this.A00;
        if (r2.A0G && !r2.A0F && (A002 = 1bC.A00(r2)) != null) {
            0eP A07 = 1bC.A07(A002, r2, false, false);
            1bC.A0E(r2, (HashMap) A07.A00, (List) A07.A01);
            1bC.A0D(r2);
            1bC.A0C(r2);
        }
        0fh.A00(-928153771);
    }
}
