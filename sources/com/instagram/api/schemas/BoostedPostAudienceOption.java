package com.instagram.api.schemas;

import X.0oU;
import X.DbY;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BoostedPostAudienceOption implements Parcelable {
    UNRECOGNIZED("BoostedPostAudienceOption_unspecified"),
    ANY_POST_OR_AD_ENGAGEMENT("ANY_POST_OR_AD_ENGAGEMENT"),
    ANY_POST_OR_AD_ENGAGEMENT_LAL("ANY_POST_OR_AD_ENGAGEMENT_LAL"),
    AUTO_LOOKALIKE("AUTO_LOOKALIKE"),
    AUTO_PAGE_LOOKALIKE("AUTO_PAGE_LOOKALIKE"),
    AUTO_TARGETING("AUTO_TARGETING"),
    COUNTRY_AND_INTEREST("COUNTRY_AND_INTEREST"),
    CREATE_NEW("CREATE_NEW"),
    CUSTOM_AUDIENCE("CUSTOM_AUDIENCE"),
    DISTRICT("DISTRICT"),
    DYNAMIC_TOFU_CUSTOM_AUDIENCE("DYNAMIC_TOFU_CUSTOM_AUDIENCE"),
    EVENT_CUSTOM_AUDIENCES("EVENT_CUSTOM_AUDIENCES"),
    EVENT_ENGAGEMENT("EVENT_ENGAGEMENT"),
    FANS("FANS"),
    GROUPER("GROUPER"),
    HEC_AUDIENCE("HEC_AUDIENCE"),
    IG_BOOST_UNIFIED_AUDIENCE("IG_BOOST_UNIFIED_AUDIENCE"),
    IG_PROMOTED_POST_AUTO("IG_PROMOTED_POST_AUTO"),
    IG_REACH_CHURNED("IG_REACH_CHURNED"),
    IG_REACH_LAL("IG_REACH_LAL"),
    INTEREST_BASED_AUDIENCE("INTEREST_BASED_AUDIENCE"),
    JOBS_DEFAULT_AUDIENCE("JOBS_DEFAULT_AUDIENCE"),
    JOBS_NATIONAL_AUDIENCE("JOBS_NATIONAL_AUDIENCE"),
    JOBS_REGIONAL_AUDIENCE("JOBS_REGIONAL_AUDIENCE"),
    LOCAL("LOCAL"),
    LOCAL_AWARENESS("LOCAL_AWARENESS"),
    LOOKALIKE("LOOKALIKE"),
    MARKETPLACE_DEFAULT("MARKETPLACE_DEFAULT"),
    MARKETPLACE_NATIONWIDE_AUDIENCE("MARKETPLACE_NATIONWIDE_AUDIENCE"),
    MARKETPLACE_SAVED_AUDIENCE("MARKETPLACE_SAVED_AUDIENCE"),
    MULT_CUSTOM_AUDIENCES("MULT_CUSTOM_AUDIENCES"),
    NCPP("NCPP"),
    PAGE_ENGAGEMENT("PAGE_ENGAGEMENT"),
    PAGE_ENGAGEMENT_LAL("PAGE_ENGAGEMENT_LAL"),
    PAGE_MULTIPLE_EVENTS_CUSTOM_AUDIENCE("PAGE_MULTIPLE_EVENTS_CUSTOM_AUDIENCE"),
    PAGE_REACH_CHURNED("PAGE_REACH_CHURNED"),
    PAGE_REACH_LAL("PAGE_REACH_LAL"),
    SAVED_AUDIENCE("SAVED_AUDIENCE"),
    SHOPS_NEW_BUYER_AUDIENCE("SHOPS_NEW_BUYER_AUDIENCE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BoostedPostAudienceOption[] boostedPostAudienceOptionArr;
        A02 = 0oU.A00(boostedPostAudienceOptionArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r4));
        for (BoostedPostAudienceOption boostedPostAudienceOption : values()) {
            linkedHashMap.put(boostedPostAudienceOption.A00, boostedPostAudienceOption);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(67);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BoostedPostAudienceOption(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
