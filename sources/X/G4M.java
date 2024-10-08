package X;

import com.instagram.api.schemas.TextAppOnlineStatusVisibilitySetting;

public final class G4M extends 0Yg implements 0sP {
    public static final G4M A00 = new G4M();

    public G4M() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = TextAppOnlineStatusVisibilitySetting.A01.get(obj);
        if (obj2 == null) {
            return TextAppOnlineStatusVisibilitySetting.UNRECOGNIZED;
        }
        return obj2;
    }
}
