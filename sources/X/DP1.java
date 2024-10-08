package X;

import com.instagram.api.schemas.ProductReviewStatus;

public final class DP1 extends 0Yg implements 0sP {
    public static final DP1 A00 = new DP1();

    public DP1() {
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
