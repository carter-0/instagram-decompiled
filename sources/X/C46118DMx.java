package X;

import com.instagram.api.schemas.TIFUAppDestinationEnum;

/* renamed from: X.DMx  reason: case insensitive filesystem */
public final class C46118DMx extends 0Yg implements 0sP {
    public static final C46118DMx A00 = new C46118DMx();

    public C46118DMx() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = TIFUAppDestinationEnum.A01.get(obj);
        if (obj2 == null) {
            return TIFUAppDestinationEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
