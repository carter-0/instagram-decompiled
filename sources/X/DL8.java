package X;

import com.instagram.api.schemas.MediaNoteMimicryTrigger;

public final class DL8 extends 0Yg implements 0sP {
    public static final DL8 A00 = new DL8();

    public DL8() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = MediaNoteMimicryTrigger.A01.get(obj);
        if (obj2 == null) {
            return MediaNoteMimicryTrigger.UNRECOGNIZED;
        }
        return obj2;
    }
}
