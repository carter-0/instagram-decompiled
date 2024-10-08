package X;

import com.instagram.common.session.UserSession;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;

/* renamed from: X.Kuo  reason: case insensitive filesystem */
public abstract class C63305Kuo {
    public static final IncentivePlatformApi A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (IncentivePlatformApi) userSession.A01(IncentivePlatformApi.class, new C66299MMi(userSession, 40));
    }
}
