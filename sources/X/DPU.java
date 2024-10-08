package X;

import com.instagram.api.schemas.MerchantCheckoutStyle;

public final class DPU extends 0Yg implements 0sP {
    public static final DPU A00 = new DPU();

    public DPU() {
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
