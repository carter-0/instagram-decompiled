package X;

import com.instagram.api.schemas.MediaDestinationEnum;

public final class G33 extends 0Yg implements 0sP {
    public static final G33 A00 = new G33();

    public G33() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MediaDestinationEnum.A01.get(obj);
        if (obj2 == null) {
            return MediaDestinationEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
