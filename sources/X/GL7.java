package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public abstract class GL7 {
    public static final boolean A00(View view, UserSession userSession, float f, float f2, boolean z) {
        0qQ.A0B(userSession, 1);
        if (!z && 182.A06(0Tu.A05, userSession, 36329126903365445L)) {
            double width = ((double) view.getWidth()) * 0.1d;
            double height = ((double) view.getHeight()) * 0.1d;
            double d = (double) f;
            if (d > width && d < ((double) view.getWidth()) - width) {
                double d2 = (double) f2;
                if (d2 <= height || d2 >= ((double) view.getHeight()) - height) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36329126902841152L) || 182.A06(r2, userSession, 36329126902710078L)) {
            return true;
        }
        return false;
    }
}
