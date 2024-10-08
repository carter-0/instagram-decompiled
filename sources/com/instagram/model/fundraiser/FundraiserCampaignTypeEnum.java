package com.instagram.model.fundraiser;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum FundraiserCampaignTypeEnum implements Parcelable {
    UNRECOGNIZED("FundraiserCampaignTypeEnum_unspecified"),
    CHARITY_TO_USER("CHARITY_TO_USER"),
    CRISIS_FOR_CHARITY("CRISIS_FOR_CHARITY"),
    DONATE_BUTTON_ON_ADS("DONATE_BUTTON_ON_ADS"),
    DONATE_BUTTON_ON_LIVE_VIDEO("DONATE_BUTTON_ON_LIVE_VIDEO"),
    DONATE_BUTTON_ON_PAGE("DONATE_BUTTON_ON_PAGE"),
    DONATE_BUTTON_ON_POST("DONATE_BUTTON_ON_POST"),
    EXTERNALLY_OWNED_OFFSITE_FUNDRAISER("EXTERNALLY_OWNED_OFFSITE_FUNDRAISER"),
    FACEBOOK_TO_USER("FACEBOOK_TO_USER"),
    IG_CHARITY_BUSINESS_PROFILE("IG_CHARITY_BUSINESS_PROFILE"),
    IG_LIVE_FOR_CHARITY("IG_LIVE_FOR_CHARITY"),
    IG_STANDALONE_FOR_CHARITY("IG_STANDALONE_FOR_CHARITY"),
    IG_STANDALONE_FOR_PERSON("IG_STANDALONE_FOR_PERSON"),
    IG_STICKER_FOR_CHARITY("IG_STICKER_FOR_CHARITY"),
    LIGHTWEIGHT_FUNDRAISER_FOR_STORY("LIGHTWEIGHT_FUNDRAISER_FOR_STORY"),
    PERSON_FOR_CAUSE("PERSON_FOR_CAUSE"),
    PERSON_FOR_CHARITIES_IN_CAUSE("PERSON_FOR_CHARITIES_IN_CAUSE"),
    PERSON_FOR_PERSON("PERSON_FOR_PERSON"),
    PROFILE_FOR_CHARITY("PROFILE_FOR_CHARITY"),
    TEAM_FUNDRAISER_FOR_CHARITY("TEAM_FUNDRAISER_FOR_CHARITY");
    
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
        FundraiserCampaignTypeEnum[] fundraiserCampaignTypeEnumArr;
        A02 = 0oU.A00(fundraiserCampaignTypeEnumArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum : values()) {
            linkedHashMap.put(fundraiserCampaignTypeEnum.A00, fundraiserCampaignTypeEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new C376399Hv(27);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FundraiserCampaignTypeEnum(String str) {
        this.A00 = str;
    }
}
