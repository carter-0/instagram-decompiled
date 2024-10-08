package X;

import com.instagram.api.schemas.ThumbnailInteractionType;

public final class DOG extends 0Yg implements 0sP {
    public static final DOG A00 = new DOG();

    public DOG() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ThumbnailInteractionType.A01.get(obj);
        if (obj2 == null) {
            return ThumbnailInteractionType.UNRECOGNIZED;
        }
        return obj2;
    }
}
