package X;

import com.instagram.api.schemas.CommentAudienceControlType;

public final class DPH extends 0Yg implements 0sP {
    public static final DPH A00 = new DPH();

    public DPH() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CommentAudienceControlType.A01.get(obj);
        if (obj2 == null) {
            return CommentAudienceControlType.UNRECOGNIZED;
        }
        return obj2;
    }
}
