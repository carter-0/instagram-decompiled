package X;

import com.instagram.api.schemas.ProductTilePriceLabelOptionsImpl;
import java.io.IOException;

/* renamed from: X.CcG  reason: case insensitive filesystem */
public abstract class C44272CcG {
    public static ProductTilePriceLabelOptionsImpl parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            Boolean bool = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("show_checkout_signaling".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("show_commission_rate".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r9);
                } else {
                    bool3 = C41847B3o.A0z(r9, bool3, A17, "show_soldout");
                }
                r9.A0z();
            }
            if (bool == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_checkout_signaling", r9, "ProductTilePriceLabelOptionsImpl");
            } else if (bool2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_commission_rate", r9, "ProductTilePriceLabelOptionsImpl");
            } else if (bool3 != null || !(r9 instanceof 0c9)) {
                return new ProductTilePriceLabelOptionsImpl(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                AnonymousClass7TF.A1L("show_soldout", r9, "ProductTilePriceLabelOptionsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
