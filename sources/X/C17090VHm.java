package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VHm  reason: case insensitive filesystem */
public abstract class C17090VHm {
    public static final boolean A00(C18588Vuf vuf) {
        Product product = vuf.A09;
        if (product != null) {
            ProductGroup productGroup = vuf.A00;
            if (!product.A04()) {
                return false;
            }
            boolean z = product.A0P;
            if (productGroup == null) {
                return !z;
            }
            if (z) {
                return false;
            }
            HashSet hashSet = new HashSet(productGroup.A00());
            Iterator A0h = JTQ.A0h(productGroup.A02);
            while (A0h.hasNext()) {
                ProductVariantDimension productVariantDimension = (ProductVariantDimension) AnonymousClass7TF.A0a(A0h);
                C18448Vrv vrv = vuf.A07;
                String str = productVariantDimension.A02;
                0qQ.A07(str);
                String A11 = DbT.A11(str, vrv.A01);
                if (A11 != null) {
                    List A01 = productGroup.A01(productVariantDimension, A11);
                    0qQ.A07(A01);
                    hashSet.retainAll(00k.A0k(A01));
                }
            }
            if ((hashSet instanceof Collection) && hashSet.isEmpty()) {
                return true;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((Product) it.next()).A0P) {
                    return false;
                }
            }
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }
}
