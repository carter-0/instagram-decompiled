package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VGt  reason: case insensitive filesystem */
public abstract class C17071VGt {
    public static final VariantSelectorModel A00(ProductVariantDimension productVariantDimension, C18588Vuf vuf) {
        ProductGroup productGroup = vuf.A00;
        if (productGroup != null) {
            C18448Vrv vrv = vuf.A07;
            ProductVariantDimension productVariantDimension2 = productVariantDimension;
            C17987VjP vjP = new C17987VjP(productGroup, productVariantDimension);
            Iterator A0h = JTQ.A0h(productGroup.A02);
            while (A0h.hasNext()) {
                ProductVariantDimension productVariantDimension3 = (ProductVariantDimension) A0h.next();
                String str = productVariantDimension3.A02;
                0qQ.A07(str);
                String A11 = DbT.A11(str, vrv.A01);
                if (A11 != null && !productVariantDimension3.equals(productVariantDimension)) {
                    vjP.A01(productVariantDimension3, A11);
                }
            }
            C17986VjO A00 = vjP.A00();
            ArrayList A01 = A00.A01();
            int indexOf = Collections.unmodifiableList(productGroup.A02).indexOf(productVariantDimension);
            ArrayList A002 = A00.A00();
            String str2 = productVariantDimension2.A02;
            0qQ.A07(str2);
            return new VariantSelectorModel(productVariantDimension2, A01, (List) null, A002, indexOf, A01.indexOf(vrv.A01.get(str2)));
        }
        throw AnonymousClass7TE.A0y();
    }
}
