package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kxb  reason: case insensitive filesystem */
public abstract class C63472Kxb {
    public static final int A00(Context context, UserSession userSession, int i, boolean z, boolean z2) {
        int i2;
        if (LQN.A01()) {
            return 640;
        }
        if (z) {
            i2 = 1080;
        } else {
            i2 = 640;
            if (AnonymousClass0Ke.A00(context) >= 2009) {
                i2 = 720;
            }
        }
        if (!z2) {
            return 1WJ.A00(i, 480, i2);
        }
        int i3 = 1;
        if (182.A06(0Tu.A05, userSession, 36320171895300172L)) {
            i3 = 2;
        }
        int i4 = i * i3;
        int i5 = 480;
        if (i4 >= 480) {
            i5 = 720;
            if (i4 >= 720) {
                i5 = 1080;
            }
        }
        return Math.min(i5, i2);
    }
}
