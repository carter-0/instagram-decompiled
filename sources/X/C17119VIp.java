package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VIp  reason: case insensitive filesystem */
public abstract class C17119VIp {
    public static final void A00(Activity activity, 0xI r3, UserSession userSession) {
        int i;
        if (activity != null) {
            AnonymousClass3LV r0 = (AnonymousClass3LV) C71342cb.A00(userSession).A0M.get(activity.toString());
            if (r0 != null) {
                i = r0.A00;
            } else {
                i = -1;
            }
            r3.A08(Integer.valueOf(i), AnonymousClass000.A00(709));
            r3.A06(2cc.A00(C71342cb.A00(userSession), activity.toString()), "nav_stack");
        }
    }
}
