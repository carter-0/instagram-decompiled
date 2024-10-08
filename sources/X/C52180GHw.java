package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GHw  reason: case insensitive filesystem */
public abstract class C52180GHw {
    public static final boolean A01(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        if (C66901Mej.A00(context) <= 1.0f || !182.A06(0Tu.A05, userSession, 36324827639853450L)) {
            return false;
        }
        return true;
    }

    public static final long A00(Context context) {
        int floatToRawIntBits;
        if (0nA.A03(context, 12.0f) >= 56.0f) {
            floatToRawIntBits = Float.floatToRawIntBits(0nA.A02(context, 56.0f));
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(12.0f);
        }
        return ((long) floatToRawIntBits) | 9221683186994511872L;
    }
}
