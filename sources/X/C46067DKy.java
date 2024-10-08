package X;

import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;

/* renamed from: X.DKy  reason: case insensitive filesystem */
public final class C46067DKy extends 0Yg implements 0sP {
    public static final C46067DKy A00 = new C46067DKy();

    public C46067DKy() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGClickToMessagingCardTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGClickToMessagingCardTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
