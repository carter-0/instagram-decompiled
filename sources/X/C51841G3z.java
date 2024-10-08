package X;

import com.instagram.api.schemas.LikeVisibilityType;

/* renamed from: X.G3z  reason: case insensitive filesystem */
public final class C51841G3z extends 0Yg implements 0sP {
    public static final C51841G3z A00 = new C51841G3z();

    public C51841G3z() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = LikeVisibilityType.A01.get(obj);
        if (obj2 == null) {
            return LikeVisibilityType.UNRECOGNIZED;
        }
        return obj2;
    }
}
