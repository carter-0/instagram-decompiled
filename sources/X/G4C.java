package X;

import com.instagram.api.schemas.LikeVisibilityType;

public final class G4C extends 0Yg implements 0sP {
    public static final G4C A00 = new G4C();

    public G4C() {
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
