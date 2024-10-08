package X;

import com.instagram.api.schemas.IGAdsRrFormatEnum;

/* renamed from: X.WyJ  reason: case insensitive filesystem */
public final class C20746WyJ extends 0Yg implements 0sP {
    public static final C20746WyJ A00 = new C20746WyJ();

    public C20746WyJ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGAdsRrFormatEnum.A01.get(obj);
        if (obj2 == null) {
            return IGAdsRrFormatEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
