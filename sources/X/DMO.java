package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;

public final class DMO extends 0Yg implements 0sP {
    public static final DMO A00 = new DMO();

    public DMO() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ClipsACRMidCardSubType.A01.get(obj);
        if (obj2 == null) {
            return ClipsACRMidCardSubType.UNRECOGNIZED;
        }
        return obj2;
    }
}
