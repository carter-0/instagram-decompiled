package X;

import com.instagram.api.schemas.AssetRecommendationType;

public final class DKG extends 0Yg implements 0sP {
    public static final DKG A00 = new DKG();

    public DKG() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AssetRecommendationType.A01.get(obj);
        if (obj2 == null) {
            return AssetRecommendationType.UNRECOGNIZED;
        }
        return obj2;
    }
}
