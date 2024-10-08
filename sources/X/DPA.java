package X;

import com.instagram.api.schemas.IGLiveModeratorStatus;

public final class DPA extends 0Yg implements 0sP {
    public static final DPA A00 = new DPA();

    public DPA() {
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
