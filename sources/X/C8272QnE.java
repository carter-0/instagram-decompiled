package X;

import android.os.Bundle;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormParams;

/* renamed from: X.QnE  reason: case insensitive filesystem */
public final class C8272QnE extends QD7 {
    public FBPayLoggerData A00;
    public C10696Rwa A01;
    public final 2Fk A02;
    public final 2FO A03;

    public C8272QnE(2FO r4, C10696Rwa rwa) {
        this.A01 = rwa;
        this.A03 = r4;
        AnonymousClass2gB r2 = rwa.A00;
        this.A02 = TPM.A00(r2, this, 12);
        C11652Sdu.A03(r2, this.A03, this, 44);
    }

    public static void A00(C8272QnE qnE, FormParams formParams) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("form_params", formParams);
        SR4.A01(qnE.A06, new SFA("form", A0a));
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A00 = Pxj.A0Y(bundle);
    }

    public final void A05(String str) {
        SOR sor = new SOR(5, 2131962806, (String) null, 0);
        C8029QfJ qfJ = new C8029QfJ(2);
        qfJ.A0B = str;
        qfJ.A03 = 2131962806;
        qfJ.A0G.add(new TextValidatorParams(AnonymousClass05K.A0Y, "", 2131962805, 0));
        sor.A09.add(qfJ.A01());
        A00(this, sor.A01());
    }
}
