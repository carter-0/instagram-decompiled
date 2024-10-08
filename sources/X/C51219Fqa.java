package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.Fqa  reason: case insensitive filesystem */
public final class C51219Fqa implements Runnable {
    public final /* synthetic */ E5C A00;

    public C51219Fqa(E5C e5c) {
        this.A00 = e5c;
    }

    public final void run() {
        E5C e5c = this.A00;
        e5c.requireArguments().putBoolean("push_to_next", false);
        FragmentActivity requireActivity = e5c.requireActivity();
        String str = E5C.__redex_internal_original_name;
        C309516Yo A0J = DbY.A0J(requireActivity, e5c.A02);
        C47448E2u e2u = new C47448E2u();
        String string = e5c.mArguments.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
        String string2 = e5c.mArguments.getString("COUNTRY_CODE");
        String string3 = e5c.mArguments.getString("NATIONAL_NUMBER");
        Bundle bundle = e5c.mArguments;
        Dbc.A0L(bundle, string2, string3, string, false);
        C48975EnD.A00(bundle, EVZ.ARGUMENT_TWOFAC_FLOW);
        bundle.putBoolean("HAS_SMS_CONSENT", false);
        A0J.A0B(bundle, e2u);
        A0J.A0F(e5c, 0);
        A0J.A04();
    }
}
