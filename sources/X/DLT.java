package X;

import com.instagram.api.schemas.OverlayAdsTextStyleEnum;

public final class DLT extends 0Yg implements 0sP {
    public static final DLT A00 = new DLT();

    public DLT() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OverlayAdsTextStyleEnum.A01.get(obj);
        if (obj2 == null) {
            return OverlayAdsTextStyleEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
