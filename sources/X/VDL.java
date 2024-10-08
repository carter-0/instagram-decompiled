package X;

import com.facebook.graphql.enums.EnumHelper;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

public abstract class VDL {
    public static C17247VNz parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17247VNz vNz = new C17247VNz();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE.equals(A17)) {
                    EnumHelper.A00(r3.A1Q(), C16624UyK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("metrics".equals(A17)) {
                    vNz.A00 = VDK.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
