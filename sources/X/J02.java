package X;

import com.instagram.api.schemas.ChallengeName;

public final class J02 extends 0Yg implements 0sP {
    public static final J02 A00 = new J02();

    public J02() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ChallengeName.A01.get(obj);
        if (obj2 == null) {
            return ChallengeName.UNRECOGNIZED;
        }
        return obj2;
    }
}
