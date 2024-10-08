package X;

import com.instagram.api.schemas.AdModelType;

public final class DO2 extends 0Yg implements 0sP {
    public static final DO2 A00 = new DO2();

    public DO2() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AdModelType.A01.get(obj);
        if (obj2 == null) {
            return AdModelType.UNRECOGNIZED;
        }
        return obj2;
    }
}
