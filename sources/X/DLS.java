package X;

import com.instagram.api.schemas.OverlayAdTapDestinationEnum;

public final class DLS extends 0Yg implements 0sP {
    public static final DLS A00 = new DLS();

    public DLS() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OverlayAdTapDestinationEnum.A01.get(obj);
        if (obj2 == null) {
            return OverlayAdTapDestinationEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
