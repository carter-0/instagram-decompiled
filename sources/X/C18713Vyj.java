package X;

import android.content.Context;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.Vyj  reason: case insensitive filesystem */
public final class C18713Vyj {
    public static final C18713Vyj A00 = new Object();

    public static final void A00(Context context, UwD uwD, Product product, Integer num, List list) {
        String string;
        SellerBadgeDict sellerBadgeDict;
        if (list.size() < 2) {
            int ordinal = uwD.ordinal();
            if (ordinal == 0) {
                ProductCheckoutProperties productCheckoutProperties = product.A01.A0C;
                if (productCheckoutProperties != null && DbX.A1a(productCheckoutProperties.A05)) {
                    string = context.getString(2131971332);
                } else {
                    return;
                }
            } else if (ordinal == 3 && (sellerBadgeDict = product.A01.A08) != null) {
                string = sellerBadgeDict.A02;
            } else {
                return;
            }
            if (string != null) {
                if (list.size() > 0 && num == AnonymousClass05K.A00) {
                    string = 002.A0R(" • ", string);
                    0qQ.A07(string);
                }
                list.add(string);
            }
        }
    }
}
