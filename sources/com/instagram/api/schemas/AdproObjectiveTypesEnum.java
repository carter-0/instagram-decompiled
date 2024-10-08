package com.instagram.api.schemas;

import X.0oU;
import X.DbY;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdproObjectiveTypesEnum implements Parcelable {
    UNRECOGNIZED("AdproObjectiveTypesEnum_unspecified"),
    APP_INSTALLS("APP_INSTALLS"),
    BRAND_AWARENESS("BRAND_AWARENESS"),
    CANVAS_APP_ENGAGEMENT("CANVAS_APP_ENGAGEMENT"),
    CANVAS_APP_INSTALLS("CANVAS_APP_INSTALLS"),
    DEPRECATED_CLICKS("DEPRECATED_CLICKS"),
    EVENT_RESPONSES("EVENT_RESPONSES"),
    EXTERNAL("EXTERNAL"),
    GROUP_JOINS("GROUP_JOINS"),
    IMPRESSIONS("IMPRESSIONS"),
    INCOMPATIBLE_CANVAS_APP_ENGAGEMENT("INCOMPATIBLE_CANVAS_APP_ENGAGEMENT"),
    INCOMPATIBLE_CANVAS_APP_INSTALLS("INCOMPATIBLE_CANVAS_APP_INSTALLS"),
    INCOMPATIBLE_EVENT_RESPONSES("INCOMPATIBLE_EVENT_RESPONSES"),
    INCOMPATIBLE_MOBILE_APP_INSTALLS("INCOMPATIBLE_MOBILE_APP_INSTALLS"),
    INCOMPATIBLE_OFFER_CLAIMS("INCOMPATIBLE_OFFER_CLAIMS"),
    INCOMPATIBLE_PAGE_ENGAGEMENT("INCOMPATIBLE_PAGE_ENGAGEMENT"),
    INCOMPATIBLE_PAGE_LIKES("INCOMPATIBLE_PAGE_LIKES"),
    INCOMPATIBLE_POST_ENGAGEMENT("INCOMPATIBLE_POST_ENGAGEMENT"),
    INCOMPATIBLE_WEBSITE_CLICKS("INCOMPATIBLE_WEBSITE_CLICKS"),
    INCOMPATIBLE_WEBSITE_CONVERSIONS("INCOMPATIBLE_WEBSITE_CONVERSIONS"),
    INSTAGRAM_BRAND_AWARENESS("INSTAGRAM_BRAND_AWARENESS"),
    LEAD_GENERATION("LEAD_GENERATION"),
    LINK_CLICKS("LINK_CLICKS"),
    LOCAL_AWARENESS("LOCAL_AWARENESS"),
    LOCAL_IMPRESSIONS("LOCAL_IMPRESSIONS"),
    MEDIA_DOWNLOADS("MEDIA_DOWNLOADS"),
    MESSAGES("MESSAGES"),
    MILLE("MILLE"),
    MOBILE_APP_ENGAGEMENT("MOBILE_APP_ENGAGEMENT"),
    MOBILE_APP_INSTALLS("MOBILE_APP_INSTALLS"),
    MULTIPLE("MULTIPLE"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    OFFER_CLAIMS("OFFER_CLAIMS"),
    OUTCOME_ACQUISITION("OUTCOME_ACQUISITION"),
    OUTCOME_APP_PROMOTION("OUTCOME_APP_PROMOTION"),
    OUTCOME_AWARENESS("OUTCOME_AWARENESS"),
    OUTCOME_ENGAGEMENT("OUTCOME_ENGAGEMENT"),
    OUTCOME_LEADS("OUTCOME_LEADS"),
    OUTCOME_SALES("OUTCOME_SALES"),
    OUTCOME_TRAFFIC("OUTCOME_TRAFFIC"),
    PAGE_LIKES("PAGE_LIKES"),
    POST_ENGAGEMENT("POST_ENGAGEMENT"),
    PRODUCT_CATALOG_SALES("PRODUCT_CATALOG_SALES"),
    PROFILE_FOLLOWERS("PROFILE_FOLLOWERS"),
    REACH("REACH"),
    RESEARCH_POLL("RESEARCH_POLL"),
    STORE_VISITS("STORE_VISITS"),
    VIDEO_VIEWS("VIDEO_VIEWS"),
    WEBSITE_CONVERSIONS("WEBSITE_CONVERSIONS"),
    WILDCARD_INTERNAL_ONLY("WILDCARD_INTERNAL_ONLY"),
    XPLATFORM_SALES("XPLATFORM_SALES");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AdproObjectiveTypesEnum[] adproObjectiveTypesEnumArr;
        A02 = 0oU.A00(adproObjectiveTypesEnumArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r4));
        for (AdproObjectiveTypesEnum adproObjectiveTypesEnum : values()) {
            linkedHashMap.put(adproObjectiveTypesEnum.A00, adproObjectiveTypesEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(29);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdproObjectiveTypesEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
