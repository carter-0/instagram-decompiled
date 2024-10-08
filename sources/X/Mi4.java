package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

public abstract class Mi4 {
    public static Mi5 A00(UserSession userSession) {
        C376169Gw r1 = C376169Gw.A00;
        0sn r0 = 0sn.A00;
        return A01(userSession, r1.createWithAdditionalCapabilities(r0, r0));
    }

    public static final Mi5 A01(UserSession userSession, Capabilities capabilities) {
        UserSession userSession2 = userSession;
        Capabilities capabilities2 = capabilities;
        AnonymousClass7TG.A1N(userSession2, capabilities2);
        boolean A00 = capabilities2.A00(C376179Gx.RAVEN_VISUAL_MESSAGING);
        0Tu r3 = 0Tu.A05;
        boolean A06 = 182.A06(r3, userSession2, 2342153289799303171L);
        boolean A062 = 182.A06(r3, userSession2, 2342153289799368708L);
        boolean A063 = 182.A06(r3, userSession2, 2342154642714002055L);
        return new Mi5(C73928Pm8.A01(userSession2, 11), C73928Pm8.A01(userSession2, 12), C73928Pm8.A01(userSession2, 13), C73928Pm8.A01(userSession2, 14), C73928Pm8.A01(userSession2, 15), AnonymousClass0eN.A01(C67204Mk0.A00), C73928Pm8.A01(userSession2, 16), C73928Pm8.A01(userSession2, 17), C73928Pm8.A01(userSession2, 18), C73928Pm8.A01(userSession2, 10), A00, A06, A062, A063, 182.A06(r3, userSession2, 36318879110208043L));
    }
}
