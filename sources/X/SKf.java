package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.Arrays;

public abstract class SKf {
    public static final int A00(ShippingAddress shippingAddress) {
        return Arrays.hashCode(new Object[]{shippingAddress.A05, shippingAddress.A00, shippingAddress.A08, shippingAddress.A09, shippingAddress.A01, shippingAddress.A07, shippingAddress.A02, Boolean.valueOf(shippingAddress.A0B), Boolean.valueOf(shippingAddress.A0A), shippingAddress.A06});
    }

    public static final String A01(ShippingAddress shippingAddress) {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        String str2 = shippingAddress.A01;
        if (str2 != null && C51966G9m.A1X(str2)) {
            StringFormatUtil.appendFormatStrLocaleSafe(A1A, "%s", new Object[]{DbT.A0z(" ", DbV.A18(str2, " "), TX0.A00)});
        }
        String str3 = shippingAddress.A07;
        if ((str3 != null && !00l.A0W(str3)) || ((str = shippingAddress.A06) != null && !00l.A0W(str))) {
            StringFormatUtil.appendFormatStrLocaleSafe(A1A, "%s", new Object[]{", "});
            if (str3 != null && C51966G9m.A1X(str3)) {
                StringFormatUtil.appendFormatStrLocaleSafe(A1A, "%s", new Object[]{002.A0C(str3, ' ')});
            }
            String str4 = shippingAddress.A06;
            if (str4 != null && C51966G9m.A1X(str4)) {
                StringFormatUtil.appendFormatStrLocaleSafe(A1A, "%s", new Object[]{str4});
            }
        }
        return DbT.A10(A1A);
    }

    public static final String A02(ShippingAddress shippingAddress) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        String str = shippingAddress.A08;
        if (str != null && C51966G9m.A1X(str)) {
            StringFormatUtil.appendFormatStrLocaleSafe(A1A, "%s", new Object[]{str});
        }
        String str2 = shippingAddress.A09;
        if (str2 != null && C51966G9m.A1X(str2)) {
            if (A1A.length() > 0) {
                StringFormatUtil.appendFormatStrLocaleSafe(A1A, "%s", new Object[]{", "});
            }
            StringFormatUtil.appendFormatStrLocaleSafe(A1A, "%s", new Object[]{str2});
        }
        return DbT.A10(A1A);
    }
}
