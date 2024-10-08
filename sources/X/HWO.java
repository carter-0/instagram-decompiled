package X;

import com.instagram.model.mediatype.ProductType;
import java.util.Map;

public abstract class HWO {
    public static final boolean A00(C267284bJ r4) {
        String productType = r4.getProductType();
        if (productType == null) {
            return false;
        }
        ProductType productType2 = ProductType.FEED;
        Map map = ProductType.A01;
        if (productType2 == map.get(productType) || ProductType.IGTV == map.get(productType)) {
            return true;
        }
        return false;
    }
}
