package X;

import com.instagram.api.schemas.ProductReviewStatus;

public final class DP2 extends 0Yg implements 0sP {
    public static final DP2 A00 = new DP2();

    public DP2() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ProductReviewStatus.A01.get(obj);
        if (obj2 == null) {
            return ProductReviewStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
