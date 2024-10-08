package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;

public final class DL0 extends 0Yg implements 0sP {
    public static final DL0 A00 = new DL0();

    public DL0() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = IGPostClickEligibleExperienceTypes.A01.get(obj);
        if (obj2 == null) {
            return IGPostClickEligibleExperienceTypes.UNRECOGNIZED;
        }
        return obj2;
    }
}
