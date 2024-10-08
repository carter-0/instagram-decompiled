package X;

import com.instagram.api.schemas.InstagramProductTaggabilityState;

public final class DN4 extends 0Yg implements 0sP {
    public static final DN4 A00 = new DN4();

    public DN4() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = InstagramProductTaggabilityState.A01.get(obj);
        if (obj2 == null) {
            return InstagramProductTaggabilityState.UNRECOGNIZED;
        }
        return obj2;
    }
}
