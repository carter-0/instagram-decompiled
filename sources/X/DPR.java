package X;

import com.instagram.api.schemas.IGLiveNotificationPreference;

public final class DPR extends 0Yg implements 0sP {
    public static final DPR A00 = new DPR();

    public DPR() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveNotificationPreference.A01.get(obj);
        if (obj2 == null) {
            return IGLiveNotificationPreference.UNRECOGNIZED;
        }
        return obj2;
    }
}
