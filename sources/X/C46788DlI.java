package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.DlI  reason: case insensitive filesystem */
public final class C46788DlI extends 2YL {
    public UserMonetizationProductType A00;
    public FAE A01;
    public final AnonymousClass2Fj A02;
    public final 1a8 A03 = 1a8.A00();
    public final UserSession A04;
    public final OnboardingRepository A05;
    public final MonetizationRepository A06;
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;

    public final void A06(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        int i;
        IGRevShareProductType iGRevShareProductType;
        Fragment A002;
        UserSession userSession2 = userSession;
        String str3 = str;
        int A032 = DbW.A03(1, userSession2, str3);
        OnboardingRepository onboardingRepository = this.A05;
        MonetizationRepository monetizationRepository = this.A06;
        UserMonetizationProductType A022 = A02();
        String A042 = A04();
        String A033 = A03();
        0qQ.A0B(onboardingRepository, 2);
        DbW.A1N(monetizationRepository, A032, A042);
        List A062 = onboardingRepository.A06(A022);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String str4 = str2;
        if (A062 == null || A062.isEmpty()) {
            monetizationRepository.A03(A022, true);
            onboardingRepository.A07(A022, 0);
            C47184Drz drz = (C47184Drz) onboardingRepository.A00.get(A022);
            if (drz != null) {
                drz.A01 = null;
            }
            C309516Yo A0P = DbU.A0P((Bundle) null, C49904FEc.A01(A022, userSession2, A042, A033, (String) null), fragmentActivity2, userSession2);
            A0P.A09();
            A0P.A0A = str4;
            A0P.A04();
            return;
        }
        HashMap hashMap = onboardingRepository.A00;
        C47184Drz drz2 = (C47184Drz) hashMap.get(A022);
        if (drz2 != null) {
            i = drz2.A00;
        } else {
            i = 0;
        }
        ((ProductOnboardingNextStepInfo) A062.get(i)).A01 = "complete";
        C47184Drz drz3 = (C47184Drz) hashMap.get(A022);
        if (drz3 != null) {
            drz3.A01 = A062;
        }
        int i2 = i + 1;
        if (A062.size() > i2) {
            onboardingRepository.A07(A022, i2);
            ProductOnboardingNextStepInfo productOnboardingNextStepInfo = (ProductOnboardingNextStepInfo) A062.get(i2);
            String str5 = productOnboardingNextStepInfo.A02;
            if ("payouts_onboarding".equals(str5)) {
                FragmentActivity fragmentActivity3 = fragmentActivity2;
                F6T.A01(fragment, fragmentActivity3, A022, userSession2, str3, A042, (String) null, (String) null, (String) null);
                return;
            }
            int ordinal = A022.ordinal();
            if (ordinal == 10) {
                iGRevShareProductType = IGRevShareProductType.PROFILE_ADS;
                A002 = C49053EoX.A00(iGRevShareProductType, productOnboardingNextStepInfo);
            } else if (ordinal == 13) {
                iGRevShareProductType = IGRevShareProductType.REELS_OVERLAY_ADS;
                A002 = C49053EoX.A00(iGRevShareProductType, productOnboardingNextStepInfo);
            } else if (ordinal == 9) {
                FC8.A02();
                A002 = C49891FBs.A02(DbS.A0N(userSession2), C46649DiU.A04("com.instagram.user_pay.fan_club.screens.creator_onboarding.feature_list", AnonymousClass7TE.A1E()));
            } else if (ordinal != 2) {
                throw DbW.A0c("CompleteStepAndGetNextStepFragment: Invalid product type for settings: ", A022.name());
            } else if (0qQ.A0K(str5, "checklist_screen") || !0qQ.A0K(str5, "terms_and_conditions")) {
                C49195Er0.A00().A00();
                A002 = new E4Z();
            } else {
                C49195Er0.A00().A00();
                A002 = new E4U();
            }
            C309516Yo A0P2 = DbU.A0P((Bundle) null, A002, fragmentActivity2, userSession2);
            A0P2.A09();
            A0P2.A0A = str4;
            A0P2.A04();
        }
    }

    public final UserMonetizationProductType A02() {
        UserMonetizationProductType userMonetizationProductType = this.A00;
        if (userMonetizationProductType != null) {
            return userMonetizationProductType;
        }
        0qQ.A0F("monetizationProductType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A03() {
        Dr0 dr0 = (Dr0) this.A02.A02();
        if (dr0 != null) {
            return dr0.A01;
        }
        return null;
    }

    public final String A04() {
        String str;
        Dr0 dr0 = (Dr0) this.A02.A02();
        if (dr0 == null || (str = dr0.A02) == null) {
            return "UNKNOWN";
        }
        return str;
    }

    public final void A05() {
        int i;
        OnboardingRepository onboardingRepository = this.A05;
        UserMonetizationProductType A022 = A02();
        int i2 = 0;
        0qQ.A0B(onboardingRepository, 0);
        C47184Drz drz = (C47184Drz) onboardingRepository.A00.get(A022);
        if (drz != null) {
            i = drz.A00;
        } else {
            i = 0;
        }
        List A062 = onboardingRepository.A06(A022);
        if (A062 != null && !A062.isEmpty()) {
            if (i != 0) {
                i2 = i - 1;
            } else {
                return;
            }
        }
        onboardingRepository.A07(A022, i2);
    }

    public final void onCleared() {
        this.A03.A01();
    }

    public C46788DlI(UserSession userSession, OnboardingRepository onboardingRepository, MonetizationRepository monetizationRepository) {
        this.A04 = userSession;
        this.A06 = monetizationRepository;
        this.A05 = onboardingRepository;
        1HR r0 = new 1HR(0);
        this.A07 = r0;
        this.A08 = 0u9.A04(r0);
        this.A02 = new AnonymousClass2Fj();
    }

    public static final void A00(C46788DlI dlI) {
        C51645Fy4.A01(dlI, C318116oQ.A00(dlI), 27);
    }

    public final int A01() {
        switch (A02().ordinal()) {
            case 2:
                return 2131976253;
            case 7:
                return 2131956604;
            case 9:
                return 2131976320;
            case 10:
                if (C49785F6t.A01(this.A04)) {
                    return 2131963692;
                }
                return 2131963642;
            case 11:
                return 2131964326;
            case 13:
                return 2131963626;
            case 15:
                return 2131976337;
            default:
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("getOnboardingProductTitle Invalid product type: ");
                throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(A02(), A1A));
        }
    }
}
