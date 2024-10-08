package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3uP  reason: invalid class name and case insensitive filesystem */
public final class C255603uP {
    public final UserSession A00;
    public final boolean A01;

    public C255603uP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 182.A06(0Tu.A05, userSession, 36312260565599251L);
    }

    public final void A01(C256203vO r6) {
        0qQ.A0B(r6, 0);
        boolean z = this.A01;
        UserSession userSession = this.A00;
        if (z) {
            1wY A002 = 1wY.A00(userSession);
            AnonymousClass3WR r3 = r6.A07;
            String str = r6.A08;
            C256223vQ A003 = r6.A00();
            C250593li r1 = A002.A0B;
            r1.A8Z(r3, A003, str);
            r1.ExO(AnonymousClass05K.A0N);
            T7A t7a = A002.A00;
            if (t7a != null) {
                t7a.A00(r3, str, A002.A04.A06);
                return;
            }
            return;
        }
        C256233vR.A00(userSession, r6);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2S1, java.lang.Object] */
    public final void A00(Context context) {
        UserSession userSession = this.A00;
        1w8.A01(context, userSession);
        1wC.A01(userSession);
        synchronized (AnonymousClass2S1.class) {
            if (AnonymousClass2S1.A02 == null) {
                Context applicationContext = context.getApplicationContext();
                ? obj = new Object();
                obj.A00 = applicationContext.getApplicationContext();
                AnonymousClass2S1.A02 = obj;
            }
        }
        14G.A05(new 14G());
    }
}
