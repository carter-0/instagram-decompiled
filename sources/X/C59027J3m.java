package X;

import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;

/* renamed from: X.J3m  reason: case insensitive filesystem */
public final class C59027J3m extends 0Yg implements 0sP {
    public static final C59027J3m A00 = new C59027J3m();

    public C59027J3m() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = IGAdsGenericCardInfoTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGAdsGenericCardInfoTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
