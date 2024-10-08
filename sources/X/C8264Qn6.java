package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;

/* renamed from: X.Qn6  reason: case insensitive filesystem */
public final class C8264Qn6 extends QD7 {
    public FBPayLoggerData A00;
    public final 2Fk A01;
    public final 2FO A02;

    public C8264Qn6(2FO r4, C10446RsN rsN) {
        this.A02 = r4;
        C7422QCn A002 = C8282QnO.A00(new C45896DEb(rsN, 2), rsN.A00);
        this.A01 = TPM.A00(A002, this, 17);
        C11652Sdu.A03(A002, this.A03, this, 59);
    }

    public final void A04(Bundle bundle) {
        this.A00 = Pxj.A0Y(bundle);
    }
}
