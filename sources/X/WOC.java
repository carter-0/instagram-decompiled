package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class WOC implements X3J {
    public final /* synthetic */ C15328Uac A00;
    public final /* synthetic */ C19176WOi A01;

    public WOC(C15328Uac uac, C19176WOi wOi) {
        this.A00 = uac;
        this.A01 = wOi;
    }

    public final void onComplete() {
        C15328Uac uac = this.A00;
        FragmentActivity requireActivity = uac.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(uac.A0f);
        String str = this.A01.A0B;
        if (str != null) {
            C18662VwK vwK = uac.A07;
            if (vwK == null) {
                0qQ.A0F("adsManagerLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            String A002 = vwK.A00();
            Bundle A0B = DbV.A0B(A0l, 1);
            A0B.putString("paymentAccountID", str);
            A0B.putString("placement", "ig_boost");
            T8B A0T = C13991Tnr.A0T(A0B, A0l, "wizardName", "PAY_NOW", A002);
            A0T.A07 = requireActivity.getString(2131970538);
            A0T.A00(A0B);
            A0T.A01("BillingWizardIGRoute");
            A0T.F08(requireActivity).A04();
            return;
        }
        throw new IllegalStateException("ad account ID should not be null, if payment_anomaly is not null");
    }
}
