package X;

import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class Cn3 {
    public static Map A00(ProductItemWithARIntf productItemWithARIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productItemWithARIntf.AcJ() != null) {
            A1H.put("ar_effect_metadata", productItemWithARIntf.AcJ().FHC());
        }
        if (productItemWithARIntf.BgJ() != null) {
            A1H.put("product_item", productItemWithARIntf.BgJ().FHC());
        }
        return 0Yt.A0B(A1H);
    }
}
