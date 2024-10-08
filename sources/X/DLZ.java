package X;

import com.instagram.api.schemas.ProductTileBannerType;

public final class DLZ extends 0Yg implements 0sP {
    public static final DLZ A00 = new DLZ();

    public DLZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ProductTileBannerType.A01.get(obj);
        if (obj2 == null) {
            return ProductTileBannerType.UNRECOGNIZED;
        }
        return obj2;
    }
}
