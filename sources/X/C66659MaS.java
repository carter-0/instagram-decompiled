package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* renamed from: X.MaS  reason: case insensitive filesystem */
public final class C66659MaS extends 0ng {
    public final /* synthetic */ 1bC A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66659MaS(1bC r4, List list) {
        super(522, 4, false, false);
        this.A00 = r4;
        this.A01 = list;
    }

    public final void run() {
        1bC r1 = this.A00;
        List<1OS> list = this.A01;
        SystemClock.uptimeMillis();
        SQLiteDatabase A002 = 1bC.A00(r1);
        if (A002 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AnonymousClass0fa.A01(A002, -1761473994);
            try {
                UserSession userSession = r1.A01;
                AnonymousClass494 r2 = (AnonymousClass494) userSession.A01(AnonymousClass494.class, new C73907Pli(userSession, 3));
                r2.A03(r2.A04());
                for (1OS A09 : list) {
                    r2.A09(byteArrayOutputStream, A09);
                }
                A002.setTransactionSuccessful();
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
    }
}
