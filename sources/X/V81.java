package X;

import com.instagram.api.schemas.ProductCollectionV2Type;

public abstract class V81 {
    public static final ProductCollectionV2Type A00(String str) {
        ProductCollectionV2Type productCollectionV2Type = (ProductCollectionV2Type) ProductCollectionV2Type.A01.get(str);
        if (productCollectionV2Type == null) {
            return ProductCollectionV2Type.UNRECOGNIZED;
        }
        return productCollectionV2Type;
    }
}
