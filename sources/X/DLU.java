package X;

import com.instagram.api.schemas.FundingSourceType;

public final class DLU extends 0Yg implements 0sP {
    public static final DLU A00 = new DLU();

    public DLU() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = FundingSourceType.A01.get(obj);
        if (obj2 == null) {
            return FundingSourceType.UNRECOGNIZED;
        }
        return obj2;
    }
}
