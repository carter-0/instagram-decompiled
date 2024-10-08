package X;

import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.Sva  reason: case insensitive filesystem */
public final class C12504Sva implements C13622Tdo {
    public final /* synthetic */ CheckoutHandler A00;
    public final /* synthetic */ C8286QnS A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C12504Sva(CheckoutHandler checkoutHandler, C8286QnS qnS, String str, String str2) {
        this.A01 = qnS;
        this.A00 = checkoutHandler;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void DYU() {
        int i = this.A01.A00;
        if (i == 2992005 || i == 4447002 || i == 4447012) {
            CheckoutHandler checkoutHandler = this.A00;
            C12402StT stT = checkoutHandler.A0S;
            Integer num = AnonymousClass05K.A0j;
            String str = this.A03;
            String str2 = this.A02;
            stT.CIS(new C10749RxT((OtcInput) null, str, str2, (String) null, (String) null), C11418SSt.A00(str, str2), num);
            S3F s3f = (S3F) checkoutHandler.A0Y.getValue();
            if (s3f != null) {
                try {
                    C8134QhS qhS = s3f.A06.A00;
                    if (qhS != null) {
                        qhS.A0K(num);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
