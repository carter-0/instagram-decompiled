package X;

import com.instagram.api.schemas.InspirationSignalType;

public final class DKT extends 0Yg implements 0sP {
    public static final DKT A00 = new DKT();

    public DKT() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = InspirationSignalType.A01.get(obj);
        if (obj2 == null) {
            return InspirationSignalType.UNRECOGNIZED;
        }
        return obj2;
    }
}
