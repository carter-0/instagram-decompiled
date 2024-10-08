package X;

import com.instagram.api.schemas.MidCardOverlayType;

public final class J0A extends 0Yg implements 0sP {
    public static final J0A A00 = new J0A();

    public J0A() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MidCardOverlayType.A01.get(obj);
        if (obj2 == null) {
            return MidCardOverlayType.UNRECOGNIZED;
        }
        return obj2;
    }
}
