package X;

import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;

public final class DL3 extends 0Yg implements 0sP {
    public static final DL3 A00 = new DL3();

    public DL3() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGPBIAProfileBrowseTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGPBIAProfileBrowseTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
