package X;

import com.instagram.api.schemas.CreationToolEnum;

public final class J07 extends 0Yg implements 0sP {
    public static final J07 A00 = new J07();

    public J07() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CreationToolEnum.A01.get(obj);
        if (obj2 == null) {
            return CreationToolEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
