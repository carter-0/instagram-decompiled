package X;

import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CnM  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44929CnM {
    public static Map A00(ProductLaunchInformation productLaunchInformation) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productLaunchInformation.AzA() != null) {
            A1H.put("drops_campaign_id", productLaunchInformation.AzA());
        }
        if (productLaunchInformation.BBR() != null) {
            A1H.put("has_launched", productLaunchInformation.BBR());
        }
        if (productLaunchInformation.CUw() != null) {
            A1H.put("is_ig_exclusive", productLaunchInformation.CUw());
        }
        if (productLaunchInformation.BLg() != null) {
            A1H.put("launch_date", productLaunchInformation.BLg());
        }
        return 0Yt.A0B(A1H);
    }
}
