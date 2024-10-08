package X;

import com.instagram.api.schemas.AppreciationUFIEntryActionType;

public final class DK7 extends 0Yg implements 0sP {
    public static final DK7 A00 = new DK7();

    public DK7() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AppreciationUFIEntryActionType.A01.get(obj);
        if (obj2 == null) {
            return AppreciationUFIEntryActionType.UNRECOGNIZED;
        }
        return obj2;
    }
}
