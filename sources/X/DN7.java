package X;

import com.instagram.api.schemas.IgUserBioLinkTypeEnum;

public final class DN7 extends 0Yg implements 0sP {
    public static final DN7 A00 = new DN7();

    public DN7() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IgUserBioLinkTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IgUserBioLinkTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
