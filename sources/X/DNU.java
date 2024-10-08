package X;

import com.instagram.api.schemas.LinkAction;

public final class DNU extends 0Yg implements 0sP {
    public static final DNU A00 = new DNU();

    public DNU() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = LinkAction.A01.get(obj);
        if (obj2 == null) {
            return LinkAction.UNRECOGNIZED;
        }
        return obj2;
    }
}
