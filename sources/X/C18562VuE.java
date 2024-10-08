package X;

import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.VuE  reason: case insensitive filesystem */
public final class C18562VuE {
    public final Product A00;
    public final List A01;
    public final Map A02 = new HashMap();
    public final ProductGroup A03;

    public static Product A00(C18562VuE vuE) {
        List<Product> list = vuE.A01;
        r1 = vuE.A00;
        if (!list.contains(r1)) {
            for (Product product : list) {
                if (product.A04()) {
                    if (product.A0P) {
                    }
                }
            }
            return (Product) AnonymousClass7TE.A13(list);
        }
        return product;
    }

    public final void A01(ProductVariantDimension productVariantDimension, String str) {
        List A012 = this.A03.A01(productVariantDimension, str);
        List list = this.A01;
        if (Collections.disjoint(list, A012)) {
            List list2 = this.A00.A0O;
            list2.getClass();
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf = (ProductVariantPossibleValueDictIntf) it.next();
                if (productVariantPossibleValueDictIntf.getId().equals(productVariantDimension.A02)) {
                    if (!productVariantPossibleValueDictIntf.isPreselected()) {
                        return;
                    }
                }
            }
            A00(this).A01(productVariantDimension.A02);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02.put(productVariantDimension.A02, str);
        list.retainAll(A012);
    }

    public C18562VuE(ProductGroup productGroup, Product product) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        this.A03 = productGroup;
        this.A00 = product;
        arrayList.addAll(productGroup.A00());
    }
}
