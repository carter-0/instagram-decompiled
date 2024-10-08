package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hc9  reason: case insensitive filesystem */
public abstract class C55100Hc9 {
    public static final double A00(UserSession userSession, C309426Yf r8) {
        double d;
        if (182.A06(0Tu.A05, userSession, 36316400918663502L)) {
            d = (double) r8.A0O;
            if (d <= 0.0d) {
                return 0.0d;
            }
        } else {
            d = (double) r8.A0P;
            if (d == 0.0d) {
                return 0.0d;
            }
        }
        return (((double) SystemClock.uptimeMillis()) - d) / 1000.0d;
    }
}
