package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class NS3 extends 0ng {
    public final /* synthetic */ 1bC A00;
    public final /* synthetic */ DirectThreadKey A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NS3(1bC r4, DirectThreadKey directThreadKey) {
        super(520, 4, false, false);
        this.A00 = r4;
        this.A01 = directThreadKey;
    }

    public final void run() {
        SQLiteDatabase A002;
        1bC r3 = this.A00;
        DirectThreadKey directThreadKey = this.A01;
        2Ot r9 = AnonymousClass2Oq.A06;
        if (!r9.A03()) {
            SystemClock.uptimeMillis();
            AnonymousClass48S A0P = r3.A04.A0P(directThreadKey);
            if (A0P != null && (A002 = 1bC.A00(r3)) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                List list = null;
                AnonymousClass0fa.A01(A002, 950116071);
                try {
                    UserSession userSession = r3.A01;
                    2PX.A00(userSession).A0L(directThreadKey);
                    2Q7.A00(userSession).A0L(directThreadKey);
                    list = 1bC.A03(A0P, r3, byteArrayOutputStream, DbS.A04(0Tu.A05, userSession, 36610090777778147L));
                    A002.setTransactionSuccessful();
                } catch (SQLiteException | IllegalStateException e) {
                    r9.A02(e);
                } catch (Throwable th) {
                    AnonymousClass48L.A00(A002);
                    throw th;
                }
                AnonymousClass48L.A00(A002);
                if (!r9.A03() && list != null) {
                    HashSet hashSet = new HashSet(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0f = C66580MXl.A0a(it).A0f();
                        if (A0f != null) {
                            hashSet.add(A0f);
                        }
                    }
                    OO2 A003 = O0F.A00(r3.A01);
                    Iterator it2 = 00k.A0l(hashSet, A003.A04).iterator();
                    while (it2.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it2);
                        C71033OZu oZu = A003.A01;
                        oZu.A02(A18, "persist_end");
                        oZu.A04(A18, 2);
                    }
                }
                SystemClock.uptimeMillis();
            }
        }
    }
}
