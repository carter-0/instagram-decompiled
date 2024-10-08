package X;

import com.instagram.api.schemas.MediaCommentAudienceControlType;

public final class DO8 extends 0Yg implements 0sP {
    public static final DO8 A00 = new DO8();

    public DO8() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MediaCommentAudienceControlType.A01.get(obj);
        if (obj2 == null) {
            return MediaCommentAudienceControlType.UNRECOGNIZED;
        }
        return obj2;
    }
}
