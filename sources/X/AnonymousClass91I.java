package X;

import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.91I  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass91I {
    public static Map A00(ProductImageContainer productImageContainer) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (productImageContainer.BGO() != null) {
            linkedHashMap.put("image_versions2", productImageContainer.BGO().FHC());
        }
        if (productImageContainer.getPreview() != null) {
            linkedHashMap.put("preview", productImageContainer.getPreview());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
