package X;

import com.instagram.api.schemas.IGLiveGameStatus;

public final class DKB extends 0Yg implements 0sP {
    public static final DKB A00 = new DKB();

    public DKB() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveGameStatus.A01.get(obj);
        if (obj2 == null) {
            return IGLiveGameStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
