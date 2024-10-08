package X;

import com.instagram.api.schemas.MusicProduct;

/* renamed from: X.AzQ  reason: case insensitive filesystem */
public final class C41735AzQ extends 0Yg implements 0sP {
    public static final C41735AzQ A00 = new C41735AzQ();

    public C41735AzQ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MusicProduct.A01.get(obj);
        if (obj2 == null) {
            return MusicProduct.UNRECOGNIZED;
        }
        return obj2;
    }
}
