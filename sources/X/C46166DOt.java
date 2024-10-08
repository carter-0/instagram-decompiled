package X;

import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;

/* renamed from: X.DOt  reason: case insensitive filesystem */
public final class C46166DOt extends 0Yg implements 0sP {
    public static final C46166DOt A00 = new C46166DOt();

    public C46166DOt() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = IGAdsTrustInfoTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGAdsTrustInfoTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
