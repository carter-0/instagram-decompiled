package X;

import com.facebookpay.logging.LoggingContext;

public final class TWM extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWM(LoggingContext loggingContext, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A02 = loggingContext;
        this.A01 = j;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            0Ak r4 = (0Ak) obj;
            0bb r2 = new 0bb();
            C51971G9r.A1B(r2, (LoggingContext) this.A02);
            r2.A05("paypal_billing_agreement_id", Long.valueOf(this.A01));
            Pxg.A1J(r4, r2, this.A03);
            return r4;
        }
        0Ak r42 = (0Ak) obj;
        0bb r22 = new 0bb();
        C51971G9r.A1B(r22, (LoggingContext) this.A02);
        r22.A05("paypal_billing_agreement_id", Long.valueOf(this.A01));
        Pxe.A1T(r22, this.A03);
        r42.A0N(r22, "event_payload");
        return r42;
    }
}
