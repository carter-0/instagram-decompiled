package X;

import com.instagram.api.schemas.EventVisibilityType;

public final class DL2 extends 0Yg implements 0sP {
    public static final DL2 A00 = new DL2();

    public DL2() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = EventVisibilityType.A01.get(obj);
        if (obj2 == null) {
            return EventVisibilityType.UNRECOGNIZED;
        }
        return obj2;
    }
}
