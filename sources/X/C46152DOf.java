package X;

import com.instagram.api.schemas.TextReviewStatus;

/* renamed from: X.DOf  reason: case insensitive filesystem */
public final class C46152DOf extends 0Yg implements 0sP {
    public static final C46152DOf A00 = new C46152DOf();

    public C46152DOf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = TextReviewStatus.A01.get(obj);
        if (obj2 == null) {
            return TextReviewStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
