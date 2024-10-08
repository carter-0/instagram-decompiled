package X;

import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;

public final class G38 extends 0Yg implements 0sP {
    public static final G38 A00 = new G38();

    public G38() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IgUserRelatedAccountTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IgUserRelatedAccountTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
