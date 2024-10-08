package X;

import com.instagram.api.schemas.WearablesAppAttributionType;

public final class J0H extends 0Yg implements 0sP {
    public static final J0H A00 = new J0H();

    public J0H() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = WearablesAppAttributionType.A01.get(obj);
        if (obj2 == null) {
            return WearablesAppAttributionType.UNRECOGNIZED;
        }
        return obj2;
    }
}
