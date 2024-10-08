package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;

/* renamed from: X.Qn7  reason: case insensitive filesystem */
public final class C8265Qn7 extends QD7 {
    public FBPayLoggerData A00;
    public final 2Fk A01;
    public final 2FO A02;
    public final C10696Rwa A03;

    public C8265Qn7(2FO r3, C10696Rwa rwa) {
        this.A03 = rwa;
        this.A02 = r3;
        this.A01 = TPM.A00(rwa.A01, this, 13);
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A00 = Pxj.A0Y(bundle);
    }
}
