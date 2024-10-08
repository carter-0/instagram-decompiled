package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.model.business.Address;
import java.io.StringWriter;

/* renamed from: X.EnS  reason: case insensitive filesystem */
public abstract class C48990EnS {
    public static String A00(Address address) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        String str = address.A04;
        if (str != null) {
            A0K.A0R("address_street", str);
        }
        String str2 = address.A00;
        if (str2 != null) {
            A0K.A0R("city_id", str2);
        }
        String str3 = address.A02;
        if (str3 != null) {
            A0K.A0R(ServerW3CShippingAddressConstants.POSTAL_CODE, str3);
        }
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}
