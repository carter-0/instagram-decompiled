package X;

import com.instagram.api.schemas.IGLiveModeratorEligibilityType;

public final class DPP extends 0Yg implements 0sP {
    public static final DPP A00 = new DPP();

    public DPP() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveModeratorEligibilityType.A01.get(obj);
        if (obj2 == null) {
            return IGLiveModeratorEligibilityType.UNRECOGNIZED;
        }
        return obj2;
    }
}
