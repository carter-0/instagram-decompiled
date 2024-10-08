package X;

import com.instagram.api.schemas.HasPasswordState;

public final class DPK extends 0Yg implements 0sP {
    public static final DPK A00 = new DPK();

    public DPK() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = HasPasswordState.A01.get(obj);
        if (obj2 == null) {
            return HasPasswordState.UNRECOGNIZED;
        }
        return obj2;
    }
}
