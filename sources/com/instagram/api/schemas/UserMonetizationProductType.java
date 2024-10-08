package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum UserMonetizationProductType implements Parcelable {
    UNRECOGNIZED("UserMonetizationProductType_unspecified"),
    AFFILIATE("affiliate"),
    BADGES_INCENTIVES("badges_incentives"),
    BRANDED_CONTENT("branded_content"),
    BRANDED_CONTENT_DEAL_BRAND("branded_content_deal_brand"),
    BRANDED_CONTENT_DEAL_CREATOR("branded_content_deal_creator"),
    BRANDED_CONTENT_TAG_IN_LIVE("branded_content_tag_in_live"),
    CONTENT_APPRECIATION("content_appreciation"),
    DETECTED_OUTCOMES("detected_outcomes"),
    FAN_CLUB_CREATOR("fan_club_creator"),
    IGTV_REVSHARE("igtv_revshare"),
    INCENTIVE_PLATFORM("incentive_platform"),
    INCENTIVE_PLATFORM_SPEAKER_ENGAGEMENT("incentive_platform_speaker_engagement"),
    REELS_OVERLAY_ADS("reels_overlay_ads"),
    SHOPPING_FROM_CREATORS("shopping_from_creators"),
    USER_PAY("user_pay");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        UserMonetizationProductType[] userMonetizationProductTypeArr;
        A02 = 0oU.A00(userMonetizationProductTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (UserMonetizationProductType userMonetizationProductType : values()) {
            linkedHashMap.put(userMonetizationProductType.A00, userMonetizationProductType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(52);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    UserMonetizationProductType(String str) {
        this.A00 = str;
    }
}
