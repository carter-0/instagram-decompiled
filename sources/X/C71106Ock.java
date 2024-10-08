package X;

import android.app.Activity;
import android.os.Build;
import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ock  reason: case insensitive filesystem */
public final class C71106Ock {
    public static final C71106Ock A00 = new Object();

    public static final boolean A02(Activity activity) {
        if (!AnonymousClass3HA.A00(activity) && 2db.A00(activity) == -1) {
            return true;
        }
        return false;
    }

    public final void A03(ComponentActivity componentActivity, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        if (componentActivity != null) {
            int i = OSU.A00;
            C73988PnF pnF = C73988PnF.A00;
            boolean A1Y = C51970G9q.A1Y(pnF);
            OSU.A00(componentActivity, new C70638OEk(pnF, A1Y ? 1 : 0, A1Y, A1Y), new C70638OEk(pnF, OSU.A01, OSU.A00, A1Y));
        }
        2db.A06(componentActivity, false);
        if (componentActivity != null && z && A04(userSession)) {
            2db.A02(componentActivity, -1);
        }
    }

    public final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!A01() || !182.A06(0Tu.A05, userSession, 36323161193393080L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01() {
        return JTQ.A1P(Build.VERSION.SDK_INT, 30);
    }

    public static final void A00(Activity activity, int i) {
        activity.getWindow().setStatusBarColor(i);
    }
}
