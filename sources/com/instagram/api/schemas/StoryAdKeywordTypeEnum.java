package com.instagram.api.schemas;

import X.0oU;
import X.DE6;
import X.DbS;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryAdKeywordTypeEnum implements Parcelable {
    UNRECOGNIZED("StoryAdKeywordTypeEnum_unspecified"),
    EVENT("EVENT"),
    ITEM("ITEM"),
    MAIN_FUNCTION("MAIN_FUNCTION"),
    A07(PriceTableAnnotation$Companion.OFFER),
    OTHER_OFFERS("OTHER_OFFERS"),
    PRICE_OFFERS("PRICE_OFFERS"),
    SELLING_POINT("SELLING_POINT"),
    SEM_EX_BRAND_NAME("SEM_EX_BRAND_NAME"),
    SEM_EX_CONTACT_INFO("SEM_EX_CONTACT_INFO"),
    SEM_EX_CTA("SEM_EX_CTA"),
    SEM_EX_LOCATION("SEM_EX_LOCATION"),
    SEM_EX_MISC("SEM_EX_MISC"),
    SEM_EX_PRODUCT_SERVICE_EVENT_NAME("SEM_EX_PRODUCT_SERVICE_EVENT_NAME"),
    SEM_EX_PROMO_CODE("SEM_EX_PROMO_CODE"),
    SEM_EX_SALES_OFFER("SEM_EX_SALES_OFFER"),
    SEM_EX_SELLING_POINT("SEM_EX_SELLING_POINT"),
    SEM_EX_TIMING_SEASONALITY_OCCASION("SEM_EX_TIMING_SEASONALITY_OCCASION"),
    SEM_EX_USER_COHORT("SEM_EX_USER_COHORT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryAdKeywordTypeEnum[] storyAdKeywordTypeEnumArr;
        A02 = 0oU.A00(storyAdKeywordTypeEnumArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r3));
        for (StoryAdKeywordTypeEnum storyAdKeywordTypeEnum : values()) {
            A0x.put(storyAdKeywordTypeEnum.A00, storyAdKeywordTypeEnum);
        }
        A01 = A0x;
        CREATOR = new DE6(91);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryAdKeywordTypeEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
