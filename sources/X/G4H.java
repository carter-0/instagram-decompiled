package X;

import com.instagram.api.schemas.PrimaryProfileLinkType;

public final class G4H extends 0Yg implements 0sP {
    public static final G4H A00 = new G4H();

    public G4H() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = PrimaryProfileLinkType.A01.get(obj);
        if (obj2 == null) {
            return PrimaryProfileLinkType.UNRECOGNIZED;
        }
        return obj2;
    }
}
