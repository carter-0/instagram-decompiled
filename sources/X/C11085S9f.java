package X;

import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import kotlin.Deprecated;

@Deprecated(message = "To be replaced with FulfillmentType")
/* renamed from: X.S9f  reason: case insensitive filesystem */
public abstract class C11085S9f {
    public static Integer A00(String str) {
        if (str.equals("SHIPPING")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals(OffsiteShippingType$Companion.DELIVERY)) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("PICKUP")) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return OffsiteShippingType$Companion.DELIVERY;
            case 2:
                return "PICKUP";
            default:
                return "SHIPPING";
        }
    }
}
