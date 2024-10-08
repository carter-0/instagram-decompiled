package X;

import com.instagram.api.schemas.MidCardLayoutType;

public final class J0B extends 0Yg implements 0sP {
    public static final J0B A00 = new J0B();

    public J0B() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MidCardLayoutType.A01.get(obj);
        if (obj2 == null) {
            return MidCardLayoutType.UNRECOGNIZED;
        }
        return obj2;
    }
}
