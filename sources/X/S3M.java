package X;

import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;

public final class S3M {
    public C2818759x A00;
    public final C2818759x A01 = new C12506Svc(C9627Re7.A00((S4g) null), TY2.A00(TXU.A00, 49));
    public final C2818759x A02;
    public final C8293QnZ A03;
    public final C13884Tj7 A04;
    public final C10302Rq0 A05;
    public final IGPaymentMethodsAPI A06;
    public final AnonymousClass5A7 A07;
    public final IGPaymentMethodsAPI A08;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.R9l, X.11X] */
    public final C8293QnZ A00(String str, String str2) {
        synchronized (this) {
            C2818759x r1 = this.A00;
            if (r1 != null) {
                r1.AOY(this.A07);
            }
            IGPaymentMethodsAPI iGPaymentMethodsAPI = this.A06;
            1ES.A03(new C8784R9l((S4g) null, iGPaymentMethodsAPI, str, str2, JTP.A0y(REG.CREDIT_CARD)));
            C2818659w r2 = iGPaymentMethodsAPI.A01;
            0qQ.A07(r2);
            C12506Svc svc = new C12506Svc(r2, TY2.A00(TXV.A00, 49));
            this.A00 = svc;
            svc.A9U(this.A07);
        }
        return this.A03;
    }

    public S3M(C13884Tj7 tj7, C45439CwM cwM, C10302Rq0 rq0, IGPaymentMethodsAPI iGPaymentMethodsAPI) {
        this.A05 = rq0;
        this.A06 = iGPaymentMethodsAPI;
        this.A04 = tj7;
        this.A02 = new C12506Svc(cwM.A00((S4g) null), TY2.A00(new C66308MMr(this, 6), 49));
        this.A08 = iGPaymentMethodsAPI;
        this.A07 = new C12509Svf(this, 4);
        this.A03 = new C8293QnZ();
    }
}
