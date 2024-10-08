package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.80s  reason: invalid class name and case insensitive filesystem */
public abstract class C3495280s {
    public static final boolean A00(Context context) {
        Boolean bool = C340267kz.A00;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass4x4.A00(context, false));
            C340267kz.A00 = bool;
            if (bool == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bool.booleanValue();
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (Build.VERSION.SDK_INT < 34 || !182.A06(0Tu.A05, userSession, 36321670839412349L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        if (Build.VERSION.SDK_INT < 34 || !182.A06(0Tu.A05, userSession, 36321670838953592L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(boolean z) {
        if (Build.VERSION.SDK_INT < 33 || !z) {
            return false;
        }
        return true;
    }
}
