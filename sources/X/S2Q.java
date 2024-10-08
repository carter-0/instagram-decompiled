package X;

import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.Set;

public final class S2Q {
    public AnonymousClass5A3 A00;
    public IGPaymentMethodsAPI A01;
    public 2Fk A02;
    public final AnonymousClass2gB A03 = Pxh.A0M();

    public final void A00(Set set) {
        2Fk r1 = this.A02;
        if (r1 != null) {
            this.A03.A0D(r1);
        }
        C7422QCn A012 = C8282QnO.A01(new C11542Sc3(10, this, set), this.A00);
        this.A02 = A012;
        C11652Sdu.A03(A012, this.A03, this, 60);
    }

    public S2Q(AnonymousClass5A3 r2, IGPaymentMethodsAPI iGPaymentMethodsAPI) {
        this.A01 = iGPaymentMethodsAPI;
        this.A00 = r2;
    }
}
