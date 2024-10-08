package X;

import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;

/* renamed from: X.DOx  reason: case insensitive filesystem */
public final class C46170DOx extends 0Yg implements 0sP {
    public static final C46170DOx A00 = new C46170DOx();

    public C46170DOx() {
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
