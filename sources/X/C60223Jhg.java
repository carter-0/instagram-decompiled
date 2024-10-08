package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.Jhg  reason: case insensitive filesystem */
public final class C60223Jhg extends 2YL {
    public final 05G A00 = 106.A01(K39.A00);
    public final UserSession A01;

    public C60223Jhg(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(C64301LZb lZb, String str) {
        JSONObject A11 = DbS.A11();
        A11.put(TraceFieldType.AdhocEventName, "start_animation");
        A11.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
        lZb.A03(AnonymousClass7TE.A1L("avatar_animation_event", A11));
    }
}
