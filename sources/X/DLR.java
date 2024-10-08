package X;

import com.instagram.api.schemas.OverlayAdsFormatEnum;

public final class DLR extends 0Yg implements 0sP {
    public static final DLR A00 = new DLR();

    public DLR() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OverlayAdsFormatEnum.A01.get(obj);
        if (obj2 == null) {
            return OverlayAdsFormatEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
