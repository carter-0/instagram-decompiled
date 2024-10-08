package X;

import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class W1L {
    public static final W1L A06 = new W1L(new C18570VuM());
    public final 1Xj A00;
    public final Uw7 A01;
    public final C16276Urd A02;
    public final Integer A03;
    public final Map A04;
    public final Map A05;

    public W1L(1Xj r1, Uw7 uw7, C16276Urd urd, Integer num, Map map, Map map2) {
        this.A01 = uw7;
        this.A00 = r1;
        this.A05 = map2;
        this.A03 = num;
        this.A04 = map;
        this.A02 = urd;
    }

    public static String A00(UserSession userSession, Product product) {
        List<ProductVariantPossibleValueDictIntf> list;
        if (!182.A06(0Tu.A05, userSession, 36312574098146480L) || (list = product.A0O) == null || list.isEmpty()) {
            return product.A0H;
        }
        StringBuilder sb = new StringBuilder("key");
        for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
            if (productVariantPossibleValueDictIntf.CFr() == ProductVariantVisualStyle.THUMBNAIL) {
                sb.append(",");
                sb.append(productVariantPossibleValueDictIntf.getId());
                sb.append(":");
                sb.append(productVariantPossibleValueDictIntf.getValue());
            }
        }
        return sb.toString();
    }

    public final List A01(UserSession userSession, Product product) {
        Map map = this.A05;
        if (map.containsKey(A00(userSession, product))) {
            return C66580MXl.A13(A00(userSession, product), map);
        }
        0qQ.A0B(product, 1);
        return Collections.singletonList(new C16273Ura(product.A07, 002.A0R(product.A0H, "_image_0"), product.A0I));
    }

    public W1L(C18570VuM vuM) {
        this.A01 = vuM.A01;
        this.A00 = vuM.A00;
        this.A05 = vuM.A05;
        this.A03 = vuM.A03;
        this.A04 = vuM.A04;
        this.A02 = vuM.A02;
    }
}
