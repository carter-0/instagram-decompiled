package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nu4  reason: case insensitive filesystem */
public abstract class C69902Nu4 {
    public static final void A00(UserSession userSession, Context context, String str) {
        DbY.A1S(userSession, str);
        C67458MoD moD = new C67458MoD(userSession);
        if (C67458MoD.A04(moD) && moD.A00.getBoolean("EB_SHOW_DEBUG_TOASTS", false) && context != null) {
            11Z.A02(new C73188PYS(context, str));
        }
    }
}
