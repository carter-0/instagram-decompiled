package X;

import com.instagram.api.schemas.ThumbnailInteractionType;

/* renamed from: X.DNs  reason: case insensitive filesystem */
public final class C46139DNs extends 0Yg implements 0sP {
    public static final C46139DNs A00 = new C46139DNs();

    public C46139DNs() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ThumbnailInteractionType.A01.get(obj);
        if (obj2 == null) {
            return ThumbnailInteractionType.UNRECOGNIZED;
        }
        return obj2;
    }
}
