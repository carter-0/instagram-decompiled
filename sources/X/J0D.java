package X;

import com.instagram.api.schemas.ClipsMidCardType;

public final class J0D extends 0Yg implements 0sP {
    public static final J0D A00 = new J0D();

    public J0D() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ClipsMidCardType.A01.get(obj);
        if (obj2 == null) {
            return ClipsMidCardType.UNRECOGNIZED;
        }
        return obj2;
    }
}
