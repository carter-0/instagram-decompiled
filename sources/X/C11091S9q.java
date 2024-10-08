package X;

import android.content.Context;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.List;

/* renamed from: X.S9q  reason: case insensitive filesystem */
public abstract class C11091S9q {
    public static final StS A00(ShippingAddress shippingAddress) {
        String A12;
        String str = shippingAddress.A00;
        if (!(str == null || (A12 = DbV.A12(str)) == null || 00l.A0W(A12))) {
            List A0Q = 00l.A0Q(A12, new char[]{' '}, 0);
            if (AnonymousClass7TE.A1b(A0Q)) {
                A0Q.get(0);
            }
            if (A0Q.size() > 1) {
                A0Q.get(1);
            }
        }
        return new StS(shippingAddress.A08, shippingAddress.A09, shippingAddress.A01, shippingAddress.A07, shippingAddress.A02, shippingAddress.A06);
    }

    public static final String A01(Context context, C8935RGd rGd) {
        int i;
        0qQ.A0B(context, 1);
        int ordinal = rGd.ordinal();
        if (ordinal == 1) {
            i = 2131961271;
        } else if (ordinal != 2) {
            return "";
        } else {
            i = 2131961274;
        }
        return AnonymousClass7TE.A16(context, i);
    }
}
