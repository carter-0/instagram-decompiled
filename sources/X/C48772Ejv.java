package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Ejv  reason: case insensitive filesystem */
public abstract class C48772Ejv {
    public static final void A00(UserSession userSession, Activity activity, String str) {
        AnonymousClass7TG.A1N(activity, userSession);
        if (1Wj.A00 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            if (str.length() != 0) {
                A1E.put("delete_reason", str);
            }
            DcL.A00().A00(activity, userSession, "732098461071346", A1E);
        }
    }
}
