package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EpI  reason: case insensitive filesystem */
public abstract class C49093EpI {
    public static final void A00(Activity activity, UserSession userSession) {
        Activity activity2 = activity;
        0qQ.A0B(activity, 0);
        UserSession userSession2 = userSession;
        AnonymousClass3BK A00 = AnonymousClass3BJ.A00(userSession);
        if (!A00.A04.getBoolean("has_seen_roll_call_nux", false)) {
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A0T = null;
            C331157Pu A002 = A0W.A00();
            E16 e16 = new E16();
            E0X e0x = new E0X();
            e16.mLifecycleRegistry.A09(new C64307LZh(A00));
            e16.A00 = new FP2((Object) A002, 21);
            e16.A01 = new FO6(13, activity2, e16, userSession2, e0x);
            A002.A02(activity2, e16);
        }
    }
}
