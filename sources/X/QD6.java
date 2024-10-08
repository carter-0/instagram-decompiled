package X;

import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import java.util.Map;

public final class QD6 extends 2YL {
    public ECPHandler A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass2Fj A05 = JTO.A0K();
    public final AnonymousClass2Fj A06 = JTO.A0K();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(TUO.A00);

    public final void A00(LoggingContext loggingContext, Integer num) {
        String str;
        if (num == AnonymousClass05K.A00) {
            C51965G9l.A0g().A0U(loggingContext, "url_loading_screen", (Map) null);
        }
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            String str2 = this.A04;
            if (str2 == null) {
                str = "sessionId";
            } else {
                String str3 = this.A02;
                if (str3 == null) {
                    str = "productId";
                } else {
                    String str4 = this.A01;
                    if (str4 == null) {
                        str = "orderId";
                    } else {
                        String str5 = this.A03;
                        if (str5 == null) {
                            str = "receiverId";
                        } else {
                            eCPHandler.CIS(new C10749RxT((OtcInput) null, str2, str3, str4, str5), loggingContext, num);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }
}
