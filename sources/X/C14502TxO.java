package X;

import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TxO  reason: case insensitive filesystem */
public abstract class C14502TxO {
    public static final Product A00(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        0qQ.A0B(productDetailsProductItemDictIntf, 0);
        return new Product((TaggingFeedSessionInformation) null, productDetailsProductItemDictIntf.FGr((1E6) null));
    }

    public static final List A02(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(A00((ProductDetailsProductItemDictIntf) it.next()));
        }
        return A0r;
    }

    public static final List A04(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product product = (Product) it.next();
            0qQ.A0B(product, 0);
            A0r.add(product.A01);
        }
        return A0r;
    }

    public static final List A03(List list) {
        if (list == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(A00((ProductDetailsProductItemDictIntf) it.next()));
        }
        return A0r;
    }

    public static final ProductDetailsProductItemDict A01() {
        ProductDetailsProductItemDict A00 = C18714Vyk.A00();
        0qQ.A0B(A00, 1);
        return new C17947Vic(A00).A00();
    }
}
