package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;

public final class DMP extends 0Yg implements 0sP {
    public static final DMP A00 = new DMP();

    public DMP() {
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
