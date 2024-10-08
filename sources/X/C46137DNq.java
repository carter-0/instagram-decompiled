package X;

import com.instagram.api.schemas.MomentAdsTypeEnum;

/* renamed from: X.DNq  reason: case insensitive filesystem */
public final class C46137DNq extends 0Yg implements 0sP {
    public static final C46137DNq A00 = new C46137DNq();

    public C46137DNq() {
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
