package X;

import com.instagram.api.schemas.ClipChainType;

public final class DKF extends 0Yg implements 0sP {
    public static final DKF A00 = new DKF();

    public DKF() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ClipChainType.A01.get(obj);
        if (obj2 == null) {
            return ClipChainType.UNRECOGNIZED;
        }
        return obj2;
    }
}
