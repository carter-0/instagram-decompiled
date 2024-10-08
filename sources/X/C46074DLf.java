package X;

import com.instagram.api.schemas.ProfileBannerType;

/* renamed from: X.DLf  reason: case insensitive filesystem */
public final class C46074DLf extends 0Yg implements 0sP {
    public static final C46074DLf A00 = new C46074DLf();

    public C46074DLf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ProfileBannerType.A01.get(obj);
        if (obj2 == null) {
            return ProfileBannerType.UNRECOGNIZED;
        }
        return obj2;
    }
}
