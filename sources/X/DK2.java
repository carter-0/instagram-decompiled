package X;

import com.instagram.api.schemas.AdMetadataType;

public final class DK2 extends 0Yg implements 0sP {
    public static final DK2 A00 = new DK2();

    public DK2() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AdMetadataType.A01.get(obj);
        if (obj2 == null) {
            return AdMetadataType.UNRECOGNIZED;
        }
        return obj2;
    }
}
