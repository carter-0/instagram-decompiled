package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;

/* renamed from: X.Nv4  reason: case insensitive filesystem */
public abstract class C69964Nv4 {
    public static final void A00(UserSession userSession, AnonymousClass7UH r3, String str) {
        IGFOAMessagingLocalSendSpeedLogger A00;
        AnonymousClass7TG.A1O(r3, userSession);
        r3.A02(str, "ThreadKey is null");
        if (str != null && (A00 = C328727Fx.A00(userSession, Integer.valueOf(str.hashCode()))) != null) {
            A00.onEndFlowFail("ThreadKey is null");
        }
    }
}
