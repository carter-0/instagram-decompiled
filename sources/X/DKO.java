package X;

import com.instagram.api.schemas.MediaTrialStatus;

public final class DKO extends 0Yg implements 0sP {
    public static final DKO A00 = new DKO();

    public DKO() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MediaTrialStatus.A01.get(obj);
        if (obj2 == null) {
            return MediaTrialStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
