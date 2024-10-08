package X;

import com.instagram.nux.cal.model.NuxConnectResponse;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.F6n  reason: case insensitive filesystem */
public final class C49780F6n {
    public static NuxConnectResponse parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("user_token".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("fb_id".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r3);
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
