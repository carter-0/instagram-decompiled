package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallLaunchConfig;

/* renamed from: X.Hdt  reason: case insensitive filesystem */
public abstract class C55203Hdt {
    public static final H0S A00(UserSession userSession, WallLaunchConfig wallLaunchConfig) {
        0qQ.A0B(userSession, 0);
        H0S h0s = new H0S();
        Bundle A0B = DbY.A0B(AnonymousClass000.A00(1103), wallLaunchConfig);
        C227642jf.A04(A0B, userSession);
        h0s.setArguments(A0B);
        return h0s;
    }
}
