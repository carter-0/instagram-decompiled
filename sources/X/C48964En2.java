package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.En2  reason: case insensitive filesystem */
public abstract class C48964En2 {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Eu8] */
    public static Eu8 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE.equals(A17)) {
                    C41846B3n.A1A(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
