package X;

import com.instagram.api.schemas.ClipsCameraSurface;

public final class G40 extends 0Yg implements 0sP {
    public static final G40 A00 = new G40();

    public G40() {
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
