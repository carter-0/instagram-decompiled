package X;

import com.instagram.api.schemas.IGLiveModeratorStatus;

public final class DPQ extends 0Yg implements 0sP {
    public static final DPQ A00 = new DPQ();

    public DPQ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveModeratorStatus.A01.get(obj);
        if (obj2 == null) {
            return IGLiveModeratorStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
