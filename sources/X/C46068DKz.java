package X;

import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;

/* renamed from: X.DKz  reason: case insensitive filesystem */
public final class C46068DKz extends 0Yg implements 0sP {
    public static final C46068DKz A00 = new C46068DKz();

    public C46068DKz() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGFormatLiquidityUseCaseEnum.A01.get(obj);
        if (obj2 == null) {
            return IGFormatLiquidityUseCaseEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
