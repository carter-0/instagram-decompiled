package X;

import com.instagram.api.schemas.IGPostTriggerExperience;

public final class DOQ extends 0Yg implements 0sP {
    public static final DOQ A00 = new DOQ();

    public DOQ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = IGPostTriggerExperience.A01.get(obj);
        if (obj2 == null) {
            return IGPostTriggerExperience.UNRECOGNIZED;
        }
        return obj2;
    }
}
