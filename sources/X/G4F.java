package X;

import com.instagram.api.schemas.ClipsCameraSurface;

public final class G4F extends 0Yg implements 0sP {
    public static final G4F A00 = new G4F();

    public G4F() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ClipsCameraSurface.A01.get(obj);
        if (obj2 == null) {
            return ClipsCameraSurface.UNRECOGNIZED;
        }
        return obj2;
    }
}
