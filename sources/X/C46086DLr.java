package X;

import com.instagram.api.schemas.SellerBadgeType;

/* renamed from: X.DLr  reason: case insensitive filesystem */
public final class C46086DLr extends 0Yg implements 0sP {
    public static final C46086DLr A00 = new C46086DLr();

    public C46086DLr() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = SellerBadgeType.A01.get(obj);
        if (obj2 == null) {
            return SellerBadgeType.UNRECOGNIZED;
        }
        return obj2;
    }
}
