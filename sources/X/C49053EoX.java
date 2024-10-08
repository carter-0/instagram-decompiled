package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;

/* renamed from: X.EoX  reason: case insensitive filesystem */
public abstract class C49053EoX {
    public static final Fragment A00(IGRevShareProductType iGRevShareProductType, ProductOnboardingNextStepInfo productOnboardingNextStepInfo) {
        Fragment fragment;
        String str;
        String str2 = productOnboardingNextStepInfo.A02;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1555696638:
                    str = "account_review_pending";
                    break;
                case -1008182312:
                    if (str2.equals("terms_and_conditions")) {
                        FCL.A01().A00();
                        return new E4U();
                    }
                    break;
                case 686746125:
                    if (str2.equals("payouts_onboarding")) {
                        throw AnonymousClass7TE.A0z("Cannot get fragment for payout onboarding. Must use PayoutOnboardingFlowActivity instead.");
                    }
                    break;
                case 1479758269:
                    str = "welcome_to_program";
                    break;
                case 2035013598:
                    if (str2.equals("igtv_account_level_monetization_toggle")) {
                        FCL.A01().A00();
                        E4N e4n = new E4N();
                        DbZ.A1B(e4n, "ARGUMENT_PRODUCT_TYPE", iGRevShareProductType);
                        return e4n;
                    }
                    break;
            }
            if (str2.equals(str)) {
                FCL.A01().A00();
                fragment = new E4S();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putParcelable("ARGUMENT_PRODUCT_TYPE", iGRevShareProductType);
                fragment.setArguments(A0a);
                return fragment;
            }
        }
        FCL.A01().A00();
        fragment = new C47920EMx();
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putParcelable("ARGUMENT_PRODUCT_TYPE", iGRevShareProductType);
        fragment.setArguments(A0a2);
        return fragment;
    }
}
