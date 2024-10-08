package X;

import com.instagram.api.schemas.ContextualHighlightType;

public final class DNR extends 0Yg implements 0sP {
    public static final DNR A00 = new DNR();

    public DNR() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ContextualHighlightType.A01.get(obj);
        if (obj2 == null) {
            return ContextualHighlightType.UNRECOGNIZED;
        }
        return obj2;
    }
}
