package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public abstract class WGT implements CallerContextable {
    public static final String __redex_internal_original_name = "PromoteReactBridgingUtil";

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        Bundle A0B = DbV.A0B(userSession, 1);
        A0B.putString("entryPoint", "instagram");
        T8B A0T = C13991Tnr.A0T(A0B, userSession, "paymentAccountID", str, str2);
        A0T.A07 = fragmentActivity.getString(2131970538);
        A0T.A00(A0B);
        A0T.A01("AdsPaymentsPayNowRoute");
        A0T.F08(fragmentActivity).A04();
    }

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("entryPoint", "instagram");
        T8B A0T = C13991Tnr.A0T(bundle, userSession, "paymentAccountID", str, str2);
        A0T.A07 = fragmentActivity.getString(2131970259);
        A0T.A00(bundle);
        A0T.A01("BillingASLDisplayIGRoute");
        A0T.F08(fragmentActivity).A04();
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        Bundle bundle = new Bundle();
        bundle.putString("paymentAccountID", str);
        bundle.putString("placement", str5);
        bundle.putString("wizardName", str2);
        bundle.putString("paymentMethodID", "");
        bundle.putString("externalFlowID", str4);
        bundle.putString("accessToken", str6);
        if (str3 != null && str2.equals("ADD_FUNDS")) {
            bundle.putString("jsonProps", str3);
        }
        1WM.getInstance();
        T8B A00 = new T8B(userSession).A00(bundle);
        A00.A01("BillingWizardIGRoute");
        C309516Yo F08 = A00.F08(fragmentActivity);
        if (z) {
            F08.A0D = false;
        }
        F08.A04();
    }
}
