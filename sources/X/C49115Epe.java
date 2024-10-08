package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Epe  reason: case insensitive filesystem */
public abstract class C49115Epe {
    public static void A00(Activity activity, UserSession userSession, 1Xj r8, String str, String str2) {
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0a = AnonymousClass7TE.A0u();
        A0W.A1R = true;
        C331157Pu A00 = A0W.A00();
        E5q e5q = new E5q();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, userSession);
        A0a.putString("media_id", r8.getId());
        A0a.putString("prior_module", str2);
        A0a.putString("module", str);
        e5q.setArguments(A0a);
        A00.A02(activity, e5q);
    }
}
