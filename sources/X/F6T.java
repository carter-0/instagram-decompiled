package X;

import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.payout.activity.PayoutOnboardingFlowActivity;

public abstract class F6T {
    public static final void A00(TextView textView, FragmentActivity fragmentActivity, UserSession userSession, 2EG r10, String str, String str2, String str3, String str4, C62320sa r15) {
        0qQ.A0B(fragmentActivity, 0);
        AnonymousClass7TG.A1U(userSession, str, textView);
        AnonymousClass7AV.A07(new C46700DjT(fragmentActivity, userSession, r10, str4, str, r15), textView, str3, str2);
    }

    public static final void A01(Fragment fragment, FragmentActivity fragmentActivity, UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = str;
        AnonymousClass7TG.A1Q(userSession, str);
        C50332FYn A00 = FCG.A00(userSession);
        String A01 = FCG.A01(userMonetizationProductType);
        String A02 = FCG.A02(userMonetizationProductType);
        String str8 = null;
        if (str2 != null) {
            str6 = AnonymousClass7TF.A0k(str2);
        } else {
            str6 = null;
        }
        A00.A02(A01, A02, "start", "payouts_onboarding", str7, str6, (String) null);
        if (C64941Yv.A00 == null) {
            0qQ.A0F("plugin");
            throw AnonymousClass00P.createAndThrow();
        }
        Intent intent = new Intent(fragmentActivity, PayoutOnboardingFlowActivity.class);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A06);
        intent.putExtra("ARGUMENT_PRODUCT_TYPE", userMonetizationProductType.A00);
        if (str2 != null) {
            str8 = AnonymousClass7TF.A0j(str2);
        }
        intent.putExtra("ARGUMENT_ORIGIN", str8);
        intent.putExtra("ARGUMENT_DEAL_ID", str3);
        intent.putExtra("ARGUMENT_FE_ID", str4);
        intent.putExtra(Dbj.A02(), str5);
        intent.addFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
        if (fragment != null) {
            0kR.A05(fragment, intent, 8888);
        } else {
            0kR.A07(fragmentActivity, intent, 8888);
        }
        fragmentActivity.overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}
