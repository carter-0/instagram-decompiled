package X;

import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentRequest;
import java.util.Locale;

/* renamed from: X.ReS  reason: case insensitive filesystem */
public abstract /* synthetic */ class C9648ReS {
    public static PaymentReceiverInfo A00(C13864Til til, PaymentRequest paymentRequest) {
        String str;
        PaymentConfiguration paymentConfiguration = paymentRequest.content.paymentConfiguration;
        0qQ.A0B(paymentConfiguration, 0);
        String str2 = paymentConfiguration.partnerId;
        if (str2.length() > 0) {
            String str3 = paymentConfiguration.partnerMerchantId;
            if (str3.length() > 0) {
                String str4 = null;
                PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo((String) null, paymentConfiguration.merchantName, (String) null, Pxe.A12(Locale.ROOT, "%s::%s", Pxf.A1X(str2, str3, 2)));
                PaymentReceiverInfo A00 = til.An6().A00();
                String str5 = null;
                if (A00 != null) {
                    str = A00.A02;
                } else {
                    str = null;
                }
                PaymentReceiverInfo A002 = til.An6().A00();
                if (A002 != null) {
                    str4 = A002.A03;
                }
                PaymentReceiverInfo A003 = til.An6().A00();
                if (A003 != null) {
                    str5 = A003.A01;
                }
                PaymentReceiverInfo paymentReceiverInfo2 = new PaymentReceiverInfo(str, str4, str5, paymentReceiverInfo.A00);
                String str6 = paymentReceiverInfo2.A02;
                if (str6 == null || str6.length() == 0) {
                    return paymentReceiverInfo;
                }
                return paymentReceiverInfo2;
            }
        }
        return til.An6().A00();
    }
}
