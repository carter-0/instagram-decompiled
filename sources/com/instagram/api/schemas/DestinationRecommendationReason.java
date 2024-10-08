package com.instagram.api.schemas;

import X.0oU;
import X.DE7;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum DestinationRecommendationReason implements Parcelable {
    UNRECOGNIZED("DestinationRecommendationReason_unspecified"),
    CTD_HIGH_SPEND_SEGMENT("ctd_high_spend_segment"),
    CTD_MID_SPEND_SEGMENT("ctd_mid_spend_segment"),
    CTWA_INTENT_IN_BIOGRAPHY_CAPTION("ctwa_intent_in_biography_caption"),
    CTWA_INTENT_IN_MEDIA_CAPTION("ctwa_intent_in_media_caption"),
    CTWA_INTENT_IN_PHOTO_OCR("ctwa_intent_in_photo_ocr"),
    DIRECT_INBOX_UPSELL_CLICK_THROUGH("direct_inbox_upsell_click_through"),
    DIRECT_INTENT_IN_PHOTO_OCR("direct_intent_in_photo_ocr"),
    EMPTY("empty"),
    EXISTING_CTX_MAA("existing_ctx_maa"),
    FIRST_TIME_ADVERTISERS_PV("first_time_advertisers_pv"),
    HIGH_VBTS("high_vbts"),
    INTENT_IN_BIOGRAPHY("intent_in_biography"),
    INTENT_IN_MEDIA_CAPTION("intent_in_media_caption"),
    LESS_THAN_1K_FOLLOWERS_PV("less_than_1k_followers_pv"),
    MESSAGING_INTENT_BY_MTML("messaging_intent_by_mtml"),
    MESSGAING_TOOLS_USER("messaging_tools_user"),
    WHATSAPP_LOGO_INTENT_IN_PHOTO_OCR("whatsapp_logo_intent_in_photo_ocr");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        DestinationRecommendationReason[] destinationRecommendationReasonArr;
        A02 = 0oU.A00(destinationRecommendationReasonArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (DestinationRecommendationReason destinationRecommendationReason : values()) {
            linkedHashMap.put(destinationRecommendationReason.A00, destinationRecommendationReason);
        }
        A01 = linkedHashMap;
        CREATOR = new DE7(50);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    DestinationRecommendationReason(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
