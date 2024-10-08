package X;

import com.instagram.api.schemas.MoreInfoStickerCTAType;

public final class DLI extends 0Yg implements 0sP {
    public static final DLI A00 = new DLI();

    public DLI() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MoreInfoStickerCTAType.A01.get(obj);
        if (obj2 == null) {
            return MoreInfoStickerCTAType.UNRECOGNIZED;
        }
        return obj2;
    }
}
