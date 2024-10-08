package X;

import com.instagram.api.schemas.IGLiveNotificationPreference;

public final class DPB extends 0Yg implements 0sP {
    public static final DPB A00 = new DPB();

    public DPB() {
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
