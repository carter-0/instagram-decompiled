package X;

import com.instagram.api.schemas.BCPDealOutputTypeEnum;

public final class MNS extends 0Yg implements 0sP {
    public static final MNS A00 = new MNS();

    public MNS() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = BCPDealOutputTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return BCPDealOutputTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
