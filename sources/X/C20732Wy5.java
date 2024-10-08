package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;

/* renamed from: X.Wy5  reason: case insensitive filesystem */
public final class C20732Wy5 extends 0Yg implements 0sP {
    public static final C20732Wy5 A00 = new C20732Wy5();

    public C20732Wy5() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ProfileGridItemTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return ProfileGridItemTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
