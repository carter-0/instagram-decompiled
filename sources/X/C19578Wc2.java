package X;

import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Wc2  reason: case insensitive filesystem */
public final class C19578Wc2 implements C20926X4r {
    public final /* synthetic */ ProductVariantDimension A00;
    public final /* synthetic */ C18616Vv9 A01;
    public final /* synthetic */ VariantSelectorModel A02;

    public C19578Wc2(ProductVariantDimension productVariantDimension, C18616Vv9 vv9, VariantSelectorModel variantSelectorModel) {
        this.A01 = vv9;
        this.A00 = productVariantDimension;
        this.A02 = variantSelectorModel;
    }

    public final void Dx4(ProductVariantDimension productVariantDimension, String str) {
        String str2;
        AnonymousClass7TG.A1N(productVariantDimension, str);
        C18616Vv9 vv9 = this.A01;
        ProductVariantDimension productVariantDimension2 = this.A00;
        vv9.A02(productVariantDimension, str, DbW.A1a(productVariantDimension2));
        if (productVariantDimension2 != null) {
            C19676Wde wde = vv9.A04;
            VariantSelectorModel variantSelectorModel = this.A02;
            vv9.A06.Bz5();
            wde.A02(this, variantSelectorModel, C331127Pr.A1X);
            return;
        }
        X9C x9c = vv9.A06;
        if (x9c.Bz5().A09 != null) {
            Product product = x9c.Bz5().A09;
            if (product != null) {
                W1W w1w = vv9.A02;
                User user = product.A0B;
                if (user == null || (str2 = AnonymousClass3ZA.A00(user)) == null) {
                    str2 = "";
                }
                w1w.A04(product, str2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        vv9.A04.A03((C20932X4x) null);
    }
}
