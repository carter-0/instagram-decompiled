package X;

import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Hcy  reason: case insensitive filesystem */
public abstract class C55150Hcy {
    public static final ProductTileMedia A00(1Xj r5, Product product, int i) {
        String id;
        User user;
        0qQ.A0B(product, 3);
        if (r5.A5D() && i != -1) {
            r5 = r5.A1c(i);
        }
        boolean z = false;
        if (r5 != null) {
            ArrayList A3B = r5.A3B();
            if (!(A3B instanceof Collection) || !A3B.isEmpty()) {
                Iterator it = A3B.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (0qQ.A0K(((Product) it.next()).A0H, product.A0H)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (r5 == null || r5.A5v() || !z || (id = r5.getId()) == null || (user = product.A0B) == null) {
            return null;
        }
        return new ProductTileMedia(r5.A1p(), user, id, (String) null);
    }
}
