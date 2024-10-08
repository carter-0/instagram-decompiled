package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Qn9  reason: case insensitive filesystem */
public final class C8267Qn9 extends QD7 {
    public FBPayLoggerData A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final 2FO A03;
    public final UserSession A04;

    public C8267Qn9(2FO r4, C10445RsM rsM, UserSession userSession) {
        this.A03 = r4;
        C7422QCn A002 = C8282QnO.A00(new Sd0((Object) rsM, 8), rsM.A00);
        this.A01 = TPM.A00(A002, this, 15);
        C11652Sdu.A03(A002, this.A03, this, 58);
        this.A02 = TPM.A00(A002, this, 16);
        this.A04 = userSession;
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A00 = Pxj.A0Y(bundle);
    }
}
