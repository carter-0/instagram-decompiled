package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VjP  reason: case insensitive filesystem */
public final class C17987VjP {
    public final ProductVariantDimension A00;
    public final List A01;
    public final ProductGroup A02;

    public final C17986VjO A00() {
        C17986VjO vjO = new C17986VjO(this);
        Iterator it = this.A01.iterator();
        if (!it.hasNext()) {
            return vjO;
        }
        ((Product) it.next()).A01(this.A00.A02);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(ProductVariantDimension productVariantDimension, String str) {
        17k.A0E(!this.A00.equals(productVariantDimension));
        this.A01.retainAll(this.A02.A01(productVariantDimension, str));
    }

    public C17987VjP(ProductGroup productGroup, ProductVariantDimension productVariantDimension) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        this.A00 = productVariantDimension;
        this.A02 = productGroup;
        arrayList.addAll(productGroup.A00());
    }
}
