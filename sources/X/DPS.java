package X;

import com.instagram.api.schemas.IGLiveWaveStatus;

public final class DPS extends 0Yg implements 0sP {
    public static final DPS A00 = new DPS();

    public DPS() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveWaveStatus.A01.get(obj);
        if (obj2 == null) {
            return IGLiveWaveStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
