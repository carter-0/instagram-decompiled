package X;

import com.instagram.api.schemas.HighlightReelTypeStr;

public final class DOP extends 0Yg implements 0sP {
    public static final DOP A00 = new DOP();

    public DOP() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = HighlightReelTypeStr.A01.get(obj);
        if (obj2 == null) {
            return HighlightReelTypeStr.UNRECOGNIZED;
        }
        return obj2;
    }
}
