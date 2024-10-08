package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

public final class NRW extends 0ng {
    public final /* synthetic */ 1bC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRW(1bC r4) {
        super(356635853, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        0fh.A01("DirectSQLiteDiskIO.savePendingInboxToDiskAsync", 609459013);
        1bC r9 = this.A00;
        SystemClock.uptimeMillis();
        SQLiteDatabase A002 = 1bC.A00(r9);
        if (A002 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AnonymousClass0fa.A01(A002, 1269875669);
            try {
                UserSession userSession = r9.A01;
                2PY A003 = 2PX.A00(userSession);
                List A07 = A003.A07(2Pb.A00(new String[]{A003.A04(), 002.A0R("is_permitted==", "0")}));
                2PY A004 = 2PX.A00(userSession);
                A004.A03(2Pb.A00(new String[]{A004.A04(), 002.A0R("is_permitted==", "0")}));
                2Q7.A00(userSession).A0N(A07);
                List A1I = AnonymousClass7TE.A1I(2EN.A06);
                2Dr r6 = r9.A04;
                Iterator it = r6.A0R(C51966G9m.A1J(A1I)).iterator();
                int i = 0;
                while (it.hasNext()) {
                    AnonymousClass3U9 r3 = (AnonymousClass3U9) it.next();
                    if (i >= DbS.A04(0Tu.A05, userSession, 36598636100979953L)) {
                        break;
                    }
                    AnonymousClass48S A0P = r6.A0P(r3.BJz());
                    if (A0P != null) {
                        1bC.A03(A0P, r9, byteArrayOutputStream, 20);
                        i++;
                    }
                }
                A002.setTransactionSuccessful();
                1Av A005 = 1Au.A00(userSession);
                long currentTimeMillis = System.currentTimeMillis();
                0xY A0p = AnonymousClass7TE.A0p(A005);
                A0p.E5c("last_pending_inbox_cache_update_timestamp", currentTimeMillis);
                A0p.apply();
            } catch (SQLiteException e) {
                AnonymousClass2Oq.A06.A02(e);
            } catch (IllegalStateException e2) {
                AnonymousClass2Oq.A06.A02(e2);
            } catch (Throwable th) {
                AnonymousClass48L.A00(A002);
                throw th;
            }
            AnonymousClass48L.A00(A002);
            SystemClock.uptimeMillis();
        }
        0fh.A00(2126831576);
    }
}
