package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Yd  reason: invalid class name and case insensitive filesystem */
public final class C357498Yd {
    public final C357488Yc A00(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        C357518Yf r1 = (C357518Yf) userSession.A01(C357518Yf.class, C357508Ye.A00);
        C357488Yc r0 = r1.A00;
        if (r0 != null) {
            return r0;
        }
        C357488Yc r02 = new C357488Yc(context, userSession);
        r1.A00 = r02;
        return r02;
    }

    public final C357488Yc A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return ((C357518Yf) userSession.A01(C357518Yf.class, C357508Ye.A00)).A00;
    }

    public final void A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 2342165826809113038L)) {
            ((C357518Yf) userSession.A01(C357518Yf.class, C357508Ye.A00)).A00 = null;
        }
    }
}
