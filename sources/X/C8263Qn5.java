package X;

import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

/* renamed from: X.Qn5  reason: case insensitive filesystem */
public final class C8263Qn5 extends QD7 {
    public FBPayLoggerData A00;
    public final AnonymousClass2Fj A01 = JTO.A0K();

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        if (bundle == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (bundle.getSerializable("payout_methods") != null) {
            ImmutableCollection immutableCollection = (ImmutableCollection) bundle.getSerializable("payout_methods");
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) bundle.getParcelable("logger_data");
            if (fBPayLoggerData != null) {
                this.A00 = fBPayLoggerData;
                AnonymousClass2Fj r6 = this.A01;
                ImmutableList.Builder A0Y = Pxe.A0Y();
                0qQ.A0A(immutableCollection);
                if (!immutableCollection.isEmpty()) {
                    Qmj qmj = new Qmj();
                    qmj.A02 = 2131969257;
                    Qms.A00(qmj, A0Y);
                    C249803kO A0J = C66580MXl.A0J(immutableCollection);
                    while (A0J.hasNext()) {
                        FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) A0J.next();
                        Qml qml = new Qml(0);
                        String str = fbPayPaymentMethod.A06;
                        qml.A0G = StringFormatUtil.formatStrLocaleSafe("%s • %s", str, fbPayPaymentMethod.A07);
                        qml.A0F = str;
                        qml.A02 = R.drawable.bank_icon_border;
                        qml.A01 = R.drawable.payment_bank_on_file_hub;
                        qml.A08 = C11499SbM.A00(fbPayPaymentMethod, this, 49);
                        SEE.A00(qml);
                        A0Y.add(new Qmq(qml));
                    }
                }
                r6.A0B(DbZ.A0K(A0Y));
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
