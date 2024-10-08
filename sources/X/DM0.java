package X;

import com.instagram.api.schemas.UserRoleOnFundraiser;

public final class DM0 extends 0Yg implements 0sP {
    public static final DM0 A00 = new DM0();

    public DM0() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = UserRoleOnFundraiser.A01.get(obj);
        if (obj2 == null) {
            return UserRoleOnFundraiser.UNRECOGNIZED;
        }
        return obj2;
    }
}
