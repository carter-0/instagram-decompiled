package X;

import com.instagram.api.schemas.AdFormatType;

public final class DK1 extends 0Yg implements 0sP {
    public static final DK1 A00 = new DK1();

    public DK1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AdFormatType.A01.get(obj);
        if (obj2 == null) {
            return AdFormatType.UNRECOGNIZED;
        }
        return obj2;
    }
}
