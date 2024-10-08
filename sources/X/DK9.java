package X;

import com.instagram.api.schemas.MediaType;

public final class DK9 extends 0Yg implements 0sP {
    public static final DK9 A00 = new DK9();

    public DK9() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MediaType.A01.get(obj);
        if (obj2 == null) {
            return MediaType.UNRECOGNIZED;
        }
        return obj2;
    }
}
