package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.TransactionInfo;

public final class TX7 extends 0Yg implements 0sP {
    public static final TX7 A00 = new TX7();

    public TX7() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        TransactionInfo transactionInfo = (TransactionInfo) Pxf.A0P(obj).A01;
        if (transactionInfo != null) {
            return C11432SUd.A03(transactionInfo);
        }
        return new CurrencyAmount("", "");
    }
}
