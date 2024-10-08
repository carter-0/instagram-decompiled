package X;

import com.instagram.api.schemas.InstapalCharacterType;

public final class DMK extends 0Yg implements 0sP {
    public static final DMK A00 = new DMK();

    public DMK() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = InstapalCharacterType.A01.get(obj);
        if (obj2 == null) {
            return InstapalCharacterType.UNRECOGNIZED;
        }
        return obj2;
    }
}
