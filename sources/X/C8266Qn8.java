package X;

import android.os.Bundle;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;

/* renamed from: X.Qn8  reason: case insensitive filesystem */
public final class C8266Qn8 extends QD7 {
    public AddressFormFieldsConfig A00;
    public FBPayLoggerData A01;
    public final 2Fk A02;
    public final 2FO A03;
    public final C10588Rui A04;

    public C8266Qn8(2FO r4, C10588Rui rui) {
        this.A04 = rui;
        this.A03 = r4;
        AnonymousClass2gB r2 = rui.A00;
        this.A02 = TPM.A00(r2, this, 11);
        C11652Sdu.A03(r2, this.A03, this, 41);
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A01 = Pxj.A0Y(bundle);
    }
}
