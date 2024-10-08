package X;

import com.instagram.api.schemas.CreatorViewerBottomCTAType;

public final class DKV extends 0Yg implements 0sP {
    public static final DKV A00 = new DKV();

    public DKV() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CreatorViewerBottomCTAType.A01.get(obj);
        if (obj2 == null) {
            return CreatorViewerBottomCTAType.UNRECOGNIZED;
        }
        return obj2;
    }
}
