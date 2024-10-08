package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.LinkedHashMap;

/* renamed from: X.QnA  reason: case insensitive filesystem */
public final class C8268QnA extends QD7 {
    public 2Fk A00;
    public FBPayLoggerData A01;
    public FbPayPayPal A02;
    public final AnonymousClass2Fj A03 = JTO.A0K();
    public final 2FO A04;
    public final S2Q A05;

    public C8268QnA(2FO r2, S2Q s2q) {
        this.A05 = s2q;
        this.A04 = r2;
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A01 = Pxj.A0Y(bundle);
        Parcelable parcelable = bundle.getParcelable("paypal_credential");
        parcelable.getClass();
        this.A02 = (FbPayPayPal) parcelable;
        AnonymousClass2Fj r2 = this.A03;
        ImmutableList.Builder A0Y = Pxe.A0Y();
        Qml qml = new Qml(0);
        qml.A07 = 2131969220;
        qml.A0F = this.A02.A01;
        qml.A02 = R.drawable.payment_paypal_hub;
        A0Y.add(new Qmq(qml));
        Qmk qmk = new Qmk();
        qmk.A02 = 2131972015;
        qmk.A01 = R.attr.fbpay_error_text_color;
        qmk.A03 = C11496SbJ.A00(this, 60);
        SEE.A00(qmk);
        A0Y.add(new Qmt(qmk));
        r2.A0B(A0Y.build());
        LinkedHashMap A06 = C2818159r.A06(this.A01);
        Pxj.A1N(this.A02.A00, A06);
        this.A04.Cgl("fbpay_edit_paypal_display", A06);
    }
}
