package X;

import com.instagram.api.schemas.UnlockableStickerStatus;

/* renamed from: X.DMt  reason: case insensitive filesystem */
public final class C46114DMt extends 0Yg implements 0sP {
    public static final C46114DMt A00 = new C46114DMt();

    public C46114DMt() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = UnlockableStickerStatus.A01.get(obj);
        if (obj2 == null) {
            return UnlockableStickerStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
