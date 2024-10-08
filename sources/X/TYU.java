package X;

import com.facebookpay.paymentmethod.model.PaymentMethod;

public final class TYU extends 0Yg implements 0sL {
    public static final TYU A00 = new TYU();

    public TYU() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        SUj sUj = (SUj) obj;
        SUj sUj2 = (SUj) obj2;
        AnonymousClass7TG.A1N(sUj, sUj2);
        PaymentMethod paymentMethod = (PaymentMethod) sUj.A01;
        String str2 = null;
        if (paymentMethod != null) {
            str = paymentMethod.Asm();
        } else {
            str = null;
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) sUj2.A01;
        if (paymentMethod2 != null) {
            str2 = paymentMethod2.Asm();
        }
        return Pxi.A0R(str, str2);
    }
}
