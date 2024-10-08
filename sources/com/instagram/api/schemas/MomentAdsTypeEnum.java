package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MomentAdsTypeEnum implements Parcelable {
    UNRECOGNIZED("MomentAdsTypeEnum_unspecified"),
    FB_LIVE_SHOPPING("fb_live_shopping"),
    IG_DROPS("ig_drops"),
    IG_LIVE_SHOPPING("ig_live_shopping"),
    IG_ONLINE_EVENT("ig_online_event"),
    IG_OPTIONAL_ONLINE_EVENT("ig_optional_online_event"),
    IG_OPTIONAL_ONLINE_EVENT_WITH_REMIND_ME_CTA("ig_optional_online_event_with_remind_me_cta"),
    IG_OPTIONAL_ONLINE_EVENT_WITH_REMIND_ME_CTA_FALLBACK("ig_optional_online_event_with_remind_me_cta_fallback"),
    IG_SCHEDULED_LIVE("ig_scheduled_live");
    
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
        MomentAdsTypeEnum[] momentAdsTypeEnumArr;
        A02 = 0oU.A00(momentAdsTypeEnumArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MomentAdsTypeEnum momentAdsTypeEnum : values()) {
            linkedHashMap.put(momentAdsTypeEnum.A00, momentAdsTypeEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(64);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MomentAdsTypeEnum(String str) {
        this.A00 = str;
    }
}
