package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.HashMap;

public abstract class RVJ {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.RxC, java.lang.Object] */
    public static C10733RxC parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            ? obj = new Object();
            16L A11 = r6.A11();
            16L r3 = 16L.A0D;
            if (A11 != r3) {
                r6.A0z();
                return null;
            }
            while (true) {
                16L A1J = r6.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    return obj;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                HashMap hashMap = null;
                if ("h".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r6);
                } else if ("media_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r6);
                } else if ("upload_id".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r6);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r6);
                } else if ("xsharing_nonces".equals(A17)) {
                    if (r6.A11() == r3) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r6.A1J() != r4) {
                            C41847B3o.A1M(r6, hashMap);
                        }
                    }
                    obj.A04 = hashMap;
                }
                r6.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
