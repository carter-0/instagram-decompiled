package X;

import com.instagram.api.schemas.ContextualLinkCtaType;

public final class DKR extends 0Yg implements 0sP {
    public static final DKR A00 = new DKR();

    public DKR() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ContextualLinkCtaType.A01.get(obj);
        if (obj2 == null) {
            return ContextualLinkCtaType.UNRECOGNIZED;
        }
        return obj2;
    }
}
