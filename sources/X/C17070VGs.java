package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VGs  reason: case insensitive filesystem */
public abstract class C17070VGs {
    public static final 1OC A00(UserSession userSession, Integer num, Integer num2, List list) {
        String str;
        String str2;
        String str3;
        boolean A1X = DbW.A1X(list);
        0qQ.A0B(num2, 3);
        1NY A0M = DbU.A0M(userSession);
        A0M.A0A("commerce/product_feed/metadata/");
        A0M.A05();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product product = (Product) it.next();
            String str4 = product.A0C;
            if (str4 == null) {
                String str5 = product.A0H;
                User user = product.A0B;
                if (user != null) {
                    str3 = AnonymousClass3ZA.A00(user);
                } else {
                    str3 = null;
                }
                str4 = String.format(AnonymousClass000.A00(397), Arrays.copyOf(new Object[]{str5, str3}, 2));
                0qQ.A07(str4);
            }
            A0r.add(str4);
        }
        A0M.A9m(AnonymousClass000.A00(2912), C51970G9q.A0k(A0r));
        switch (num.intValue()) {
            case 0:
                str = "shopping_bag";
                break;
            case 1:
                str = "wishlist";
                break;
            default:
                str = "recently_viewed";
                break;
        }
        A0M.A9m("primary_endpoint", str);
        switch (num2.intValue()) {
            case 1:
                str2 = "multi_merchant_reconsideration";
                break;
            case 2:
                str2 = "single_merchant_reconsideration";
                break;
            default:
                str2 = "wishlist";
                break;
        }
        A0M.A9m("surface_type", str2);
        return DbT.A0R((15p) null, A0M, ProductFeedResponse.class, LJM.class, A1X);
    }
}
