package X;

import com.instagram.api.schemas.OrganicCTAType;

public final class DLP extends 0Yg implements 0sP {
    public static final DLP A00 = new DLP();

    public DLP() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OrganicCTAType.A01.get(obj);
        if (obj2 == null) {
            return OrganicCTAType.UNRECOGNIZED;
        }
        return obj2;
    }
}
