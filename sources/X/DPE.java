package X;

import com.instagram.api.schemas.ShopManagementAccessState;

public final class DPE extends 0Yg implements 0sP {
    public static final DPE A00 = new DPE();

    public DPE() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ShopManagementAccessState.A01.get(obj);
        if (obj2 == null) {
            return ShopManagementAccessState.UNRECOGNIZED;
        }
        return obj2;
    }
}
