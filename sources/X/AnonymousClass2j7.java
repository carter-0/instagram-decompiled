package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2j7  reason: invalid class name */
public abstract class AnonymousClass2j7 {
    public static final void A00(Context context, UserSession userSession) {
        AnonymousClass2j8 r3;
        AnonymousClass2j9 r4 = AnonymousClass2j8.A04;
        synchronized (r4) {
            r4.A00(userSession);
            r3 = new AnonymousClass2j8(context, userSession);
            14i r0 = 14i.A08;
            14i.A03(15Y.A03, r3);
            userSession.A04(AnonymousClass2j8.class, r3);
        }
        if (182.A06(0Tu.A05, userSession, 36319463225695650L)) {
            r3.A03();
            r4.A00(userSession);
        }
    }
}
