package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.Suu  reason: case insensitive filesystem */
public final class C12462Suu implements C13608Tda {
    public final SIS A00;

    public final AnonymousClass2gB EwZ(Bundle bundle, C13734Tg6 tg6, C11330SNj sNj) {
        SIS sis = this.A00;
        String string = bundle.getString("PAYMENT_TYPE");
        SSZ A01 = SOC.A01();
        Object obj = new Object();
        Set singleton = Collections.singleton(sNj);
        C11214SFo A002 = C11214SFo.A0A.A00(A01, obj, "DISABLE_FBPAY_PIN", S9s.A01(bundle), singleton);
        return TPM.A00(SQA.A00(new C45906DEl(sis, A002, string, 6), sis, sis.A01, A002), this, 6);
    }

    public C12462Suu(SIS sis) {
        this.A00 = sis;
    }
}
