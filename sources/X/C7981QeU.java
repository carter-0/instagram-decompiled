package X;

import android.content.Context;
import com.facebookpay.expresscheckout.models.PriceInfo;

/* renamed from: X.QeU  reason: case insensitive filesystem */
public final class C7981QeU extends QEW {
    public static final String A07(QF2 qf2, C7981QeU qeU, PriceInfo priceInfo, Integer num, Integer num2) {
        Context context;
        int i;
        if ((num == AnonymousClass05K.A0C && C11431STx.A01() && priceInfo.A01 == RFW.SHIPPING) || (num2 == AnonymousClass05K.A01 && priceInfo.A01 == RFW.FULFILLMENT)) {
            context = qf2.A00.getContext();
            i = 2131961249;
        } else if (!qeU.A01 || priceInfo.A01 != RFW.DISCOUNT) {
            return priceInfo.A04;
        } else {
            context = qf2.A00.getContext();
            i = 2131961255;
        }
        String string = context.getString(i);
        0qQ.A0A(string);
        return string;
    }
}
