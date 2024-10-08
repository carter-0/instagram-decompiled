package X;

import com.instagram.api.schemas.SoundPlatformProduct;

public final class J01 extends 0Yg implements 0sP {
    public static final J01 A00 = new J01();

    public J01() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = SoundPlatformProduct.A01.get(obj);
        if (obj2 == null) {
            return SoundPlatformProduct.UNRECOGNIZED;
        }
        return obj2;
    }
}
