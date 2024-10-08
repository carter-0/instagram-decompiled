package X;

import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;

/* renamed from: X.J3p  reason: case insensitive filesystem */
public final class C59030J3p extends 0Yg implements 0sP {
    public static final C59030J3p A00 = new C59030J3p();

    public C59030J3p() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGAdsCardBackgroundTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGAdsCardBackgroundTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
