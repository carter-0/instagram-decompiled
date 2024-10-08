package com.instagram.api.schemas;

import X.0oU;
import X.DE6;
import X.DbS;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum PartnerProgramOnboardingSteps implements Parcelable {
    UNRECOGNIZED("PartnerProgramOnboardingSteps_unspecified"),
    ACCOUNT_REVIEW_PENDING("account_review_pending"),
    AFFILIATE_CREATOR_PARTNERSHIP_MESSAGING_ONBOARDING("affiliate_creator_partnership_messaging_onboarding"),
    BC_DEAL_BRAND_PARTNERSHIP_MESSAGES_SCREEN_SEEN("bc_deal_brand_partnership_messages_screen_seen"),
    BC_DEAL_CREATOR_AUDIENCE_INTERESTS_SCREEN_SEEN("bc_deal_creator_audience_interests_screen_seen"),
    BC_DEAL_CREATOR_PARTNERSHIP_MESSAGES_SCREEN_SEEN("bc_deal_creator_partnership_messages_screen_seen"),
    BONUSES_UNAVAILABLE_SCREEN("bonuses_unavailable"),
    BRANDED_CONTENT_DEAL_CREATOR_CONSENT_SCREEN("branded_content_deal_creator_consent_screen"),
    BRANDED_CONTENT_DEAL_CREATOR_WISHLIST_SCREEN("branded_content_deal_creator_wishlist_screen"),
    BRANDED_CONTENT_DEAL_ONBOARDING_COMPLETE_SCREEN("branded_content_deal_onboarding_complete_screen"),
    CHECKLIST_SCREEN("checklist_screen"),
    CONVERT_TO_PROFESSIONAL_SCREEN("convert_to_professional_screen"),
    DEALS_ONBOARDING("deals_onboarding"),
    DEFERRED_ONBOARDING_BASIC_INFO("deferred_onboarding_basic_info"),
    DEFERRED_ONBOARDING_PAYOUTS("deferred_onboarding_payouts"),
    FAN_CLUB_DETAILS("fan_club_details"),
    FAN_CLUB_PRICING_LIST("fan_club_pricing_list"),
    IGTV_ACCOUNT_LEVEL_MONETIZATION_TOGGLE("igtv_account_level_monetization_toggle"),
    INCENTIVE_PROGRAM_DEALS_CONTRACT("incentive_program_deals_contract"),
    PAYOUTS_ONBOARDING("payouts_onboarding"),
    PREVIEW_SCREEN("preview_screen"),
    TERMS_AND_CONDITIONS("terms_and_conditions");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        PartnerProgramOnboardingSteps[] partnerProgramOnboardingStepsArr;
        A02 = 0oU.A00(partnerProgramOnboardingStepsArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r3));
        for (PartnerProgramOnboardingSteps partnerProgramOnboardingSteps : values()) {
            A0x.put(partnerProgramOnboardingSteps.A00, partnerProgramOnboardingSteps);
        }
        A01 = A0x;
        CREATOR = new DE6(7);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PartnerProgramOnboardingSteps(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
