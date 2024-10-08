package X;

import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;

/* renamed from: X.PpE  reason: case insensitive filesystem */
public final class C74111PpE extends 0Yg implements 0sP {
    public static final C74111PpE A00 = new C74111PpE();

    public C74111PpE() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = FeaturedProductPermissionStatus.A01.get(obj);
        if (obj2 == null) {
            return FeaturedProductPermissionStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
