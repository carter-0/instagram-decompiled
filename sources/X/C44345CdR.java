package X;

import com.instagram.api.schemas.ShoppingBrandWithProductsSubtitle;
import java.io.IOException;

/* renamed from: X.CdR  reason: case insensitive filesystem */
public abstract class C44345CdR {
    public static ShoppingBrandWithProductsSubtitle parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("should_show_checkout_signaling".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("should_show_checkout_signaling", r8, "ShoppingBrandWithProductsSubtitle");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new ShoppingBrandWithProductsSubtitle(bool.booleanValue(), str);
            } else {
                AnonymousClass7TF.A1L("text", r8, "ShoppingBrandWithProductsSubtitle");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
