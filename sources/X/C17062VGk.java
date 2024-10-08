package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.VGk  reason: case insensitive filesystem */
public abstract class C17062VGk {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.Vgt, java.lang.Object] */
    public static C17840Vgt parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1E(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A02 = A0l;
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    Integer A00 = C17063VGl.A00(AnonymousClass7TG.A0l(r4));
                    0qQ.A0B(A00, 0);
                    obj.A01 = A00;
                } else if ("count".equals(A17)) {
                    obj.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
