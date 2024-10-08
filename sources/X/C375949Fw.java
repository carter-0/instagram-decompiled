package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Fw  reason: invalid class name and case insensitive filesystem */
public abstract class C375949Fw {
    public static final void A02(UserSession userSession, Context context, boolean z) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        C359638dF.A01(context, new C359618dD(userSession), "com.bloks.www.ig.pro_dash.entry_point.hypercard", (String) null, A01(z));
    }

    public static final HashMap A01(boolean z) {
        return 0Yt.A02(new 0eP[]{new 0eP("params", 002.A0S("{\"server_params\":", 002.A0L("{\"is_badged\":", '}', z), '}'))});
    }

    public static final long A00() {
        Calendar instance = Calendar.getInstance();
        long timeInMillis = instance.getTimeInMillis();
        instance.add(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return TimeUnit.MILLISECONDS.toSeconds(instance.getTimeInMillis() - timeInMillis);
    }
}
