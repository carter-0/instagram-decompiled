package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.8g8  reason: invalid class name and case insensitive filesystem */
public abstract class C361378g8 {
    public static final boolean A01(UserSession userSession) {
        if (Build.VERSION.SDK_INT < 34 || !182.A06(0Tu.A05, userSession, 2342162987835465569L)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(Context context, UserSession userSession) {
        if (!C2604245p.A04(context) || !182.A06(0Tu.A05, userSession, 2342162987835465569L)) {
            return false;
        }
        return true;
    }
}
