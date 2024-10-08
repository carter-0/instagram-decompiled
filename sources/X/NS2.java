package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class NS2 extends 0ng {
    public final /* synthetic */ 1bC A00;
    public final /* synthetic */ DirectThreadKey A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NS2(1bC r4, DirectThreadKey directThreadKey) {
        super(1817872983, 4, false, false);
        this.A00 = r4;
        this.A01 = directThreadKey;
    }

    public final void run() {
        1bC r1 = this.A00;
        DirectThreadKey directThreadKey = this.A01;
        2Ot r3 = AnonymousClass2Oq.A06;
        if (!r3.A03()) {
            SystemClock.uptimeMillis();
            SQLiteDatabase A002 = 1bC.A00(r1);
            if (A002 != null) {
                AnonymousClass0fa.A01(A002, 78406013);
                try {
                    UserSession userSession = r1.A01;
                    2PX.A00(userSession).A0L(directThreadKey);
                    2Q7.A00(userSession).A0L(directThreadKey);
                    A002.setTransactionSuccessful();
                } catch (SQLiteException | IllegalStateException e) {
                    r3.A02(e);
                } catch (Throwable th) {
                    AnonymousClass48L.A00(A002);
                    throw th;
                }
                AnonymousClass48L.A00(A002);
                SystemClock.uptimeMillis();
            }
        }
    }
}
