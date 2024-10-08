package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;
import java.util.HashMap;

public final class LQV {
    public final UserSession A00;
    public final LM8 A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();

    public LQV(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        LM8 lm8 = new LM8(userSession);
        this.A00 = userSession;
        this.A01 = lm8;
    }

    public static final L8Q A00(ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, LQV lqv) {
        HashMap hashMap = lqv.A02;
        Object obj = hashMap.get(shoppingReconFeedEndpoint);
        if (obj == null) {
            obj = new L8Q(shoppingReconFeedEndpoint);
            hashMap.put(shoppingReconFeedEndpoint, obj);
        }
        return (L8Q) obj;
    }

    public static final void A01(ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, LQV lqv, 0sP r3) {
        05G r2 = A00(shoppingReconFeedEndpoint, lqv).A03;
        Object value = r2.getValue();
        Object invoke = r3.invoke(value);
        if (!0qQ.A0K(invoke, value)) {
            r2.Epw(invoke);
        }
    }
}
