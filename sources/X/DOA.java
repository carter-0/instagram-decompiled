package X;

import com.instagram.api.schemas.MomentAdsTypeEnum;

public final class DOA extends 0Yg implements 0sP {
    public static final DOA A00 = new DOA();

    public DOA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MomentAdsTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return MomentAdsTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
