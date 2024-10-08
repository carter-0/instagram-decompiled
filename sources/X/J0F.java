package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;

public final class J0F extends 0Yg implements 0sP {
    public static final J0F A00 = new J0F();

    public J0F() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ClipsCameraCommandAction.A01.get(obj);
        if (obj2 == null) {
            return ClipsCameraCommandAction.UNRECOGNIZED;
        }
        return obj2;
    }
}
