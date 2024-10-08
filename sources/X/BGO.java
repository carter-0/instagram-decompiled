package X;

import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.user.model.ProductDetailsProductItemDict;

public final class BGO extends AnonymousClass0T0 implements DRT {
    public final DRO A00;
    public final ShoppingBrandWithProducts A01;
    public final ProductDetailsProductItemDict A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGO) {
                BGO bgo = (BGO) obj;
                if (!0qQ.A0K(this.A01, bgo.A01) || !0qQ.A0K(this.A02, bgo.A02) || !0qQ.A0K(this.A00, bgo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BGO(DRO dro, ShoppingBrandWithProducts shoppingBrandWithProducts, ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A01 = shoppingBrandWithProducts;
        this.A02 = productDetailsProductItemDict;
        this.A00 = dro;
    }
}
