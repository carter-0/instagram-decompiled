package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* renamed from: X.DiN  reason: case insensitive filesystem */
public abstract class C46642DiN {
    public static Integer A00(String str) {
        if (str.equals("ForceDarkMode")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("ForceLightMode")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals(ServerW3CShippingAddressConstants.DEFAULT)) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ForceLightMode";
            case 2:
                return ServerW3CShippingAddressConstants.DEFAULT;
            default:
                return "ForceDarkMode";
        }
    }
}
