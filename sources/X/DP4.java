package X;

import com.instagram.api.schemas.UpcomingEventIDType;

public final class DP4 extends 0Yg implements 0sP {
    public static final DP4 A00 = new DP4();

    public DP4() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = UpcomingEventIDType.A01.get(obj);
        if (obj2 == null) {
            return UpcomingEventIDType.UNRECOGNIZED;
        }
        return obj2;
    }
}
