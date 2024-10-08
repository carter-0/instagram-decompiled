package X;

import com.instagram.api.schemas.XFBYPRequestStatus;

public final class G37 extends 0Yg implements 0sP {
    public static final G37 A00 = new G37();

    public G37() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = XFBYPRequestStatus.A01.get(obj);
        if (obj2 == null) {
            return XFBYPRequestStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
