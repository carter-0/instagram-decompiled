package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;

/* renamed from: X.FEc  reason: case insensitive filesystem */
public final class C49904FEc {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2.isEmpty() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo A00(com.instagram.api.schemas.UserMonetizationProductType r6, com.instagram.monetization.onboarding.repository.OnboardingRepository r7) {
        /*
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.util.List r2 = r7.A06(r6)
            if (r2 == 0) goto L_0x0011
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r4 = 0
            if (r0 == 0) goto L_0x0019
            r7.A07(r6, r5)
            return r4
        L_0x0019:
            java.util.Iterator r3 = r2.iterator()
        L_0x001d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r2 = r3.next()
            com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo r2 = (com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "incomplete"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            return r2
        L_0x0034:
            r7.A07(r6, r5)
            java.util.HashMap r0 = r7.A00
            java.lang.Object r0 = r0.get(r6)
            X.Drz r0 = (X.C47184Drz) r0
            if (r0 == 0) goto L_0x0043
            r0.A01 = r4
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49904FEc.A00(com.instagram.api.schemas.UserMonetizationProductType, com.instagram.monetization.onboarding.repository.OnboardingRepository):com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo");
    }

    public final void A02(Fragment fragment, FragmentActivity fragmentActivity, UserMonetizationProductType userMonetizationProductType, UserSession userSession, OnboardingRepository onboardingRepository, String str, String str2, String str3, String str4, String str5, String str6) {
        Fragment A00;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        UserMonetizationProductType userMonetizationProductType2 = userMonetizationProductType;
        OnboardingRepository onboardingRepository2 = onboardingRepository;
        String str7 = str;
        AnonymousClass7TG.A0w(2, str7, onboardingRepository2, userMonetizationProductType2);
        String str8 = str2;
        0qQ.A0B(str8, 5);
        0qQ.A0B(str3, 6);
        ProductOnboardingNextStepInfo A002 = A00(userMonetizationProductType2, onboardingRepository2);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (A002 == null || !0qQ.A0K(A002.A02, "payouts_onboarding")) {
            int ordinal = userMonetizationProductType2.ordinal();
            String str9 = str4;
            if (ordinal != 10) {
                if (ordinal != 13) {
                    if (ordinal == 2) {
                        A00 = C46474Dfc.A00(userSession2, C46447Df9.A02(), C46548Dgp.A00(userSession2, "user_pay_incentives_onboarding", str7));
                    } else if (ordinal != 15) {
                        if (ordinal == 11) {
                            A00 = F9Y.A00().A03(userSession2, str8, str9, (String) null);
                        } else {
                            throw DbW.A0c("GetOnboardingStepsOrSettingsFragment: Unsupported monetization product type: ", userMonetizationProductType2.name());
                        }
                    } else if (A002 == null) {
                        A00 = C49195Er0.A00().A00().A00(str8, str9);
                    } else {
                        throw AnonymousClass7TE.A0z("GetOnboardingStepsOrSettingsFragment: onboarding for user_pay migrated to Bloks. Native onboarding is not supported.");
                    }
                } else if (A002 == null) {
                    A00 = FCL.A00().A00(IGRevShareProductType.REELS_OVERLAY_ADS, str8, str9);
                } else {
                    A00 = C49053EoX.A00(IGRevShareProductType.REELS_OVERLAY_ADS, A002);
                }
            } else if (A002 == null) {
                A00 = FCL.A00().A00(IGRevShareProductType.PROFILE_ADS, str8, str9);
            } else {
                A00 = C49053EoX.A00(IGRevShareProductType.PROFILE_ADS, A002);
            }
            C309516Yo A0Q = DbU.A0Q(fragmentActivity2, userSession2);
            A0Q.A0B((Bundle) null, A00);
            A0Q.A0A = str6;
            A0Q.A04();
            return;
        }
        F6T.A01(fragment, fragmentActivity2, userMonetizationProductType2, userSession2, str7, str8, (String) null, (String) null, str5);
    }

    public static final C47480E4f A01(UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str, String str2, String str3) {
        switch (userMonetizationProductType.ordinal()) {
            case 2:
            case 15:
                return C49195Er0.A00().A00().A00(str, str2);
            case 9:
                return FC8.A00().A02(str);
            case 10:
                return FCL.A00().A00(IGRevShareProductType.PROFILE_ADS, str, str2);
            case 11:
                return F9Y.A00().A03(userSession, str, str2, str3);
            case 13:
                return FCL.A00().A00(IGRevShareProductType.REELS_OVERLAY_ADS, str, str2);
            default:
                throw DbW.A0c("GetSettingsFragmentByProductType: Invalid product type for settings: ", userMonetizationProductType.name());
        }
    }
}
