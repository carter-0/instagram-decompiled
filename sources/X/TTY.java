package X;

import android.content.Context;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

public final class TTY extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTY(Object obj, Object obj2, String str, String str2, String str3, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
        this.A05 = str2;
        this.A04 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        switch (this.A00) {
            case 0:
                0kR.A0F((Context) this.A01, DbT.A09(this.A03));
                UserSession userSession = (UserSession) this.A02;
                String str2 = this.A05;
                String str3 = this.A04;
                LinkedHashMap A0t = C51972G9s.A0t(userSession);
                A0t.put("opened_in", C273654mx.A00(2333));
                C9761RgJ.A00(userSession, C273654mx.A00(3169), userSession.A06, str2, str3, A0t);
                break;
            case 1:
                S3F s3f = (S3F) this.A02;
                ECPHandler eCPHandler = s3f.A00;
                Integer num = AnonymousClass05K.A0j;
                String str4 = this.A05;
                String str5 = this.A04;
                String str6 = this.A03;
                PaymentReceiverInfo paymentReceiverInfo = (PaymentReceiverInfo) this.A01;
                if (paymentReceiverInfo != null) {
                    str = paymentReceiverInfo.A02;
                } else {
                    str = null;
                }
                eCPHandler.CIS(new C10749RxT((OtcInput) null, str4, str5, str6, str), (LoggingContext) null, num);
                try {
                    C8134QhS qhS = s3f.A06.A00;
                    if (qhS != null) {
                        qhS.A0K(num);
                        break;
                    }
                } catch (Exception unused) {
                    break;
                }
                break;
            case 2:
                throw AnonymousClass7TE.A11("followUserId");
            default:
                ((0sG) this.A01).invoke(this.A02, this.A05, (Object) null, (Object) null, (Object) null, this.A03, this.A04);
                break;
        }
        return C60340gF.A00;
    }
}
