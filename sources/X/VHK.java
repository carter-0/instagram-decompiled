package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.user.model.Product;

public abstract class VHK {
    public static final String A00(Product product, Integer num) {
        String str;
        0qQ.A0B(product, 0);
        switch (num.intValue()) {
            case 1:
                str = "commerce/products/%s/influencer_posts/";
                break;
            case 2:
                str = "commerce/products/%s/featured_product_medias/";
                break;
            default:
                str = "commerce/products/%s/related_posts/";
                break;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, product.A0H);
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
