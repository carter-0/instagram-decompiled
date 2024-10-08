package X;

import com.instagram.api.schemas.GuideTypeStr;

/* renamed from: X.DNl  reason: case insensitive filesystem */
public final class C46132DNl extends 0Yg implements 0sP {
    public static final C46132DNl A00 = new C46132DNl();

    public C46132DNl() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = GuideTypeStr.A01.get(obj);
        if (obj2 == null) {
            return GuideTypeStr.UNRECOGNIZED;
        }
        return obj2;
    }
}
