package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;

public final class J09 extends 0Yg implements 0sP {
    public static final J09 A00 = new J09();

    public J09() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MidCardClipsClickedAction.A01.get(obj);
        if (obj2 == null) {
            return MidCardClipsClickedAction.UNRECOGNIZED;
        }
        return obj2;
    }
}
