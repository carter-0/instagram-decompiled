package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;

/* renamed from: X.TGm  reason: case insensitive filesystem */
public final class C12979TGm implements Runnable {
    public final /* synthetic */ C12435SuM A00;
    public final /* synthetic */ PaymentRequest A01;

    public C12979TGm(C12435SuM suM, PaymentRequest paymentRequest) {
        this.A00 = suM;
        this.A01 = paymentRequest;
    }

    public final void run() {
        String A05;
        C12435SuM suM = this.A00;
        C8124QhG qhG = (C8124QhG) suM;
        QLA C8U = qhG.A02.C8U();
        if (C8U == null || (A05 = C8U.A05()) == null) {
            0KC.A0C("OffsiteMessageHandler", "Security Origin is empty for Payment Request event");
            return;
        }
        PaymentRequest paymentRequest = this.A01;
        AnonymousClass0eM r3 = suM.A07;
        AnonymousClass2Fj A09 = ((CheckoutHandler) r3.getValue()).A09(paymentRequest, A05, SUR.A05(qhG.A05), 0sn.A00);
        FragmentActivity fragmentActivity = suM.A02;
        A09.A06(fragmentActivity, suM.A04);
        ((CheckoutHandler) r3.getValue()).A0N.A06(fragmentActivity, suM.A03);
    }
}
