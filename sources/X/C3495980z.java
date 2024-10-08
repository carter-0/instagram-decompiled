package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.80z  reason: invalid class name and case insensitive filesystem */
public abstract class C3495980z {
    public static final C3495880y A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320880564970408L)) {
            return C3495880y.DURATION_600_SEC_IN_MS;
        }
        if (182.A06(r2, userSession, 36320880564904871L)) {
            return C3495880y.DURATION_180_SEC_IN_MS;
        }
        return C3495880y.DURATION_90_SEC_IN_MS;
    }

    public static final ArrayList A01(UserSession userSession) {
        ArrayList A1M = 0sr.A1M(new C3495880y[]{C3495880y.DURATION_15_SEC_IN_MS, C3495880y.DURATION_30_SEC_IN_MS, C3495880y.DURATION_60_SEC_IN_MS, C3495880y.DURATION_90_SEC_IN_MS});
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320880564904871L)) {
            A1M.add(C3495880y.DURATION_180_SEC_IN_MS);
        }
        if (182.A06(r2, userSession, 36320880564970408L)) {
            A1M.add(C3495880y.DURATION_600_SEC_IN_MS);
        }
        return A1M;
    }
}
