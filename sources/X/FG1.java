package X;

import androidx.fragment.app.Fragment;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

public abstract class FG1 {
    public static BusinessFlowAnalyticsLogger A00(G8D g8d, AnonymousClass0iw r3, 0lg r4) {
        C319586qr B6a;
        String str;
        if (g8d == null) {
            B6a = C319586qr.EDIT_PROFILE;
            str = null;
        } else {
            B6a = g8d.B6a();
            str = (String) AnonymousClass7TE.A14(((BusinessConversionActivity) g8d).A0C);
        }
        return C319596qs.A00(B6a, r3, r4, str);
    }

    public static boolean A02(G8D g8d) {
        if ((g8d == null || (g8d.B6a() != C319586qr.INTEREST_ACCOUNT_CONVERSION && g8d.B6a() != C319586qr.RENEW_PROFESSIONAL_ACCOUNT && g8d.B6a() != C319586qr.CONVERSION_FLOW)) && !A03(g8d)) {
            return false;
        }
        return true;
    }

    public static boolean A03(G8D g8d) {
        if (g8d == null || g8d.B6a() != C319586qr.CREATOR_CONVERSION_FLOW) {
            return false;
        }
        return true;
    }

    public static boolean A04(G8D g8d) {
        if (g8d == null) {
            return false;
        }
        if (g8d.B6a() == C319586qr.PROFESSIONAL_SIGNUP_FLOW || g8d.B6a() == C319586qr.BUSINESS_SIGNUP_FLOW || g8d.B6a() == C319586qr.CREATOR_SIGNUP_FLOW) {
            return true;
        }
        return false;
    }

    public static G8D A01(Fragment fragment) {
        G8D activity = fragment.getActivity();
        if (activity instanceof G8D) {
            return activity;
        }
        return null;
    }
}
