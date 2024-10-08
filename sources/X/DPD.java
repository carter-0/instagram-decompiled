package X;

import com.instagram.api.schemas.MerchantCheckoutStyle;

public final class DPD extends 0Yg implements 0sP {
    public static final DPD A00 = new DPD();

    public DPD() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MerchantCheckoutStyle.A01.get(obj);
        if (obj2 == null) {
            return MerchantCheckoutStyle.UNRECOGNIZED;
        }
        return obj2;
    }
}
