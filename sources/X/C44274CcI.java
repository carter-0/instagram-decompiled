package X;

import com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl;
import java.io.IOException;

/* renamed from: X.CcI  reason: case insensitive filesystem */
public abstract class C44274CcI {
    public static ProductTileProductNameLabelOptionsImpl parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Integer num = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("num_lines".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else {
                    bool = C41847B3o.A0z(r7, bool, A17, "show_checkout_signaling");
                }
                r7.A0z();
            }
            if (num == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("num_lines", r7, "ProductTileProductNameLabelOptionsImpl");
            } else if (bool != null || !(r7 instanceof 0c9)) {
                return new ProductTileProductNameLabelOptionsImpl(num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("show_checkout_signaling", r7, "ProductTileProductNameLabelOptionsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
