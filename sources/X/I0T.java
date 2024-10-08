package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class I0T {
    public static final I0T A00 = new Object();

    public final void A00(Activity activity, UserSession userSession, 1Xj r12, AnonymousClass3W1 r13, C273384mU r14, String str) {
        C54128Gzx gzx = new C54128Gzx();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("user_name", str);
        C331127Pr A0V = DbV.A0V(A0a, gzx, userSession);
        A0V.A0g = activity.getString(2131976856);
        A0V.A1J = true;
        AnonymousClass3W1 r5 = r13;
        A0V.A0K = new ICB(9, r5, gzx, r12, userSession);
        A0V.A0v = true;
        A0V.A0h = activity.getString(2131954722);
        A0V.A1N = true;
        A0V.A0w = true;
        if (r14 != null) {
            r14.EHY("bottom_sheet");
            C57385IZq.A00(A0V, r14, 5);
        }
        DbU.A0y(activity, gzx, A0V);
    }
}
