package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public abstract class ORV {
    public static final C49530ExC A00(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        return (C49530ExC) userSession.A01(C49530ExC.class, new GA1(44, userSession, z));
    }

    public static final C71093OcF A01(Activity activity, AnonymousClass0iw r9, UserSession userSession, C14068TpH tpH, C16677UzD uzD, String str) {
        0qQ.A0B(userSession, 0);
        Activity activity2 = activity;
        AnonymousClass0iw r2 = r9;
        C51974G9v.A1P(activity, r9, str, tpH);
        C16677UzD uzD2 = uzD;
        0qQ.A0B(uzD, 5);
        return new C71093OcF(activity2, r2, userSession, tpH, uzD2, str, false);
    }
}
