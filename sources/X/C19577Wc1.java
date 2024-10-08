package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;

/* renamed from: X.Wc1  reason: case insensitive filesystem */
public final class C19577Wc1 implements C20926X4r {
    public final /* synthetic */ UZF A00;

    public C19577Wc1(UZF uzf) {
        this.A00 = uzf;
    }

    public final void Dx4(ProductVariantDimension productVariantDimension, String str) {
        AnonymousClass7TF.A1H(productVariantDimension, str);
        UZF uzf = this.A00;
        ProductGroup productGroup = uzf.A02;
        if (productGroup == null) {
            0qQ.A0F("productGroup");
            throw AnonymousClass00P.createAndThrow();
        }
        Object obj = productGroup.A01(productVariantDimension, str).get(0);
        0qQ.A07(obj);
        UZF.A01(uzf, (Product) obj);
    }
}
