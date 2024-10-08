package X;

import com.instagram.api.schemas.InspirationSignalType;

public final class DL7 extends 0Yg implements 0sP {
    public static final DL7 A00 = new DL7();

    public DL7() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = InspirationSignalType.A01.get(obj);
        if (obj2 == null) {
            return InspirationSignalType.UNRECOGNIZED;
        }
        return obj2;
    }
}
